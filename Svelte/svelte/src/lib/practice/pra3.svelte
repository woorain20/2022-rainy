<script>
    let player=[
        {
            name:"베르트 레노",
            team:"아스날",
            nation:"독일",
            birthYear:1992,
            position:"GK",
            backNum:1
        },
        {
            name:"키어런 티어니",
            team:"아스날",
            nation:"스코틀랜드",
            birthYear:1997,
            position:"DF",
            backNum:3
        },
        {
            name:"벤 화이트",
            team:"아스날",
            nation:"잉글랜드",
            birthYear:1997,
            position:"DF",
            backNum:4
        },
        {
            name:"토마스 파티",
            team:"아스날",
            nation:"가나",
            birthYear:1993,
            position:"MF",
            backNum:5
        },
        {
            name:"가브리엘 마갈량이스",
            team:"아스날",
            nation:"브라질",
            birthYear:1997,
            position:"DF",
            backNum:6
        },
        {
            name:"부카요 사카",
            team:"아스날",
            nation:"잉글랜드",
            birthYear:2001,
            position:"MF",
            backNum:7
        },
        {
            name:"마틴 외데고르",
            team:"아스날",
            nation:"노르웨이",
            birthYear:1998,
            position:"MF",
            backNum:8
        },
        {
            name:"가브리엘 제수스",
            team:"아스날",
            nation:"브라질",
            birthYear:1997,
            position:"FW",
            backNum:9
        },
        {
            name:"에밀 스미스로우",
            team:"아스날",
            nation:"잉글랜드",
            birthYear:2000,
            position:"MF",
            backNum:10
        },
        {
            name:"가브리엘 마르티넬리",
            team:"아스날",
            nation:"브라질",
            birthYear:2001,
            position:"FW",
            backNum:11
        },
        {
            name:"에디 은케티아",
            team:"아스날",
            nation:"가나",
            birthYear:1999,
            position:"FW",
            backNum:14
        },
        {
            name:"롭 홀딩",
            team:"아스날",
            nation:"잉글랜드",
            birthYear:1995,
            position:"DF",
            backNum:16
        },
        {
            name:"세드릭 소아레스",
            team:"아스날",
            nation:"포르투갈",
            birthYear:1991,
            position:"DF",
            backNum:17
        },
        {
            name:"토미야스 다케히로",
            team:"아스날",
            nation:"일본",
            birthYear:1998,
            position:"DF",
            backNum:18
        },
        {
            name:"니콜라스 페페",
            team:"아스날",
            nation:"코트디부아르",
            birthYear:1995,
            position:"MF",
            backNum:19
        },
        {
            name:"누노 타바레스",
            team:"아스날",
            nation:"포르투갈",
            birthYear:2000,
            position:"DF",
            backNum:20
        },
        {
            name:"파비우 비에이라",
            team:"아스날",
            nation:"포르투갈",
            birthYear:2000,
            position:"MF",
            backNum:21
        },
        {
            name:"삼비 로콩가",
            team:"아스날",
            nation:"벨기에",
            birthYear:1999,
            position:"MF",
            backNum:23
        },
        {
            name:"모하메드 엘네니",
            team:"아스날",
            nation:"이집트",
            birthYear:1992,
            position:"MF",
            backNum:25
        },
        {
            name:"맷 터너",
            team:"아스날",
            nation:"미국",
            birthYear:1994,
            position:"GK",
            backNum:30
        },
        {
            name:"아론 램스데일",
            team:"아스날",
            nation:"잉글랜드",
            birthYear:1998,
            position:"GK",
            backNum:32
        },
        {
            name:"그라니트 자카",
            team:"아스날",
            nation:"스위스",
            birthYear:1992,
            position:"MF",
            backNum:34
        }
    ]
    let worldcup=[
        {
            nation:"카타르",
            group:"A조",
            region:"아시아"
        },
        {
            nation:"에콰도르",
            group:"A조",
            region:"남미"
        },
        {
            nation:"네덜란드",
            group:"A조",
            region:"유럽"
        },
        {
            nation:"세네갈",
            group:"A조",
            region:"아프리카"
        },
        {
            nation:"잉글랜드",
            group:"B조",
            region:"유럽"
        },
        {
            nation:"미국",
            group:"B조",
            region:"북중미"
        },
        {
            nation:"웨일스",
            group:"B조",
            region:"유럽"
        },
        {
            nation:"이란",
            group:"B조",
            region:"아시아"
        },
        {
            nation:"아르헨티나",
            group:"C조",
            region:"남미"
        },
        {
            nation:"사우디 아라비아",
            group:"C조",
            region:"아시아"
        },
        {
            nation:"멕시코",
            group:"C조",
            region:"북중미"
        },
        {
            nation:"폴란드",
            group:"C조",
            region:"유럽"
        },
        {
            nation:"프랑스",
            group:"D조",
            region:"유럽"
        },
        {
            nation:"호주",
            group:"D조",
            region:"아시아"
        },
        {
            nation:"덴마크",
            group:"D조",
            region:"유럽"
        },
        {
            nation:"튀니지",
            group:"D조",
            region:"아프리카"
        },
        {
            nation:"스페인",
            group:"E조",
            region:"유럽"
        },
        {
            nation:"독일",
            group:"E조",
            region:"유럽"
        },
        {
            nation:"코스타리카",
            group:"E조",
            region:"북중미"
        },
        {
            nation:"일본",
            group:"E조",
            region:"아시아"
        },
        {
            nation:"벨기에",
            group:"F조",
            region:"유럽"
        },
        {
            nation:"캐나다",
            group:"F조",
            region:"북중미"
        },
        {
            nation:"모로코",
            group:"F조",
            region:"아프리카"
        },
        {
            nation:"크로아티아",
            group:"F조",
            region:"유럽"
        },
        {
            nation:"브라질",
            group:"G조",
            region:"남미"
        },
        {
            nation:"세르비아",
            group:"G조",
            region:"유럽"
        },
        {
            nation:"스위스",
            group:"G조",
            region:"유럽"
        },
        {
            nation:"카메룬",
            group:"G조",
            region:"아프리카"
        },
        {
            nation:"대한민국",
            group:"H조",
            region:"아시아"
        },
        {
            nation:"포르투갈",
            group:"H조",
            region:"유럽"
        },
        {
            nation:"가나",
            group:"H조",
            region:"아프리카"
        },
        {
            nation:"우루과이",
            group:"H조",
            region:"남미"
        }
    ]
    let yes=false
    let yes2=false
    let text=""
    let text2=""

</script>

<div>
    <label>
        <p>정보 확인</p>
        <input type="checkbox" bind:checked="{yes}">
    </label>
    {#if yes}
    <div id="info">
        {#each player as pl}
            {#each worldcup as wc}
                {#if pl.nation==wc.nation}
                    <div id="ul">
                        <ul>
                            <li>{pl.name}</li>
                            <li>{pl.nation}</li>
                            <li>{wc.group}</li>
                        </ul>  
                    </div>  
                {/if}
            {/each}
        {/each}
    </div>
    {/if}
</div>
<div>
    <label>
        <p>선수 찾기</p>
        <input type="text" bind:value="{text}">
        <input type="checkbox" bind:checked="{yes2}" disabled={!text}>
    </label>
    <div id="info2">
        {#if yes2}
            {#each player as pl}
                {#if pl.nation=="잉글랜드"}
                    <div id="ul2">
                        <ul>
                            <li>{pl.name}</li>
                            <li>{pl.nation}</li>
                        </ul>  
                    </div>
                {/if}
            {/each}
        {/if}
    </div>
</div>
<div>
    <input type="text" bind:value="{text2}">
    {#if text2}
        {#each player as pla}
            {#if text2==pla.name}
                <table>
                    <tr>
                        <th>{text2}</th>
                    </tr>
                    <tr>
                        <td>소속팀</td>
                        <td>{pla.team}</td>
                    </tr>
                    <tr>
                        <td>포지션</td>
                        <td>{pla.position}</td>
                    </tr>
                    <tr>
                        <td>등번호</td>
                        <td>{pla.backNum}</td>
                    </tr>
                </table>          
            {/if}
            {#if text2==pla.position}
                <table>
                    <tr>
                        <th>{text2}</th>
                    </tr>
                    <tr>
                        <td>이름</td>
                        <td>{pla.name}</td>
                    </tr>
                    <tr>
                        <td>소속팀</td>
                        <td>{pla.team}</td>
                    </tr>
                    <tr>
                        <td>등번호</td>
                        <td>{pla.backNum}</td>
                    </tr>
                </table>          
            {/if}
            {#if text2==pla.nation}
                <table>
                    <tr>
                        <th>{text2}</th>
                    </tr>
                    <tr>
                        <td>이름</td>
                        <td>{pla.name}</td>
                    </tr>
                    <tr>
                        <td>포지션</td>
                        <td>{pla.position}</td>
                    </tr>
                    <tr>
                        <td>등번호</td>
                        <td>{pla.backNum}</td>
                    </tr>
                </table>          
            {/if}
        {/each}
    {/if}
</div>
<style>
    #info:checked{
        display: none;
    }
    #info2:checked{
        display: none;
    }
    #ul{
        float: left;
        width: 160px;
        height: 100px;
        margin: 10px;
    }
    #ul2{
        float: left;
        width: 160px;
        height: 100px;
        margin: 10px;
    }
</style>
