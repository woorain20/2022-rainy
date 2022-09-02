import { Collapse } from "bootstrap"

console.log("chapter2")
/*
    prompt("라벨 메시지","안내 문자열")
*/
//const message=prompt("메세지를 입력해주세요","여기에 입력해주세요")
//alert("경고창")
//alert(message)
//console.log(message)

//const b=confirm("수락하시겠습니까?")

let a=1
console.log(typeof(a))
a="asdf"
console.log(typeof(a))

let num1=Number("273")
console.log(num1)
console.log(typeof(num1))

/* nan = not a number */
let num2=Number("273d")

let num3=Number(true)
console.log(num3)
console.log(typeof(num3))

let num4=Number(false)
console.log(num4)
console.log(typeof(num4))

/* 연산자 사용해서 자료형 변환 */
//문자로 자동 변환 연산자: +
let data1=1.23+123+""
console.log("data1: "+data1)
console.log(typeof(data1))
let data2=true+""
console.log("data2: "+data2)
console.log(typeof(data2))

// -,*,/,% -> 넘버 타입으로 자동 변환
let data3="52"-0
console.log("data3: "+data3)
console.log(typeof(data3))

console.log(typeof(String(52.273)))
/* 
    prinf 비슷한 랜더링
*/
let num5=2022
let num6=6
let num7=28

console.log(num5+"년 "+num6+"월 "+num7+"일")
console.log(`${num5}년 ${num6}월 ${num7}일`)

console.log(Boolean(52.273))    //뭔가를 넣으면 true
console.log(Boolean("sada"))

/* false로 변환되는 5가지 */
console.log(Boolean(0))
console.log(Boolean(NaN))
console.log(Boolean(""))
console.log(Boolean(null))
let variable
console.log(Boolean(variable))

if(Boolean(variable)){
    console.log("True ")
}else{
    console.log("False ")
}

console.log(!true)
console.log(!false)
console.log(!!0)
console.log(!!123)

const date=new Date()
console.log(date)
const hour=date.getHours()
console.log(hour)
const minutes=date.getMinutes()
console.log(minutes)

if(hour<12){
    console.log("오전")
}
if(hour>12){
    console.log("오후")
}

if(hour<12){
    console.log("오전!")
    if(8<hour<9){
        console.log("아침시간")
    }
}else{
    console.log("오후!")
}

if(hour<12){
    console.log("아침시간!")
}else if(hour<15){
    console.log("점심시간!")
}else if(hour<20){
    console.log("저녁시간!")
}else{
    console.log("잘 시간!")
}

//const input=Number(prompt("숫자 입력: ")) //prompt는 문자열로 입력되므로 Number로 형변환 해줌

// switch(input%2){
//     case 0:
//         console.log("짝수")
//         break
//     case 1:
//         console.log("홀수")
//         break
//     default:
//         console.log("숫자아님")
//         break
// }

// const input=Number(prompt("숫자 입력: "))
// const result=input>0?"양수.":"음수."
// const result2=input%2==0?"짝":"홀"
// console.log(result)
// console.log(result2)

let a1=true
let b1=false
console.log(a1||b1)
a1||console.log("실행a")    //false 일 때 실행
!a1||console.log("실행a2")
b1||console.log("실행b")
!b1||console.log("실행b2")
// true && (실행할 문장)
a1&&console.log("실1")  // true일 때 실행
!a1&&console.log("실2")
b1&&console.log("실3")
!b1&&console.log("실4")

//java script에서는 배열 안에 다양한 형태의 데이터가 들어갈 수 있음
const array=[273,"string",true,{1:"object"},[273,103],function(){}] //{}: 객체
console.log(array)

const numbers=[273,52,103,32]
console.log(numbers[0])
console.log(numbers[1])
console.log(numbers[2])
console.log(numbers[3])
let num8=1
console.log(numbers[num8])
console.log(numbers[1+1])

const fruits=["배","사과","키위","바나나","망고"]
console.log(fruits.length)
console.log(fruits[5])
console.log(fruits.length-2)
console.log(fruits[3-1])

fruits[6]="레몬"
console.log(fruits)
console.log(fruits.length)
fruits[5]="딸기"
console.log(fruits)
fruits[fruits.length]="파인애플"
console.log(fruits)
fruits[0]="참외"
console.log(fruits)
fruits.push("수박")
console.log(fruits)

/*
    배열.splice(인덱스, 제거할 요소의 개수)
*/
const itemsA=["사과","배","바나나"]
// itemsA.splice(2,1)
// console.log(itemsA) //사과 배만 나옴

// itemsA.splice(1,2)
// console.log(itemsA) //사과만 나옴

const i=itemsA.indexOf("배")
console.log(i)
itemsA.splice(i,1)
console.log(itemsA) //사과 바나나만 나옴

const itemsC=["사과","귤","바나나","오렌지"]
itemsC.splice(1,0,"양파")   // 배열상 1인 귤의 앞에 새로운 배열 되며 0을 하면 지우지 않음
console.log(itemsC)