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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            game1.BringToFront();
            recordimg1.BringToFront();
        }

        private void Exit_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void Game_Click(object sender, EventArgs e)
        {
            game1.BringToFront();
        }

        private void Record_Click(object sender, EventArgs e)
        {
            recordimg1.BringToFront();
        }
    }
}
