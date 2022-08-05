<script>
import { onMount } from "svelte";

let events=[]
let inknum

const eventdb="http://192.168.0.51:8080/event/"

onMount(async function(){
    
    const rsq= await fetch(eventdb)
    const vev= await rsq.json()
    events=vev._embedded.event
})

</script>

<h1>skdhskdksskdhsk</h1>

<div class="grid">
    {#each events.filter(t=>t.done) as event}
        <label class="square" >
                <button id="d" on:click={()=>{inknum=event.id}}>
                <img src="./src/lib/exhibitionposter/{event.banner}.jpg" alt = "사진오류" />
                <br /><br />
                <h4>{event.eventname}</h4>
                <p>{event.startday}~{event.endday}</p>
            </button>
        </label>
    {/each}
</div>


<style>
    .grid{
    display: grid;
	flex: 1;
	grid-template-columns: repeat(3, 4fr);
	grid-template-rows: repeat(3, 1fr);
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

</style>