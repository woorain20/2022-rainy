using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1번");
            int inch = int.Parse(Console.ReadLine());
            Console.WriteLine(inch*2.54+" cm");

            Console.WriteLine("2번");
            int kg = int.Parse(Console.ReadLine());
            Console.WriteLine(kg*2.20462262+" pound");

            Console.WriteLine("3번");
            int r=int.Parse(Console.ReadLine());
            Console.WriteLine("둘레: "+2*3.14*r);
            Console.WriteLine("넓이: "+3.14*r*r);

            Console.WriteLine("4번 첫번째 풀이");
            int num1=int.Parse(Console.ReadLine());
            string num2=Console.ReadLine();
            int mynum2 =int.Parse(num2);

            Console.WriteLine(num1 * (num2[2]-'0'));
            Console.WriteLine(num1 * (num2[1]-'0'));
            Console.WriteLine(num1 * (num2[0]-'0'));
            Console.WriteLine(num1*mynum2);

            Console.WriteLine("4번 두번째 풀이");
            Console.WriteLine(num1*(mynum2%10));
            Console.WriteLine(num1*((mynum2/10)%10));
            Console.WriteLine(num1*(mynum2/100));
            Console.WriteLine(num1*mynum2);
        }
    }
}
