<script>
import { trusted } from "svelte/internal"

    const train=[
        {
            train:"KTX",
            depart:"부산",
            de_time:"18:30",
            arrive:"서울",
            ar_time:"21:08",
            division:"경부선"
        },
        {
            train:"KTX",
            depart:"서울",
            de_time:"11:24",
            arrive:"여수",
            ar_time:"13:18",
            division:"호남선"
        },
        {
            train:"KTX",
            depart:"인천공항",
            de_time:"12:49",
            arrive:"부산",
            ar_time:"14:53",
            division:"경부선"
        },
        {
            train:"KTX",
            depart:"서울",
            de_time:"17:11",
            arrive:"강릉",
            ar_time:"18:46",
            division:"경강선"
        },
        {
            train:"SRT",
            depart:"수서",
            de_time:"14:40",
            arrive:"대구",
            ar_time:"16:12",
            division:"경부선"
        },
        {
            train:"KTX",
            depart:"대구",
            de_time:"07:45",
            arrive:"서울",
            ar_time:"10:42",
            division:"경부선"
        },
        {
            train:"SRT",
            depart:"부산",
            de_time:"09:21",
            arrive:"천안",
            ar_time:"10:53",
            division:"경부선"
        },
        {
            train:"KTX",
            depart:"광주",
            de_time:"11:36",
            arrive:"수원",
            ar_time:"13:00",
            division:"호남선"
        }
    ]
    let i=0
    function count(){
        i++
    }
    function reset(){
        i=0
    }
    let check=document.getElementById("text")
    function ch1(){
        if(check==train["train"]){
            
        }
    }
</script>
<div id="pr1">
    <h2>열차 운행 정보</h2>
    {#each train as tr1}
        <table>
            <tr>
                <td>{tr1.train}</td>
                <td>{tr1.depart}</td>
                <td>{tr1.de_time}</td>
                <td>{tr1.arrive}</td>
                <td>{tr1.ar_time}</td>
                <td>{tr1.division}</td>
            </tr>
        </table> 
    {/each}
</div>
<div>
    <button on:click="{count}">확인</button>
    <button on:click="{reset}">리셋</button>
    <ul>
        <li>{train[i]["train"]}</li>
        <li>{train[i]["depart"]}</li>
        <li>{train[i]["de_time"]}</li>
        <li>{train[i]["arrive"]}</li>
        <li>{train[i]["ar_time"]}</li>
        <li>{train[i]["division"]}</li>
    </ul>  
</div>
<div>
    <form id="form">
        <input id="text" type="text">
        <button on:click="{ch1}">조회</button>
        {#if ch1}
            <ul>
                <li>{train["train"]}</li>
                <li>{train["depart"]}</li>
                <li>{train["de_time"]}</li>
                <li>{train["arrive"]}</li>
                <li>{train["ar_time"]}</li>
                <li>{train["division"]}</li>
            </ul>
        {:else}
            <p>잘못 입력하셨습니다.</p>
        {/if}  
    </form>
</div>

<style>
    div{
        padding: 15px;
    }
    #pr1 td{
        width:80px;
        height: 30px;
        border: 2px solid;
        text-align: center;
    }
    form{
        width: 70%;
        border: 2px solid;
    }
</style>