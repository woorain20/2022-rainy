<script>
    import { onMount } from "svelte";

    const museumList="http://192.168.0.51:8080/museumlist/"

    let museuminfomation=[]

    onMount(async function(){
        const res=await fetch(museumList)
        const data = await res.json()
        museuminfomation=data._embedded.museumlist
        console.log(museuminfomation)
        // console.log(museuminfo[0])
    })
</script>

<div id="main">
    <div id="contents">
        <div id="muse">
            {#each museuminfomation as museum}
                {#if museum.photo=="gwangju1"}
                    <div id="img">
                        <img src="./src/lib/museumlist/infoimg/{museum.photo}.jpg" alt="박물관">
                    </div>
                    <div id="map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3260.7126013276434!2d126.88134361560292!3d35.188715064431584!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x35718c339b4c64d9%3A0x529f3ce75d9d6879!2z6rWt66a96rSR7KO867CV66y86rSA!5e0!3m2!1sko!2skr!4v1659663593587!5m2!1sko!2skr"
                         width="400" height="300" style="border:0;" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                    </div>
                    <div id="info">
                        <table>
                            <tr>
                                <td class="tdb">장소</td>
                                <td class="tda">국립광주박물관</td>
                            </tr>
                            <tr>
                                <td class="tdb">주소</td>
                                <td class="tda">{museum.address}</td>
                            </tr>
                            <tr>
                                <td class="tdb">전화번호</td>
                                <td class="tda">{museum.phone}</td>
                            </tr>
                            <tr>
                                <td class="tdb">개관</td>
                                <td class="tda">{museum.found}</td>
                            </tr>
                            <tr>
                                <td class="tdb">이용시간</td>
                                <td class="tda">{museum.time}</td>
                            </tr>
                            <tr>
                                <td class="tdb">휴무일</td>
                                <td class="tda">{museum.rest}</td>
                            </tr>
                            <tr>
                                <td class="tdb">요금</td>
                                <td class="tda">{museum.fee}</td>
                            </tr>
                            <tr>
                                <td class="tdb">편의시설</td>
                                <td class="tda">{museum.depository}</td>
                            </tr>
                            <tr>
                                <td class="tdb">홈페이지</td>
                                <td class="tda"><a href="https://gwangju.museum.go.kr/" target="_blank">{museum.homepage}</a></td>
                            </tr>
                        </table>
                    </div>
                {/if}                
            {/each}
        </div>
    </div>
</div>

<style>
    #contents{
        background-color: #f9ffe6;
    }
    #img{
        width: 100%;
        align-items: center;
    }
    img{
        width: 75%;
        border-radius: 7px 7px 7px 7px;
    }
    #map{
        float: left;
        margin-top: 3%;
        margin-left: 20%;
        margin-bottom: 2%;
        box-shadow: 5px 5px 5px;
    }
    #info{
        float: left;
        margin-top: 3%;
        margin-left: 6%;
        margin-bottom: 2%;
    }
    .tdb{
        border: 5px inset;
        width: 100px;
        height: 30px;
        background-color: #e6e6e6;
    }
    .tda{
        border: 5px inset;
        width: 550px;
        height: 30px;
        font-weight: 600;
        text-align: left;
    }
</style>