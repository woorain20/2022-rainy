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
<div class="post">
    <div>
        <table>
            <tr><td>전경</td><td><input type="url" bind:value="{photo}"></td><td> 주소</td><td><input type="text" bind:value="{address}"> </td></tr>
            <tr><td>전화번호></td><td><input type="text" bind:value="{phone}"></td><td> 개관</td><td><input type="text" bind:value="{found}"> </td></tr>
            <tr><td>이용시간</td><td><input type="text" bind:value="{time}"></td><td>휴무일</td><td><input type="text" bind:value="{rest}"></td></tr>
            <tr><td>요금</td><td><input type="text" bind:value="{fee}"></td><td>편의시설</td><td><input type="text" bind:value="{depository}"></td></tr>
            <tr><td>홈페이지</td><td><input type="url" bind:value="{homepage}"></td><td></td><td></td></tr>
        </table>
        <input type="submit" style="width: 85px; height:40px;" on:click={()=>add()}>
    </div>
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
    .post td {
        padding:5px;
        border : 0px;
    }
</style>