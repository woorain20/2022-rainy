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

    function reset(){
        muserel=null
        gukbo=bomul=gita=false
    }
</script>

<div id="main">
<div id="detail">
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
</div>
<div id="result">
    {#each relicinfo as info}
    {#if muserel==info.museum}
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
        {:else}
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
</div>
</div>

<style>
    #main{
        text-align: center;
        vertical-align: middle;
        width: 100%;
    }
    #detail{
        width: 100%;
        height: 20%;
        margin-left: 10%;
        margin-top: 3%;
        display: flex;
    }
    #museum_option{
        float: left;
        margin-right: 1%;
        font-size: 1.1em;
        flex: 3;
    }
    #note_option{
        float: left;
        margin-right: 1%;
        font-size: 1.1em;
        flex: 3;
    }
    #reset_bt{
        flex: 2;
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