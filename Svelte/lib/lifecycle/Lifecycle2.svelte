<script>
    import {afterUpdate, beforeUpdate, onDestroy, onMount, tick} from "svelte"
    onMount(()=>{
        console.log("onMount Called")
    })
    onDestroy(()=>{
        console.log("onDestory Called")
    })
    beforeUpdate(()=>{
        console.log("beforeUpdate Called")
    })
    afterUpdate(()=>{
        console.log("afterUpdate Called")
    })
    let name="World"
    function changeName(){
        name="Svelte"
        console.log("Name Changed")
    }
    async function changeNameAfter(){
        name="Aweasome Svelte"
        await tick()    //화면 갱신이 완료된 후 시행하도록 하는 것
        const h3=document.querySelector("h3")
        console.log("h1: ",h3.textContent)
    }
</script>
<div>
    <h3>Hello {name}!</h3>
    <button on:click="{changeName}">Change Name</button>
    <button on:click="{changeNameAfter}">change Name After</button>
</div>
<h1>Lifecycle2</h1>