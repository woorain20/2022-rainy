<script>
    import { onMount } from "svelte";
    import RelicOption from "./RelicOption.svelte";
    import RelicSearch from "./RelicSearch.svelte";

    const relic="http://192.168.0.51:8080/relic/?page=0&size=148"

    let relicinfo=[]

    onMount(async function(){
        const res=await fetch(relic)
        const data = await res.json()
        relicinfo=data._embedded.relic
        // console.log(relicinfo)
    })

    let search, option=false

    function searopen(){
        search=true
        option=false
    }
    function optopen(){
        search=false
        option=true
    }
</script>

<div id="main">
    <div id="header">
        <h1>소장품 검색</h1>
    </div>
    <div id="option">
        <button on:click="{searopen}">검색</button>
        <button on:click="{optopen}">상세 검색</button>
    </div>
    <div id="result">
        {#if search}
            <RelicSearch/>
        {:else if option}
            <RelicOption/>
        {:else}
            {#each relicinfo as info}
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
            {/each}
        {/if}
    </div>
</div>

<style>
    #option{
        margin-top: 35px;
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