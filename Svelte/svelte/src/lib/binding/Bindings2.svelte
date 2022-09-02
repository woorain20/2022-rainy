<script>
    let value="html도 작성 가능"
    let answer=""
    let selected
    let questions=[
        {id:1, text:`초등학교 이름은?`},
        {id:2, text:`어머니 이름은?`},
        {id:3, text:`애완동물 이름은?`}
    ]
    function handleSubmit(){
        alert(`질문: ${selected.id}, ${selected.text} 답: ${answer}`)
    }
    function initSelect(){
        console.log(selected)
        answer=""
    }
    const list=[
        {id:1, text:"A"},
        {id:2, text:"B"},
        {id:3, text:"C"}
    ]
    let selList=[]
    // document.getElementById("header1").innerHTML="Hello World!"
    let html="<h1>Hello World</h1>"
</script>

<div>
    <textarea bind:value></textarea>
    {@html value}
</div>
<h1>Bindings2</h1>
<div>
    <form on:submit|preventDefault={handleSubmit}> 
        <select bind:value={selected} on:change="{initSelect}">
            {#each questions as question}
                <option value={question}>
                    {question.text}
                </option>
            {/each}
        </select>
        <input bind:value={answer}/>
        <input type="submit" disabled={!answer}>
    </form>
</div>
<div>
    <select multiple bind:value="{selList}">
        {#each list as item}
            <option value={item}>{item.text}</option>
        {/each}
    </select>
    {#each selList as selItem}
        <p>{selItem.text}</p>
    {/each}
</div>

<div contenteditable="true" bind:innerHTML={html}></div>
<div contenteditable="true" bind:textContent={html}></div>

<style>
    textarea{
        width: 100%;
        height: 200px;
    }
    input, select{
        display: block;
        margin: 10px;
    }
</style>