<script>
    import Eliza from "elizabot"
    import {beforeUpdate, afterUpdate} from "svelte"

    const eliza=new Eliza()
    // console.log(eliza.getInitial())
    // console.log(eliza.transform("Europe is fired"))
    let div
    let autoscroll
    beforeUpdate(()=>{
        autoscroll=div&&(div.offsetHeight+div.scrollTop)>(div.scrollHeight-20)
        // console.log(autoscroll)
    })
    afterUpdate(()=>{
        if(autoscroll) div.scrollTo(0,div.scrollHeight)
    })
    let comments=[
        {author:"eliza", text:eliza.getInitial()}
    ]
    function handleKeydown(event){
        // console.log(event.key)
        if(event.key==="Enter"){
            const text=event.target.value
            if(!text) return;
            comments=comments.concat({
                author:"user",
                text
            })
            event.target.value=""
            const reply=eliza.transform(text)
            setTimeout(()=>{
                comments=comments.concat({
                    author:"eliza",
                    text:"...",
                    placeholder:true
                })
                setTimeout(()=>{
                    comments=comments.filter(
                        comment=>!comment.placeholder
                    ).concat({
                        author: "eliza",
                        text: reply
                    })
            },800+Math.random()*1600)
            },250+Math.random()*250)
        }
    }
</script>

<h1>Eliza</h1>

<div class="chat">
    <div class="scrollable" bind:this={div}>
        {#each comments as comment}
            <article class={comment.author}>
                <span>{comment.text}</span>
            </article>
        {/each}
    </div>
    <input on:keydown="{handleKeydown}"/>
</div>

<style>
	.chat {
		display: flex;
		flex-direction: column;
		height: 320px;
		max-width: 320px;
	}

	.scrollable {
		flex: 1 1 auto;
		border-top: 1px solid #eee;
		margin: 0 0 0.5em 0;
		overflow-y: auto;
	}

	article {
		margin: 0.5em 0;
	}

	.user {
		text-align: right;
	}

	span {
		padding: 0.5em 1em;
		display: inline-block;
	}

	.eliza span {
		background-color: #eee;
		border-radius: 1em 1em 1em 0;
	}

	.user span {
		background-color: #0074D9;
		color: white;
		border-radius: 1em 1em 0 1em;
		word-break: break-all;
	}
</style>