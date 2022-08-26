using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CSharpStudy0824
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Animal an = new Animal();
            an.name = "두치";
            an.age = 7;
            an.sleep();
            Animal an2 = new Animal();
            an2.name = "뿌꾸";
            an2.age = 4;
            an2.sleep();
        }
    }
}
