console.log(1)
let output=0;
for(let i=0; i<=10; i++){
    if(i%2===1){
        continue
    }
    output+=i
}
console.log(output)
//중첩 반복문2
let dot=''
for(let i=1; i<15; i++){
    for(let j=15; j>i; j--){
        dot+=' '
    }
    for(let k=0; k<2*i-1; k++){
        dot+='*'
    }
    dot+='\n'
}
console.log(dot)
//4-1
const array=["사과","배","귤","바나나"]
console.log("# for in 반복문")
for(const i in array){
    console.log(i)
}
console.log("# for of 반복문")
for(const i of array){
    console.log(i)
}
//4-2
const array1=[]
for(let i=0; i<3; i++){
    array1.push((i+1)*3)
}
console.log(array1)
//4-3
let ouput=1
for(let i=1; i<=100; i++){
    ouput*=i
}
console.log(ouput)
//4-4
let dott=''
const size=8
for(let i=1;i<size;i++){
    for(let j=size; j>i; j--){
        dott+=' '
    }
    for(let k=0; k<2*i-1; k++){
        dott+='*'
    }
    dott+='\n'
}
for(let i=size-2; i>0; i--){
    for(let j=i; j<size; j++){
        dott+=' '
    }
    for(let k=0; k<2*i-1;k++){
        dott+='*'
    }
    dott+='\n'
}
console.log(dott)
//a~b 합
function sumAll(a,b){
    let output=0
    for(let i=a; i<=b; i++){
        output+=i
    }
    return output
}
console.log(`1~100까지 합: ${sumAll(1,100)}`)
console.log(`1~500까지 합: ${sumAll(1,500)}`)
//a~b 빼기
function subAll(a,b){
    let output=0
    for(let i=a; i>=b; i--){
        output-=i
    }
    return output
}
console.log(`sub: ${subAll(200,1)}`)
//매개변수 배열
function sample(...items){
    console.log(items)
}
sample(1,2)
sample(1,2,3)
//매개변수 min함수
function min(...items){
    let output=items[0]
    for(const item of items){
        if(ouput>item){
            output=item
        }
    }
    return output
}
//max
function max(...items){
    let output=items[0]
    for(const item of items){
        if(output<item){
            output=item
        }
    }
    return output
}
console.log('min(12,546,185,123,45,18,3,48,4465')
console.log(`=${min(12,546,185,123,45,18,3,48,4465,1)}`)
console.log(`=${max(12,546,185,123,45,18,3,48,4465,1)}`)
//매개변수 자료형에 따라 다르게 작동하는 min함수
function min2(first,...rests){
    let output
    let items
    if(Array.isArray(first)){
        output=first[0]
        items=first
    }else if(typeof(first)==='number'){
        output=first
        items=rests
    }
    for(const item of items){
        if(output>item){
            output=item
        }
    }
    return output
}
//max
function max2(first,...rests){
    let output
    let items
    if(Array.isArray(first)){
        output=first[0]
        items=first
    }else if(typeof(first)==='number'){
        output=first
        items=rests
    }
    for(const item of items){
        if(output<item){
            output=item
        }
    }
    return output
}
console.log(`min(배열): ${min(15,464,151,157,32,17,2,879,453,2879,6)}`)
console.log(`min(숫자,...): ${min(15,464,151,157,32,17,2,879,453,2879,6)}`)
console.log(`max(배열): ${max(15,464,151,157,32,17,2,879,453,2879,6)}`)
console.log(`max(숫자,...): ${max(15,464,151,157,32,17,2,879,453,2879,6)}`)
//매개변수 활용
function earnings(name, wage=9160, hour=40,towage){
    console.log(`# ${name} 님의 주급정보`)
    console.log(`- 시급: ${wage}원`)
    console.log(`- 근무 시간: ${hour}시간`)
    if(hour<=40){
        towage=wage*hour
    }else if(hour>40 && hour<=52){
        towage=(wage*40)+((wage*1.5)*(hour-40))
    }else if(hour>52){
        towage=(wage*40)+((wage*1.5)*12)+((wage*2)*(hour-52))
    }
    console.log(`- 급여: ${towage}원`)
}
earnings("김EC",9160,92)
earnings("김MA",31610,40)
earnings("오라클")
