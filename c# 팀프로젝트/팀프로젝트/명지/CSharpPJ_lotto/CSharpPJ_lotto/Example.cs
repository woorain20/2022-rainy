using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CSharpPJ_lotto
{
    public partial class Example : Form
    {
        int[] lottoN = new int[7];
        Label[] labels = new Label[7];

        public Example()
        {
            InitializeComponent();

            labels[0] = label_sort1;
            labels[1] = label_sort2;
            labels[2] = label_sort3;
            labels[3] = label_sort4;
            labels[4] = label_sort5;
            labels[5] = label_sort6;
            labels[6] = label_sort_bonus;
        }

        private void unduplication()
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
            }
            //Console.WriteLine(arr[i]);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            unduplication();
            label_ball1.Text = lottoN[0].ToString();
            label_ball2.Text = lottoN[1].ToString();
            label_ball3.Text = lottoN[2].ToString();
            label_ball4.Text = lottoN[3].ToString();
            label_ball5.Text = lottoN[4].ToString();
            label_ball6.Text = lottoN[5].ToString();
            label_bonus.Text = lottoN[6].ToString();
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

        private void button2_Click(object sender, EventArgs e)
        {
            sort();
            label_sort1.Text = lottoN[0].ToString();
            label_sort2.Text = lottoN[1].ToString();
            label_sort3.Text = lottoN[2].ToString();
            label_sort4.Text = lottoN[3].ToString();
            label_sort5.Text = lottoN[4].ToString();
            label_sort6.Text = lottoN[5].ToString();
            label_sort_bonus.Text = lottoN[6].ToString();

            for (int i = 0; i < labels.Length; i++)
            {
                color(labels[i]);
            }
        }

        private void color(Label l)
        {
            Color c = new Color();
            int num = int.Parse(l.Text);
            if (num <= 10)
            {
                l.BackColor = Color.Gold;
            }
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

        //private void pictureBox1_Click(object sender, EventArgs e)
        //{
        //    pictureBox1.Load(@"../../../material/free-icon-lucky-draw-5525324.png");
        //    pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        //}
        //출처: https://tyen.tistory.com/74 [TYen:티스토리]
    }
}
