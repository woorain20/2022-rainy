// sotres.js - 안에 store를 만드는 것
import { derived, readable, writable } from "svelte/store"

//변수 -> 읽기 쓰기 writable -> 스토어
export const count=writable(0)

//initial - 초기값, null, undefind
//start - 첫 구독자 발생 했을 때 호출 함수
//start(set) - 관찰하고 있는 값이 변경될 때 실행되는 콜백 함수
//start(stop) - 모든 구독자가 구독을 중단했을 때 호출되는 함수
export const time=readable(
    new Date(), 
    function start(set){
        const interval=setInterval(()=>{
            set(new Date())
    },1000)
    return function stop(){
        clearInterval(interval)
    }
})

//Derived stores - 기존 스토어를 재사용
// const start=new Date()
// export const elapsed=derived(time, $time=>{
//     Math.round(($time-start)/1000)
// })

export const name=writable("world")

export const greeting=derived(
    name,
    $name=>`Hello ${$name}!`
)