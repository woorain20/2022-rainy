<script>
    import { Link } from "svelte-routing";
    import { onMount } from "svelte";

    let event=[]
    let banner, eventname, fee, place, startday, endday, time, empty, content, step
    let done=false
    const savepoint="http://192.168.0.51:8080/event/"

    onMount(async function(){
        const rsq= await fetch(savepoint)
        const vev= await rsq.json()
        event=vev._embedded.event
    })

    async function add(){
       const events = {
        done:  done , banner: banner, eventname: eventname, fee: fee, place: place, startday: startday, endday: endday, time: time, empty: empty, content: content, step: step
       }
       await fetch(savepoint,{
           method:"POST", headers:{    //headers를 설정해야 오류가 안남
               "Content-Type":"application/json"
           },
           body:JSON.stringify({
            done: events.done , banner: events.banner, eventname: events.eventname, fee: events.fee, place: events.place, startday: events.startday, endday: events.endday, time: events.time, empty: events.empty, content: events.content, step: events.step
           })
       })
       event=[events,...event]
       
       done=false
       banner=""
       eventname=""
       fee=""
       place=""
       startday=""
       endday=""
       time=""
       empty=""
       content=""
       step=""
       console.log(events)
   }
</script>

<div>
    <h1>Event</h1>
    <Link to="museum"><button>Museum</button></Link>
    <Link to="relic"><button>Relic</button></Link>
    <Link to="exhibition"><button>Exhibition</button></Link>
    <Link to="event"><button>Event</button></Link>
    <Link to="board"><button>Board</button></Link>
    <Link to="goods"><button>Goods</button></Link>
    <Link to="home"><button>Home</button></Link>
</div>
<div>
    배너<input type="url" bind:value="{banner}">
    이벤트명<input type="text" bind:value="{eventname}"><br/>
    요금<input type="text" bind:value="{fee}">
    장소<input type="text" bind:value="{place}"><br/>
    시작<input type="text" bind:value="{startday}">
    마침<input type="text" bind:value="{endday}"><br/>
    시간<input type="text" bind:value="{time}">
    정원<input type="text" bind:value="{empty}"><br/>
    내용<input type="text" bind:value="{content}">
    담당자<input type="text" bind:value="{step}"><br/>
    종료<input type="checkbox" bind:checked="{done}"><br/>
    <input type="submit" on:click={()=>add()}>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>