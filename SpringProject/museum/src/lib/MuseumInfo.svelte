<script>
    import src from "./infoimg/roof-tile-g319be8635_1920.jpg"
    import CentralMuseum from "./museumList/CentralMuseum.svelte";

    let cmclick=false
    let gyjmclick=false
    let gwjmclick=false
    let jejmclick=false
    let dgmclick=false
    let bymclick=false
    let gojmclick=false
    let jijmclick=false
    let cjmclick=false
    let ghmclick=false
    let jjumclick=false
    let ccmclick=false
    let njmclick=false
    let ismclick=false

    function cmopen(){
        cmclick=!cmclick
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function gyjopen(){
        cmclick=false
        gyjmclick=!gyjmclick
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function gwjopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=!gyjmclick
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function jejopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=!jejmclick
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function dgopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=!dgmclick
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function byopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=!bymclick
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function gojopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=!gojmclick
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function jijopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=!jijmclick
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function cjopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=!cjmclick
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function ghopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=!ghmclick
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function jjuopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=!jjumclick
        ccmclick=false
        njmclick=false
        ismclick=false
    }
    function ccopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=!ccmclick
        njmclick=false
        ismclick=false
    }
    function njopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=!njmclick
        ismclick=false
    }
    function isopen(){
        cmclick=false
        gyjmclick=false
        gwjmclick=false
        jejmclick=false
        dgmclick=false
        bymclick=false
        gojmclick=false
        jijmclick=false
        cjmclick=false
        ghmclick=false
        jjumclick=false
        ccmclick=false
        njmclick=false
        ismclick=!ismclick
    }
</script>
<body>
<div id="list">
    <h1>우리의 박물관을 찾아서</h1>
    <ul>
        <button on:click="{cmopen}"><li>국립 중앙박물관</li></button>
        <button on:click="{gyjopen}"><li>국립 경주박물관</li></button>
        <button on:click="{gwjopen}"><li>국립 광주박물관</li></button>
        <button on:click="{jejopen}"><li>국립 전주박물관</li></button>
        <button on:click="{dgopen}"><li>국립 대구박물관</li></button>
        <button on:click="{byopen}"><li>국립 부여박물관</li></button>
        <button on:click="{gojopen}"><li>국립 공주박물관</li></button>
        <button on:click="{jijopen}"><li>국립 진주박물관</li></button>
        <button on:click="{cjopen}"><li>국립 청주박물관</li></button>
        <button on:click="{ghopen}"><li>국립 김해박물관</li></button>
        <button on:click="{jjuopen}"><li>국립 제주박물관</li></button>
        <button on:click="{ccopen}"><li>국립 춘천박물관</li></button>
        <button on:click="{njopen}"><li>국립 나주박물관</li></button>
        <button on:click="{isopen}"><li>국립 익산박물관</li></button>
    </ul>
</div>
<div id="pic">
    {#if !cmclick && !gyjmclick && !gwjmclick && !jejmclick && !dgmclick && !bymclick && !gojmclick && !jijmclick && !cjmclick && !ghmclick && !jjumclick && !ccmclick && !njmclick && !ismclick}  
    <img {src} alt="담">
    {/if}
</div>
<div>
    {#if cmclick}
    <CentralMuseum/>
    {:else if gyjmclick}
    {/if}
</div>
</body>
<style>
    body{
        text-align: center;
        display: table-cell;
        vertical-align: middle;
    }
  
    h1{
        margin-bottom: 50px;
    }
    ul{
        margin-bottom: 50px;
    }
    li{
        list-style: none;
        float: left;
    }
    #pic{
        margin-top: 50px;
    }
    img{
        width: 100%;
        height: 70%;
        border-radius: 5px 5px 5px 5px;
    }
</style>