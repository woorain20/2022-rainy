using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824
{
    public class Human
    {
        public string name { get; set; }

        public int age { get; set; }

        public Human()
        {
            Console.WriteLine("인간생성");
        }        
        public Human(int age)
        {
            this.age = age;
            Console.WriteLine(age+"세 인간생성");
        }

        public void sleep()
        {
            Console.WriteLine("sleep");
            Console.WriteLine(name+"이 잠니다");
            Console.WriteLine(age+"세 답게 잠이 많습니다.");
        }
    }
}
