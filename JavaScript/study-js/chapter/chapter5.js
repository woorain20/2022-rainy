console.log("chapter5")

//익명 함수
const 함수=function(){
    console.log('함수 내부의 코드입니다...1')
    console.log('함수 내부의 코드입니다...2')
    console.log('함수 내부의 코드입니다...3')
    console.log('함수 내부의 코드입니다...4')
}
함수()
//선언적 함수
function funcName(){
    console.log("선언적 함수1")
    console.log("선언적 함수2")
    console.log("선언적 함수3")
}
//함수 호출(func call)
funcName()
//익명함수는 상수나 변수의 이름으로 호출
const func1=function(){
    console.log("익명함수1")
    console.log("익명함수2")
    console.log("익명함수3")
}
func1()
console.log(typeof 함수)
console.log(함수);

//즉시 호출 함수 IIFE(이피) - 선언과 동시에 호출 - 이전 코드에 끝났음을 알리는 세미콜론(;)을 찍어줘야 함
(function func2(){
    console.log("func2 called")
})()

console.log(typeof(func1))
function f(x){
    return x*x
}
console.log(f(2)) //4
console.log(f(3)) //9
console.log(f(4)) //16
console.log(f("문자")) //NaN Not a Number

/*
    윤년 - 2월이 29일까지 있는 해
    4년 마다 한번씩 옴 - y%4===0 윤년
    100년마다 윤년이 아님 - y%100===0 윤년아님
    400년마다 윤년 - y%400===0 윤년
*/
function isLeapYear(year){
    return(year%4===0)&&(year%100!==0)||(year%400===0)
}

if(isLeapYear(2022)){
    console.log("2월 29일까지")
}else{
    console.log("2월 28일까지")
}
console.log(`2024년은 윤년인가? ===${isLeapYear(2024)}`)
console.log(`2023년은 윤년인가? ===${isLeapYear(2023)}`)
console.log(`2020년은 윤년인가? ===${isLeapYear(2020)}`)
console.log(`2010년은 윤년인가? ===${isLeapYear(2010)}`)
console.log(`2000년은 윤년인가? ===${isLeapYear(2000)}`)
console.log(`1990년은 윤년인가? ===${isLeapYear(1990)}`)

/*
    자바에서
    같은 이름의 함수 정의 가능
    단, 매개변수의 개수, 매개변수의 타입이 다를 때 - 메소드 오버로딩
*/
/*
    ...variableName -> 나머지 매개변수
*/
function f1(...items){
    console.log(items)
    for(const item of items){
        console.log(item)
    }
}
f1(1)
f1(1,2)
f1(1,2,3)
f1(1,2,3,4)

//최솟값 구하기
function min(...numbers){
    let num=numbers[0]
    for(const number of numbers){
        if(num>number){
            num=number
        }
    }
    return num
}
console.log("최솟값: "+min(12,45,158,15677,21,8,156,17,1659))
/*
    전개 연산자
    배열을 전개한다
*/
const array=[1,2,3,4]
console.log(`${array[0]}, ${array[1]}`)
console.log(...array)
console.log(min(...array))
console.log(min(1,2,3,4))

//시급 계산기
function earnings(name,wage=9160,hours=40){ 
    //wage에서 wage=9160을 하면 기본값이 9160이 됨
    console.log(`# ${name}님의 급여정보`)
    console.log(`- 시급 ${wage}원`)
    console.log(`- 근무시간 ${hours}시간`)
    console.log(`- 급여 ${wage*hours}원`)
}
earnings("김ECMA",10850,42)
earnings("김스크립트")  //하나만 입력해도 출력됨 이 때 기본값을 정해줄 수 있음
earnings("김자바",12000)
earnings("김파이썬",15000,18)