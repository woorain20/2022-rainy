<script>
    import { onMount } from "svelte";
    import {boardid} from "../store"
    
    let callno

    boardid.subscribe(t=>{callno=t})
    const post="http://192.168.0.51:8080/postboard/"
    let board=[]


    onMount(async function(){
        const res=await fetch(post)
        const data = await res.json()
        board=data._embedded.postboard
        // console.log(board)
        // console.log(callno)
    })
</script>
    {#each board as pbd}
        {#if pbd.num==callno}
    <div id="top">
        <h3 style="text-align: left;">{pbd.title}</h3> 
        <h7 style="float: right; padding: 0px 10px;">작성일 :{pbd.date}</h7>
        <h7 style="float: right; padding: 0px 10px;">조회수 : {pbd.count}</h7>
        <h7 style="float: right; padding: 0px 10px;">담당자:{pbd.whiter}</h7>
    </div>
    <div id="content">
        {pbd.content} 
    </div>
        {/if}
    {/each}


<style>
    #content{
        border:1px solid black;
        width: 100%;
        height:500px;
    }
    #top{
        width:100%;
        height:80px;
    }
</style>