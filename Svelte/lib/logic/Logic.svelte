<script>
    let user={
        loggedIn:false
    }
    function toggle(){
        user.loggedIn=!user.loggedIn
        console.log(user.loggedIn)
    }
    let x=8

    let cats=[
        {id:"J---aiyznGQ", name:"Keyboard Cat"},
        {id:"X-b4CgGmhuA", name:"Maru Cat"},
        {id:"wx5Of3X-VJw", name:"Henri Cat"},
        {id:"bxhS1bW-hs8", name:"Romano Cat"}
    ]
</script>
<!-- 
    {#if 조건}
    {/if} 
-->
<!-- #,:,/ -->
<div>
    {#if !user.loggedIn}
    <button on:click="{toggle}">Log in</button> <!-- "{}"에서 ""는 생략가능-->
    {/if}
    {#if user.loggedIn}
    <button on:click={toggle}>Log out</button>
    {/if}
</div>
<h1>logic</h1>
<div>
    {#if user.loggedIn}
    <button on:click={toggle}>Log out</button>
    {:else}
    <button on:click="{toggle}">Log in</button>
    {/if}
</div>
<div>
    {#if x>10}
    <p>{x} is greater than 10</p>
    {:else if 5>x}
    <p>{x} is less than 5</p>
    {:else}
    <p>{x} is between 5 and 10</p>
    {/if}
</div>
<div>
    <h1>The Famous Cats of YouTube</h1>
    <!-- loop -->
    <ul>
        {#each cats as cat} 
            <li><a target="_blank" href="https://www.youtube.com/watch?v={cat.id}">{cat.name}</a></li>
        {/each}
    </ul>
    <ul>
        {#each cats as {id,name},i} 
            <li><a target="_blank" href="https://www.youtube.com/watch?v={id}">{i+1}: {name}</a></li>
        {/each}
    </ul>
</div>