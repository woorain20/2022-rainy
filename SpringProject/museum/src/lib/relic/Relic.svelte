<script>
    import { onMount } from "svelte";
    import RelicOption from "./RelicOption.svelte";
    import RelicSearch from "./RelicSearch.svelte";
    import { paginate, PaginationNav } from 'svelte-easy-paginate'

    const relic="http://192.168.0.51:8080/relic/?page=0&size=148"

    let items=[]
    
    onMount(async function(){
        const res=await fetch(relic)
        const data = await res.json()
        items=data._embedded.relic
        // console.log(relicinfo)
    })
    
    let currentPage = 1
    let pageSize = 4
    $: relicinfo = paginate({ items, pageSize, currentPage })

    let search, option, view=false

    function searopen(){
        search=true
        option=view=false
    }
    function optopen(){
        option=true
        search=view=false
    }
    function viewopen(){
        view=true
        search=option=false
    }

  
</script>

<div id="main">
    <div id="header">
        <h1>소장품 검색</h1>
    </div>
    <div id="option">
        <button on:click="{searopen}">검색</button>
        <button on:click="{optopen}">상세 검색</button>
        <button on:click="{viewopen}">전체 보기</button>
    </div>
    <div id="result" >
        {#if search}
            <RelicSearch/>
        {:else if option}
            <RelicOption/>
        {:else}
        <ul class="items">
            {#each relicinfo as info}
            <li class="items">
            <div id="content" class="items">
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
        </li>
        {/each}
        <PaginationNav
          totalItems="{items.length}"
          pageSize="{pageSize}"
          currentPage="{currentPage}"
          limit="{1}"
          showStepOptions="{true}"
          on:setPage="{(e) => currentPage = e.detail.page}"
        />
        </ul>
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
    li{
        list-style: none;
    }
</style>