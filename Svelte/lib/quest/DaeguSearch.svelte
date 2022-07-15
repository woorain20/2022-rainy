<script>
    import busInfo from "./DaeguInfo.svelte"
    console.log(busInfo)

    let a=false
    function open(){
        a=!a
    }
    let b=false
    function open2(){
        b=!b
    }
    let c=false
    function open3(){
        c=!c
    }
    let d=false
    function open4(){
        d=!d
    }
    let text=""
</script>

<div>
    <div>
        <div id="seardiv">
            <ul id="searul">
                <li class="searli"><button on:click="{open}">유형 검색</button></li>
                <li class="searli"><button on:click="{open2}">번호 검색</button></li>
                <li class="searli"><button on:click="{open3}">기점 검색</button></li>
                <li class="searli"><button on:click="{open4}">종점 검색</button></li>
            </ul>
        </div>
        <div id="inputdiv">
            <ul id="inputul">
                <li class="inputli">
                    {#if a}
                    <label>
                        <input type="text" bind:value="{text}" placeholder="버스 유형을 정확히 입력해주세요">
                    </label>             
                    {/if} 
                </li>
                <li class="inputli">
                    {#if b}
                    <label>
                        <input type="text" bind:value="{text}" placeholder="버스 번호를 정확히 입력해주세요">
                    </label>             
                    {/if}
                </li>
                <li class="inputli">
                    {#if c}
                    <label>
                        <input type="text" bind:value="{text}" placeholder="기점의 정확한 이름을 입력해주세요">
                    </label>             
                    {/if}
                </li>
                <li class="inputli">
                    {#if d}
                    <label>
                        <input type="text" bind:value="{text}" placeholder="종점의 정확한 이름을 입력해주세요">
                    </label>             
                    {/if}
                </li>
            </ul>
        </div>
    </div>
</div>


<style>
    #seardiv{
        display: table;
        margin-left: auto;
        margin-right: auto;
    }
    #searul{
        width: 100%;
        height: 50px;
    }
    .searli{
        list-style: none;
        float: left;
        margin: 10px;
    }
    #inputul{
        width: 100%;
        height: 50px; 
    }
    .inputli{
        list-style: none;
        margin: 10px;     
    }
    input{
        width: 250px;
        height: 30px;
        font-size: 1em;
    }
    button{
        border-radius: 10px 10px 10px 10px;
        width: 100px;
        height: 40px;
        background-color: lightgrey;
        font-size: 1em;
    }
</style>