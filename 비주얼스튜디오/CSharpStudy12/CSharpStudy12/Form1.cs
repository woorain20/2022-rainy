using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CSharpStudy12
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            button1.Text = "Hello";
            myButton.Text = "Hello";
            Label_Random.Text = new Random().Next().ToString();
            label_myrandom.Text = "";
            label_r.Text = "";
            label_r2.Text = "";
            label_r3.Text = "";
            label_r4.Text = "";
            label_r5.Text = "";
            label_r6.Text = "";
            label_r7.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("우리 헤어지면 안되잖아\n우리 이별하긴 이르잖아\n이렇게 날 떠나가면 안돼요\n내가 하지 못한 말들이 아직 너무 많은데\n이대로 날 떠나가지 마세요");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("네이버로 이동합니다.");
            System.Diagnostics.Process.Start("https://www.naver.com");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.instagram.com");
        }

        private void myButton_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Hello, it's me\nI was wondering if after all these years you'd like to meet\nTo go over everything");
        }

        private void Label_Random_Click(object sender, EventArgs e)
        {

        }

        private void label_myrandom_Click(object sender, EventArgs e)
        {

        }

        private void button_random_Click(object sender, EventArgs e)
        {
            label_myrandom.Text = new Random().Next().ToString();
            Random r = new Random();
            int num = r.Next(1, 46);
            int num2 = r.Next(1, 46);
            int num3 = r.Next(1, 46);
            int num4 = r.Next(1, 46);
            int num5 = r.Next(1, 46);
            int num6 = r.Next(1, 46);
            int num7 = r.Next(1, 46);

            label_r.Text = num.ToString();
            label_r2.Text = num2.ToString();
            label_r3.Text = num3.ToString();
            label_r4.Text = num4.ToString();
            label_r5.Text = num5.ToString();
            label_r6.Text = num6.ToString();
            label_r7.Text = num7.ToString();
        }

        private void label1_Click(object sender, EventArgs e)
        {
        }

        private void label_r2_Click(object sender, EventArgs e)
        {

        }
    }
}
