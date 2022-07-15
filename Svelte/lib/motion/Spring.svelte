<script>
    import {spring} from "svelte/motion"
    
    let coords=spring(
        {x:50, y:50},
        {stiffness:0.1, damping:0.25})

    let size=spring(10)
</script>

<svg on:mousemove="{e=>coords.set({x:e.clientX, y:e.clientY})}"
    on:mousedown="{()=>size.set(30)}"
    on:mouseup="{()=>size.set(10)}">
    <circle cx={$coords.x} cy={$coords.y} r={$size}/>
</svg>
<div style="position: absolute; right: 1em;">
    <label>
        <h3>stiffness({coords.stiffness})</h3>
        <input bind:value="{coords.stiffness}" type="range" min="0" max="1" step="0.01">
    </label>

    <label>
        <h3>damping({coords.damping})</h3>
        <input bind:value="{coords.damping}" type="range" min="0" max="1" step="0.01">
    </label>
</div>

<style>
    svg{
        width: 800px;
        height: 800px;
        margin: -8px;
        border: 1px solid;
    }
    circle{
        fill:#ff3e00;
    }
</style>