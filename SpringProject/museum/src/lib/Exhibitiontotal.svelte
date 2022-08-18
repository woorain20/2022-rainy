<script>
    import { onMount } from "svelte";
    import { paginate } from "svelte-easy-paginate";
    import PaginationNav from "svelte-easy-paginate/src/PaginationNav.svelte";
    import Exhibitiondetail from "./exhibitiondetail.svelte";
    import { callid } from "./store";


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
    let pageSize = 7
    $: exhib = paginate({ items, pageSize, currentPage })

</script>
<div id="main">
    <div id="head">
        <h1>EXHIBITIOM</h1>
    </div>
{#if page}
    
    <div class="grid ">
        {#each exhib as exhibition}
            {#if exhibition.done}
                <label class="square open" on:click={toggle}>
                    <button id="d" class="open" on:click={()=>{addno(exhibition.id)}}>
                        {#if exhibition.always}
                            <h2> 상설 전시회</h2>
                        {:else if !exhibition.always}
                            <h2> 특별 전시회</h2>
                        {/if}
                        <img src="./src/lib/exhibitionposter/{exhibition.poster}.jpg" alt = "사진오류" />
                        <br /><br />
                        <h4>{exhibition.title}</h4>
                        <p>{exhibition.startday}~{exhibition.endday}</p>
                    </button>
                </label>
            {:else}
                <label class="square close ">
                    <button id="d" class="close " >
                        <img src="./src/lib/exhibitionposter/{exhibition.poster}.jpg" alt = "사진오류" />
                        <br /><br />
                        <h4>{exhibition.title}</h4>
                        <h2>전시 완료</h2>
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
    <bottun id="qwe" on:click={toggle}>다른 이벤트</bottun>
    <Exhibitiondetail/>
    {/if}
</div>

<style>
#main{
    text-align: center;
    vertical-align: middle;
    margin-top: 3%;
}
#head{
    margin-bottom: 2%;
}
.grid{
    display: grid;
	flex: 1;
	grid-template-columns: repeat(3, 4fr);
	grid-template-rows: repeat(2, 1fr);
	grid-gap: 1vmin;
    width:60%;
    margin: 0px auto;
    margin-bottom: 2%;
}
.open{
    background-color: white;
}
.open:hover{
    background-color: #ccffee;
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
    border: 2px solid black;
    background-color: bisque;
    border-radius: 5px;
    font-weight: 600;
    font-size: 1.2em;
    margin-right:30%;
}
#qwe:hover{
    background-color: #ffff99;
}
.close{
    opacity: 0.6;
}
.close:hover{
    background-color: lightcoral;
    content:"전시 완료";
}

    
    </style>