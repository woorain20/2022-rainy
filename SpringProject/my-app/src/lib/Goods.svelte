<script>
import { onMount } from "svelte";

    import { Link } from "svelte-routing";

    let goods=[]
   
   let category, image, name, price


   const savepoint="http://192.168.0.51:8080/goods/?page=0&size=50"
   onMount(async function(){
       const res=await fetch(savepoint)
       const data = await res.json()
       goods=data._embedded.goods
   })


   async function add(){
       const good = {
        category:  category , image: image, name: name, price: price
       }
    //    await fetch(savepoint,{
    //        method:"POST", headers:{    //headers를 설정해야 오류가 안남
    //            "Content-Type":"application/json"
    //        },
    //        body:JSON.stringify({
    //            done:board.done, date : board.date, content : board.content, title: board.title, whiter: board.whiter, workplace: board.workplace
    //        })
    //    })
       goods=[good,...goods]
       
       category =""
       image =""
       name =""
       price =""
       console.log(good)
   }
</script>

<div>
    <h1>Goods</h1>
    <Link to="museum"><button>Museum</button></Link>
    <Link to="relic"><button>Relic</button></Link>
    <Link to="exhibition"><button>Exhibition</button></Link>
    <Link to="event"><button>Event</button></Link>
    <Link to="board"><button>Board</button></Link>
    <Link to="goods"><button>Goods</button></Link>
    <Link to="home"><button>Home</button></Link>
</div>
<div>
    <input type="text" bind:value={name}> 상품이름
    <input type="text" bind:value={category}> 구성
    <input type="text" bind:value={image}> 이미지 링크 주소 
    <input type="text" bind:value={price}>가격("원"까지 기입) 
    <input type="submit" on:click={()=>add()}>
 
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>