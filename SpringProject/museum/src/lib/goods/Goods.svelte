<script>
    import { onMount } from "svelte";

    const goodsList="http://192.168.0.51:8080/goods/?page=0&size=50"

    let goods=[]

    onMount(async function(){
        const res=await fetch(goodsList)
        const data = await res.json()
        goods=data._embedded.goods
        console.log(goods)
    })

    let total, fashion, props, dinner, stationery, craft, etc=false
</script>
<div>
    <button>전체</button>   
    <button>패션</button>   
    <button>소품</button>   
    <button>주방/식기류</button>   
    <button>문구/사무</button>   
    <button>공예품</button>   
    <button>어린이/기타</button>   
</div>
<div>
    {#each goods as good}
        <div id="intro">
            <img src="{good.image}" alt="상품">
            <p>{good.name}</p>
            <p>{good.price}</p>
            <p>{good.category}</p>
        </div>
    {/each}
</div>

<style>
    #intro{
        width: 350px;
        height: 450px;
        float: left;
    }
    img{
        width: 250px;
        height: 300px; 
    }
</style>