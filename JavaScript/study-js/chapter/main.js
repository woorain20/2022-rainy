import './style.css'

console.log("Hello World by main.JS")
// alert("Hello") 한줄 주석
/*
  여러줄 주석
*/ 
for(let i=0;i<3;i++){
  console.log(i)
}

let sum=10+20; console.log(sum);  // ;없어도 됨 줄 바꾸면 한 문장으로 분류
let sum2=10+30
console.log(sum2)
let sum3=
  10+50;
console.log(sum3)
// _ $ -> 사용해서 이름짓기 안 한다 (사용가능하나 주로 라이브러리에서 사용됨)
// 식별자
// will out ->willOut

//변수의 선언 앞에 let
let pi=3.14
let pi1=3
let pi2="문자열"

//상수
const p3="상수"

//문자열 자료형
let str="안녕하세요"
let str2='안녕하세요2'
let str3="'안녕'하세요"
console.log(str3)
let str4="<img src='./favicon.svg'>"
console.log(str4)
let str5="Hello"
str5+=" World"
console.log(str5)
let str6="Hello"+"JavaScript"+1
console.log(str6)
console.log("안녕하세요"[0])
console.log("안녕하세요"[1])
console.log("안녕하세요"[2])
let str7="안녕하세요"
console.log(str7[3])
console.log("안녕하세요".length)
/*
  == -> 값만 비교
  != -> 값만 다름
  === -> 값과 데이터 타입까지 비교
  !== -> 값과 데이터 타입 둘 다 달라야 함
*/
let c1=10
let c2="10"
console.log(c1==c2)
console.log(c1===c2)
console.log(10==10)
console.log(!true)
let b1=true
let b2=false
console.log(b1?"b1 is true":"b1 is false")
console.log(b1 && b2?"true":"false")
console.log(b1 || b2?"true":"false")

let any
any=1
any="문자"
console.log("typeof any: "+typeof(any))
any=2
console.log("typeof any: "+typeof(any))
any=true
console.log("typeof any: "+typeof(any))

const final1=10
//final1=20
let v="변수"

let number=10
console.log(number++)//10
console.log(number--)//11
console.log(++number)//11
console.log(--number)//10
console.log(number)//10

let num4=10
num4=num4+1
num4+=1
/* += -= *= /= %= 가능 */

/* undefined 자료형 */
let a
console.log(typeof(a))
if(a===undefined){
  a=1
}
console.log("a: "+a)
let b=null
console.log(typeof(b))