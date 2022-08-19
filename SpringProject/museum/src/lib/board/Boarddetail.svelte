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

<div id="total">
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
        <input type="password" bind:value="{pass}" placeholder="비밀번호를 입력하세요">           
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
    #total{
        width: 90%;
        margin-left: 5%;
    }
    #top{
        width:100%;
        height:80px;
    }
    h3{
        margin-left: 3%;
        font-weight: 600;
    }
    h7{
        margin-right: 2%;
    }
    #content{
        border:1px solid black;
        width: 100%;
        height:500px;
        margin-bottom: 1%;
    }
    #delete{
        margin-bottom: 1%;
    }
    #delete > button > a{
        text-decoration: none;
        color: black;
    }
</style>