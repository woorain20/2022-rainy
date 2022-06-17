using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Csharp20610_WF
{
    public partial class Form1 : Form
    {

        int[] lottoN = new int[7];
        Label[] labels = new Label[7];

        public Form1()
        {
            InitializeComponent();
            button1.Text = "안녕";
            myButton.Text = "Hello";
            label_random.Text = new Random().Next().ToString();
            //button_radom.Text = "돌려돌려!";

            labels[0] = sort1;
            labels[1] = sort2;
            labels[2] = sort3;
            labels[3] = sort4;
            labels[4] = sort5;
            labels[5] = sort6;
            labels[6] = sort_bounus;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //mbox tab*2
            MessageBox.Show("Test");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Test2");
            
        }

        private void button_radom_Click(object sender, EventArgs e)
        {
            Random random = new Random();

            for (int i = 0; i < lottoN.Length; i++)
            {
                lottoN[i] = random.Next(1, 46);

                for (int j = 0; j < i; j++)
                {
                    if (lottoN[i] == lottoN[j])
                    {
                        i--;
                    }
                }

               // Console.WriteLine(arr[i]);
            }

            labal_lotto1.Text = lottoN[0].ToString();
            labal_lotto2.Text = lottoN[1].ToString();
            labal_lotto3.Text = lottoN[2].ToString();
            labal_lotto4.Text = lottoN[3].ToString();  
            labal_lotto5.Text = lottoN[4].ToString();
            labal_lotto6.Text = lottoN[5].ToString();
            labal_lotto_bounus.Text = lottoN[6].ToString();
    
        }
        private void unduplication()
        {

            int[] lottoN = new int[7];
             
            for (int i = 0; i < 7; i++)
            {
                Random r = new Random();

                lottoN[i] = r.Next(1, 46);

                for(int j = 0; j < i; j++)
                {
                   lottoN[i] = lottoN[j];
                    i--;
                }
            }
        }
        private void sort()
        {
            int nTemp;
            //int nCount = 0;

            for (int i = 0; i < lottoN.Length - 2; i++)
            {
                for (int j = 0; j < lottoN.Length - 2; j++)
                {
                    if (lottoN[j] > lottoN[j + 1])
                    {
                        nTemp = lottoN[j + 1];
                        lottoN[j + 1] = lottoN[j];
                        lottoN[j] = nTemp;
                    }
                }
            }
        }


        private void button3_Click(object sender, EventArgs e)
        {
            sort();
            sort1.Text = lottoN[0].ToString();
            sort2.Text = lottoN[1].ToString();
            sort3.Text = lottoN[2].ToString();
            sort4.Text = lottoN[3].ToString();
            sort5.Text = lottoN[4].ToString();
            sort6.Text = lottoN[5].ToString();
            sort_bounus.Text = lottoN[6].ToString();

            for (int i = 0; i < labels.Length; i++)
                color(labels[i]);
        }
        private void color(Label l)
        {
            Color c = new Color();
            int num = int.Parse(l.Text);
            if (num <= 10)
                l.BackColor = Color.Gold;
            else if (num > 10 && num <= 20)
            {
                l.BackColor = Color.DodgerBlue;
            }
            else if (num > 20 && num <= 30)
            {
                l.BackColor = Color.DarkOrange;
            }
            else if (num > 30 && num <= 40)
            {
                l.BackColor = Color.DimGray;
            }
            else if (num > 40 && num <= 45)
            {
                l.BackColor = Color.ForestGreen;
            }


        }

    }
}
