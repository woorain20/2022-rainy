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
    public partial class record : UserControl
    {
        public record()
        {
            InitializeComponent();
        }

        private void rbutton_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://dhlottery.co.kr/gameResult.do?method=byWin");
        }
    }
}
