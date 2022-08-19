<script>
    import { onMount } from "svelte";
    import {boardid,boardcount} from "../store"
    import { paginate, PaginationNav } from 'svelte-easy-paginate'
    import Boarddetail from "./Boarddetail.svelte";
    import BoardWrite from "./BoardWrite.svelte";

    const post="http://192.168.0.51:8080/postboard/?page=0&size=200"

    let items=[]
    let inknum
    let inkcount

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
    $:boardcount.update(t=>inkcount)
        
    let page=true
    let content=false
    let write=false

    function aop(recnt){
        inkcount=recnt
        content=!content
        page=!page
        console.log(inkcount)
    }
    
    function backpage(){
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

<div id="total">
    <h1>게시판</h1>
    {#if page}
    <div id="write">
        <button on:click="{writeop}">글쓰기</button>
    </div>
    <div id="board">
        <div id="name" class="align">
            <div class="number board-open">번호</div>
            <div class="place board-open">장소</div>
            <div class="thda board-open" id="title">제목</div>
            <div class="writer board-open">작성자</div>
            <div class="date board-open">작성일</div>
            <div class="count board-open">조회</div>
        </div>
    <div class="align">
        {#each items as pbd}
            {#if pbd.official}
            <div class="align" id="notice" on:click={()=>{addno(pbd.num)}}>
                <div class="number board-open" style="background-color: #ffffb3;">공지</div>
                <div class="place board-open">{pbd.workplace}</div>
                <div class="thda board-open" on:click={()=>aop(pbd.count)}><button on:click={()=>{addno(pbd.num)}}>{pbd.title}</button></div>
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
                <div class="thda board-open" on:click={()=>aop(pbd.count)}><button on:click={()=>{addno(pbd.num)}}>{pbd.title}</button></div>
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
{/if}
</div>
<div>
    {#if content}
        <Boarddetail/>
        <bottun class="back" on:click={backpage}>뒤로가기</bottun>  
    {:else if write}
        <BoardWrite/>
        <bottun class="back" on:click={writeop}>뒤로가기</bottun>
    {/if}
</div>

<style>
    #total{
        margin-top: 3%;
        text-align: center;
    }
    h1{
        margin-bottom: 2%;
    }
    #write{
        text-align: right;
        width: 87.5%;
        margin-bottom: 0.5%;
    }
    #write>button{
        border-radius: 5px 5px 5px 5px;
        font-weight: 700;
        background-color: linen;
        border: 3px outset;
    }
    #write>button:hover{
        border: 3px inset;
    }
    #board{
        width: 75%;
        margin:0 auto;
    }
    #name{
        background-color: lightgray;
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
        margin-bottom: 1px;
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
    #title{
        border: 1px solid black;
    }
    .thda{
        width: 45%;
        border: 1px solid black;
    }
    .thda>button{
        width: 100%;
        background-color: white;
        border:0px
    }
    .back{
        margin-left: 5%;
        border-radius: 5px 5px 5px 5px;
        border: 3px outset;
        font-weight: 600;
        background-color: #cce6ff;
    }
    .back:hover{
        background-color: #cce6ff;
        border: 3px inset
    }
</style>