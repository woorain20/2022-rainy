<script>
    import Thing from "./Thing.svelte";

    let things=[
        {id: 1, name:"apple"},
        {id: 2, name:"banana"},
        {id: 3, name:"carrot"},
        {id: 4, name:"doughnut"},
        {id: 5, name:"egg"},
    ]
    //매개변수 한개 일때 그 인덱스 값의 미만 삭제
    // things=things.slice(1)
    // things=things.slice(2)
    // slice(x,y) x이상 y미만 인덱스 값 남김
    // things=things.slice(3,4)
    // things=things.slice(0,4)
    // 매개변수가 음수일 때 끝에서 -1
    // things=things.slice(-1)
    // things=things.slice(2,-1)
    function handleClick(){
        things=things.slice(1)  // 숫자 미만을 지우겠다는 뜻 slice(1)은 1 미만을 지운다는 것
    }
    async function getRandomNumber(){
        const res=await fetch("https://svelte.dev/tutorial/random-number")
        // console.log(res)
        const text=await res.text();
        if(res.ok){
            return text
        }else{
            console.log("fetch error 발생")
        }
    }
    let promise=getRandomNumber()
    function handleClick2(){
        promise=getRandomNumber();
    }
</script>

<div>
    <button on:click="{handleClick}">
        Remove first thing</button>
    {#each things as thing (thing.id)}  <!-- 키값으로 순차적으로 생성되는 것이면 다 가능-->
        <Thing name={thing.name}/>
    {/each}
</div>
<h1>Logic2</h1>
<div>
    <button on:click="{handleClick2}">generate random number</button>
    {#await promise}
        <p>...waiting</p>      
    {:then num} 
        <p>The number is {num}</p>
    {:catch error}
        <p>{error.message}</p>
    {/await}
</div>