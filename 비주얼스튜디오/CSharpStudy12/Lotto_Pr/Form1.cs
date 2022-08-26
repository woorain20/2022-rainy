using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lotto_Pr
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Label[] LottoArray = new Label[] { ball1, ball2, ball3,
                ball4, ball5, ball6, bonus };

            Random rand = new Random();

            for (int lotto = 0; lotto < LottoArray.Length; lotto++)
            {

                int lottonumber = rand.Next(1, 46);

                for (int lottoCheck = lotto; lottoCheck >= 0; lottoCheck--)
                {
                    if (LottoArray[lottoCheck].Text == lottonumber.ToString())
                    {
                        lottoCheck = lotto;
                        lottonumber = rand.Next(1, 46);
                    }
                }
                LottoArray[lotto].Text = lottonumber.ToString();
            }
        }
        private void ball1_Click(object sender, EventArgs e)
        {

        }

        private void result_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
