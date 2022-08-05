
// export var xhr = new XMLHttpRequest();
// export var url = 'http://www.emuseum.go.kr/openapi/relic/list'; /*URL*/
// export var queryParams = '?' + encodeURIComponent('serviceKey') + '='+'x0KzQoj/BIV99brth41ohqqH0C5620X1PHjoinCE0HLzbf0J99nvL/Zo3TCCzAbXXPr+w8iS8bomh8QnO9kqpQ=='; /*Service Key*/
// queryParams += '&' + encodeURIComponent('pageNo') + '=' + encodeURIComponent('1'); /**/
// queryParams += '&' + encodeURIComponent('numOfRows') + '=' + encodeURIComponent('200'); /**/
// queryParams += '&' + encodeURIComponent('id') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('museumCode') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('name') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('nameKr') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('nameEn') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('nameCn') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('author') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('nationalityCode') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('materialCode') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('purposeCode') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('sizeRangeCode') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('placeLandCode') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('designationCode') + '=' + encodeURIComponent(''); /**/
// queryParams += '&' + encodeURIComponent('indexWord') + '=' + encodeURIComponent(''); /**/
// xhr.open('GET', url + queryParams);
// xhr.onreadystatechange = function () {
//     if (this.readyState == 4) {
//         alert('Status: '+this.status+'nHeaders: '+JSON.stringify(this.getAllResponseHeaders())+'nBody: '+this.responseText);
//     }
// };

// xhr.send('');

    // 함수선언
    export const getXMLfromAPI = async () => {
        const url = 'http://www.emuseum.go.kr/openapi/relic/list';
        const authKey = 'x0KzQoj%2FBIV99brth41ohqqH0C5620X1PHjoinCE0HLzbf0J99nvL%2FZo3TCCzAbXXPr%2Bw8iS8bomh8QnO9kqpQ%3D%3D';
        const reqURL = url + '?serviceKey=' + authKey + 'x0KzQoj%2FBIV99brth41ohqqH0C5620X1PHjoinCE0HLzbf0J99nvL%2FZo3TCCzAbXXPr%2Bw8iS8bomh8QnO9kqpQ%3D%3D';

        // async와 await을 통해 바로 XML을 JSON으로 변환
        const response = await fetch(reqURL);
        const xmlString = await response.text();
        var XmlNode = new DOMParser().parseFromString(xmlString, 'text/xml');
        console.log(xmlToJson(XmlNode));
    };

    //함수호출
    getXMLfromAPI();