console.log("chapter4")
/*
    for in  반복문 - index값이 순차적으로 대입
*/
const todos=["우유 구매","업무메일 확인","필라테스 수업"]
todos.push("자바스크립트 공부") // 가능
let todos1=["할일1","할일2"]
//todos=todos1 - 안됨 const는 상수이므로
todos1=todos // 가능 let이기에
for(const i in todos){
    console.log(i)
    console.log(`${i}번째 할 일: ${todos[i]}`)
}
for(let num in todos){
    console.log(`${num}번째 할 일: ${todos[num]}`)
}
/* 
    for of 반복문 - 값을 순차적으로 대입
*/
for(const todo of todos){
    console.log(`오늘의 할 일: ${todo}`)
}
/* 구버전 : var, 현재버전: let, const */
for(let i=0;i<5;i++){
    console.log(`${i}번째 반복입니다.`)
}
//for문
let output=0
for(let i=0;i<=100;i++){
    output+=i
}
console.log(`1~100까지 숫자를 모두 더하면 ${output}입니다.`)

for(let i=0;i<todos.length;i++){
    console.log(`${i}번째 할일: ${todos[i]}`)
}
for(let i=todos.length-1;i>=0;i--){
    console.log(`${i}번째 할일: ${todos[i]}`)
}
//while 반복문
let i=0;
while(i<todos.length){
    console.log(`${i}번째 할일: ${todos[i]} with while`)
    i=i+1   // 1씩 증가시킬 때 표현식 i++, i+=1으로 할 수도 있음
}
/* 
    break - 중괄호 완전히 종료
    continue - 그 줄에서 실행 멈추고 조건 검사
    return - 함수를 종료
*/
// for(let i=0;true;i++){
//     console.log(i+"번째 반복문입니다.")
//     if(i&10==0){
//         const isContinue=confirm("계속 할까요?")
//         if(!isContinue){
//             break;
//         }
//     }
// }
// 터미널 ctrl+c 작업종료

for(let i=0;i<5;i++){
    console.log("continue: "+i)
    continue
    alert("continue: "+i)//실행 안됨
}
let out=''
for(let i=0;i<10;i++){
    for(let j=0;j<i;j++){
        out+='*'
    }
    out+='\n'
}
console.log(out)