<script>
import { onMount } from "svelte";


let posters=[]
let exhib=[]
let boards=[]
let events=[]
let sliedtest=[
    {number:"slide-1"},
    {number:"slide-2"},
    {number:"slide-3"},

]

const upsidebanner="http://192.168.0.51:8080/mainpage/"
const slidingbnn="http://192.168.0.51:8080/exhibition/"
const boardbnn="http://192.168.0.51:8080/postboard/"
const eventdb="http://192.168.0.51:8080/event/"

onMount(async function(){
    const res=await fetch(upsidebanner)
    const data = await res.json()
    posters=data._embedded.mainpage

    const red= await fetch(slidingbnn)
    const open= await red.json()
    exhib=open._embedded.exhibition
    
    const rew= await fetch(boardbnn)
    const por= await rew.json()
    boards=por._embedded.postboard
    
    const rsq= await fetch(eventdb)
    const vev= await rsq.json()
    events=vev._embedded.event
})

</script>




<h1>전국 전시회 모음</h1>
{#each exhib as exhibition}
<label>
    <button>
        <img src = "./src/lib/exhibitionposter/{exhibition.poster}.jpg" alt="업슴">
    </button>
</label>
{/each}

<h2>알립니다</h2>
<p>공지사항, 공고, 채용, 보도자료</p>

<th>공지사항</th>

<ul id="board">
    {#each boards as board}
      {#if board.official}
        <li ><a href="https://www.museum.go.kr/site/main/archive/united/18496">{board.title}</a>    
         <div style="float:right">{board.date}</div></li> 
      {/if}
    {/each}
</ul>



<section id="clients" class="clients">
  <div class="container">

    <div class="section-title">
      <h2>행사</h2>
      <p>지금 신청 가능하거나 진행중인 EVENT 최신 소식!</p>
    </div>

    <div class="clients-slider swiper align-items-center" id="eventCarousel">
      <div class="swiper-wrapper ">
        {#each events as event}
        <div id="eventbanner">
            <label>
                <button class="eventposter">
                  <div class="swiper-slide"><img src = "./src/lib/eventbanner/{event.banner}.jpg" class="img-fluid" alt="업슴"></div>
                </button>
            </label><br />
            <button class="nametak">{event.eventname}</button>
            <p>{event.startday} ~ {event.endday}</p>
          </div>
          {/each}
      </div>
      <div class="swiper-pagination"></div>
    </div>

  </div>

</section><!-- End Clients Section -->



<style>
/* .upsidebanner{
    width:100%;
    height: 300px;
}
.upsidebanner>img{
    width:100%;
    height : 100%;
} */
#board{
    border: 1px solid black;
}
#eventbanner{
    float: left;
    text-align: center;
    width:20%;
}
.eventposter>div>img{
    width: 250px;
    height: 250px;
}
.container{
  margin:0px auto;
}
.nametak{
  width: 100%;
  border: 0px;
  background-color: white;
}
.nametak:hover{
  background-color: antiquewhite;
}

</style>

