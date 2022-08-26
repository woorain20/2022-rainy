using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824_1
{
    public class Hamster : Animal
    {
        public string species { get; set; }

        public void lets()
        {
            System.Windows.Forms.MessageBox.Show($"{species}종의 이름은 {name}이다");
        }
    }
}
