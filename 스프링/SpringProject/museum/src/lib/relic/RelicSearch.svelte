<script>
    import { onMount } from "svelte";

    const relic="http://192.168.0.51:8080/relic/?page=0&size=148"

    let relicinfo=[]

    onMount(async function(){
        const res=await fetch(relic)
        const data = await res.json()
        relicinfo=data._embedded.relic
        // console.log(relicinfo)
    })
    let text=""

    let a=false
    function open(){
        a=!a
    }
    function close(){
        a=false
        text=""
    }
</script>

<div id="main">
<div id="search_input">
    <input type="text" autocomplete="off" placeholder="유물명" bind:value="{text}">
    <button class="but" on:click="{open}">찾기</button>
    <button class="but" on:click="{close}">RESET</button>
</div>
<div id="result">
    {#if a}
    {#each relicinfo as info}
        {#if text}
            {#if text==info.name.slice(0,1)}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td class="tda" colspan="2">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기</td>
                                <td class="tdb">{info.period}</td>
                            </tr>
                            <tr>
                                <td>등재</td>
                                <td class="tdb">{info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지</td>
                                <td class="tdb">{info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관</td>
                                <td class="tdb">{info.museum}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            {/if}
            {#if text==info.name.slice(0,2)}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td class="tda" colspan="2">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기</td>
                                <td class="tdb">{info.period}</td>
                            </tr>
                            <tr>
                                <td>등재</td>
                                <td class="tdb">{info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지</td>
                                <td class="tdb">{info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관</td>
                                <td class="tdb">{info.museum}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            {/if}
            {#if text==info.name.slice(0,3)}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td class="tda" colspan="2">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기</td>
                                <td class="tdb">{info.period}</td>
                            </tr>
                            <tr>
                                <td>등재</td>
                                <td class="tdb">{info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지</td>
                                <td class="tdb">{info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관</td>
                                <td class="tdb">{info.museum}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            {/if}
            {#if text==info.name.slice(0,4)}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td class="tda" colspan="2">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기</td>
                                <td class="tdb">{info.period}</td>
                            </tr>
                            <tr>
                                <td>등재</td>
                                <td class="tdb">{info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지</td>
                                <td class="tdb">{info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관</td>
                                <td class="tdb">{info.museum}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            {/if}
            {#if text==info.name.slice(0,5)}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td class="tda" colspan="2">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기</td>
                                <td class="tdb">{info.period}</td>
                            </tr>
                            <tr>
                                <td>등재</td>
                                <td class="tdb">{info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지</td>
                                <td class="tdb">{info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관</td>
                                <td class="tdb">{info.museum}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            {/if}
            {#if text==info.name.slice(0,6)}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td class="tda" colspan="2">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기</td>
                                <td class="tdb">{info.period}</td>
                            </tr>
                            <tr>
                                <td>등재</td>
                                <td class="tdb">{info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지</td>
                                <td class="tdb">{info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관</td>
                                <td class="tdb">{info.museum}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            {/if}
            {#if text==info.name.slice(0,7)}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td class="tda" colspan="2">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기</td>
                                <td class="tdb">{info.period}</td>
                            </tr>
                            <tr>
                                <td>등재</td>
                                <td class="tdb">{info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지</td>
                                <td class="tdb">{info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관</td>
                                <td class="tdb">{info.museum}</td>
                            </tr>
                        </table>
                    </div>
                </div>
                {/if}
                {#if text==info.name}
                    <div id="content">
                        <div id="img">
                            <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                        </div>
                        <div id="text">
                            <table>
                                <tr>
                                    <td class="tda" colspan="2">{info.name}</td>
                                </tr>
                                <tr>
                                    <td>시기</td>
                                    <td class="tdb">{info.period}</td>
                                </tr>
                                <tr>
                                    <td>등재</td>
                                    <td class="tdb">{info.note}</td>
                                </tr>
                                <tr>
                                    <td>출토지</td>
                                    <td class="tdb">{info.excavation}</td>
                                </tr>
                                <tr>
                                    <td>소장박물관</td>
                                    <td class="tdb">{info.museum}</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                {/if}
            {/if}    
        {/each}
    {/if}
</div>
</div>
<style>
    #main{
        text-align: center;
        vertical-align: middle;
        width: 100%;
    }
    #search_input{
        width: 100%;
        height: 20%;
        margin-left: 10%;
        margin-top: 3%;
    }
    #search_input > input{
        width: 25%;
        margin-right: 3%;
    }
    .but{
        border: 3px outset;
        border-radius: 5px;
        font-weight: 600;
    }
    .but:hover{
        border: 3px inset;
    }
    #result{
        margin-top: 3%;
        margin-left: 15%;
    }
    #content{
        margin-top: 3%;
        margin-bottom: 2%;
        width: 100%;
        border-bottom: 2px dashed;
    }
    #img{
        width: 300px;
        height: 270px;
        float: left;
        margin-bottom: 2%;
        overflow: hidden;
    }
    img{
        width: 100%;
        height: 100%;
        object-fit: fill;
        transition: all 0.2s linear;
    }
    img:hover{
        transform: scale(1.1);
    }
    #text{
        width: 350px;
        height: 270px;
        margin-left: 60%;
        margin-bottom: 2%;
    }
    table{
        text-align: left;
        width: 100%;
        height: 100%;
        object-fit: fill;
    }
    .tda{
        font-weight: 900;
        font-size: 1.2em;
    }
    .tdb{
        width: 20%;
    }
    td{
        width: 10%;
        height: 4%;
    }
</style>