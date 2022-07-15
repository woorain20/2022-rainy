<script>
    import Pra10 from "./Pra10.svelte";
    import Pra12 from "./Pra12.svelte";
    import Pra8 from "./Pra8.svelte";
    import Pra9 from "./Pra9.svelte";

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
        <h1>지역선택</h1>
        <ul>
            <li><button on:click="{dgop}">대구</button></li>
            <li><button on:click="{icop}">인천</button></li>
            <li><button on:click="{gjop}">광주</button></li>
            <li><button on:click="{d_gop}">대전/계룡</button></li>
        </ul>
    </div>
    <div id="reg_info">
        {#if a}
            <Pra8/>
        {:else if b}
            <Pra10/>
        {:else if c}
            <Pra9/>
        {:else if d}
            <Pra12/>
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