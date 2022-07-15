<script>
import { onMount } from "svelte";

export let movie=[]
let actors
let actors1
let actors2
let actors3
let i=0
function index(){
    i++
}
let text=""
let text2=""
let b=false
function br(){
    b!=b
    text2
}
    onMount(async()=>{
        const res=await fetch("http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=f5eef3421c602c6cb7ea224104795888&movieCd=20124079")
        movie=await res.json()
        actors = movie.movieInfoResult.movieInfo.actors
        actors1 = movie.movieInfoResult.movieInfo.actors[i].peopleNm
        actors2 = movie.movieInfoResult.movieInfo.actors[1].peopleNm
        actors3 = movie.movieInfoResult.movieInfo.actors[i]
        console.log(movie["movieInfoResult"]["movieInfo"]["actors"])
        console.log(actors.length)
    })     
</script>

<div>
    <input type="text" bind:value="{text}">
    {#if text}
        {#if text==actors1}
            <p>{actors3.peopleNmEn}</p>
            <p>{actors3.cast}</p>
        {/if}
    {/if}
</div>
<div>
    <input type="text" bind:value="{text2}">
    {#if text2}
        {#each actors as act}
            {#if text2==act.peopleNm}
                <table>
                    <tr>
                        <td>{act.peopleNm}</td>
                        <td>{act.peopleNmEn}</td>
                        <td>{act.cast}</td>
                    </tr>
                </table>
            {/if}
        {/each}
    {/if}
    <!-- {actors} -->
    <!-- {actors2} -->
</div>
