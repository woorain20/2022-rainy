using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823
{
    public partial class Dog
    {
        public void bark()
        {
            Console.WriteLine(name+"이 짖습니다.");
        }

        public void sleep()
        {
            Console.WriteLine("코드명이 " +code+"인 개 " +name+"견이 잠을 잠니다.");
        }
    }
}
