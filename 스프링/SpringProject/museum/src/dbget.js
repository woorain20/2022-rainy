import { onMount } from "svelte"

let posters=[]
let exhib=[]
let boards=[]
let events=[]

const upsidebanner="http://192.168.0.51:8080/mainpage/"
const slidingbnn="http://192.168.0.51:8080/exhibition/"
const boardbnn="http://192.168.0.51:8080/postboard/"
const eventdb="http://192.168.0.51:8080/event/"

onMount(async function(){
    const res=await fetch(upsidebanner)
    const data = await res.json()
    posters=data._embedded.mainpage

    const red= await fetch(slidingbnn)
    const open= await red.json()
    exhib=open._embedded.exhibition
    
    const rew= await fetch(boardbnn)
    const por= await rew.json()
    boards=por._embedded.postboard
    
    const rsq= await fetch(eventdb)
    const vev= await rsq.json()
    events=vev._embedded.event
})
