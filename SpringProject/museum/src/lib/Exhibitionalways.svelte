<script>
    import { onMount } from "svelte";
    import Exhibitiondetail from "./exhibitiondetail.svelte";
    import { callid } from "./store";
    import { paginate, PaginationNav } from 'svelte-easy-paginate'

    let items=[]
    let inknum
    
    const slidingbnn="http://192.168.0.51:8080/exhibition/"
    
    onMount(async function(){
        const red= await fetch(slidingbnn)
        const open= await red.json()
        items=open._embedded.exhibition
    })
    function addno(ibs){
        inknum=ibs
        console.log(inknum)
    }
        
    $:callid.update(t=>inknum)

    let page=true
    let detail=false

    function toggle(){
    page=!page
    detail=!detail
    }
    
    let currentPage = 1
    let pageSize = 4
    $: exhib = paginate({ items, pageSize, currentPage })

    </script>
    
    <h1>Always Exhibitions</h1>
    {#if page}
    <div class="grid">
        {#each exhib.filter(t=>t.done) as exhibition}
            {#if exhibition.always}
                <label class="square" on:click={toggle}>
                    <button id="d" on:click={()=>{addno(exhibition.id)}}>
                        <img src="./src/lib/exhibitionposter/{exhibition.poster}.jpg" alt = "사진오류" />
                        <br /><br />
                        <h4>{exhibition.title}</h4>
                        <p>{exhibition.startday}~{exhibition.endday}</p>
                    </button>
                </label>
            {/if}
        {/each}
    </div>
    <PaginationNav
    totalItems="{items.length}"
    pageSize="{pageSize}"
    currentPage="{currentPage}"
    limit="{1}"
    showStepOptions="{true}"
    on:setPage="{(e) => currentPage = e.detail.page}"
    />
    {/if}
    {#if detail}
    <bottun id="qwe" on:click={toggle}>다른 이벤트 보기</bottun>
    <Exhibitiondetail/>
    {/if}

    <style>
        .grid{
        display: grid;
        flex: 1;
        grid-template-columns: repeat(3, 4fr);
        grid-template-rows: repeat(1, 1fr);
        grid-gap: 1vmin;
        width:90%;
        margin: 0px auto;
        }
    div>label>button {
        width: 100%;
        height: 100%;
        color:black;
        border: none;
        margin: 0;
        }
    img{
        width:100%;
        height:60%;
    }
    #qwe{
    float: right;
    border: 1px solid black;
    background-color: bisque;
    margin-right:30%;
}
    </style>