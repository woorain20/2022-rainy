<script>
import { onMount } from "svelte";
import {callid} from "./store";

let callno
    callid.subscribe(t=>{ callno=t})

    // DB를 열어(특정 DB) ID 일치하는것 정보 가져오기!

    let exhib=[]

    const slidingbnn="http://192.168.0.51:8080/exhibition/"
    
    onMount(async function(){
        const red= await fetch(slidingbnn)
        const open= await red.json()
        exhib=open._embedded.exhibition
    })
</script>

<div id="total">
{#each exhib as exhibition}
{#if callno==exhibition.id}
<div id="poster">
    <img src="./src/lib/exhibitionposter/{exhibition.poster}.jpg" style="width: 450px; height:600px;" alt="오타났다"/>
</div>
<div id="content">
    <table>
        <th colspan="2">{exhibition.title}</th>
            <tr>
                <td class="col">관람료</td>
                <td class="con">{exhibition.fee}</td>
            </tr>
            <tr>
                <td class="col">장소</td>
                <td class="con">{exhibition.place}</td>
            </tr>
            <tr>
                <td class="col">시작일</td>
                <td class="con">{exhibition.startday}</td>
            </tr>
            <tr>
                <td class="col">마감일</td>
                <td class="con">{exhibition.endday}</td>
            </tr>
            <tr id="detailcon">
                <td class="col">내용</td>
                <td class="con">{exhibition.content}</td>
            </tr>
            
        </table>
    </div>
    {/if}
{/each}
</div>

<style>
#poster{ 
    float: left;
    width:450px;
    margin:0 auto;
}
#content{
    float: left;
    margin-left:5%;
    width:300px;
}
#content>table>th{
    margin-top:30px;
}
th{
    font-weight: 600;
    font-size: 1.2em;
}
.col{
    width:100px;
    height:50px;
    text-align: left;
}
.con{
    width:200px;
    border-bottom: 1px dotted;
}
#detailcon{
    height:300px;
}
#total{
    width:60%;
    margin: 0px auto;
    margin-top: 3%;
}

</style>