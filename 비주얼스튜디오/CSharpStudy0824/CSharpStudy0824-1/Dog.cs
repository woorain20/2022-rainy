using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824_1
{
    public class Dog : Animal
    {
        public string hairColor { get; set; }

        public void bark()
        {
            System.Windows.Forms.MessageBox.Show($"{name}의 이름의 개과 동물은 {hairColor} 색이다.");
        }
    }
}
