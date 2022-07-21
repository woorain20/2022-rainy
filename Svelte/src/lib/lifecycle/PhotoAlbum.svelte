<script>
import { onMount } from "svelte";

    let photos=[]
    onMount(async ()=>{
        const res=await fetch("https://jsonplaceholder.typicode.com/photos")
        photos=await res.json()
        console.log(photos)
    })
</script>

<h1>Photo Album</h1>
<div class="photos">
    {#each photos as photo}
        <figure>
            <img src={photo.thumbnailUrl} alt={photo.title}/>
            <figcaption>{photo.title}</figcaption>
        </figure>    
    {:else}
        <p>Loading....</p>  <!-- each 안에도 else 가능 -->
    {/each}
</div>

<style>
    .photos{
        width: 100%;
        display: grid;
        grid-template-columns: repeat(7,1fr);
        grid-gap:8px;
    }
    figure, img{
        margin: 0;
        width: 100%;
    }
</style>