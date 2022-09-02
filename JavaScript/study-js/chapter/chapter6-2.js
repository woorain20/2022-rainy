console.log("chapter6-2")

const num=Math.random()
const num1=Math.random()
console.log("0~1 사이의 랜덤한 숫자: ", num)
console.log("0~10 사이의 랜덤한 숫자: ", num*10)
console.log("0~50 사이의 랜덤한 숫자: ", num*50)

//소수점 없애고 싶을 때
console.log("0~10 사이의 랜덤한 숫자: ", Math.floor(num1*10))
console.log("0~50 사이의 랜덤한 숫자: ", Math.floor(num1*50))

//-범위까지 확장
console.log("-5~5 사이의 랜덤한 숫자: ", num*10-5)
console.log("-25~25 사이의 랜덤한 숫자: ", num*50-25)
console.log("-5~5 사이의 랜덤한 숫자: ", Math.floor(num1*10-5))
console.log("-25~25 사이의 랜덤한 숫자: ", Math.floor(num1*50-25))
//Math.ceil() - 소수점 올림
//Math.round() - 소수점 반올림
//Math.floor() - 소수점 내림, 버림
//정수 반환

//객체 기반의 다중 할당
const object={
    name:"혼자 공부하는 파이썬",
    price:18000,
    publisher:"한빛 미디어"
}
const {name, price}=object
console.log(name, price)

//전개 연산자 - 깊은 복사(새로운 배열을 따로 만들고 싶을 때)
//얕은 복사 - 같은 메모리 공간을 가르키고 있음 - 대체로 얕은 복사를 쓰지만 깊은 복사를 쓸 때도 있음
const product1=["Milk", "Bread"]
const product2=product1
product2.push("Sweet Potato")
product2.push("Tomato")
console.log(product1)

//깊은 복사 - ...배열
const product3=["Milk", "Bread"]
const product4=[...product3]
product4.push("Sweet Potato")
product4.push("Tomato")
console.log(product3)
console.log(product4)

const product5=["Milk", "Bread"]
const product6=["Sweet Potato", ...product5,"Tomato"]
console.log(product6)
