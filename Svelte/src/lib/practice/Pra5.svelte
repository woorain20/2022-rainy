<script>
// import cities from "all-the-cities";

    import Pra6 from "./Pra6.svelte"

    let a=false
    function ar(){
        a=!a
    }

</script>

<div>
    <div id="header">
        <h2>영화 정보</h2>
        <button on:click="{ar}">조회</button>
    </div>
    {#if a}
        <Pra6/>
    {/if}
</div>