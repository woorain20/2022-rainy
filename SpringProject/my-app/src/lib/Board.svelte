<script>
import { onMount } from "svelte";
import { Link } from "svelte-routing";


    let boards=[]
    let workplacenames=[
        "중앙박물관",
        "경주박물관",
        "광주박물관",
        "전주박물관",
        "대구박물관",
        "부여박물관",
        "공주박물관",
        "진주박물관",
        "청주박물관",
        "김해박물관",
        "제주박물관",
        "춘천박물관",
        "나주박물관",
        "익산박물관"
    ]
   
    let title, content, whiter, workplace
    let official=false
    let password= 1111

    const savepoint="http://192.168.0.51:8080/postboard/?page=0&size=50"
	onMount(async function(){
		const res=await fetch(savepoint)
		const data = await res.json()
		boards=data._embedded.postboard
	})


    async function add(){
        const board = {
			 done: official , date : new Date , content: content, title: title, whiter: whiter,workplace: workplace, password: password
        }
		await fetch(savepoint,{
			method:"POST", headers:{    //headers를 설정해야 오류가 안남
				"Content-Type":"application/json"
			},
			body:JSON.stringify({
				done:board.done, date : board.date, content : board.content, title: board.title, whiter: board.whiter, workplace: board.workplace, password:board.password
			})
		})
        boards=[board,...boards]
        
        title =""
        content =""
        whiter =""
        workplace =""
        official=false
        password=1111
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
    장소<select bind:value={workplace}>
        {#each workplacenames as workplacename}
            <option value={workplacename}>
            {workplacename}
        </option>
        {/each} <br />
    </div>
<div>
    제목<input type="text" bind:value={title}><br />
    작성자<input type="text" bind:value={whiter}> <br />
    내용 <textarea bind:value={content}></textarea><br />
    오피셜<input type="checkbox" bind:checked={official}><br />
    <input type="submit" on:click={()=>add()}>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>