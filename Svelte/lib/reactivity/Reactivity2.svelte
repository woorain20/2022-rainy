<script>
    // $: reactivity 반응성
    let count=0
    function handleClick(){
        count+=1
    }
    // $: console.log("the count is "+count)
    // $:{
    //     console.log("the count is "+count)
    //     alert("I Said the count is "+count)
    // }
    $:if(count>=10){
        alert("Count is dangerously high!")
        count=9
    }
    let numbers=[1,2,3,4]
    // join <-> split
    let sum=numbers.reduce((t,n)=>t+n,0)    //배열 안의 합을 구할 때 사용
    $: sum=numbers.reduce((t,n)=>t+n,0)    // $(반응형)로 바꿔서 배열이 추가되면 더하기가 계속 진행되도록 함 
    // 0+1=1 -> t=1, 1+2=3 -> t=3
    function addNumber(){
        numbers=[...numbers,numbers.length+1]
        // numbers.push(numbers.length+1)
    }
</script>
<div>
    <button on:click={handleClick}>
        Clicked {count} {count===1?"time":"times"}</button>
</div>
<div>
    <p>{numbers.join(" + ")}</p> <!-- 배열에 있는 내용에 +를 추가해주는 것 -->
    <p>{numbers.join(" + ")}={sum}</p>
    <button on:click={addNumber}>
        Add a bumber</button>
</div>
<h1>Reactivity2</h1>