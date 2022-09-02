console.log(220701)

let player={
    1:{
        name:"베르트 레노",
        team:"아스날",
        nation:"독일",
        birthYear:1992,
        position:"GK",
        ex_team:"바이에른 레버쿠젠"
    },
    3:{
        name:"키어런 티어니",
        team:"아스날",
        nation:"스코틀랜드",
        birthYear:1997,
        position:"DF",
        ex_team:"셀틱"
    },
    4:{
        name:"벤 화이트",
        team:"아스날",
        nation:"잉글랜드",
        birthYear:1997,
        position:"DF",
        ex_team:"브라이튼"
    },
    5:{
        name:"토마스 파티",
        team:"아스날",
        nation:"가나",
        birthYear:1993,
        position:"MF",
        ex_team:"AT마드리드"
    },
    6:{
        name:"가브리엘 마갈량이스",
        team:"아스날",
        nation:"브라질",
        birthYear:1997,
        position:"DF",
        ex_team:"릴"
    },
    7:{
        name:"부카요 사카",
        team:"아스날",
        nation:"잉글랜드",
        birthYear:2001,
        position:"MF",
        ex_team:"아스날"
    },
    8:{
        name:"마틴 외데고르",
        team:"아스날",
        nation:"노르웨이",
        birthYear:1998,
        position:"MF",
        ex_team:"레알 마드리드"
    },
    9:{
        name:"가브리엘 제수스",
        team:"아스날",
        nation:"브라질",
        birthYear:1997,
        position:"FW",
        ex_team:"맨체스터 시티"
    },
    10:{
        name:"에밀 스미스로우",
        team:"아스날",
        nation:"잉글랜드",
        birthYear:2000,
        position:"MF",
        ex_team:"아스날"
    },
    11:{
        name:"가브리엘 마르티넬리",
        team:"아스날",
        nation:"브라질",
        birthYear:2001,
        position:"FW",
        ex_team:"이투아누"
    },
    14:{
        name:"에디 은케티아",
        team:"아스날",
        nation:"가나",
        birthYear:1999,
        position:"FW",
        ex_team:"아스날"
    },
    16:{
        name:"롭 홀딩",
        team:"아스날",
        nation:"잉글랜드",
        birthYear:1995,
        position:"DF",
        ex_team:"볼튼"
    },
    17:{
        name:"세드릭 소아레스",
        team:"아스날",
        nation:"포르투갈",
        birthYear:1991,
        position:"DF",
        ex_team:"사우스햄튼"
    },
    18:{
        name:"토미야스 다케히로",
        team:"아스날",
        nation:"일본",
        birthYear:1998,
        position:"DF",
        ex_team:"볼로냐"
    },
    19:{
        name:"니콜라스 페페",
        team:"아스날",
        nation:"코트디부아르",
        birthYear:1995,
        position:"MF",
        ex_team:"릴"
    },
    20:{
        name:"누노 타바레스",
        team:"아스날",
        nation:"포르투갈",
        birthYear:2000,
        position:"DF",
        ex_team:"벤피카"
    },
    21:{
        name:"파비우 비에이라",
        team:"아스날",
        nation:"포르투갈",
        birthYear:2000,
        position:"MF",
        ex_team:"포르투"
    },
    23:{
        name:"삼비 로콩가",
        team:"아스날",
        nation:"벨기에",
        birthYear:1999,
        position:"MF",
        ex_team:"안더레흐트"
    },
    25:{
        name:"모하메드 엘네니",
        team:"아스날",
        nation:"이집트",
        birthYear:1992,
        position:"MF",
        ex_team:"FC바젤"
    },
    30:{
        name:"맷 터너",
        team:"아스날",
        nation:"미국",
        birthYear:1994,
        position:"GK",
        ex_team:"뉴잉글랜드 레볼루션"
    },
    32:{
        name:"아론 램스데일",
        team:"아스날",
        nation:"잉글랜드",
        birthYear:1998,
        position:"GK",
        ex_team:"셰필드 유나이티드"
    },
    34:{
        name:"그라니트 자카",
        team:"아스날",
        nation:"스위스",
        birthYear:1992,
        position:"MF",
        ex_team:"묀헨글라트바흐"
    },
    unknown:{
        name:["헥토르 베예린","윌리엄 살리바","메이틀란드 나일스","리스 넬슨"],
        team:["아스날","아스날","아스날","아스날"],
        nation:["스페인","프랑스","잉글랜드","잉글랜드"],
        birthYear:[1995, 2001, 1997, 1999],
        position:["DF", "DF", "DF","FW"],
        ex_team:["아스날","마르세유","아스날","아스날"]
    }
}
console.log(player[10].name)
console.log(player[21]["birthYear"])
console.log(player[8])
console.log(player.unknown.name[1])
document.getElementById("name").innerText=player[4]["name"]
document.getElementById("nation").innerText=player[4]["nation"]
document.getElementById("birthYear").innerText=player[4]["birthYear"]
document.getElementById("position").innerText=player[4]["position"]
document.getElementById("name1").innerText=player[8]["name"]
document.getElementById("nation1").innerText=player[8]["nation"]
document.getElementById("birthYear1").innerText=player[8]["birthYear"]
document.getElementById("position1").innerText=player[8]["position"]

const but=document.getElementById("but")
let nam=document.getElementById("nam")
let te=document.getElementById("te")
let nat=document.getElementById("nat")
let by=document.getElementById("by")
let pos=document.getElementById("pos")
let et=document.getElementById("et")

let count=0
let buc=(event)=>{
    count++
    nam.innerHTML=player[count].name
    te.innerHTML=player[count].team
    nat.innerHTML=player[count].nation
    by.innerHTML=player[count].birthYear
    pos.innerHTML=player[count].position
    et.innerHTML=player[count].ex_team
}
but.addEventListener("click",(buc))

// let names = player.map(player =>player[i]["name"]);
// console.log(names); 

// let newJson = player.map(function(name, index){
//     console.log(name);
//     let returnObj = {}
//     returnObj[player.name] = player.name;
//     return returnObj;
// });
