using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823_1
{
    public class Cat
    {
        public string name { get; set; }
        public int age { get; set; }
        public string color { get; set; }

        public void meow()
        {
            System.Windows.Forms.MessageBox.Show(name + "이/가 울고 있습니다.");
        }

        public string eat()
        {
            return name + "이/가 밥을 먹는다.";
        }

        public static void jump()
        {
            System.Windows.Forms.MessageBox.Show("냥이 점프");
        }

        public void test(int count)
        {
            System.Windows.Forms.MessageBox.Show($"{color}색 고양이가 {count}번 야옹거렸다.");
        }

    }
}
