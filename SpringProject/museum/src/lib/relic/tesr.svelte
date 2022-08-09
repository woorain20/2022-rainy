<script>
    import { onMount } from "svelte";

    const relic="http://192.168.0.51:8080/relic/?page=0&size=148"

    let relicinfo=[]

    onMount(async function(){
        const res=await fetch(relic)
        const data = await res.json()
        relicinfo=data._embedded.relic
        console.log(relicinfo)
    })

    let text=""

    let rel = 0
	let muserel = []

	let muse = [
		'국립중앙박물관',
		'국립경주박물관',
		'국립광주박물관',
		'국립전주박물관',
		'국립대구박물관',
		'국립부여박물관',
		'국립공주박물관',
		'국립진주박물관',
		'국립청주박물관',
		'국립김해박물관',
		'국립제주박물관',
		'국립춘천박물관',
		'국립나주박물관',
		'국립익산박물관'
	]

	function join(muserel) {
		if (muserel.length === 1) return muserel[0]
		return `${muserel.slice(0, -1).join(', ')} and ${muserel[muserel.length - 1]}`
	}

    let option, gukbo, bomul, gita=false
    
    function optopen(){
        option=!option
    }

    function reset(){
        muserel=null
        gukbo=bomul=gita=false
    }
</script>

<div id="main">
    <div id="header">
        <h1>소장품 찾기</h1>
    </div>
    <div id="search_input">
        <input type="text" autocomplete="off" placeholder="유물명" bind:value="{text}">
    </div>
    <div id="option">
        <button on:click="{optopen}">상세 검색</button>
        <div id="detail">
            {#if option}
            <div id="museum_option">  
                <select bind:value={muserel}>
                    {#each muse as reli}
                    <option value={reli}>
                        {reli}
                    </option>
                    {/each}
                </select>
            </div>
            <div id="note_option">
                <label>
                    <input type="checkbox" bind:checked="{gukbo}">국보
                </label>
                <label>
                    <input type="checkbox" bind:checked="{bomul}">보물
                </label>
                <label>
                    <input type="checkbox" bind:checked="{gita}">기타
                </label>
            </div>
            <div id="reset_bt">
            <button on:click="{reset}">reset</button>
            </div>
            {/if}
        </div>
    </div>
    <div id="result">
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

            {:else if muserel==info.museum}
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
            {:else if muserel!=info.museum}
                {#if gukbo}             
                    {#if info.note.slice(0,2)=="국보"}
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
                {:else if bomul}
                    {#if info.note.slice(0,2)=="보물"}
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
                {:else if gita}    
                    {#if info.note.slice(0,2)!="국보"}
                        {#if info.note.slice(0,2)!="보물"}
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
                {/if}                 
            {/if}              
        {/each}                        
    </div>
</div>

<style>
    #option{
        margin-top: 35px;
    }
    #detail{
        width: 600px;
        height: 100px;
        margin-top: 30px;
        display: flex;
    }
    #museum_option{
        float: left;
        margin-right: 20px;
        font-size: 1.1em;
        flex: 3.5;
    }
    #note_option{
        float: left;
        margin-right: 20px;
        font-size: 1.1em;
        flex: 3.5;
    }
    #reset_bt{
        flex: 2;
    }
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