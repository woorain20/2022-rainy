<script>
    let det="소개"
    function moDet(){
        det="Introduce"+"\n"+"History"+"\n"+"Philosophy"
    }
    function moDet2(){
        det="소개"
    }
    let det2="지점"
    function moDet3(){
        det2="검색"+"\n"+"지점 방침"
    }
    function moDet4(){
        det2="지점"
    }
    let det3="이벤트"
    function moDet5(){
        det3="진행중인 이벤트"+"\n"+"지난 이벤트"+"\n"+"당첨자 발표"
    }
    function moDet6(){
        det3="이벤트"
    }
</script>

<div>
    <details>소개
        <summary>Introduce</summary>
        <summary>History</summary>
        <summary>Philosophy</summary>
    </details>
    <details>지점
        <summary>검색</summary>
        <summary>지점 방침</summary>
    </details>
    <details>이벤트
        <summary>진행중 이벤트</summary>
        <summary>지난 이벤트</summary>
        <summary>당첨자 발표</summary>
    </details>   
</div>
<div>
    <button on:click="{moDet}" on:click="{moDet3}" on:click="{moDet5}">펼치기</button>
    <button on:click="{moDet2}" on:click="{moDet4}" on:click="{moDet6}">접기</button>
    <ul>
        <li>{det}</li>
        <li>{det2}</li>
        <li>{det3}</li>
    </ul>
</div>

<style>

</style>