using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Projectlotto
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }
        public Form2(string l, string a="")
        {
            InitializeComponent();
            now.Text = l;
            if(a!="")
            {
                string[] test = a.Split(',');

                b1.Text = test[0];
                b2.Text = test[1];
                b3.Text = test[2];
                b4.Text = test[3];
                b5.Text = test[4];
                b6.Text = test[5];
            }
        }

        private void Form2_Load(object sender, EventArgs e)
        {

        }

        private void now_Click(object sender, EventArgs e)
        {
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
