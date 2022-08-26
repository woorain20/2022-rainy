using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823
{
    public class Cat
    {
        public string name { get; set; }
        public int age { get; set; }
        public string color { get; set; }

        public void meow()
        {
            Console.WriteLine(name+"이/가 울고 있습니다.");
        }

        public void eat()
        {
            Console.WriteLine(name+ "이/가 밥을 먹고 있습니다.");
        }

        public static void jump()
        {
            Console.WriteLine("고양이는 점프가 좋습니다.");
        }

    }

}
