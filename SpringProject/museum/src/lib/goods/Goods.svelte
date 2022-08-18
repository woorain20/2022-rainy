<script>
    import { onMount } from "svelte";

    const goodsList="http://192.168.0.51:8080/goods/?page=0&size=100"

    onMount(async function(){
        const res=await fetch(goodsList)
        const data = await res.json()
        goods=data._embedded.goods
        // console.log(goods)
    })

    let goods=[]

    let total, it, interior, scarf, accessory, bag, umbrella, dinner, stationery, craft, fan, kids, etc=false

    function opent(){
        total=true
        it=interior=scarf=accessory=bag=umbrella=dinner=stationery=craft=fan=kids=etc=false
    }
    function openit(){
        it=true
        total=interior=scarf=accessory=bag=umbrella=dinner=stationery=craft=fan=kids=etc=false 
    }
    function openin(){
        interior=true
        total=it=scarf=accessory=bag=umbrella=dinner=stationery=craft=fan=kids=etc=false         
    }
    function opensc(){
        scarf=true
        total=it=interior=accessory=bag=umbrella=dinner=stationery=craft=fan=kids=etc=false
    }
    function openac(){
        accessory=true
        total=it=interior=scarf=bag=umbrella=dinner=stationery=craft=fan=kids=etc=false
    }
    function openb(){
        bag=true
        total=it=interior=scarf=accessory=umbrella=dinner=stationery=craft=fan=kids=etc=false
    }
    function openu(){
        umbrella=true
        total=it=interior=scarf=accessory=bag=dinner=stationery=craft=fan=kids=etc=false
    }
    function opend(){
        dinner=true
        total=it=interior=scarf=accessory=bag=umbrella=stationery=craft=fan=kids=etc=false
    }
    function openst(){
        stationery=true
        total=it=interior=scarf=accessory=bag=umbrella=dinner=craft=fan=kids=etc=false
    }
    function openc(){
        craft=true
        total=it=interior=scarf=accessory=bag=umbrella=dinner=stationery=fan=kids=etc=false
    }
    function openf(){
        fan=true
        total=it=interior=scarf=accessory=bag=umbrella=dinner=stationery=craft=kids=etc=false
    }
    function openk(){
        kids=true
        total=it=interior=scarf=accessory=bag=umbrella=dinner=stationery=craft=fan=etc=false
    }
    function opene(){
        etc=true
        total=it=interior=scarf=accessory=bag=umbrella=dinner=stationery=craft=fan=kids=false
    }
</script>

<div id="main">
    <div id="head">
        <h1>Goods Mall</h1>
    </div>
    <div id="but">
        <button class="button" on:click="{opent}">전체</button>   
        <button class="button" on:click="{openit}">IT소품</button>   
        <button class="button" on:click="{openin}">인테리어소품</button>   
        <button class="button" on:click="{opensc}">스카프/손수건</button>   
        <button class="button" on:click="{openac}">액세서리</button>   
        <button class="button" on:click="{openb}">가방/지갑</button>   
        <button class="button" on:click="{openu}">우산/양산</button>   
        <button class="button" on:click="{opend}">주방/식기류</button>   
        <button class="button" on:click="{openst}">문구/사무</button>   
        <button class="button" on:click="{openc}">공예품</button>   
        <button class="button" on:click="{openf}">부채</button>   
        <button class="button" on:click="{openk}">어린이</button>   
        <button class="button" on:click="{opene}">기타</button>   
    </div>
    <div id="content">
        {#each goods as good}
            {#if total}
            <div id="intro">
                <img src="{good.image}" alt="상품">
                <p>{good.name}</p>
                <p>{good.price}</p>
                <p>{good.category}</p>
            </div>
            {:else if it}
                {#if good.category=="IT소품"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>
                {/if}
            {:else if interior} 
                {#if good.category=="인테리어소품"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div> 
                {/if}
            {:else if scarf}
                {#if good.category=="스카프/손수건"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>    
                {/if}
            {:else if accessory}
                {#if good.category=="액세서리"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>     
                {/if}
            {:else if bag}
                {#if good.category=="가방/지갑"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>      
                {/if}
            {:else if umbrella}
                {#if good.category=="우산/양산"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>    
                {/if}
            {:else if dinner}
                {#if good.category=="주방/식기류"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>    
                {/if}
            {:else if stationery}
                {#if good.category=="문구/사무"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>    
                {/if}
            {:else if craft}
                {#if good.category=="공예품"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>  
                {/if}
            {:else if fan}
                {#if good.category=="부채"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>  
                {/if}
            {:else if kids}
                {#if good.category=="어린이"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>  
                {/if}
            {:else if etc}
                {#if good.category=="기타"}
                <div id="intro">
                    <img src="{good.image}" alt="상품">
                    <p>{good.name}</p>
                    <p>{good.price}</p>
                    <p>{good.category}</p>
                </div>  
                {/if}
            {:else}
            <div id="intro">
                <img src="{good.image}" alt="상품">
                <p>{good.name}</p>
                <p>{good.price}</p>
                <p>{good.category}</p>
            </div>  
            {/if}
            {/each}
    </div>
</div>

<style>
    #main{
        text-align: center;
        vertical-align: middle;
        margin-top: 2%;
    }
    #head{
        margin-bottom: 3%;
    }
    #but{
        margin-bottom: 3%;
    }
    .button{
        width: 7%;
        border: 3px outset;
        border-radius: 5px;
        font-weight: 700;
    }
    .button:hover{
        border: 3px inset;
    }
    .button:focus{
        border: 3px inset;
    }
    #content{
        display: grid;
        flex: 1;
        grid-template-columns: repeat(4, 4fr);
        grid-gap: 1vmin;
        width: 80%;
        height: 650px;
        margin: 0px auto;
        margin-bottom: 2%;
        overflow-y: scroll;
    }
    #intro{
        width: 100%;
        float: left;
    }
    img{
        width: 80%;
    }
</style>