<script>
import { onMount } from "svelte";
import { Link } from "svelte-routing";


    let boards=[]
   
    let title, content, whiter, workplace
    let official=false

    const savepoint="http://192.168.0.51:8080/postboard/?page=0&size=50"
	onMount(async function(){
		const res=await fetch(savepoint)
		const data = await res.json()
		boards=data._embedded.postboard
	})


    async function add(){
        const board = {
			 done: official , date : new Date , content: content, title: title, whiter: whiter,workplace: workplace,
        }
		await fetch(savepoint,{
			method:"POST", headers:{    //headers를 설정해야 오류가 안남
				"Content-Type":"application/json"
			},
			body:JSON.stringify({
				done:board.done, date : board.date, content : board.content, title: board.title, whiter: board.whiter, workplace: board.workplace
			})
		})
        boards=[board,...boards]
        
        title =""
        content =""
        whiter =""
        workplace =""
        official=false
        console.log(board)
    }

</script>

<div>
    <h1>Board</h1>
    <Link to="museum"><button>Museum</button></Link>
    <Link to="relic"><button>Relic</button></Link>
    <Link to="exhibition"><button>Exhibition</button></Link>
    <Link to="event"><button>Event</button></Link>
    <Link to="board"><button>Board</button></Link>
    <Link to="goods"><button>Goods</button></Link>
    <Link to="home"><button>Home</button></Link>
</div>
<div>
    제목<input type="text" bind:value={title}><br />
    작성자<input type="text" bind:value={whiter}> <br />
    장소<input type="text" bind:value={workplace}> <br />
    내용 <textarea bind:value={content}></textarea><br />
    오피셜<input type="checkbox" bind:checked={official}><br />
    <input type="submit" on:click={()=>add()}>
 
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>