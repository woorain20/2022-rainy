using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //숫자 입력해서 홀수인 경우만 출력
            Console.WriteLine("숫자입력");
            int num=int.Parse(Console.ReadLine());
            //2로 나눴을 때 나머지가 0이 아닌 경우(=홀수)
            if (num % 2 != 0)
            {
                Console.WriteLine("홀수!!!");
                Console.WriteLine(num);
            }

            //삼항연산자(엑셀 if문과 비슷)
            //1줄로 조건문을 표시하는 아주 간단한 코드
            //보통 2가지 경우의 수가 있을 때 쓰고, 경우의 수가 2개 넘어도 쓸 수 있는데 너무 복잡해짐
            //물음표 뒤에 있는 건 물음표 앞에 있는 조건이 참일 때 성립됨, 조건이 거짓이면 콜론 뒤에 있는 것이 성립됨
            string result = num % 2 == 0 ? "짝" : "홀";
            Console.WriteLine("결과: "+result);

            switch (num%2)
            {
                case 0:
                    Console.WriteLine("num은 짝");
                    break;
                case 1:
                    Console.WriteLine("num은 홀");
                    break;
                default:
                    break;
            }

            Console.WriteLine("안녕하세요".Contains("안녕")); // 안녕하세요 안에 contains에 포함된 것이 있으면 트루
            Console.WriteLine("안녕하세요".Equals("안녕하세요"));
            Console.WriteLine("안녕하세요"=="안녕하세요");
        }
    }
}
