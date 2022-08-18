<script>
    import { onMount } from "svelte";

    const post="http://192.168.0.51:8080/postboard/"
    let boards=[]

    onMount(async function(){
        const res=await fetch(post)
        const data = await res.json()
        boards=data._embedded.postboard
        // console.log(board)
        // console.log(callno)
    })

    let title, content, workplace, password
    let official=false
    let whiter="사용자"

    async function add(){
        const board = {
			 done: official , date : new Date , content: content, title: title, whiter: whiter, workplace: workplace, password: password
        }
		await fetch(post,{
			method:"POST", headers:{    //headers를 설정해야 오류가 안남
				"Content-Type":"application/json"
			},
			body:JSON.stringify({
				done:board.done, date : board.date, content : board.content, title: board.title, workplace: board.workplace, password: board.password, whiter: board.whiter
			})
		})
        boards=[board,...boards]
        
        title =""
        content =""
        workplace =""
        password =""
        whiter="사용자"
        official=false
        console.log(board)
    }
</script>

<div id="total">
    <div id="input">
        <input type="text" placeholder="작성자" bind:value="{whiter}"><br>
        <input type="text" placeholder="제목" id="title" bind:value="{title}">
        <input type="text" placeholder="문의장소" id="place" bind:value="{workplace}"><br>
        <input type="password" placeholder="비밀번호" id="pass" maxlength="6" minlength="4" bind:value="{password}">
        <p class="arrow_box">비밀번호는 4~6자리 숫자로 입력해주세요</p><br/>
        <textarea placeholder="내용을 입력해주세요" bind:value="{content}"></textarea><br/>
        <input type="submit" value="작성" id="click" on:click={()=>add()}>
    </div>
    <div id="note">
        <p>본인이 쓴 글을 삭제하기 위해서는 비밀번호가 필요합니다. 비밀번호를 기억해주시기 바랍니다.</p>
        <p>욕설, 인신공격, 광고 글은 삭제되니 작성에 유의 바랍니다.</p>
        <p>문의하여 주신 사항은 공지로 알려드립니다.</p>
    </div>
</div>

<style>
    #total{
        width: 90%;
        margin-left: 5%;
    }
    input{
        margin-bottom: 1%;
    }
    textarea{
        width: 90%;
        height: 350px;
    }
    #title{
        width: 30%;
    }
    #place{
        width: 20%;
    }
    #click{
        border-radius: 5px 5px 5px 5px;
        font-weight: 600;
    }
    #note{
        font-weight: 800;
    } 
    #pass{
        display: flex;
        width: 15%;
        cursor: pointer;
    }
    /* 말풍선 적절한 top 과 margin-left 로 위치조정 */
    .arrow_box {
        display: none;
        position: absolute;
        width: 15%;
        padding: 8px;
        left: 0;
        margin-left: 5%;
        -webkit-border-radius: 8px;
        -moz-border-radius: 8px;
        border-radius: 8px;
        background: #333;
        color: #fff;
        font-size: 14px;
    }
    .arrow_box:after {
        position: absolute;
        bottom: 100%;
        left: 50%;
        width: 0;
        height: 0;
        margin-left: 10%;
        border: solid transparent;
        border-color: rgba(51, 51, 51, 0);
        border-bottom-color: #333;
        border-width: 10px;
        pointer-events: none;
        content: ' ';
    }
    #pass:hover + p.arrow_box {
        display: block;
    }
</style>