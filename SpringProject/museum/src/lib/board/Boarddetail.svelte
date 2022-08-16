<script>
    import { onMount } from "svelte";

    import {boardcount, boardid} from "../store"
    
    let callno
    let modeficount

    boardid.subscribe(t=>{callno=t})
    boardcount.subscribe(t=>{modeficount=t})

    const post="http://192.168.0.51:8080/postboard/"
    let board=[]

    onMount(async function(){
        const res=await fetch(post)
        const data = await res.json()
        board=data._embedded.postboard
        // console.log(board)
        // console.log(callno)
        modeficount=modeficount+1

        await fetch(post+callno,{
			method:"PATCH", headers:{    //headers를 설정해야 오류가 안남
				"Content-Type":"application/json"
			},
			body:JSON.stringify({
				count:modeficount
			})
		})
    })

    let pass=""

	async function remove(pbd){
		await fetch(post+pbd.num,{
			method:"DELETE"
		})
		board=board.filter(t=>t!==pbd)
	}
</script>
<div>
    {#each board as pbd}
        {#if pbd.num==callno}
    <div id="top">
        <h3 style="text-align: left;">{pbd.title}</h3> 

        <h7 style="float: right; padding: 0px 10px;">작성일: {pbd.date}</h7>
        <h7 style="float: right; padding: 0px 10px;">조회수: {pbd.count}</h7>
        <h7 style="float: right; padding: 0px 10px;">담당자: {pbd.whiter}</h7>

    </div>
    <div id="content">
        {pbd.content} 
    </div>
    <div id="delete">
        <input type="password" bind:value="{pass}">           
        {#if pass==pbd.password}
            <button disabled="{!pass}" on:click="{()=>remove(pbd)}"><a href="board.html">삭제</a></button>
        {:else if pass!=pbd.password}
            <button disabled="{!pass}">삭제</button>
        {/if}    
    </div>
        {/if}
    {/each}
</div>

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