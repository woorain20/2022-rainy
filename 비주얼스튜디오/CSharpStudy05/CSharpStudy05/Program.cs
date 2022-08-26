using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("안녕");
            Console.WriteLine((int)'A');
            Console.WriteLine((int)'가');
            Console.WriteLine((char)102);

            Console.WriteLine(10+20);
            Console.WriteLine(""+10+20); // "" 뒤쪽을 문자로 인식
            Console.WriteLine(10+20+""+30+40);

            Console.WriteLine("ABC"[0]); // 가장 첫번째 글자
            Console.WriteLine((int)"ABC"[0]);
            Console.WriteLine((int)"123"[0]);
            Console.WriteLine((int)"123"[0]-'0');
            Console.WriteLine((int)"123"[0]-48);
            Console.WriteLine("가"+"힛");
            Console.WriteLine('가' + '힛');

            Console.WriteLine(100==100);
            Console.WriteLine(100!=100);
            Console.WriteLine('가'>500);

            Console.WriteLine(int.MaxValue);
            Console.WriteLine(long.MaxValue);
            Console.WriteLine(ulong.MaxValue); // 음수 없는 long

            int aa = 100;
            aa += 'A'; // A=65
            Console.WriteLine(aa);

            int bb = 200;
            bb += aa;
            Console.WriteLine(bb);

            string hi = "Hello";
            hi += "World";
            Console.WriteLine(hi);
            int a1 = 10;
            int b1 = 20;
            Console.WriteLine(++a1+b1++);
            Console.WriteLine(++b1+a1);

            int test = int.Parse("1234");
            test++;
            Console.WriteLine(test);

            Console.WriteLine("당신의 MBTI는 뭔가요?");
            Console.WriteLine(Console.ReadLine());
            string mbti = Console.ReadLine();
            Console.WriteLine("당신의 mbti는 "+mbti+"입니다.");

            //String.fomat
            //1. String.format
            //문자열에 들어갈 변수가 여러개면 {0},{1},{2}...  이렇게 숫자를 늘려주고 그에 따라서 변수들을 콤마 뒤에 적으면 됨
            Console.WriteLine(string.Format("당신의 mbti: {0},{1}",mbti,aa));

            //2. $(자바스크립트에 유사방식 있음)
            Console.WriteLine($"당신의 mbti는 {mbti}이예요.");
            string result = $"aa의 값은  {aa}이고, mbti는 {mbti}다";
            Console.WriteLine(result);
        }
    }
}
