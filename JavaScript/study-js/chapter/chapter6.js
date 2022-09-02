console.log("chapter6")

//객체 - 배열, 함수, 기본타입
//자바 - 인스턴스와 유사
//key: value
const product={
    proName: '7D 건조 망고',
    type: '당절임',
    ingredient: ['망고', '설탕', '메타중아황산나트륨', '치자황색소'],
    originCon: '필리핀',
    "price":3900,
    "1#$~&#@":430
}
console.log(product)
//값의 반환 2가지 - 첫 번째 : 객체["key"]
console.log(product["proName"])
console.log(product["type"])
console.log(product["ingredient"])
console.log(product["originCon"])
console.log(product["price"])
console.log(product["1#$~&#@"])
//값의 반환 2가지 - 두 번째 : 객체.key
console.log(product.proName)
console.log(product.type)
console.log(product.ingredient)
console.log(product.originCon)
console.log(product.price)  
//특수문자나 숫자는 두 번째 방법 불가

//메타중아황산나트륨만 찍히게 하는 법
console.log(product["ingredient"][2])
console.log(product.ingredient[2])
document.getElementById("div1").innerText=product["ingredient"][2]

console.log("===============")
//for of문으로 배열 내용 뽑기
for(const ingre of product["ingredient"]){
    console.log(ingre)
}
//for문으로 배열 내용 뽑기
console.log("===============")
for(let i=0;i<product.ingredient.length;i++){
    console.log(product.ingredient[i])
}

const pet={
    name:"구름",
    eat:function(food){
        console.log(this.name+"이가 "+food+"을(를) 먹습니다.")
    },
    getName(){
        return this.name
    },
}
pet.eat("망고")
pet.eat(product["proName"])
pet.eat(product["ingredient"][1])

const student={
    name:"윤인성",
    hobby:"악기",
    a:function(){
        console.log("a")
        console.log(this)
    },
    b:()=>{
        console.log("b")
        console.log(this)   //this가 이상한 함수 찍음
    }
}
console.log(student)
student.toBe="SG wannabe"   //추가
console.log(student)
delete student.hobby    //삭제
console.log(student)

console.log(pet.getName())
student.a()
student.b()

//객체 - 속성 메소드
const a=[]
a.sample=10
console.log(a.sample)

function b(){}
b.sample=12
console.log(b.sample)

console.log(typeof(a))
if(Array.isArray(a)){
    console.log("배열 맞습니다.")
}
console.log(typeof(b))

function c(callback){
    if(typeof(callback)=="function"){
        console.log("함수 맞습니다.")
    }else{
        console.log("첫 번째 매개변수는 함수만")
    }
}
c(b)

//식별자 참조 가능한 것들을 일급 객체
//기본 자료형, 배열, 객체, 함수

const num1=new Number(10)
const str1=new String("문자열")
const b1=new Boolean(true)

const c1=273
// c1.sample=10
// console.log(c1.sample)

const f=new Number(273)
f.sample=10
console.log(f.sample)

//메소드를 추가하면 메소드체이닝 방식으로 사용
//제곱 해주는 메소드
console.log(2**4)
console.log(2**16)
Number.prototype.power=function(n=2){
    return this.valueOf()**n
}
const num2=12
console.log('num2.power():',num2.power())
console.log('num2.power(3):',num2.power(3))
console.log('num2.power(4):',num2.power(4))
const num3=new Number(3)
console.log(num3)

//소수점 숫자 n번째 자릿수까지 출력: toFixed()
const d1=123.456789
console.log(d1.toFixed(3))
console.log(d1.toFixed(5))
console.log(d1.toFixed(1))

let num4=4
num4=num4*"1일"
console.log(num4)
console.log(num4===NaN)
if(Number.isNaN(num4)){
    console.log("Not a Number")
}else{
    console.log("Number")
}

//number 객체
const num5=10/0
console.log(num5)
const num6=-10/0
console.log(num6)
console.log(Number.isFinite(num5))  //false
const num7=7
console.log(Number.isFinite(num7))  //true
console.log(num5===Infinity)

//string 객체 내장 메소드
//문자열 양쪽 끝의 공백 없애기: trim()
const stringA="                 "   
//stringA=stringA.trim()
if(stringA.trim()===""){
    console.log("아이디 입력 요망")
}else{
    console.log("아이디 서버 전송됨")
}

let stringB="       앞뒤   공백          "
console.log(stringB)
console.log(stringB.trim())

//csv data1,data2,data3
const stringC="2022-07-11"
const arrA=stringC.split("-")
console.log(arrA)
console.log(arrA[0])
console.log(arrA[1])
console.log(arrA[2])

//json.stringify()
/*
    json
    1. 값 - 문자열, 숫자, 불 자료형 (함수(x)) - 함수 못들어감
    2. 문자열 무조건 ""
    3. 키 반드시 ""
    4. [] - 배열[index], {key:value} - 객체["key"]
*/
const books=[
    {
        "name":"혼자 공부하는 파이썬",
        "price":18000,
        "publisher":"한빛미디어"
    },
    {
        "name":"HTML5 웹 프로그래밍 입문",
        "price":26000,
        "publisher":"한빛미디어"
    }
]
console.log(books[1]["price"])

const books1={
    "arr":[
        {
            "key":"value",
            "arr1":[
                {
                    "key1":"v1",
                    "ke2":"v2"
                },
                10,20
            ]
        }
    ]
}
console.log(books1["arr"][0]["arr1"][0]["key1"])
console.log(books1["arr"][0]["arr1"][2])

//문자열 -> Json 객체
//Json 문자열로 변환 - Json.stringify()
const json=JSON.stringify(books)
console.log(json)
console.log(json[1])
console.log(json[10])
//자바스크립트 객체로 - Json.parse()
console.log(JSON.parse(json))