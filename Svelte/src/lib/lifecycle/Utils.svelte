<script>
import { onDestroy } from "svelte";


    export let callback

    let milliseconds=1000
    const interval=setInterval(callback,milliseconds)
    onDestroy(()=>{
        clearInterval(interval)
    })
</script>

<div>
    <p>This conponent executes a callback every {milliseconds} millisecond{milliseconds===1?"":"s"}</p>
</div>
