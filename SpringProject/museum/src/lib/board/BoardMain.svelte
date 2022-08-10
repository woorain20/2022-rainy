<script>
    import { onMount } from "svelte";
    import {callid} from "../store"
    import { paginate, PaginationNav } from 'svelte-easy-paginate'
    import Boarddetail from "./Boarddetail.svelte";

    const post="http://192.168.0.51:8080/postboard/?page=0&size=50"

    let items=[]

    onMount(async function(){
        const res=await fetch(post+"&sort=num,desc")
        const data = await res.json()
        items=data._embedded.postboard
        // console.log(board)
    })

    let inknum

    function addno(ibs){
        inknum=ibs
        console.log(inknum)
    }

    $:callid.update(t=>inknum) 

    let currentPage = 1
    let pageSize = 10
    $: items = paginate({ items, pageSize, currentPage })

    let page=true
    let content=false
    function aop(){
        content=!content
        page=!page
    }
</script>

<div>
    {#if page}
    <table>
        <tr>
            <th>번호</th>
            <th>구분</th>
            <th class="thda">제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회</th>
        </tr>
    </table>
    <table>
    {#each items as pbd}
        <tr on:click="{aop}">
            <td>{pbd.num}</td>
            <td>{pbd.workplace}</td>
            <td class="thda"><button on:click={()=>{addno(pbd.title)}}>{pbd.title}</button></td>
            <td>{pbd.whiter}</td>
            <td>{pbd.date}</td>
            <td>{pbd.count}</td>
        </tr>          
    {/each}
        <PaginationNav
            totalItems="{items.length}"
            pageSize="{pageSize}"
            currentPage="{currentPage}"
            limit="{1}"
            showStepOptions="{true}"
            on:setPage="{(e) => currentPage = e.detail.page}"
        />
    </table>
    {/if}
    {#if content}
    <Boarddetail/>
    <bottun on:click={aop}>뒤로가기</bottun>  
    {/if}
</div>

<style>
    table{
        width: 75%;
        height: 80%;
        border: 1px solid;
    }
    th{
        width: 10%;
        height: 10%;
    }
    td{
        width: 10%;
        height: 10%;
    }
    .thda{
        width: 20%;
        height: 10%;
    }
</style>