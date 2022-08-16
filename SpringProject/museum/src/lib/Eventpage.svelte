<script>
import { onMount } from "svelte";
import Eventdetail from "./Eventdetail.svelte";
import { callid } from "./store";
import { paginate, PaginationNav } from 'svelte-easy-paginate'

let items=[]
let inknum

const eventdb="http://192.168.0.51:8080/event/"

onMount(async function(){
    
    const rsq= await fetch(eventdb)
    const vev= await rsq.json()
    items=vev._embedded.event
})
function addno(ibs){
    inknum=ibs
    console.log(inknum)
}
let page=true
let detail=false

function toggle(){
    page=!page
    detail=!detail
}
$:callid.update(t=>inknum) 

    let currentPage = 1
    let pageSize = 7
    $: events = paginate({ items, pageSize, currentPage })

</script> 

<div id="main">
    <div id="head">
        <h1>Museum EVENT</h1>
    </div>
{#if page}

<div class="grid">
    {#each events.filter(t=>t.done) as event}
    <label class="square" on:click={toggle}>
       <button id="d" on:click={()=>{addno(event.no)}}>
        <img src="./src/lib/eventbanner/{event.banner}.jpg" alt = "사진오류" />
                <br /><br />
                <h4>{event.eventname} </h4>
                <p>{event.startday}~{event.endday}</p>
            </button>
        </label>
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
<Eventdetail />
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
    width:90%;
    margin: 0px auto;
    margin-bottom: 2%;
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