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

   let txt=""
   async function remove(good){
		await fetch("http://192.168.0.51:8080/goods/"+good.id,{
			method:"DELETE"
		})
		goods=goods.filter(t=>t!==good)
        alert("삭제되었습니다.")
	}
    let a=false
    function open(){
        a=!a
    }
    function close(){
        a=false
        txt=""
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
<div class="post">
    <h3>추가</h3>
    <div style="float:left; padding-left:30px;">
        상품분류<select bind:value={category}>
        {#each categories as cate}
            <option value={cate}>
            {cate}
        </option>
        {/each}
    </div>
    <table>
    <tr><td>상품이름</td><td> <input type="text" bind:value={name}> </td></tr>
    <tr><td>이미지 링크 </td><td><input type="url" bind:value={image}></td></tr>
    <tr><td>가격("원"까지 기입) </td><td><input type="text" bind:value={price}></td></tr>
    </table><br/>
    <input type="submit" style="width: 85px; height:40px;" on:click={()=>add()}>
</div>

<div id="delete">
    <h3>삭제</h3>
    <input type="text" bind:value="{txt}">
    <button on:click="{open}">찾기</button>
    <button on:click="{close}">RESET</button>
    <div id="search">
        <table>
        {#if a}
        {#each goods as good}
        {#if txt==good.name.slice(0,1)}
            <tr>
                <td>{good.name}</td>
                <td>{good.category}</td>
                <td>{good.price}</td>
                <td><button disabled="{!txt}" on:click="{()=>remove(good)}">삭제</button></td>
            </tr>      
        {/if}
        {#if txt==good.name.slice(0,2)}
            <tr>
                <td>{good.name}</td>
                <td>{good.category}</td>
                <td>{good.price}</td>
                <td><button disabled="{!txt}" on:click="{()=>remove(good)}">삭제</button></td>
            </tr>   
        {/if}
        {#if txt==good.name}
            <tr>
                <td>{good.name}</td>
                <td>{good.category}</td>
                <td>{good.price}</td>
                <td><button disabled="{!txt}" on:click="{()=>remove(good)}">삭제</button></td>
            </tr>   
        {/if}
        {/each}
        {/if}
        </table>
    </div>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
    td{
        border-bottom: 1px dashed;
        margin: 5px;
    }
    #search{
        margin-top: 20px;
        margin-left: 200px;
    }
    .post{
        border: 1px solid black;
        height: 300px;
        width:900px;
        margin: 0px auto;
    }
    .post td{
        padding:5px;
        
        border : 0px;
    }
</style>