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

<h1>Upsideposet</h1>

<section id="hero">
    <div class="hero-container">
      <div id="heroCarousel" data-bs-interval="5000" class="carousel slide carousel-fade" data-bs-ride="carousel">

        <ol class="carousel-indicators" id="hero-carousel-indicators"></ol>

        <div class="carousel-inner" role="listbox">

          <!-- Slide 1 -->
          <div class="carousel-item active" style="background-image: url(assets/img/slide/slide-1.jpg)">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animate__animated animate__fadeInDown">Welcome to <span>Eterna</span></h2>
                <p class="animate__animated animate__fadeInUp">Ut velit est quam dolor ad a aliquid qui aliquid. Sequi ea ut et est quaerat sequi nihil ut aliquam. Occaecati alias dolorem mollitia ut. Similique ea voluptatem. Esse doloremque accusamus repellendus deleniti vel. Minus et tempore modi architecto.</p>
                
              </div>
            </div>
          </div>
          <!-- Slide 2 -->
          <div class="carousel-item" style="background-image: url(assets/img/slide/slide-2.jpg)">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animate__animated fanimate__adeInDown">Lorem <span>Ipsum Dolor</span></h2>
                <p class="animate__animated animate__fadeInUp">Ut velit est quam dolor ad a aliquid qui aliquid. Sequi ea ut et est quaerat sequi nihil ut aliquam. Occaecati alias dolorem mollitia ut. Similique ea voluptatem. Esse doloremque accusamus repellendus deleniti vel. Minus et tempore modi architecto.</p>
                
              </div>
            </div>
          </div>
          <!-- Slide 3 -->
          <div class="carousel-item" style="background-image: url(assets/img/slide/slide-3.jpg)">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animate__animated animate__fadeInDown">Sequi ea <span>Dime Lara</span></h2>
                <p class="animate__animated animate__fadeInUp">Ut velit est quam dolor ad a aliquid qui aliquid. Sequi ea ut et est quaerat sequi nihil ut aliquam. Occaecati alias dolorem mollitia ut. Similique ea voluptatem. Esse doloremque accusamus repellendus deleniti vel. Minus et tempore modi architecto.</p>
              </div>
            </div>
          </div>

        </div>

        <a class="carousel-control-prev" href="#heroCarousel" role="button" data-bs-slide="prev">
          <span class="carousel-control-prev-icon bi bi-chevron-left" aria-hidden="true"></span>
        </a>

        <a class="carousel-control-next" href="#heroCarousel" role="button" data-bs-slide="next">
          <span class="carousel-control-next-icon bi bi-chevron-right" aria-hidden="true"></span>
        </a>

      </div>
    </div>
  </section><!-- End Hero -->
<div>
    <img src ="./src/lib/image/watch.png" alt="수정" style="width:50px">  관람시간
<p>   월/화/목/금/일 10:00 ~ 18:00 수/토 10:00 ~ 21:00    * 입장 마감은 폐관30분 전까지</p>
    <img src="./src/lib/image/wellet.png" alt="수정" style="width:50px">  관람료 
    <p>무료   **특별전시는 유료</p>
</div>

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
if이요해서 만들기


<th>공지사항</th>

<ul id="board">
    {#each boards as board}
        <li ><a href="https://www.museum.go.kr/site/main/archive/united/18496">{board.title}</a>    
         <div style="float:right">{board.date}</div></li> 
    {/each}
</ul>

<h3>행사</h3>

{#each events as event}
<div id="eventbanner">
    <label>
        <button class="eventposter">
            <img src = "./src/lib/eventbanner/{event.banner}.jpg" alt="업슴">
        </button>
    </label><br />
    <button>{event.eventname}</button>
    <p>{event.startday} ~ {event.endday}</p>
</div>
{/each}

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
}
.eventposter>img{
    width: 200px;
    height: 300px;
}

</style>

