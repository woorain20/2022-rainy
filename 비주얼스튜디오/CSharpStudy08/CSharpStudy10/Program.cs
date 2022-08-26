using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //if (false) false면 실행 안 됨
            //{
            //}

            Console.WriteLine("시간을 입력하세요");
            int hour=int.Parse(Console.ReadLine());
            if (hour < 12)
            {
                Console.WriteLine("오전");
            }
            else if(hour >= 12)
            {
                Console.WriteLine("오후");
            }

            int nh = DateTime.Now.Hour;
            if(nh < 12)
            {
                Console.WriteLine("오전");
            }
            else if(nh >= 12)
            {
                Console.WriteLine("오후");
            }

            int nm=DateTime.Now.Minute;
            if (nm < 40 && nm > 0)
            {
                Console.WriteLine("수업중");
            }
            else if(nm >= 40 && nm < 0)
            {
                Console.WriteLine("쉬는 시간");
            }

            Console.WriteLine("안녕하세요.".Contains("안"));
            Console.WriteLine("안녕하세요.".Contains("허"));

        }
    }
}
