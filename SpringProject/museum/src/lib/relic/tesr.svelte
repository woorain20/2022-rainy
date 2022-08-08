<script>
    import { onMount } from "svelte";
import { each } from "svelte/internal";

    const relic="http://192.168.0.51:8080/relic/?page=0&size=148"

    let relicinfo=[]

    onMount(async function(){
        const res=await fetch(relic)
        const data = await res.json()
        relicinfo=data._embedded.relic
        console.log(relicinfo)
    })

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

    let gukbo, bomul, gita=false

    function te(){
        muserel=null
        gukbo=bomul=gita=false
    }
</script>

<div id="main">
    <div id="header">
        <h1>소장품 찾기</h1>
    </div>
    <div id="search_input">
        <input type="text" autocomplete="off" placeholder="소장품 찾기">
        <input type="submit" value="검색">
    </div>
    <div id="option">
        <div id="title_option">
            <h4>상세 검색</h4>
        </div>
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
        <button on:click="{te}">reset</button>
    </div>
    <div id="result">
        {#each relicinfo as info}
            {#if muserel==info.museum}
                <div id="content">
                    <div id="img">
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                    </div>
                    <div id="text">
                        <table>
                            <tr>
                                <td id="tda">{info.name}</td>
                            </tr>
                            <tr>
                                <td>시기: {info.period}</td>
                            </tr>
                            <tr>
                                <td>등재: {info.note}</td>
                            </tr>
                            <tr>
                                <td>출토지: {info.excavation}</td>
                            </tr>
                            <tr>
                                <td>소장박물관: {info.museum}</td>
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
                                    <td id="tda">{info.name}</td>
                                </tr>
                                <tr>
                                    <td>시기: {info.period}</td>
                                </tr>
                                <tr>
                                    <td>등재: {info.note}</td>
                                </tr>
                                <tr>
                                    <td>출토지: {info.excavation}</td>
                                </tr>
                                <tr>
                                    <td>소장박물관: {info.museum}</td>
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
                                    <td id="tda">{info.name}</td>
                                </tr>
                                <tr>
                                    <td>시기: {info.period}</td>
                                </tr>
                                <tr>
                                    <td>등재: {info.note}</td>
                                </tr>
                                <tr>
                                    <td>출토지: {info.excavation}</td>
                                </tr>
                                <tr>
                                    <td>소장박물관: {info.museum}</td>
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
                                        <td id="tda">{info.name}</td>
                                    </tr>
                                    <tr>
                                        <td>시기: {info.period}</td>
                                    </tr>
                                    <tr>
                                        <td>등재: {info.note}</td>
                                    </tr>
                                    <tr>
                                        <td>출토지: {info.excavation}</td>
                                    </tr>
                                    <tr>
                                        <td>소장박물관: {info.museum}</td>
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
    #title_option{
        float: left;
        margin-right: 30px;
    }
    #museum_option{
        float: left;
        margin-right: 30px;
        font-size: 1.1em;
    }
    #note_option{
        float: left;
        margin-right: 30px;
        font-size: 1.1em;
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
        width: 300px;
    }
    #tda{
        font-weight: 900;
        font-size: 1.2em;
    }
    td{
        height: 40px;
    }
</style>