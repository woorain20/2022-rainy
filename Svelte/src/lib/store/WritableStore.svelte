<script>
    import { onDestroy } from "svelte";

    import Incrementer from "./Incrementer.svelte"
    import Resetter from "./Resetter.svelte"
    import {count, greeting, time, name} from "./stores"

    // let countValue
    // const unsubscrib=count.subscribe(value=>{
    //     countValue=value
    // })
    //구독 해제 - 화면 안 보일 때
    // onDestroy(unsubscrib)
    //$, _ -> 식별자 정의할 때 쓰지 않음

    const formatter=new Intl.DateTimeFormat(
        "en",
        {
            hour12:true,
            hour:"numeric",
            minute:"2-digit",
            second:"2-digit"
        }
    )
</script>

<h1>WritableStore</h1>

<div>
    <h1>The count is {$count}</h1> <!-- $ 붙이면 자동으로 구독하고 구독해제 함 -->
    <Incrementer/>
    <Resetter/>
    <h1>{$time}</h1>
    <h1>The time is {formatter.format($time)}</h1>
    <!-- <p>This page has been open for {$elapsed} {$elapsed===1?"second":"seconds"}</p> -->
    <h1>{$greeting}</h1>
    <input bind:value="{$name}">
    <button on:click="{()=>$name+="!"}">Add exclamation mark</button>
</div>