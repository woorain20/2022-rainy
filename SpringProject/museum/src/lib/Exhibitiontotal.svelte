<script>
import Exhibitionalways from "./Exhibitionalways.svelte";
import Exhibitionspecial from "./Exhibitionspecial.svelte";

let step = true


</script>

<div id="main">
    <div id="head">
        {#if step}
        <h2>상설 전시회</h2>
        {:else}
        <h2>특별전시회</h2>
        {/if}
    </div>
    <div id="but">
        <button on:click={()=>{step = true}}>상설 전시</button>
        <button on:click={()=>{step = false}}>특별 전시</button>
    </div>
    <div id="content">
    {#if step}
    <Exhibitionalways />
    {:else}
    <Exhibitionspecial />
    {/if}
    </div>
</div>

<style>
    #main{
        text-align: center;
        vertical-align: middle;
        margin-top: 3%;
        margin-bottom: 2%;
    }
    #head{
        margin-bottom: 1%;
    }
    #but{
        margin-top: 1%;
        margin-bottom: 1%;
    }
    #content{
        width: 80%;
        margin-left: 12%;
    }
</style>
