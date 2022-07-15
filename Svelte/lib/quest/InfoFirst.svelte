<script>
import DaeguInfo from "./DaeguInfo.svelte"
import DaejeonInfo from "./DaejeonInfo.svelte"
import GwangjuInfo from "./GwangjuInfo.svelte"
import IncheonInfo from "./IncheonInfo.svelte"

    let a=false
    let b=false
    let c=false
    let d=false
    function dgop(){
        a=!a
    }
    function icop(){
        b=!b
    }
    function gjop(){
        c=!c
    }
    function d_gop(){
        d=!d
    }
</script>

<div>
    <div id="reg_sel">
        <h1>버스 노선 정보</h1>
        <h3>지역선택</h3>
        <ul>
            <li><button on:click="{dgop}">대구</button></li>
            <li><button on:click="{icop}">인천</button></li>
            <li><button on:click="{gjop}">광주</button></li>
            <li><button on:click="{d_gop}">대전/계룡</button></li>
        </ul>
    </div>
    <div id="reg_info">
        {#if a}
            <DaeguInfo/>
        {:else if b}
            <IncheonInfo/>
        {:else if c}
            <GwangjuInfo/>
        {:else if d}
            <DaejeonInfo/>
        {/if}
    </div>
</div>

<style>
    #reg_sel{
        width: 100%;
        height: 200px;
        text-align: center;
    }
    #reg_info{
        text-align: center;
        align-content: center;
    }
    ul{
        display: table;
        margin-left: auto;
        margin-right: auto;
    }
    li{
        list-style: none;
        float: left;
        margin: 15px;
    }
    button{
        border-radius: 10px 10px 10px 10px;
        width: 100px;
        height: 50px;
        background-color: lightblue;
        font-size: 1.2em;
    }
</style>