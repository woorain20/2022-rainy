using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824
{
    public class Worker : Human
    {
        public int pay { get; set; }

        public Worker()
        {

        }

        //조상 클래스에 있는 생성자 중에서 매개변수가 있는 생성자를 명시적으로 
        public Worker(int a) : base(a)
        {
            Console.WriteLine("나이: "+a);
        }

        public int work()
        {
            if (pay == 0)
            {
                Console.WriteLine("만국의 노동자여 단결하라");
            }
            else
            {
                Console.WriteLine($"{pay}만큼 일을 합니다.");
            }
            return pay*30;
        }
    }
}
