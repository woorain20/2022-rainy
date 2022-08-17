<script>
    import { Link } from "svelte-routing";

    import { onMount } from "svelte";

    const savepoint="http://192.168.0.51:8080/museumlist/"

    let museuminfo=[]

    let photo, address, phone, found, time, rest, fee, depository, homepage

    onMount(async function(){
        const res=await fetch(savepoint)
        const data = await res.json()
        museuminfo=data._embedded.museumlist
        // console.log(museuminfomation)
    })

    async function add(){
       const museum = {
        photo:  photo , address: address, phone: phone, found: found, time: time, rest: rest, fee: fee, depository: depository, homepage: homepage
       }
       await fetch(savepoint,{
           method:"POST", headers:{    //headers를 설정해야 오류가 안남
               "Content-Type":"application/json"
           },
           body:JSON.stringify({
            photo: museum.photo , address: museum.address, phone: museum.phone, found: museum.found, time: museum.time, rest: museum.rest, fee: museum.fee, depository: museum.depository, homepage: museum.homepage
           })
       })
       museuminfo=[museum,...museuminfo]
       
       photo=""
       address=""
       phone=""
       found=""
       time=""
       rest=""
       fee=""
       depository=""
       homepage=""
       console.log(museum)
   }
</script>

<div>
    <h1>Museum</h1>
    <Link to="museum"><button>Museum</button></Link>
    <Link to="relic"><button>Relic</button></Link>
    <Link to="exhibition"><button>Exhibition</button></Link>
    <Link to="event"><button>Event</button></Link>
    <Link to="board"><button>Board</button></Link>
    <Link to="goods"><button>Goods</button></Link>
    <Link to="home"><button>Home</button></Link>
</div>
<div>
    전경<input type="url" bind:value="{photo}">
    주소<input type="text" bind:value="{address}"> 
    전화번호<input type="text" bind:value="{phone}"><br/>
    개관<input type="text" bind:value="{found}">
    이용시간<input type="text" bind:value="{time}">
    휴무일<input type="text" bind:value="{rest}"><br/>
    요금<input type="text" bind:value="{fee}">
    편의시설<input type="text" bind:value="{depository}">
    홈페이지<input type="url" bind:value="{homepage}"><br/>
    <input type="submit" on:click={()=>add()}>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>