using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("We are Arsenal");
            Console.WriteLine();
            Console.WriteLine("I am"+" gooner\n");
            Console.WriteLine(12+14+""+7+9);
            Console.WriteLine();
            Console.WriteLine("반갑습니다."[0]);
            Console.WriteLine("반갑습니다."[5]);
            //XOR -> 배타적 or 조건전부 true, false의 경우 무조건 false

            Console.WriteLine(true & true);
            Console.WriteLine(true | false);
            Console.WriteLine(true ^ true);
            Console.WriteLine(false ^ false);
            Console.WriteLine(true ^ false);

            string name = "이";
            name += "동준";
            Console.WriteLine(name);

            int b = 0;
            Console.WriteLine(++b);
            Console.WriteLine(b++);
            Console.WriteLine(b);

            Console.WriteLine("당신의 mbti를 입력하세요");
            string mymbti=Console.ReadLine();
            Console.WriteLine(mymbti);
            Console.WriteLine("당신의 태어난 해를 입력하세요");
            int year=int.Parse(Console.ReadLine());
            Console.WriteLine(year);

            //숫자를 문자열로 바꾸는 방식
            Console.WriteLine(year.ToString());
            Console.WriteLine(year+"");
            Console.WriteLine(123.ToString());
            Console.WriteLine(123+"");
        }
    }
}
