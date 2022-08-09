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
    }
</script>

<div id="search_input">
    <input type="text" autocomplete="off" placeholder="유물명" bind:value="{text}">
    <button on:click="{open}">찾기</button>
    <button on:click="{close}">RESET</button>
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
<style>
    #result{
        margin-top: 30px;
    }
    img{
        width: 300px;
        height: 250px;
    }
    #content{
        margin-top: 20px;
        width: 700px;
        height: 260px;
        border-bottom: 1px dashed;
    }
    #img{
        float: left;
    }
    #text{
        float: left;
        margin-left: 30px;
    }
    table{
        text-align: left;
        width: 320px;
    }
    .tda{
        font-weight: 900;
        font-size: 1.2em;
    }
    .tdb{
        width: 200px;
    }
    td{
        width: 100px;
        height: 40px;
    }
</style>