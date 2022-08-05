<h1>EVENT </h1>

<div id="poster">
    <img src="http://via.placeholder.com/450X600" alt="오타났다"/>
    </div>
    <div id="content">
        <table>
                <h4>제목</h4>
                <tr>
                    <td class="col">관람료</td>
                    <td class="con">금액</td>
                </tr>
                <tr>
                    <td class="col">장소</td>
                    <td class="con">위치</td>
                </tr>
                <tr>
                    <td class="col">기간</td>
                    <td class="con">날짜</td>
                </tr>
                <tr>
                    <td class="col">공연시간</td>
                    <td class="con">시간</td>
                </tr>
                <tr>
                    <td class="col">최대좌석</td>
                    <td class="con">인원</td>
                </tr>
                <tr id="detailcon">
                    <td class="col">내용</td>
                    <td class="con">내부</td>
                </tr>
                <tr >
                    <td colspan="2">
                        <button>장바구니</button>
                        <button>예매하기</button>
                    </td>
            </tr>
        </table>

        <!-- <div id="cancelrole"> -->
            <p>취소규정<br/>
                * 공연 시작 3시간전까지 전액환불 가능 <br/> * 1시간전까지는 절반 환불 <br/> * 30분전 환불금 없음</p>
        <!-- </div> -->
    </div>
    
    <style>
    /* div,table,th,tr,td {
        border: 1px solid black;
    } */
    #poster{
        float: left;
    }
    #content{
        float: left;
        margin-left:20px;
       
    }
    #content>table>h4{
        margin-top:10px;
    }
    .col{
        width:100px;
        height:50px;
        text-align: right;
    }
    .con{
        width:200px;
    }
    #detailcon{
        height:200px;
    }
    #content>p{
        margin-left:20px;
        margin-top:20px;
        float: left;
        border: 0px;
        height:50px;
        text-align: left;
    }
    
    
    </style>