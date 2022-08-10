<script>
import { onMount } from "svelte";
import {callid} from "./store"
    
    let callno
    callid.subscribe(t=>{ callno=t})

    // DB를 열어(특정 DB) ID 일치하는것 정보 가져오기!

    let events=[]
    const eventdb="http://192.168.0.51:8080/event/"

    onMount(async function(){
    const rsq= await fetch(eventdb)
    const vev= await rsq.json()
    events=vev._embedded.event
})

</script>
<main>
<h1>EVENT </h1>

{#each events as event}
{#if event.no==callno}
    <div id="poster">
        <img src="./src/lib/eventbanner/{event.banner}.jpg" style="width: 100%; height:600px;" alt="오타났다"/>
    </div>
    <div id="content">
        <table>
            <th colspan="2">{event.eventname}</th>
            <tr>
                <td class="col">관람료</td>
                <td class="con">{event.fee}원</td>
                    </tr>
                    <tr>
                        <td class="col">장소</td>
                        <td class="con">{event.place}</td>
                    </tr>
                    <tr>
                        <td class="col">기간</td>
                        <td class="con">{event.startday}~{event.endday}</td>
                    </tr>
                    <tr>
                        <td class="col">공연시간</td>
                        <td class="con">{event.time}</td>
                    </tr>
                    <tr>
                        <td class="col">최대좌석</td>
                        <td class="con">{event.empty}</td>
                    </tr>
                    <tr id="detailcon">
                        <td class="col">내용</td>
                        <td class="con">{event.content}</td>
                    </tr>
                    <tr >
                        <td colspan="2">
                            <button>장바구니</button>
                            <button>예매하기</button>
                        </td>
                    </tr>
            </table>
            <!-- <div id="cancelrole"> -->
                <p>취소규정<br/>
                    * 공연 시작 3시간전까지 전액환불 가능 <br/> * 1시간전까지는 절반 환불 <br/> * 30분전 환불금 없음</p>
                    <!-- </div> -->
            </div>
    {/if}   
{/each}
</main>
<style>

    #poster{
        float: left;
        width:450px;
        margin:0 auto;
    }
    #content{
        float: left;
        margin-left:20px;
        width:300px;
       
    }
    #content>table>th{
        margin-top:10px;
    }
    .col{
        width:100px;
        height:50px;
        text-align: right;
    }
    .con{
        width:200px;
    }
    #detailcon{
        height:200px;
    }
    #content>p{
        margin-left:20px;
        margin-top:20px;
        float: left;
        border: 0px;
        height:50px;
        text-align: left;
    }
    main{
    width:60%;
    margin: 0px auto;
    }
    
    
    </style>