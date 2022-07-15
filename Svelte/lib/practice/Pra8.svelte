<script>
    import { onMount } from "svelte";

    let bus=[]
    let busInfo=[]
    onMount(async()=>{
    const res=await fetch("https://apis.data.go.kr/1613000/BusRouteInfoInqireService/getRouteNoList?serviceKey=x0KzQoj%2FBIV99brth41ohqqH0C5620X1PHjoinCE0HLzbf0J99nvL%2FZo3TCCzAbXXPr%2Bw8iS8bomh8QnO9kqpQ%3D%3D&pageNo=1&numOfRows=241&_type=json&cityCode=22")
    bus=await res.json()
    console.log(bus)
    busInfo=bus.response.body.items.item
    console.log(busInfo)
})
</script>

<div id="dgb_info">
    <h2>대구 시내버스 정보</h2>
    <div>
        {#each busInfo as info}
            <table>
                <tr>
                    <td>노선종류</td>
                    <td class="tda">{info.routetp}</td>
                </tr>
                <tr>
                    <td>노선번호</td>
                    <td class="tda">{info.routeno}</td>
                </tr>
                <tr>
                    <td>출발지</td>
                    <td class="tda">{info.startnodenm}</td>
                </tr>
                <tr>
                    <td>종착지</td>
                    <td class="tda">{info.endnodenm}</td>
                </tr>
            </table>
        {/each}
    </div>
</div>

<style>
    table{
        border: 1px solid;
        margin: 5px;
        display: table;
        margin-left: auto;
        margin-right: auto;
    }
    td{
        border: 1px solid;
    }
    .tda{
        width: 480px;
    }
</style>