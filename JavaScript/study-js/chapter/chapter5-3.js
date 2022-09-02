
function mainjs(){
    {let pi=3.14
    console.log(`파이 값은 ${pi}입니다.`)}
    function f1(){
        let pi=3.14
        console.log(`파이 값은 ${pi}입니다.`)
    }
    /* 엄격 모드 */
    'use strict'
    
    //비동기 언어 - 시간이나 순서대로 발생하는 것이 아닌 동시다발적 로딩(멀티 쓰레드가 됨)
    function func1(){
        setTimeout(() => {
            for(let i=0; i<3;i++){
                console.log("func1: "+i)
            }
        }, 500);
    }
    function func2(){
        for(let i=0; i<3;i++){
            console.log("func2: "+i)
        }
    }
    //비동기식
    // func1()
    // func2()
    //func1이 끝나고 func2가 시작하는 것이 아닌 동시다발적으로 시행되면서 func2가 먼저 찍히게 됨

    //동기식
    function func3(callback){
        setTimeout(() => {
            for(let i=0; i<3;i++){
                console.log("func3: "+i)
            }
            callback()
        }, 500);
    }
    function func4(){
        for(let i=0; i<3;i++){
            console.log("func4: "+i)
        }
    }
    //func3(func4)

    //여러개를 동기화 시킬 때 promise 사용(callback 대신)
    function timer(time){
        return new Promise((resolve)=>{
            setTimeout(()=>{
                resolve(time)
            },time)
        })
    }
    // console.log("start")
    // timer(1000).then((time)=>{
    //     console.log(`${time/1000}초 후 실행`)
    //     return timer(time+1000)
    // }).then((time)=>{
    //     console.log(`${time/1000}초 후 실행`)
    //     return timer(time+1000)
    // }).then((time)=>{
    //     console.log(`${time/1000}초 후 실행`)
    //     return timer(time+1000)       
    // }).then((time)=>{
    //     console.log(`${time/1000}초 후 실행`)
    //     console.log("end")
    // })

    //async await 많이 사용 aysnc로 await를 감싸야 함
    async function asyncFunc(){
        console.log("start")
        let time=await timer(1000)
        console.log(`${time/1000}초 후 실행`)
        time=await timer(time+1000)
        console.log(`${time/1000}초 후 실행`)
        time=await timer(time+1000)
        console.log(`${time/1000}초 후 실행`)
        console.log("end")
    }
    //asyncFunc()

    //json 맛보기
    fetch("https://jsonplaceholder.typicode.com/posts").then((response)=>{
        return response.json()
    }).then((data)=>{
        console.log(data)
    })
}
mainjs()
//이런 형식으로 사용