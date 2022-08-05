<script>
import { onMount } from "svelte";


let posters=[]
let exhib=[]
let boards=[]
let events=[]

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

{#each posters as post}
<label class="upsidebanner">
    <button class="upsidebanner">
        <img src = "./src/lib/mainpage/image/{post.poster}.jpg" alt="업슴">
    </button>
</label>
   {/each}
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
        <li ><a href="https://www.museum.go.kr/site/main/archive/united/18496">{board.title}</a>     <div style="float:right">{board.date}</div></li> 
    {/each}
</ul>

<h3>행사</h3>

{#each events as event}
<label>
    <button class="eventposter">
        <input type= radio ><img src = "./src/lib/eventbanner/{event.banner}.jpg" alt="업슴">
    </button>

</label><br/>
<button>{event.eventname}</button>
<p>{event.startday} ~ {event.endday}</p>
{/each}

<style>
.upsidebanner{
    width:100%;
    height: 300px;
}
.upsidebanner>img{
    width:100%;
    height : 100%;
}
#board{
    border: 1px solid black;
}
.eventposter>img{
    width: 200px;
    height: 300px;
}

</style>

