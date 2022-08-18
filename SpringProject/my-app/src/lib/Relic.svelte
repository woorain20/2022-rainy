<script>
    import { Link } from "svelte-routing";
    import { onMount } from "svelte";

    const savepoint="http://192.168.0.51:8080/relic/?page=0&size=200"

    let relic=[]
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

    let image, name, period, note, excavation, museum

    onMount(async function(){
        const res=await fetch(savepoint)
        const data = await res.json()
        relic=data._embedded.relic
        // console.log(relicinfo)
    })

    async function add(){
       const relics = {
        image: image, name: name, period: period, note: note, excavation: excavation, museum: museum
       }
       await fetch(savepoint,{
           method:"POST", headers:{    //headers를 설정해야 오류가 안남
               "Content-Type":"application/json"
           },
           body:JSON.stringify({
            image: relics.image, name: relics.name, period: relics.period, note: relics.note, excavation: relics.excavation, museum: relics.museum
           })
       })
       relic=[relics,...relic]
       
       image=""
       name=""
       period=""
       note=""
       excavation=""
       museum=""
       console.log(relics)
    }

</script>

<div>
    <h1>Relic</h1>
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
        소장박물관<select bind:value={museum}>
            {#each workplacenames as workplacename}
                <option value={workplacename}>
                {workplacename}
            </option>
            {/each} 
        </div>

    <label>이미지 <input type="url" bind:value="{image}" placeholder="이미지주소"></label><br/><br/>
    <label>유물명 <input type="text" bind:value="{name}" placeholder="이름"></label><br/><br/>
    <label>시대 <input type="text" bind:value="{period}" placeholder="제작시기"></label><br/><br/>
    <label>등재 <input type="text" bind:value="{note}" placeholder="국보,보물,사적 등등"></label><br/><br/>
    <label>출토지 <input type="text" bind:value="{excavation}" placeholder="발견 지역"></label>
    <input type="submit" style="width: 85px; height:40px;" on:click={()=>add()}>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
    .post{
        border: 1px solid black;
        height: 300px;
        width:900px;
        margin: 0px auto;
    }
    .post>label{
        float: left;
        padding-left:10px
    }

</style>