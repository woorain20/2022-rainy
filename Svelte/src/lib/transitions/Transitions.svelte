<script>
    import {fly, fade} from "svelte/transition"
    /*
        fade 파라미터
        delay-ms 설정한 시간이 지난 후에 트랜지션 시작
        duration-ms 설정한 시간 동안 트랜지션
        easing - 함수
    */
    let visible=false
    let status="waiting..."
</script>

<h1>Transitions</h1>

<div>
    <label>
        <input type="checkbox" bind:checked="{visible}">
    </label>
    <p>status: {status}</p>
    {#if visible}
        <h1 transition:fade={{duration:1800}}>Transitions Fades in and out</h1>
    {/if}
    {#if visible}
        <h1 transition:fly={{x:150, y:200, duration:1800}}>Transitions Flies in and out</h1>
    {/if}
    {#if visible}
        <h1 in:fly={{x:150, y:-200, duration:1800}} out:fade>Transitions Flies in and Fades out</h1>
    {/if}
    {#if visible}
        <h1 out:fly={{x:150, duration:1800}} in:fade={{duration:1800}}
        on:introstart="{()=>status='intro started'}"
        on:introend="{()=>status='intro ended'}"
        on:outrostart="{()=>status='outro started'}"
        on:outroend="{()=>status='outro ended'}"
        >Transitions Flies in and Fades out</h1>
    {/if}
</div>