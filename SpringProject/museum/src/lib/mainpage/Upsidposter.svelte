<script>
import { onMount } from "svelte";


let exhib=[]
let boards=[]
let mainposter=[]
let eventposter=[]

const upsidebanner="http://192.168.0.51:8080/mainpage/"
const slidingbnn="http://192.168.0.51:8080/exhibition/"
const boardbnn="http://192.168.0.51:8080/postboard/"
const eventdb="http://192.168.0.51:8080/event/"

onMount(async function(){
  const res=await fetch(upsidebanner)
  const data = await res.json()
  mainposter=data._embedded.mainpage
  
  const red= await fetch(slidingbnn)
  const open= await red.json()
  exhib=open._embedded.exhibition
  
  const rew= await fetch(boardbnn)
  const por= await rew.json()
  boards=por._embedded.postboard
  
  const rsq= await fetch(eventdb)
  const vev= await rsq.json()
  eventposter=vev._embedded.event
  
})

let currId = 0;
let positionLeft = 0;

  const moveSlider = () => {
    positionLeft = currId * 33;
  };

  const next = () => {
    currId = currId === eventposter.length - 1 ? 0 : currId + 1;
    moveSlider();
  };
	
  const prev = () => {
    currId = currId === 0 ? eventposter.length-1 : currId - 1;
    moveSlider();
  };

  const getIndex = (index) => {
    currId = index;
    moveSlider();
  };

let currpost = 0;
let positionright = 0;

  function moveSliders () {
    positionright = currpost * 25;
  };

  const nextt = () => {
    currpost = currpost === exhib.length - 1 ? 0 : currpost + 1;
    moveSliders();
  };
	
  const prevv = () => {
    currpost = currpost === 0 ? exhib.length-1 : currpost - 1;
    moveSliders();
  };

	

</script>



<div class="section-title">
  <h2>전국 전시회 모음</h2>
  <p>전국에 진행중인 전시회</p>
</div>

  <div class="container1" >
    <div class=" slider3" style="left: -{positionright}%;">
      {#each exhib as exhibition}
      <div>
        <label>
          <button>
              <img src = "./src/lib/exhibitionposter/{exhibition.poster}.jpg" alt="업슴">
          </button>
        </label>
      </div>
      {/each}
    </div>
    <div class="arrow">
      <button on:click={prevv} class="prevv">&lang;</button>
      <button on:click={nextt} class="nextt">&rang;</button>
    </div>
  </div>
  <br /><br />
  <div class="section-title">
    <h2>공지사항</h2>
  </div>
  <div id="board">
    <ul>
        {#each boards as board}
          {#if board.official}
            <li ><a href="http://127.0.0.1:5173/board.html/">{board.title}</a>    
            <div style="float:right">{board.date}</div></li> 
          {/if}
        {/each}
    </ul>
  </div>
<br />

<section id="clients" class="clients">
  <div class="container">

    <div class="section-title">
      <h2>EVENT</h2>
      <p>지금 신청 가능하거나 진행중인 EVENT 최신 소식!</p>
    </div>


      <div class="container1"   >
          <div id="eventbanner" class=" slider2" style="left: -{positionLeft}%;">
            {#each eventposter as event}
              <div id ="sliderset">
                <label>
                    <button class="eventposter">
                      <img src = "./src/lib/eventbanner/{event.banner}.jpg" class="img-fluid" alt="업슴">
                    </button>
                </label><br />
                <button id="nametak">{event.eventname}</button>
                <p>{event.startday} ~ {event.endday}</p>
              </div>
            {/each}
          </div>
          <div class="arrow">
            <button on:click={prev} class="prev">Prev</button>
            <button on:click={next} class="next">Next</button>
          </div>
          <div class="papagination">
            {#each eventposter as _, i}
              <button
                class={currId === i ? 'active' : ''}
                on:click={() => getIndex(i)}
              ></button>
            {/each}
          </div>
      </div>
      
  </div>

</section><!-- End Clients Section -->



<style>
  
  .container1 {
    position: relative;
    width: 100%;
    height: 100%;
    max-width: 1000px;
    margin: 0 auto;
    overflow: hidden;
  }
  .slider2 {
    display: flex;
    position: relative;
    transition: left 0.5s;
  }
  .slider3 {
    widows: 100%;
    height:100%;
    display: flex;
    position: relative;
    transition: left 0.5s;
  }
  .slider3>div{
    width: 25%;
    height: 100%;
    object-fit: cover;
    flex-shrink: 0;
  }
  .slider3>div>label{
    width:200px;  
    height:300px;
  }
  .slider3>div>label>button{
    width:100%; 
    height:100%; 
  }
  .slider3>div>label>button>img{
    width:100%;  
    height:100%;
  }
 
  .slider2 img{
    width: 100%;
    height: auto;
    object-fit: cover;
    flex-shrink: 0;
  }
  .slider2>#sliderset {
    width: 33%;
    height: 100%;
    object-fit: cover;
    flex-shrink: 0;
  }
  #board{
    border-top: 1px solid black;
    border-bottom: 1px solid black;
    max-width: 1000px;
    width: 100%;
    margin: 0px auto;
    padding-top:10px; 
  }
  #eventbanner{
    float: left;
    text-align: center;
    width:100%;
  }
  .eventposter{
    width:250px;
  }
  
  .eventposter img{
    width: 250px;
    height: 250px;
  }
  .container{
    margin:0px auto;
  }
  .arrow {
    display: flex;
    justify-content: space-between;
    align-items: center;
    position: absolute;
    width: 100%;
    height: 100%;
    top: 0;
  }
  .arrow>button {
    margin-bottom: 0;
    padding: 12px;
    border: 0;
    background-color: rgba(255, 255, 255, 0.7);
    cursor: pointer;
  }
  
#nametak{
    width: 100%;
    border: 0px;
    background-color: white;
  }
#nametak:hover{
  background-color: antiquewhite;
}

.papagination {
    position: absolute;
    bottom: 0;
    padding-bottom: 8px;
    width: 100%;
  }

  .papagination button {
    margin: 0 4px;
    width: 14px;
    height: 14px;
    border: 0;
    border-radius: 50%;
    background-color: rgba(255, 255, 255, 0.8);
    text-align: center;
    cursor: pointer;
  }
  .papagination .active {
    background-color: rgba(255, 0, 0, 0.8);
  }


</style>

