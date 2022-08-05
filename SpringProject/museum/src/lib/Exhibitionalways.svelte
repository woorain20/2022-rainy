<script>
    import { onMount } from "svelte";
    

    let exhib=[]
    let inknum
    

    const slidingbnn="http://192.168.0.51:8080/exhibition/"
    
    onMount(async function(){
        const red= await fetch(slidingbnn)
        const open= await red.json()
        exhib=open._embedded.exhibition
    })
    
    </script>
    
    <h1>Exhibitions</h1>
    
    <div class="grid">
        {#each exhib.filter(t=>t.done) as exhibition}
            <label class="square" >
                    <button id="d" on:click={()=>{inknum=exhibition.id}}>
                    <img src="./src/lib/exhibitionposter/{exhibition.poster}.jpg" alt = "사진오류" />
                    <br /><br />
                    <h4>{exhibition.title}</h4>
                    <p>{exhibition.startday}~{exhibition.endday}</p>
                </button>
            </label>
        {/each}
    </div>
    
    
    <style>
        .grid{
        display: grid;
        flex: 1;
        grid-template-columns: repeat(3, 4fr);
        grid-template-rows: repeat(3, 1fr);
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
    
    </style>