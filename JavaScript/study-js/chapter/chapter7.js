console.log("chapter7")
//vanilla(바닐라) js
//HTML 요소(태그) = 문서 객체(DOM: Document Object Model)
//const firstH1
//firstH1
//window onload() - 이전에 사용하던 방식이나 이제는 addEventListener을 사용하는 것이 좋음
//body 밑에 script를 넣기도 하지만 한국에서는 head에 넣어놓음 
//head에 sctipt를 넣었을 때 아래와 같은 방식을 사용
document.addEventListener("DOMContentLoaded",()=>{
})

function chapter7(){
     //document.body - body 전체를 가져올 때 사용
     //document.head
     //document.title
     const header=document.querySelector("h1")
     header.textContent="HEADERS"
     header.style.color="white"
     header.style.backgroundColor="black"
     header.style.padding="10px"

     const headers=document.querySelectorAll("h5")
     headers.forEach((header)=>{
        header.textContent="HEADERS2"
        header.style.color="white"
        header.style.backgroundColor="black"
        header.style.padding="10px"
     })
     //아이디 선택자
     document.getElementById("firstH1").innerText="Hello DOM"
     //클래스 선택자
     const h2s=document.getElementsByClassName("h2s")
     const i=0
     console.log(h2s) //따로 지정하고 싶을 때 [index]값 넣어주면 됨
     for(const h2 of h2s){
        h2.textContent="This is h2"
     }
     h2s[0].textContent="h2"
     h2s[1].style.color="blue"
     h2s[2].style.backgroundColor="#ffff80"
     //선택자 매개변수 CSS와 유사
     //글자 조작
     const a=document.querySelector("#a")
     const b=document.getElementById("b")
     //최근에는 innerText 보다 textContent를 많이 사용
     a.textContent="<h1>textContent 속성</h1>"
     b.innerHTML="<h1>innerHTML 속성</h1>"
     //속성 조작
     const rects=document.querySelectorAll(".rect")
     rects.forEach((rect, index)=>{
        console.log(index)
        const width=(index+1)*150
        const height=(index+1)*100
        const src=`http://placekitten.com/${width}/${height}`
        rect.setAttribute("src",src)
        //rect.src=src - 가능
     })
     const rects1=document.getElementById("rect1")
     console.log(rects1.getAttribute("src"))
     console.log(rects1.getAttribute("alt"))
     //스타일 조작
     /*
        background-color -> backgroundColor
        text-align -> textAlign
        font-size -> fontSize
     */
    const styleDiv=document.getElementById("styleDiv")
    styleDiv.style.width="300px"
    styleDiv.style.height="300px"
    setTimeout(()=>{
       styleDiv.style.backgroundColor="red"
    },800)
    setTimeout(()=>{
       styleDiv.style["backgroundColor"]="blue"
    },1600)
    setTimeout(()=>{
       styleDiv.style["background-color"]="green"
    },2400)

    //요소 생성
    const header1=document.createElement("h1")
    header1.textContent="문서 객체 동적으로 생성하기"
    header1.setAttribute("class","header1")
    header1.style.color="purple"
    //요소 삽입
    //document.body -> body에 넣을 때 사용(잘 안 씀)
    document.getElementById("aDiv").appendChild(header1)
    //요소 생성 삽입 이동
    const header2=document.createElement("h2")
    header2.textContent="이동하는 태그"
    const divF=document.getElementById("first")
    divF.appendChild(header2)
    const divS=document.getElementById("second")
    setTimeout(()=>{
        divS.appendChild(header2)
    },2800)
    //요소 삭제
    setTimeout(()=>{
        header2.parentNode.removeChild(header2)
    //divS.removeChild(header2) - 이 방법도 가능
    },3500)

    //이벤트 설정
    const b1=document.getElementById("b1")
    //마우스 왼쪽 버튼이 down up ->click
    let count=0
    const listner=(event)=>{
        console.log(event)
        count++
        b1.textContent=`Count: ${count}`
    }
    b1.addEventListener("click",(listner))
    let count2=0
    const listner2=(event)=>{
        console.log(event)
        count2++
        b2.textContent=`Count: ${count2}`
    }
    b2.addEventListener("click",(listner2))
    //삭제
    setTimeout(()=>{
        b1.removeEventListener("click", listner)
    },5000)
}
chapter7()