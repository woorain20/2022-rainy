using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824_1
{
    public class Tiger : Cat
    {
        public string pattern { get; set; }

        public void fight()
        {
            System.Windows.Forms.MessageBox.Show($"{pattern} 무늬를 가진 호랑이의 이름은 {name}이고 나이는 {age}세 이다");
        }
    }
}
