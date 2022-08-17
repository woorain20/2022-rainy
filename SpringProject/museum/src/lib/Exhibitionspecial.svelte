<script>
    import { onMount } from "svelte";
    import Exhibitiondetail from "./exhibitiondetail.svelte";
    import { callid } from "./store";


    let exhib=[]
    let inknum
    
    const slidingbnn="http://192.168.0.51:8080/exhibition/"
    
    onMount(async function(){
        const red= await fetch(slidingbnn)
        const open= await red.json()
        exhib=open._embedded.exhibition
    })
    function addno(ibs){
        inknum=ibs
        console.log(inknum)
    }
        
    $:callid.update(t=>inknum)

    let page=true
    let detail=false

    function toggle(){
    page=!page
    detail=!detail
    }
    let currId = 0;
    const imgLen = exhib.length;
  let positionLeft = 0;

  const moveSlider = () => {
    positionLeft = currId * 100;
  };

  const next = () => {
    currId = currId === exhib.length - 1 ? 0 : currId + 1;
    moveSlider();
  };
	
  const prev = () => {
    currId = currId === 0 ? exhib.length - 1 : currId - 1;
    moveSlider();
  };

  const getIndex = (index) => {
    currId = index;
    moveSlider();
  };

	let interval = setInterval(next, 2000);
	const autoPlay = () => {
		interval = setInterval(next, 2000)
	}

	const stopPlay = () => {
		clearInterval(interval)
	}
  function focus(){

  }
    

    </script>
    
    <h1>Specail Exhibitions</h1>
    {#if page}
    <div on:mouseover={stopPlay} on:mouseleave={autoPlay} on:focus={focus}  class="container">
        <div class="grid slider" style="left: -{positionLeft}%;">
            {#each exhib.filter(t=>t.done) as exhibition}
                {#if !exhibition.always}
                    <label class="square" on:click={toggle}>
                        <button id="d" on:click={()=>{addno(exhibition.id)}}>
                            <img src="./src/lib/exhibitionposter/{exhibition.poster}.jpg" alt = "사진오류" />
                            <br /><br />
                            <h4>{exhibition.title}</h4>
                            <p>{exhibition.startday}~{exhibition.endday}</p>
                        </button>
                    </label>
                {/if}
            {/each}
        </div>
        <div class="arrow">
            <button on:click={prev} class="prev">Prev</button>
            <button on:click={next} class="next">Next</button>
          </div>
          <div class="papagination">
            {#each exhib as _, i}
                {#if !_.always}
              <button
                class={currId === i ? 'active' : ''}
                on:click={() => getIndex(i)}
              ></button>
              {/if}
            {/each}
          </div>
    </div>
 
    {/if}
    {#if detail}
    <bottun id="qwe" on:click={toggle}>다른 이벤트 보기</bottun>
    <Exhibitiondetail/>
    {/if}
    <style>
        .grid{
        display: grid;
        flex: 1;
        grid-template-columns: repeat(3, 4fr);
        grid-template-rows: repeat(1, 1fr);
        grid-gap: 1vmin;
        width:90%;
        margin: 0px auto;
        }
    div>label>button {
        width: 100%;
        height: 100%;
        color:black;
        border: none;
        margin: 0;
        }
    img{
        width:100%;
        height:60%;
    }
    #qwe{
    float: right;
    border: 1px solid black;
    background-color: bisque;
    margin-right:30%;
}
.container {
    position: relative;
    width: 100%;
    max-width: 640px;
    margin: 0 auto;
    overflow: hidden;
  }
  .slider {
    display: flex;
    position: relative;
    transition: left 0.5s;
  }
  .slider img {
    width: 100%;
    height: auto;
    object-fit: cover;
    flex-shrink: 0;
  }
  .arrow {
    display: flex;
    justify-content: space-between;
    align-items: center;
    position: absolute;
    width: 100%;
    height: 100%;
    top: 0;
  }
  .arrow button {
    margin-bottom: 0;
    padding: 12px;
    border: 0;
    background-color: rgba(255, 255, 255, 0.7);
    cursor: pointer;
  }

  .papagination {
    position: absolute;
    bottom: 0;
    padding-bottom: 8px;
    width: 100%;
  }

  .papagination button {
    margin: 0 4px;
    width: 14px;
    height: 14px;
    border: 0;
    border-radius: 50%;
    background-color: rgba(255, 255, 255, 0.8);
    text-align: center;
    cursor: pointer;
  }
  .papagination .active {
    background-color: rgba(255, 0, 0, 0.8);
  }

    
    </style>