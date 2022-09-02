<script>
    let name="World"
    function changeName(){
        name="Svelte"
    }
    function changeName2(){
        name="World"
    }
    let count=0
    let count2=0
    function incrementCount(){
        ++count
    }
    function decrementCount(){
        --count2
    }
    function reset(){
        count=0
        count2=0
    }
    //watch, computed
    let doubled2=count*2 // 안됨
    $: doubled=count*2  // 이런식으로 변경해야 실행됨
    //랜더링되는 기준은 데이터 바인딩된 식별자에 새로운 값이 대입될 때
</script>
<div>
    <p>{count} doubled is {doubled2}</p>
    <p>{count} doubled is {doubled}</p>
    <button on:click={incrementCount}>Clicked {count} {count===1?"time":"times"}</button>
    <!-- 
        times count > 1
        time count = 1
     -->
    <button on:click={decrementCount}>Clicked {count2} {count2===-1?"time":"times"}</button>
    <button on:click={reset}>Clicked</button>
</div>
<div>
    <button on:click={changeName}>Change Name</button>
    <button on:click={changeName2}>Change Name Reset</button>
    <h1>Hello {name}!</h1>
</div>
<h1>Reactivity</h1>

<style>
    div{
        padding: 10px;
    }
</style>