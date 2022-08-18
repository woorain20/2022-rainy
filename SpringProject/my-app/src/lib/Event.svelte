<script>
    import { Link } from "svelte-routing";
    import { onMount } from "svelte";

    let events=[]
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
    let banner, eventname, fee, place, startday, endday, time, empty, content, step
    let done=false
    const savepoint="http://192.168.0.51:8080/event/"

    onMount(async function(){
        const rsq= await fetch(savepoint)
        const vev= await rsq.json()
        events=vev._embedded.event
    })

    async function add(){
       const event = {
        done:  done , banner: banner, eventname: eventname, fee: fee, place: place, startday: startday, endday: endday, time: time, empty: empty, content: content, step: step
       }
       await fetch(savepoint,{
           method:"POST", headers:{    //headers를 설정해야 오류가 안남
               "Content-Type":"application/json"
           },
           body:JSON.stringify({
            done: event.done , banner: event.banner, eventname: event.eventname, fee: event.fee, place: event.place, startday: event.startday, endday: event.endday, time: event.time, empty: event.empty, content: event.content, step: event.step
           })
       })
       events=[event,...events]
       
       done=false
       banner=""
       eventname=""
       fee=""
       place=""
       startday=""
       endday=""
       time=""
       empty=""
       content=""
       step=""
       console.log(events)
   }
   async function remove(event){
		await fetch(savepoint+event.no,{
			method:"DELETE"
		})
		events=events.filter(t=>t!==event)
        alert("삭제되었습니다.");
	}
</script>

<div>
    <h1>Event</h1>
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
    장소<select bind:value={place}>
        {#each workplacenames as workplacename}
            <option value={workplacename}>
            {workplacename}
        </option>
        {/each} <br />
    </div>
    배너<input type="url" bind:value="{banner}">
    이벤트명<input type="text" bind:value="{eventname}">
    요금<input type="text" bind:value="{fee}"><br/>
    시작<input type="date" bind:value="{startday}">
    마침<input type="date" bind:value="{endday}"><br/>
    진행시간<input type="text" bind:value="{time}">
    정원<input type="text" bind:value="{empty}"><br/>
    내용<input type="text" bind:value="{content}">
    담당자<input type="text" bind:value="{step}"><br/>
    종료<input type="checkbox" bind:checked="{done}"><br/>
    <input type="submit" on:click={()=>add()}>
</div>

<div class="delete"> 
    <h2>삭제</h2>
    <table>
        <tr>
            <td>고유번호</td>
            <td>이미지파일이름</td>
            <td>장소</td>
            <td>이벤트이름</td>
            <td>시작날</td>
            <td>마감날</td>
            <td>담당자</td>
            <td>정원</td>
            <td>가격</td>
            <td>시간</td>
            <td>진행여부</td>
        </tr>
        {#each events as event}
        <tr>
            <td>{event.no}</td>
            <td>{event.banner}</td>
            <td class="day">{event.place}</td>
            <td class="day">{event.eventname}</td>
            <td class="day">{event.startday}</td>
            <td class="day">{event.endday}</td>
            <td>{event.step}</td>
            <td>{event.empty}</td>
            <td>{event.fee}</td>
            <td>{event.time}</td>
            <td>{#if event.done}
                O
                {:else if !event.done}
                X
                {/if}
            </td>
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
        border-bottom: 1px dashed black;
        margin-bottom: 5px;
    }
    .day{
        width: 100px;
    }
</style>