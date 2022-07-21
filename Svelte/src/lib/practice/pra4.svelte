<script>
import { onMount } from "svelte";
import Pra3 from "./pra3.svelte";

    let tex="ID"
    let pass="Password"
    let a=false
    function aStart(){
        a=!a
    }
    let b=false
    function bStart(){
        b=!b
    }
    let c=false
    function cStart(){
        c=!c
    }
    let photos=[]
    onMount(async()=>{
        const res=await fetch("https://jsonplaceholder.typicode.com/photos")
        photos=await res.json()
    })
    let albums=[]
    onMount(async()=>{
        const res=await fetch("https://jsonplaceholder.typicode.com/albums")
        albums=await res.json()
    })
</script>

<div id="all">
    <div id=header>
        <h1>Search Spot</h1>
    </div>
    <div id="body">
        <div id="aside">
            <fieldset>
                <label>
                    <input type="text" bind:value="{tex}">
                    <input type="password" bind:value="{pass}">
                    <input type="submit" disabled={!{tex, pass}}>
                </label>
            </fieldset>
            <div class="title">
                <input type="text">검색<br/>
                <ul>
                    <li><button on:click="{aStart}">사진</button></li>
                    <li><button on:click="{bStart}">선수</button></li>
                    <li><button on:click="{cStart}">기타</button></li>
                </ul>
            </div>
        </div>
        <div id="section">
            <div class="pho">
                {#if a}
                    {#each photos as photo}
                        <figure>
                            <img src="{photo.thumbnailUrl}" alt={photo.title}/>
                            <figcaption>{photo.title}</figcaption>
                        </figure>
                    {/each}
                {/if}
            </div>
            <div class="pl">
                {#if b}
                    <Pra3/>
                {/if}
            </div>
            <div>
                {#if c}
                    {#each albums as alb}
                        <p>{alb.id}</p>
                        <p>{alb.title}</p>
                    {/each}
                {/if}
            </div>
        </div>
    </div>
    <div id="footer">

    </div>
</div>

<style>
    #all{
        height: 100%;
        width: 100%;
    }
    #header{
        width: 100%;
        height: 15%;
        text-align: center;
        background-color: beige;
    }
    #body{
        width: 100%;
        height: 75%;
        display: flex;
    }
    #aside{
        flex: 2;
        height:100%;
        background-color: burlywood;
    }
    .title{
        width: 100%;
        height: 100px;
        vertical-align: top;
    }
    #section{
        flex: 8;
        height: 100%;
        text-align: center;
        background-color: darkgray;
    }
    .pho{
        width: 100%;
        display: grid;
        grid-template-columns: repeat(8,1fr);
        grid-gap:8px;
    }
    .pho figure, img{
        margin: 0;
        width: 100%;
    }
    .pl{
        width: 100%;
    }
</style>