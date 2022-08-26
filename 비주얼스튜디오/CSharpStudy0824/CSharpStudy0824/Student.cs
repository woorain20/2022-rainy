using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824
{
    //student는 human을 상속받아서 name, age 값도 가지고 있어서 sleep도 할 수 있다.
    //:(콜론) = extends(자바)
    //:(콜론) = implements(자바)
    public class Student : Human
    {
        public int score { get; set; }

        public void study(int hour)
        {
            Console.WriteLine(score+"점을 받았습니다");
            Console.WriteLine("매일 "+hour+"시간 공부합니다");
        }
    }
}
