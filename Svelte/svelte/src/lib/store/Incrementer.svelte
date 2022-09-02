<script>
    //Incrementer.svelte
    import {count} from "./stores.js"

    function increment(){
        count.update(v=>v+1)
    }
</script>

<button on:click="{increment}">+</button>