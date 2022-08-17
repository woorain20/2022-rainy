<script>
    import { onMount } from "svelte";

    import { Link } from "svelte-routing";

    let goods=[]
   
    let category, image, name, price

    let categories=[
        "IT소품",
        "인테리어소품",
        "스카프/손수건",
        "액세서리",
        "가방/지갑",
        "우산/양산",
        "주방/식기류",
        "문구/사무",
        "공예품",
        "부채",
        "어린이",
        "기타"
    ]

   const savepoint="http://192.168.0.51:8080/goods/?page=0&size=100"
   onMount(async function(){
       const res=await fetch(savepoint)
       const data = await res.json()
       goods=data._embedded.goods
   })


   async function add(){
       const good = {
        category:  category , image: image, name: name, price: price
       }
       await fetch(savepoint,{
           method:"POST", headers:{    //headers를 설정해야 오류가 안남
               "Content-Type":"application/json"
           },
           body:JSON.stringify({
            category: good.category , image: good.image, name: good.name, price: good.price
           })
       })
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
    <Link to="good"><button>good</button></Link>
    <Link to="goods"><button>Goods</button></Link>
    <Link to="home"><button>Home</button></Link>
</div>
<div>
    <div>
        상품분류<select bind:value={category}>
        {#each categories as cate}
            <option value={cate}>
            {cate}
        </option>
        {/each}
    </div>
    상품이름<input type="text" bind:value={name}> 
    이미지 링크<input type="url" bind:value={image}> 
    가격("원"까지 기입) <input type="text" bind:value={price}><br/>
    <input type="submit" on:click={()=>add()}>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>