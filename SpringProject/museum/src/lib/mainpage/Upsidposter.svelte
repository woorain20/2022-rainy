<script>
import { onMount } from "svelte";


let posters=[]
let exhib=[]

const upsidebanner="http://127.0.0.1:8080/mainpage/"
const slidingbnn="http://127.0.0.1:8080/exhibition/"

onMount(async function(){
    const res=await fetch(upsidebanner)
    const data = await res.json()
    posters=data._embedded.mainpage

    const red= await fetch(slidingbnn)
    const open= await red.json()
    exhib=open._embedded.exhibition
})

</script>

<h1>Upsideposet</h1>

{#each posters as post}
<label>
    <button>
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
        <img src = "./src/lib/mainpage/image/{exhibition.poster}.jpg" alt="업슴">
    </button>
</label>
{/each}

<h2>알립니다</h2>
<p>공지사항, 공고, 채용, 보도자료</p>
if이요해서 만들기


