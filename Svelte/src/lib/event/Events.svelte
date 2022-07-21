<script>
    let m={x:0, y:0}

    function handleMousemove(event){
        // console.log(event)
        m.x=event.clientX;
        m.y=event.clientY;
    }

    function handleClick(){
        alert("no more alers")
    }
</script>

<div on:mousemove="{handleMousemove}">
    The mouse position is {m.x} x {m.y}
</div>
<div on:mousemove="{e=>m={x:e.clientX, y:e.clientY}}">  <!-- svelte에서 지원하는 문법 -->
    The mouse position is {m.x} x {m.y}
</div>
<h1>Events</h1>
<button on:click|once="{handleClick}">Click me</button> <!-- |once = 한 번만 실행되고 안 되게 하는 것 -->
<button disabled>Click me2</button> <!-- disabled = 클릭 안 되는 버튼 -->
<a href="svelte.dev" on:click|preventDefault>Svelte Homepage</a> <!-- |preventDefault = 이벤트 실행을 막는 것 -->

<style>
    div{
        width: 75%;
        height: 350px;
        border: 1px solid black;
    }
</style>