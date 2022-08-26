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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            userControl11.BringToFront();
            userControl22.BringToFront();
        }

        private void userControl11_Load(object sender, EventArgs e)
        {

        }

        private void makeB_Click(object sender, EventArgs e)
        {
            userControl11.BringToFront();
        }

        private void RecodeB_Click(object sender, EventArgs e)
        {
            userControl22.BringToFront();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Dispose();
        }

    }
}
