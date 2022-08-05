<script>
import Exhibitionalways from "./Exhibitionalways.svelte";

let step = true


</script>

{#if step}
<h2>상설 전시회</h2>
{:else}
<h2>특별전시회</h2>
{/if}

<button on:click={()=>{step = true}}>상설 전시</button>
<button on:click={()=>{step = false}}>특별 전시</button>

{#if step}
<Exhibitionalways />

{/if}