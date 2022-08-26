using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpStudy02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("안녕");
            //문자열 입력
            string input = Console.ReadLine();
            Console.WriteLine(input); // 입력한 것 출력

            int num = int.Parse(Console.ReadLine());
            Console.WriteLine(num+10);

            Console.WriteLine("안녕하세요"[0]); // 첫번째 글자 안 입력
            Console.WriteLine("123"[0]);    // 1 출력
            Console.WriteLine("123"[0]-'0');    // 1 출력
            Console.WriteLine((int)"123"[0]);   //글자 1은 아스키코드 49

            Console.WriteLine("----------------------");
            int num2 = int.Parse(Console.ReadLine());
            Console.WriteLine(num2*2.54+" cm");

            int num3 = int.Parse(Console.ReadLine());
            Console.WriteLine(num3*2.220462262+" pound");

            int num4 = int.Parse(Console.ReadLine());
            Console.WriteLine("둘레: "+2*3.14*num4);
            Console.WriteLine("넓이: "+3.14*num4*num4);

            int num5 = int.Parse(Console.ReadLine());
            string num6 = Console.ReadLine();
            int num7 = int.Parse(num6);
            Console.WriteLine(num5 * (int)num6[2]- '0');
            Console.WriteLine(num5 * (int)num6[1]- '0');
            Console.WriteLine(num5 * (int)num6[0]- '0');
            Console.WriteLine(num5 * num7);
        }
    }
}
