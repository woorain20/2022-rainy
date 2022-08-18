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

    const savepoint="http://192.168.0.51:8080/postboard/?page=0&size=50&sort=num,desc"
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
    async function remove(board){
		await fetch("http://192.168.0.51:8080/postboard/"+board.num,{
			method:"DELETE"
		})
		boards=boards.filter(t=>t!==board)
        alert("삭제되었습니다.");
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
<div class="post">
    <div>
        <h2>추가</h2>
        장소<select bind:value={workplace} >
            {#each workplacenames as workplacename}
                <option value={workplacename}>
                {workplacename}
            </option>
            {/each} <br />
    </div>
    <label>제목 <input type="text" bind:value={title} style="width:800px" placeholder="게시글 제목"></label><br /><br />
    <label style="padding-left:500px;" >작성자 <input type="text" bind:value={whiter} placeholder="이름+직책"></label>
    <label style="padding-left:70px;">공지 <input type="checkbox" bind:checked={official}></label><br />
    <label>내용 <textarea bind:value={content} placeholder="게시글 내용 적어주세요"></textarea></label><br />
    <input type="submit" on:click={()=>add()}>
</div>

<div class="delete"> 
    <h2>삭제</h2>
    <table>
        <tr>
            <td>고유번호</td>
            <td>게시글 제목</td>
            <td>작성자</td>
            <td>기관</td>
            <td>공지여부</td>
            <td>비밀번호</td>
            <td>작성일</td>
        </tr>
        {#each boards as board}
        <tr>
            <td>{board.num}</td>
            <td class="title">{board.title}</td>
            <td>{board.whiter}</td>
            <td class="day">{board.workplace}</td>
            <td>{#if board.official}
                공지
                {:else if !board.official}
                X
                {/if}
            </td>
            <td>{board.password}</td>
            <td class="day">{board.date}</td>
            <td><button on:click={remove}>삭제</button></td>
        </tr>
        {/each}
    </table>

</div>

<style>
    div{
        margin-bottom: 30px;
    }
    td{
        border-bottom: 1px dashed black
    }
    .day{
        width: 100px;
    }
    .title{
        width:500px;
    }
    .delete{
        height:700px;
        overflow-y: scroll;
    }
    .post{
        border: 1px solid black;
        height: 900px;
        width:900px;
        margin: 0px auto;
    }
    .post>label{
        float: left;
        padding-left:10px
    }
    textarea{
        margin: 0px 25px;;
        width: 820px; 
        height:600px;
    }
</style>