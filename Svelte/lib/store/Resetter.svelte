<script>
    //Resetter.svelte
    import {count} from "./stores"  //확장자 써도 되고 안 써도 됨

    function reset(){
        count.set(0)
    }
</script>

<button on:click="{reset}">Reset</button>