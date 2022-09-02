console.log("chapter5-2")

const noNameFunc=function(){
    console.log("익명 함수")
}
/*
    콜백함수
    1. 비동기 순서를 동기적으로
    2. 라이브러리(모듈)를 쉽게 활용하기 위해
    callback
    함수 -> 객체 
    매개변수를 함수로 받을 수 있음
*/

function callThreeTimes(callback){
    for(let i=0;i<3;i++){
        callback(i)
    }
}
function print(i){
    console.log(`${i}번째 함수 호출`)
}
callThreeTimes(print)

//익명함수 사용해서 콜백 함수 //호출하는 순간 익명함수 생성해서 사용 가능 // 많이 사용되는 방식
callThreeTimes(function(i){
    const fruits=["사과","바나나","망고"]
    console.log(fruits[i])
}) 

//화살표 함수, 람다와 유사, 소괄호 생략가능(i)=> -> i=> 로 변환 가능
callThreeTimes((i)=>{
    console.log("화살표 함수")
    const fruits=["딸기","수박","오렌지"]
    console.log(fruits[i])
}) 

//foreach 함수 - for문 대체 가능
let numbers=[273, 52, 103, 32, 57]
numbers.forEach(function(value, index, array){
    console.log("방법1")
    console.log("value: "+value)
    console.log("index: "+index)
    console.log("array: "+array)
})
numbers.forEach((value, index, array)=>{
    console.log("방법2")
    console.log("value: "+value)
    console.log("index: "+index)
    console.log("array: ")
    console.log(array)
})

//제곱해서 새로운 배열
numbers=numbers.map((value, index, array)=>{    //index와 array는 삭제 가능
    return value*value
})
console.log(numbers)
numbers.forEach(console.log)

//filter 리턴 값 중 true값만 모아서 새로운 배열 생성
numbers=[0,1,2,3,4,5,6,]
const evenNumbers=numbers.filter((value)=>{
    return value%2===0
})
console.log(evenNumbers)

numbers=[0,1,2,3,4,5,6,7,8,9]
//메소드 채닝 연결해서 사용가능
numbers.filter((value)=>
    value%2===0 //한줄 뿐이면 return 생략 가능
).map((value)=>
    value*value
).forEach(value=>{ //()안에 들어가는 것이 하나 뿐이면 소괄호 생략가능
    console.log(value)
})

/* 
    타이머 함수
    setTimeOut(함수, 시간) - 특정 시간 후에 한 번 호출
    clearTimeOut(타이머 id) - 멈춤
    setInterval(함수, 시간) - 특정 시간마다 함수 호출
    clearInterval(타이머 id) -멈춤
*/
//시간은 밀리초 단위 1초==1000밀리초
setTimeout(()=>{
    console.log("setTImeOut 실행됨")
},2400)
let count=0
let id=setInterval(()=>{
    console.log(`1.5초마다 실행(${count++}번째)`)
},1500)
console.log("id: "+id)

setTimeout(() => {
    console.log('interval 함수 멈춤')
    clearInterval(id)
}, 5000);

let pi=3.14
console.log(`파이 값은 ${pi}입니다.`)
