<script>
    import BuyeoMuseum from "./BuyeoMuseum.svelte";
    import CentralMuseum from "./CentralMuseum.svelte";
    import CheongjuMuseum from "./CheongjuMuseum.svelte";
    import ChuncheonMuseum from "./ChuncheonMuseum.svelte";
    import DaeguMuseum from "./DaeguMuseum.svelte";
    import GimhaeMuseum from "./GimhaeMuseum.svelte";
    import GongjuMuseum from "./GongjuMuseum.svelte";
    import GwangjuMuseum from "./GwangjuMuseum.svelte";
    import GyeongjuMuseum from "./GyeongjuMuseum.svelte";
    import IksanMuseum from "./IksanMuseum.svelte";
    import JejuMuseum from "./JejuMuseum.svelte";
    import JeonjuMuseum from "./JeonjuMuseum.svelte";
    import JinjuMuseum from "./JinjuMuseum.svelte";
    import NajuMuseum from "./NajuMuseum.svelte";
    import src from "./infoimg/roof-tile-g319be8635_1920.jpg"

    let list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14=false
    function centralopen(){
        list=!list
        list2=list3=list4=list5=list6=list7=list8=list9=list10=list11=list12=list13=list14=false
    }
    function gyeongjuopen(){
        list2=!list2
        list=list3=list4=list5=list6=list7=list8=list9=list10=list11=list12=list13=list14=false
    }
    function gwangjuopen(){
        list3=!list3
        list=list2=list4=list5=list6=list7=list8=list9=list10=list11=list12=list13=list14=false
    }
    function jeonjuopen(){
        list4=!list4
        list=list2=list3=list5=list6=list7=list8=list9=list10=list11=list12=list13=list14=false
    }
    function daeguopen(){
        list5=!list5
        list=list2=list3=list4=list6=list7=list8=list9=list10=list11=list12=list13=list14=false
    }
    function buyeoopen(){
        list6=!list6
        list=list2=list3=list4=list5=list7=list8=list9=list10=list11=list12=list13=list14=false
    }
    function gongjuopen(){
        list7=!list7
        list=list2=list3=list4=list5=list6=list8=list9=list10=list11=list12=list13=list14=false
    }
    function jinjuopen(){
        list8=!list8
        list=list2=list3=list4=list5=list6=list7=list9=list10=list11=list12=list13=list14=false
    }
    function cheongjuopen(){
        list9=!list9
        list=list2=list3=list4=list5=list6=list7=list8=list10=list11=list12=list13=list14=false
    }
    function gimhaeopen(){
        list10=!list10
        list=list2=list3=list4=list5=list6=list7=list8=list9=list11=list12=list13=list14=false
    }
    function jejuopen(){
        list11=!list11
        list=list2=list3=list4=list5=list6=list7=list8=list9=list10=list12=list13=list14=false
    }
    function chuncheonopen(){
        list12=!list12
        list=list2=list3=list4=list5=list6=list7=list8=list9=list10=list11=list13=list14=false
    }
    function najuopen(){
        list13=!list13
        list=list2=list3=list4=list5=list6=list7=list8=list9=list10=list11=list12=list14=false
    }
    function iksanopen(){
        list14=!list14
        list=list2=list3=list4=list5=list6=list7=list8=list9=list10=list11=list12=list13=false
    }
</script>

<div id="total">
    <div id="list">
        <h1>우리의 박물관을 찾아서</h1>
        <ul>
            <button on:click="{centralopen}"><li>국립 중앙박물관</li></button>
            <button on:click="{gyeongjuopen}"><li>국립 경주박물관</li></button>
            <button on:click="{gwangjuopen}"><li>국립 광주박물관</li></button>
            <button on:click="{jeonjuopen}"><li>국립 전주박물관</li></button>
            <button on:click="{daeguopen}"><li>국립 대구박물관</li></button>
            <button on:click="{buyeoopen}"><li>국립 부여박물관</li></button>
            <button on:click="{gongjuopen}"><li>국립 공주박물관</li></button>
            <button on:click="{jinjuopen}"><li>국립 진주박물관</li></button>
            <button on:click="{cheongjuopen}"><li>국립 청주박물관</li></button>
            <button on:click="{gimhaeopen}"><li>국립 김해박물관</li></button>
            <button on:click="{jejuopen}"><li>국립 제주박물관</li></button>
            <button on:click="{chuncheonopen}"><li>국립 춘천박물관</li></button>
            <button on:click="{najuopen}"><li>국립 나주박물관</li></button>
            <button on:click="{iksanopen}"><li>국립 익산박물관</li></button>
        </ul>
    </div>
    <div id="contentsss">
        {#if !list && !list2 && !list3 && !list4 && !list5 && !list6 && !list7 && !list8 && !list9 && !list10 && !list11 && !list12 && !list13 && !list14}
            <img {src} alt="담">
        {/if}
        {#if list} 
            <CentralMuseum/>
        {:else if list2}
            <GyeongjuMuseum/>
        {:else if list3}
            <GwangjuMuseum/>
        {:else if list4}
            <JeonjuMuseum/>
        {:else if list5}
            <DaeguMuseum/>
        {:else if list6}
            <BuyeoMuseum/>
        {:else if list7}
            <GongjuMuseum/>
        {:else if list8}
            <JinjuMuseum/>
        {:else if list9}
            <CheongjuMuseum/>
        {:else if list10}
            <GimhaeMuseum/>
        {:else if list11}
            <JejuMuseum/>
        {:else if list12}
            <ChuncheonMuseum/>
        {:else if list13}
            <NajuMuseum/>
        {:else if list14}
            <IksanMuseum/>
        {/if}
    </div>
</div>
<div style="margin-bottom:100px">
    
</div>

<style>
    #total{
        text-align: center;
        vertical-align: middle;
    }
    #list{
        margin-top: 3%;
    }
    h1{
        margin-bottom: 3%;
    }
    ul{
        margin-bottom: 5%;
        width: 90%;
        margin-left: 5%;
    }
    li{
        list-style: none;
        float: left;
        font-weight: 600;
        font-size: 1.5em;
    }
    button{
        width: 12%;
        border: 3px outset;
        border-radius: 5px;
        margin: 0.5%;
    }
    button:hover{
        border: 3px inset;
    }
    button:focus{
        border: 3px inset;
    }
    img{
        width: 90%;
        height: 70%;
        border-radius: 5px;
    }
    #contentsss{
        margin-bottom: 2%;
    }
</style>