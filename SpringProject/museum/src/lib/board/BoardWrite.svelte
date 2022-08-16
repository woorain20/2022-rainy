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

<div>
    <h1>게시판 글쓰기</h1>
    <div>
        <input type="text" placeholder="작성자" bind:value="{whiter}">
        <input type="text" placeholder="제목" bind:value="{title}">
        <input type="text" placeholder="문의장소" bind:value="{workplace}">
        <input type="password" placeholder="비밀번호" bind:value="{password}"><br/>
        <textarea placeholder="내용을 입력해주세요" bind:value="{content}"></textarea><br/>
        <input type="submit" value="글쓰기" on:click={()=>add()}>
    </div>
    <p>본인이 쓴 글을 삭제하기 위해서는 비밀번호가 필요합니다. 비밀번호를 기억해주시기 바랍니다.</p>
    <p>욕설, 인신공격, 광고 글은 삭제되니 작성에 유의 바랍니다.</p>
    <p>문의하여 주신 사항은 공지로 알려드립니다.</p>
</div>

<style>
    textarea{
        width: 90%;
        height: 50%;
    }
</style>