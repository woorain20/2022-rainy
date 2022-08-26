using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy14
{
    internal class Program
    {

        static void Main(string[] args)
        {

            List<Product> input = new List<Product>()
            {
                new Product(){ Name="고구마", Price=1500},
                new Product(){ Name="사과", Price=2400},
                new Product(){ Name="배", Price=3000},
                new Product(){ Name="감자", Price=1000},
                new Product(){ Name="토마토", Price=2000},
                new Product(){ Name="옥수수", Price=1500},

            };

            input.Add(new Product() { Name = "바나나", Price = 1000 });
            input.Add(new Product() { Name = "자두", Price = 500 });

            //가격이 1500원 이상인 제품들을 제품명으로 오름차순 한 것
            Console.WriteLine("1번");
            var output = from item in input
                         where item.Price > 1500
                         orderby item.Name ascending
                         select item;

            foreach (var item in output)
            {
                Console.WriteLine(item);
            }

            //가격 비싼순
            Console.WriteLine("\n2번");
            var output2= from item in input orderby item.Price select item;
            foreach(var item in output2)
            {
                Console.WriteLine(item);
            }

            //가격 저렴한 순
            Console.WriteLine("\n3번");
            var output3= from item in input orderby item.Price descending select item;
            foreach(var item in output3)
            {
                Console.WriteLine(item);
            }

            //string만 저장되고 제품명:가격원
            Console.WriteLine("\n4번");
            var output4=from item in input select item.ToString();
            foreach(var item in output4)
            {
                Console.WriteLine(item);
            }
            var output5 = from item in input select item.Name + ":" + item.Price;
            foreach(var item in output5)
            {
                Console.WriteLine();
                Console.WriteLine(item);
            }

            Console.WriteLine("------------------");
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1150061500";
            System.Xml.Linq.XElement xe = System.Xml.Linq.XElement.Load(url);
            Console.WriteLine(xe);
            Console.WriteLine("------------------");

            var xQ = from item in xe.Descendants("data") select item;
            foreach(var item in xQ)
            {
                Console.WriteLine(item.Element("day").Value);
                Console.WriteLine(item.Element("temp").Value);
                Console.WriteLine(item.Element("wfKor").Value);
            }

            List<Weather> w = new List<Weather>();
            foreach(var item in xe.Descendants("data"))
            {
                Weather temp=new Weather();
                temp.Name=item.Element("wfKor").Value;
                temp.Temp = double.Parse(item.Element("temp").Value);
                w.Add(temp);
            }
            foreach(var item in w)
            {
                Console.WriteLine(item.Name);
                Console.WriteLine(item.Temp);
            }

            Console.WriteLine("------------------");  
            string url2 = "https://www.dtro.or.kr/openApi/lostInfo.xml?ST_DT=20210823&ED_DT=20210923";


            // System.Xml.Linq.XElement xe2=System.Xml.Linq.XElement.Load(url2);
            //Console.WriteLine(xe2);
            //var xr=from item in xe2.Descendants("apiData") select item;
            //foreach(var item in xr)
            //{
            //    Console.WriteLine(item.Element("title").Value);
            //}
            //String url = "https://code.jquery.com/jquery-3.6.0.min.js";

            //string s;
            //using (WebClient client = new WebClient())
            //{
            //    s = client.DownloadString(url2);
            //}

            //Console.WriteLine(s);

            using (StreamReader reader = new StreamReader(WebRequest.Create(url2)
                .GetResponse().GetResponseStream()))
            {
                String s = reader.ReadToEnd();
                Console.WriteLine(s);
            }

           // Console.WriteLine(s);

        }

    }

}


