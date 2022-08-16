<script>
    import { onMount } from "svelte";
    import {boardid} from "../store"
    import { paginate, PaginationNav } from 'svelte-easy-paginate'
    import Boarddetail from "./Boarddetail.svelte";
    import BoardWrite from "./BoardWrite.svelte";

    const post="http://192.168.0.51:8080/postboard/?page=0&size=50"

    let items=[]
    let inknum

    onMount(async function(){
        const res=await fetch(post+"&sort=num,desc")
        const data = await res.json()
        items=data._embedded.postboard
    })

    function addno(ibs){
        inknum=ibs
        console.log(inknum)
    }

    $:boardid.update(t=>inknum) 
        
    let page=true
    let content=false
    let write=false

    function aop(){
        content=!content
        page=!page
    }

    function writeop(){
        page=!page
        write=!write
    }

    let currentPage = 1
    let pageSize = 10
    $: postboards = paginate({ items, pageSize, currentPage })

</script>

<div>
{#if page}
<div id="board">
    <div id="name" class="align">
        <div class="number board-open">번호</div>
        <div class="place board-open">장소</div>
        <div class="thda board-open">제목</div>
        <div class="writer board-open">작성자</div>
        <div class="date board-open">작성일</div>
        <div class="count board-open">조회</div>
    </div>
    <div class="align">
        {#each items as pbd}
            {#if pbd.official}
            <div class="align" on:click={()=>{addno(pbd.num)}}>
                <div class="number board-open">공지</div>
                <div class="place board-open">{pbd.workplace}</div>
                <div class="thda board-open"><label on:click={aop}><button on:click={()=>{addno(pbd.num)}}>{pbd.title}</button></label></div>
                <div class="writer board-open">{pbd.whiter}</div>
                <div class="date board-open">{pbd.date}</div>
                <div class="count board-open">{pbd.count}</div>
            </div>
            {/if}
        {/each}
    </div>
    <div id="boardbar" class="align">
        {#each postboards as pbd}
            <div id="content" class="align" on:click={()=>{addno(pbd.num)}}>
                <div class="number board-open">{items.length-items.indexOf(pbd,0)}</div>
                <div class="place board-open">{pbd.workplace}</div>
                <div class="thda board-open"><label on:click={aop}><button on:click={()=>{addno(pbd.num)}}>{pbd.title}</button></label></div>
                <div class="writer board-open">{pbd.whiter}</div>
                <div class="date board-open">{pbd.date}</div>
                <div class="count board-open">{pbd.count}</div>
            </div>      
        {/each}
    </div>
        <div id="paginate">
            <PaginationNav
            totalItems="{items.length}"
            pageSize="{pageSize}"
            currentPage="{currentPage}"
            limit="{1}"
            showStepOptions="{true}"
            on:setPage="{(e) => currentPage = e.detail.page}"
            />
        </div>
    </div>
    <div>
        <button on:click="{writeop}">글쓰기</button>
    </div>
{/if}
</div>
<div>
    {#if content}
        <Boarddetail/>
        <bottun on:click={aop}>뒤로가기</bottun>  
    {:else if write}
        <BoardWrite/>
        <bottun on:click={writeop}>뒤로가기</bottun>
    {/if}
</div>

<style>

    #board{
        width: 70%;
        margin:0 auto;
    }
    #paginate{
        float:left;
        align-items: center;
    }
    .align{
        width: 100%;
        float: left;
    }
    
    .board-open{
        float: left;
    }
    .number{
        width: 5%;
        border: 1px solid black;
    }
    .writer{
        width: 15%;
        border: 1px solid black;
    }
    .date{
        width: 15%;
        border: 1px solid black;
    }
    .place{
        width: 15%;
        border: 1px solid black;
    }
    .count{
        width: 5%;
        border: 1px solid black;
    }
    .thda{
        width: 45%;
    }
    .thda>label>button{
        width: 100%;
    }
    .thda>label{
        width: 100%;
    }
</style>