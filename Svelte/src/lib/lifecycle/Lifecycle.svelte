<script>
import Lifecycle2 from "./Lifecycle2.svelte"

    //onMount - 컴포넌트가 화면에 보일 때 실행
    //onDestory - 컴포넌트가 화면에 안 보일 때 실행
    //beforeUpdate - 화면 갱신 전에 실행
    //afterUpdate - 화면 갱신 후에 실행
    //tick() - 화면 갱신될 때까지 기다렸다가 실행
    let b=false
    function toggle(){
        b=!b
    }

</script>

<div>
    <button on:click="{toggle}">Lifecycle2 Toggle</button>
    {#if b}
        <Lifecycle2/>
    {/if}
</div>

<h1>Lifecycle</h1>