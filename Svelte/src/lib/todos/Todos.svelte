<script>
	import { flip } from "svelte/animate";
	import { crossfade, fade, fly } from "svelte/transition";

	let todos=[
		{id:1, done:false, description: "Write some docs"},
		{id:2, done:false, description: "Start writing JSConf talk"},
		{id:3, done:true, description: "Buy some milk"},
		{id:4, done:false, description: "Mow the lawn"},
		{id:5, done:false, description: "Feed the turtle"},
		{id:6, done:false, description: "Fix some bugs"}
	]
	let uid=todos.length+1
	function add(event){
		// console.log(event.key)
		if(event.key!=="Enter"){
			return
		}
		const todo={
			id:uid++, done:false, description:event.target.value
		}
		todos=[todo,...todos]
		event.target.value=""
	}
	function remove(todo){
		todos=todos.filter(t=>t!==todo)
	}
	const [send, receive]=crossfade({
		duration:500, 
		fallback:fade
	})
</script>

<div class="board">
	<h1 transition:fade={{duration:1200}}>Todos</h1>
	<input class="new-todo" placeholder="할 일을 입력해주세요" on:keydown="{add}">
	<div class="left" transition:fly={{x:-100}}>
		<h2>todo</h2>
		{#each todos.filter(t=>!t.done) as todo(todo.id)}
			<label in:receive="{{key:todo.id}}" out:send="{{key:todo.id}}" animate:flip>
				<input type="checkbox" bind:checked="{todo.done}">
				{todo.description}
				<button on:click="{()=>{remove(todo)}}">x</button>
			</label>			
		{/each}
	</div>
	<div class="right" transition:fly={{x:100}}>
		<h2>done</h2>
		{#each todos.filter(t=>t.done) as todo(todo.id)}
			<label in:receive="{{key:todo.id}}" out:send="{{key:todo.id}}" animate:flip>
				<input type="checkbox" bind:checked="{todo.done}">
				{todo.description}
				<button on:click="{()=>{remove(todo)}}">x</button>
			</label>			
		{/each}
	</div>
</div>

<style>
	.new-todo {
		font-size: 1.4em;
		width: 100%;
		margin: 2em 0 1em 0;
	}

	.board {
		max-width: 36em;
		margin: 0 auto;
	}
	.board > h1{
		text-align: center;
	}

	.left, .right {
		float: left;
		width: 50%;
		padding: 0 1em 0 0;
		box-sizing: border-box;
	}

	h2 {
		font-size: 2em;
		font-weight: 200;
		user-select: none;
	}

	label {
		top: 0;
		left: 0;
		display: block;
		font-size: 1em;
		line-height: 1;
		padding: 0.5em;
		margin: 0 auto 0.5em auto;
		border-radius: 2px;
		background-color: #eee;
		user-select: none;
	}

	input { margin: 0 }

	.right label {
		background-color: rgb(180,240,100);
	}

	button {
		float: right;
		height: 1em;
		box-sizing: border-box;
		padding: 0 0.5em;
		line-height: 1;
		background-color: transparent;
		border: none;
		color: rgb(170,30,30);
		opacity: 0;
		transition: opacity 0.2s;
	}

	label:hover button {
		opacity: 1;
	}
</style>