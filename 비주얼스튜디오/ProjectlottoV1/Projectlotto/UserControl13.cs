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
    public partial class one : UserControl
    {
        public one()
        {
            InitializeComponent();
        }

        public one(int[] numbers)
        {
            InitializeComponent();
            onb1.Text = numbers[0] + "";
            onb2.Text = numbers[1] + "";
            onb3.Text = numbers[2] + "";
            onb4.Text = numbers[3] + "";
            onb5.Text = numbers[4] + "";
            onb6.Text = numbers[5] + "";
        }
    }
}
