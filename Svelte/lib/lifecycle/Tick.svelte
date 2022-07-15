<script>
import { tick } from "svelte";

    let text="Select some text and hit the tab key to toggle uppercase"
    async function handlekeydown(event) {
        if(event.key!=="Tab"){
            return  
        }
        event.preventDefault()  //Tab이 가진 기본 기능 막음
        // @ts-ignore
        const {selectionStart, selectionEnd, value}=this    //this는 textarea를 가르킴(아래 있는 객체)
        const selection=value.slice(selectionStart, selectionEnd)   //드래그하여 선택한 부분
        // 정규 표현식 - /패턴/ - 문자열에서 특정 문자 패턴 찾기 위한 것 - 자주 쓰이지 않음 , 만들어 놓은 것 찾아서 사용할 것  
        const replacement=/[a-z]/.test(selection)?selection.toUpperCase():selection.toLowerCase()   //3항 연산자 활용
        text=value.slice(0, selectionStart)+replacement+value.slice(selectionEnd)
        //렌더링 종료 start와 end가 사라진 상태
        await tick()
        this.selectionStart=selectionStart
        this.selectionEnd=selectionEnd
    }
</script>

<h1>Tick</h1>
<textarea value={text} on:keydown="{handlekeydown}"></textarea>

<style>
    textarea{
        width: 100%;
        height: 200px;
    }
</style>