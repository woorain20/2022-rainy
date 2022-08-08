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

    let first, gukbo, bomul, gita=false
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
        <h3>상세 검색</h3>
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
    </div>
    <div id="result">
        <div id="option_result">
            {#each relicinfo as info}
                {#if muserel==info.museum}
                    <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">
                {/if}
            {/each}                     
        </div>
        <div id="note_result">
            {#if gukbo}
                {#each relicinfo as info}
                    {#if info.note.slice(0,2)=="국보"}
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">               
                    {/if}                 
                {/each}
            {:else if bomul}
                {#each relicinfo as info}
                    {#if info.note.slice(0,2)=="보물"}
                        <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">               
                    {/if}                 
                {/each}
            {:else if gita}    
                {#each relicinfo as info}
                    {#if info.note.slice(0,2)!="국보"}
                        {#if info.note.slice(0,2)!="보물"}
                            <img src="./src/lib/relic/relicimg/{info.image}.jpg" alt="유물">        
                        {/if}
                    {/if}                 
                {/each}
            {/if}
        </div>
    </div>
</div>

<style>
    img{
        width: 300px;
        height: 300px;
    }
</style>