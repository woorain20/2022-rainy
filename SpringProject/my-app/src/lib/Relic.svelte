<script>
    import { Link } from "svelte-routing";
    import { onMount } from "svelte";

    const savepoint="http://192.168.0.51:8080/relic/?page=0&size=200"

    let relic=[]

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
<div>
    이미지<input type="url" bind:value="{image}">
    유물명<input type="text" bind:value="{name}"><br/>
    시대<input type="text" bind:value="{period}">
    등재<input type="text" bind:value="{note}"><br/>
    출토지<input type="text" bind:value="{excavation}">
    소장박물관<input type="text" bind:value="{museum}"><br/>
    <input type="submit" on:click={()=>add()}>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>