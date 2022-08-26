using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Web.Script.Serialization;

namespace ApiPra
{
    public class KakaoApi
    {
        public static List<Locale> search(string text)
        {
            List<Locale> list=new List<Locale>();
            string site = "https://dapi.kakao.com/v2/local/search/keyword.json";
            string query = $"{site}?query={text}";  //api 호출 쿼리(키워드 포함)

            string restApiKey = "90d1d5f76977acb4c02d29a6eb03d063";
            string Header = $"KakaoAK {restApiKey}";

            //Authorization

            WebRequest request = WebRequest.Create(query);
            request.Headers.Add("Authorization", Header);

            // 응답받기
            WebResponse response = request.GetResponse();    //요청보냄
            Stream stream = response.GetResponseStream();   //응답받은 자료를 저장
            StreamReader reader = new StreamReader(stream, Encoding.UTF8);
                                                            
            string json=reader.ReadToEnd();     //응답은 json 형태로 응답이 옴

            JavaScriptSerializer js=new JavaScriptSerializer();

            //c#의 var = 한 번 자료형이 정해지면 안 바뀜
            //dynamic= 한 번 자료형이 정해져도 계속 바뀜
            //자바스크립트의 var랑 let이 이거랑 동일

            dynamic dob = js.Deserialize<dynamic>(json);
            dynamic docs = dob["documents"];
            object[] buf = docs;

            int length = buf.Length;
            for(int i=0; i<length; i++)
            {
                string lname = docs[i]["place_name"];
                double x =double.Parse(docs[i]["x"]);
                double y =double.Parse(docs[i]["y"]);
                list.Add(new Locale(lname, y, x));
            }

            return list;
        }

    }
}
