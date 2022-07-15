<script>
    import src from "./image/bus-g5abd6b404_640.png"
    function exit(){
        if(!confirm("종료하시겠습니까>")){
        }else{
            alert("종료합니다.");
        }
    }
</script>

<div id="frame">
    <div id="frame2">
        <div id="main">
            <h1>버스 정보 찾Go</h1>
            <img {src} alt="버스 이미지">
            <div id="path">
                <ul>
                    <li><button>버스 정보</button></li>
                    <li><button>찾기</button></li>
                    <li><button>설정</button></li>
                    <li><button on:click="{exit}">종료</button></li>
                </ul>
            </div>
        </div>
    </div>
</div>

<style>
    #frame{
        position: absolute;
		display: flex;
		align-items: center;
		justify-content: center;
		width: 100%;
		height: 100%;
		top: 0;
		left: 0;
    }
    #frame2{
        position: relative;
		display: flex;
		flex-direction: column;
		width: 100%;
		height: 100%;
		border: 2vmin solid #ccc;
		border-bottom-width: 5vmin;
		padding: 3vmin;
		border-radius: 2vmin;
    }
    #main{
        text-align: center;
        margin: 30px;
    }
    img{
        width: 400px;
        height: 300px;
        display: table;
        margin-left: auto;
        margin-right: auto;
    }
    li{
        list-style: none;
        margin: 30px;
        align-content: center;
    }
    button{
        border-radius: 15px 15px 15px 15px;
        font-size: 2em;
        width: 200px;
        height: 75px;
        background-color: lightblue;
    }
</style>