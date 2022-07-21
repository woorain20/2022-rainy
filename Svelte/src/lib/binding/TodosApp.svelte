<script>
    let todos=[
        {done:false, text:"finish Svelte tutorial"},
        {done:false, text:"bulid an app"},
        {done:false, text:"world domination"},
        {done:true, text:"complete task"}
    ]
    $: remaining=todos.filter(t=>!t.done).length
    function add(){
        todos=todos.concat({done:false, text:""})
    }
    function clear(){
        todos=todos.filter(t=>!t.done)   //=>함수에서 return 생략 가능(t=>(return)!t.done)
    }
</script>

<div>
    <div>
        <p>{remaining} remaining</p>
        <button on:click="{add}">Add new</button>
        <button on:click="{clear}">Clear completed</button>
    </div>
    <div>
        {#each todos as todo}
            <div class:done={todo.done}>
                <input type="checkbox" bind:checked="{todo.done}">
                <input placeholder="What needs to be done?" bind:value={todo.text}>
            </div>
        {/each}
    </div>
</div>
<h1>TodosApp</h1>

<style>
    .done{
        opacity: 0.4;
    }
    div{
        margin: 10px;
    }
</style>