<script>
    let name="World"
    //양방향 바인딩: bind:
    let a=1
    let b=2
    let yes=false
    let mustYes=false
</script>

<div>
    <h1>Hello {name}!</h1>
    <input bind:value={name}>
    <label>
        A<input type=number bind:value={a}>
        <input type=range bind:value={a} min=0 max=100>
    </label>
    <label>
        B<input type=number bind:value={b}>
        <input type=range bind:value={b} min=-50 max=200>
    </label>
    <p>{a}+{b}={a+b}</p>
</div>
<div>
    <label>
        <input type="checkbox" bind:checked={mustYes}>
        <p>[필수] 동의</p>
    </label>
    <label>
        <input type="checkbox" bind:checked={yes}>
        <p>[선택] 마케팅 활용에 동의하십니까?</p>
    </label>
    {#if yes}
    <p>광고 문자나 전화를 드리겠습니다.</p>
    {:else}
    <p>마케팅 동의하시면 3% 할인 쿠폰(최대 2000원 적용) 드립니다</p>
    {/if}
    <button disabled={!mustYes}>Next</button>
</div>
<h1>Bindings</h1>

<style>
    label{
        display: flex;
    }
    input, p{
        margin: 5px;
    }
</style>
