<script>
    import { onMount } from "svelte";
    import {callid} from "../store"

    const post="http://192.168.0.51:8080/postboard/?page=0&size=50"
    let board=[]

    let callno
    callid.subscribe(t=>{ callno=t})

    onMount(async function(){
        const res=await fetch(post+"&sort=num,desc")
        const data = await res.json()
        board=data._embedded.postboard
        // console.log(board)
    })
</script>

<div>
    <div id="top">
        <h3 style="text-align: left;">게시판</h3> 
        <h7 style="float: right; padding: 0px 10px;">작성일 : 날짜</h7>
        <h7 style="float: right; padding: 0px 10px;">조회수 : --</h7>
        <h7 style="float: right; padding: 0px 10px;">담당자:직원</h7>
    </div>
    <div id="content">
        {#each board as pbd}
            {#if pbd.num==callno}
            <table>
                <tr>
                    <td rowspan="2">{pbd.title}</td>
                    <td>{pbd.date}</td>
                    <td>{pbd.whiter}</td>
                </tr>
                <tr>
                    <td>{pbd.content}</td>
                </tr>
            </table>
            {/if}
        {/each}
    </div>       
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