<script>
import About from "./About.svelte"

    let about=false
    let blog=false
    function notBoolean(){
        about=!about
    }
</script>

<h1>Routing Home</h1>
<button on:click="{notBoolean}">About</button>
{#if about}
    <About/>
{/if}
