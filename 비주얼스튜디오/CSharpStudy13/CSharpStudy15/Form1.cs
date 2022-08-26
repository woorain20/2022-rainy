using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Linq;
using Newtonsoft.Json.Linq;

namespace CSharpStudy15
{
    public partial class Form1 : Form
    {
        List<Weather> w = new List<Weather>();
        List<Air> a = new List<Air>();

        public Form1()
        {
            InitializeComponent();
            //bindingSource1.DataSource = w;
        }

        private void bindingSource1_CurrentChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1150061500";
            XElement xe = XElement.Load(url);
            foreach(var item in xe.Descendants("data"))
            {
                Weather t= new Weather();
                t.Name = item.Element("wfKor").Value;
                t.Temp = double.Parse(item.Element("temp").Value);
                w.Add(t);
            }

            dataGridView1.DataSource = null;
            dataGridView1.DataSource = w;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string url2 = "http://www.dgwater.go.kr:8080/openapi-data/service/rest/InqireWaterQualityInfoSrvc/getWaterQualityStatisticsInfo";
            XElement x = XElement.Load(url2);
            foreach(var item in x.Descendants("item"))
            {
                Air b=new Air();
                b.Name = item.Element("idNm").Value;
                b.per = double.Parse(item.Element("m11").Value);
                b.year = int.Parse(item.Element("year").Value);
                a.Add(b);
            }

            dataGridView2.DataSource = null;
            dataGridView2.DataSource= a;
        }

        private void button3_Click(object sender, EventArgs e)
        {
        https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=861

            int count = 1000;

            List<Lotto> lo = new List<Lotto>();

            while (true)
            {
                var jason = new System.Net.WebClient().DownloadString("https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=" + count);
                count++;
                var jArray = JObject.Parse(jason);
                if (jArray["returnValue"].ToString() == "fail")
                    break;
                Lotto l = new Lotto()
                {
                    drwNoDate = jArray["drwNoDate"].ToString(),
                    totsellamnt = jArray["totSellamnt"].ToString()
                };

                lo.Add(l);
            }
            dataGridView3.DataSource = null;
            dataGridView3.DataSource = lo;
        }
    }
}
