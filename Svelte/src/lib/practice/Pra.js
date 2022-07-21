
// export let bus=[]
export let busInfo=[]

    fetch("https://apis.data.go.kr/1613000/BusRouteInfoInqireService/getRouteNoList?serviceKey=x0KzQoj%2FBIV99brth41ohqqH0C5620X1PHjoinCE0HLzbf0J99nvL%2FZo3TCCzAbXXPr%2Bw8iS8bomh8QnO9kqpQ%3D%3D&pageNo=1&numOfRows=241&_type=json&cityCode=22")
        .then(res => res.json())
        .then(myJson => {
            const busInfo=myJson.response.body.items.item
            console.log(busInfo);
            // const routetp=document.createElement
            // routetp.textContent = data.name;
    })
    
// fetch("https://apis.data.go.kr/1613000/BusRouteInfoInqireService/getRouteNoList?serviceKey=x0KzQoj%2FBIV99brth41ohqqH0C5620X1PHjoinCE0HLzbf0J99nvL%2FZo3TCCzAbXXPr%2Bw8iS8bomh8QnO9kqpQ%3D%3D&pageNo=1&numOfRows=241&_type=json&cityCode=22")
//     .then(function(response) {
//         return response.json();
//     })
//     .then(function(bus) {
//         bus=bus["response"]["body"]["items"]["item"]
//         // console.log(JSON.stringify(bus));
//     })


// phone.textContent = data.phone;
//       const userInfo = document.getElementById("userInfo");
//       userInfo.appendChild(name);
//       userInfo.appendChild(email);
//       userInfo.appendChild(phone);