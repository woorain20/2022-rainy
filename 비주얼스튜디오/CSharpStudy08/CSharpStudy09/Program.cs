using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //1. 나이 혈액형, mbti 소개
            Console.WriteLine("나이를 입력해주세요");
            int age=int.Parse(Console.ReadLine());
            Console.WriteLine("혈액형을 입력해주세요");
            string blood=Console.ReadLine();
            Console.WriteLine("MBTI를 입력해주세요");
            string mbti=Console.ReadLine();
            //더하기형
            Console.WriteLine("자기 소개");
            Console.WriteLine("나이: "+age);
            Console.WriteLine("혈액형: "+blood); 
            Console.WriteLine("MBTI: "+mbti);
            //string.fomat형
            Console.WriteLine("자기 소개");
            Console.WriteLine(String.Format("나이: {0}, 혈액형: {1}, MBTI: {2}", age,blood,mbti));
            //$형
            Console.WriteLine($"나이: {age}, 혈액형: {blood}, MBTI: {mbti}");

            //2. 너비와 높이 값 입력받아서 사각형 넓이 구하기
            Console.WriteLine("사각형 넓이를 구하시오");
            Console.WriteLine("너비를 입력하시오");
            int num1=int.Parse(Console.ReadLine());
            Console.WriteLine("높이를 입력하시오");
            int num2=int.Parse(Console.ReadLine());
            int num3 = num1 * num2;
            Console.WriteLine("넓이: "+num3);

            //3. 피타고라스 정리 결과값 출력
            Console.WriteLine("피타고라스 정리 결과값 출력");
            Console.WriteLine("직각변1의 길이를 입력하시오");
            int p1=int.Parse(Console.ReadLine());
            Console.WriteLine("직각변2의 길이를 입력하시오");
            int p2=int.Parse(Console.ReadLine());
            int p3 = (p1 * p1) + (p2 * p2);
            Console.WriteLine("결과값: "+p3);


        }
    }
}
