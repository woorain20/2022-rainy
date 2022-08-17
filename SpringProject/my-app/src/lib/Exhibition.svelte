<script>
    import { Link } from "svelte-routing";
    import { onMount } from "svelte";

    let exhibition=[]
    let poster, title, place, fee, startday, endday, content, linkpage
    let always, done=false

    const savepoint="http://192.168.0.51:8080/exhibition/"
    
    onMount(async function(){
        const red= await fetch(savepoint)
        const open= await red.json()
        exhibition=open._embedded.exhibition
    })

    async function add(){
       const exhi = {
        done:  done , poster: poster, title: title, fee: fee, place: place, startday: startday, endday: endday, content: content, linkpage: linkpage, always: always
       }
       await fetch(savepoint,{
           method:"POST", headers:{    //headers를 설정해야 오류가 안남
               "Content-Type":"application/json"
           },
           body:JSON.stringify({
            done: exhi.done, poster: exhi.poster, title: exhi.title, fee: exhi.fee, place: exhi.place, startday: exhi.startday, endday: exhi.endday, content: exhi.content, linkpage: exhi.linkpage, always: exhi.always
           })
       })
       exhibition=[exhi,...exhibition]
       
       done=false
       always=false
       poster=""
       title=""
       fee=""
       place=""
       startday=""
       endday=""
       content=""
       linkpage=""
       console.log(exhi)
   }
</script>

<div>
    <h1>Exhibition</h1>
    <Link to="museum"><button>Museum</button></Link>
    <Link to="relic"><button>Relic</button></Link>
    <Link to="exhibition"><button>Exhibition</button></Link>
    <Link to="event"><button>Event</button></Link>
    <Link to="board"><button>Board</button></Link>
    <Link to="goods"><button>Goods</button></Link>
    <Link to="home"><button>Home</button></Link>
</div>
<div>
    포스터<input type="url" bind:value="{poster}">
    전시회<input type="text" bind:value="{title}"><br/>
    장소<input type="text" bind:value="{place}">
    요금<input type="text" bind:value="{fee}"><br/>
    시작<input type="text" bind:value="{startday}">
    종료<input type="text" bind:value="{endday}"><br/>
    내용<input type="text" bind:value="{content}">
    링크<input type="text" bind:value="{linkpage}"><br/>
    상설<input type="checkbox" bind:checked="{always}">
    종료<input type="checkbox" bind:checked="{done}"><br/>
    <input type="submit" on:click={()=>add()}>
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>