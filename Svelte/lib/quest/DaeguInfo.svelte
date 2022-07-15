<script>
    import { onMount } from "svelte";

    export let bus=[]
    export let busInfo=[]
    onMount(async()=>{
    const res=await fetch("https://apis.data.go.kr/1613000/BusRouteInfoInqireService/getRouteNoList?serviceKey=x0KzQoj%2FBIV99brth41ohqqH0C5620X1PHjoinCE0HLzbf0J99nvL%2FZo3TCCzAbXXPr%2Bw8iS8bomh8QnO9kqpQ%3D%3D&pageNo=1&numOfRows=241&_type=json&cityCode=22")
    bus=await res.json()
    console.log(bus)
    busInfo=bus.response.body.items.item
    console.log(busInfo)
    })
    let text="정보 없음"
</script>

<div id="dgb_info">
    <h2>대구 시내버스 정보</h2>
    <div>
        {#each busInfo as info}
            <table>
                <tr>
                    <td>노선유형</td>
                    <td class="tda">{info.routetp}</td>
                </tr>
                <tr>
                    <td>노선번호</td>
                    <td class="tda">{info.routeno}</td>
                </tr>
                <tr>
                    <td>기점</td>
                    <td class="tda">{info.startnodenm}</td>
                </tr>
                <tr>
                    <td>종점</td>
                    <td class="tda">{info.endnodenm}</td>
                </tr>
                <tr>
                    <td>첫차</td>
                    <td class="tda">
                        {#if info.startvehicletime==null}
                            {text}
                        {:else}
                            {info.startvehicletime}
                        {/if}
                    </td>
                </tr>
                <tr>
                    <td>막차</td>
                    <td class="tda">
                        {#if info.endvehicletime==null}
                            {text}
                        {:else}
                            {info.endvehicletime}
                        {/if}
                    </td>
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