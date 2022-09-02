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