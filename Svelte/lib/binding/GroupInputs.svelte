<script>
    let size=1
    let flavors=[
        "사랑에 빠진 딸기"
    ]
    let sizeType=[
        "싱글 레귤러",
        "더블 레귤러",
        "파인트",
        "쿼터"
    ]
    let menu=[
        "마누아로아 마카다미아",
        "엄마는 외계인",
        "사랑에 빠진 딸기",
        "피카피카 피카츄",
        "체리쥬빌레",
        "뉴욕치즈케이크"
    ]
    // console.log(menu.join(","))
    function getFlavor(flavors){
        if(flavors.length===1){
            return flavors[0]
        }else{ 
            return `${flavors.slice(0,-1).join(", ")} 그리고 ${flavors[flavors.length-1]}`
        }
    }
</script>

<div>
    <h2>Size</h2>
    <label>
        <input type="radio" bind:group="{size}" name="size" value={1}>
        싱글 레귤러
    </label>
    <label>
        <input type="radio" bind:group="{size}" name="size" value={2}>
        더블 레귤러
    </label>
    <label>
        <input type="radio" bind:group="{size}" name="size" value={3}>
        파인트
    </label>
    <label>
        <input type="radio" bind:group="{size}" name="size" value={4}>
        쿼터
    </label>
    <p>{size}</p>
</div>
<div>
    <h2>Flavor</h2>
    {#each menu as flavor}
        <label>
            <input type="checkbox" bind:group="{flavors}" name="flavors" value={flavor}/>
            {flavor}
        </label>
    {/each}
    {#if flavors.length===0} 
        <p>최소 1개의 맛은 선택해야 합니다.</p>
    {:else if flavors.length>size}
        <p>맛을 더 선택할 수 없습니다.</p>
    {:else}
        <p>
            선택한 사이즈:
            {sizeType[size-1]}
            <br/>
            선택한 맛: 
            {getFlavor(flavors)}
            <!-- {{#each flavors as choice}
                <span>{choice},</span>
            {/each}} -->
        </p>
        <button>주문하기</button>
    {/if}
</div>
<h1>GroupInputs</h1>