using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lotto
{
    public partial class UserControl1 : UserControl
    {
        public UserControl1()
        {
            InitializeComponent();

            
        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void lottobt_Click(object sender, EventArgs e)
        {
            int[] arr = new int[7];

            Random r = new Random();
            if (true)
            {

                for (int i = 0; i < arr.Length; i++)
                {
                    arr[i] = r.Next(1, 46);

                    for (int j = 0; j < i; j++)
                    {
                        if (arr[i] == arr[j])
                        {
                            i--;
                        }
                    }

                    //    Console.WriteLine(arr[i]);
                }
            }
            if (true)
            {
                int nTemp;
                //int nCount = 0;

                for (int i = 0; i < arr.Length - 2; i++)
                {
                    for (int j = 0; j < arr.Length - 2; j++)
                    {
                        if (arr[j] > arr[j + 1])
                        {
                            nTemp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = nTemp;
                        }
                        //        nCount++;
                    }
                }

                //Console.WriteLine("Count : {0}", nCount);

                for (int i = 0; i < arr.Length; i++)
                    Console.Write(arr[i] + "\t");
            }
            ball1.Text = arr[0].ToString();
            ball2.Text = arr[1].ToString();
            ball3.Text = arr[2].ToString();
            ball4.Text = arr[3].ToString();
            ball5.Text = arr[4].ToString();
            ball6.Text = arr[5].ToString();
            bonus.Text = arr[6].ToString();
            makedate.Text=DateTime.Now.ToString();
        }

        private void makedate_Click(object sender, EventArgs e)
        {
        }
    }
}
