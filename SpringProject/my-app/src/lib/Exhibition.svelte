<script>
    import { Link } from "svelte-routing";
    import { onMount } from "svelte";

    let exhibition=[]
    let poster, title, place, fee, startday, endday, content, linkpage
    let always, done=false

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

    const savepoint="http://192.168.0.51:8080/exhibition/"
    
    onMount(async function(){
        const red= await fetch(savepoint)
        const open= await red.json()
        exhibition=open._embedded.exhibition
    })

    async function add(){
       const exhi = {
        done:  done , poster: poster, title: title, fee: fee, place: place, startday: startday, endday: endday, content: content, linkpage: linkpage, always: always
       }
       await fetch(savepoint,{
           method:"POST", headers:{    //headers를 설정해야 오류가 안남
               "Content-Type":"application/json"
           },
           body:JSON.stringify({
            done: exhi.done, poster: exhi.poster, title: exhi.title, fee: exhi.fee, place: exhi.place, startday: exhi.startday, endday: exhi.endday, content: exhi.content, linkpage: exhi.linkpage, always: exhi.always
           })
       })
       exhibition=[exhi,...exhibition]
       
       done=false
       always=false
       poster=""
       title=""
       fee=""
       place=""
       startday=""
       endday=""
       content=""
       linkpage=""
       console.log(exhi)
   }
   async function remove(event){
		await fetch(savepoint+event.no,{
			method:"DELETE"
		})
		exhibition=exhibition.filter(t=>t!==event)
        alert("삭제되었습니다.");
	}
</script>

<div>
    <h1>Exhibition</h1>
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
        장소<select bind:value={place}>
            {#each workplacenames as workplacename}
                <option value={workplacename}>
                {workplacename}
            </option>
            {/each} 
        </div>
    포스터<input type="url" bind:value="{poster}">
    전시회<input type="text" bind:value="{title}"><br/>
    요금<input type="text" bind:value="{fee}"><br/>
    시작<input type="text" bind:value="{startday}">
    종료<input type="text" bind:value="{endday}"><br/>
    내용<input type="text" bind:value="{content}">
    링크<input type="text" bind:value="{linkpage}"><br/>
    상설<input type="checkbox" bind:checked="{always}">
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
            <td>전시회이름</td>
            <td>시작날</td>
            <td>마감날</td>
            <td>가격</td>
            <td>진행여부</td>
            <td>전시회종류</td>
        </tr>
        {#each exhibition as exhi}
        <tr>
            <td>{exhi.id}</td>
            <td>{exhi.poster}</td>
            <td class="day">{exhi.place}</td>
            <td class="day">{exhi.title}</td>
            <td class="day">{exhi.startday}</td>
            <td class="day">{exhi.endday}</td>
            <td>{exhi.fee}</td>
            <td>{#if exhi.done}
                O
                {:else if !exhi.done}
                X
                {/if}
            </td>
            <td>{#if exhi.always}
                <p class="always">상설</p>
                {:else if !exhi.always}
                <p class="spacial">특별</p>
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

    }
    .day{
        width: 100px;
    }
    td>.always{
        background-color: bisque;
    }
    td>.spacial{
        background-color: navy;
        color:white;
    }
    td>button{
        margin-left: 5px;
    }

</style>