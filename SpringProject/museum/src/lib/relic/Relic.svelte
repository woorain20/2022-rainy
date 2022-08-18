<script>
    import { onMount } from "svelte";
    import RelicOption from "./RelicOption.svelte";
    import RelicSearch from "./RelicSearch.svelte";
    import { paginate, PaginationNav } from 'svelte-easy-paginate'

    const relic="http://192.168.0.51:8080/relic/?page=0&size=200"

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
        currentPage=1
    }

  
</script>

<div id="main">
    <div id="head">
        <h1>소장품 찾기</h1>
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
    #main{
        text-align: center;
        vertical-align: middle;
    }
    #head{
        margin-top: 3%;
    }
    #option{
        margin-top: 3%;
    }
    #result{
        margin-top: 3%;
        margin-left: 20%;
        margin-right: 30%;
    }
    #content{
        margin-top: 2%;
        margin-bottom: 3%;
        width: 100%;
        border-bottom: 2px dashed;
    }
    #img{
        width: 300px;
        height: 270px;
        float: left;
        margin-bottom: 2%;
        margin-left: 10%;
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
        margin-left: 55%;
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
    li{
        list-style: none;
    }
    #option>button{
        background-color: white;
        border:0px;
        border-bottom:2px solid gray;
    }
</style>