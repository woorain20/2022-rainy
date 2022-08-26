using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //for문으로 덧셈, 1~10까지
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += i;
            Console.WriteLine("1~10의 합"+sum);

            //for(char c = '가'; c <= '힣';c++)
            //    Console.WriteLine(c);

            //숫자 5개 입력받고, 그 숫자들 합 구하기
            //foreach
            //배열 선언과 동시에 값을 집어넣음
            int[] num = { 10, 20, 1, 2, 3 };
            //배열 선언과 동시에 크기만 잡아줌
            int[] num2 = new int[5];
            num2[0] = 24;
            num2[1] = 32;
            num2[2] = 22;
            num2[3] = 12;
            num2[4] = 20;

            //for-반복, each-각각, 배열이나 list의 길이만큼만 반복을 해주는 반복문

            //foreach문 없이 반복
            sum = 0;
            for(int i = 0; i <num.Length; i++)
                sum+=num[i];
            //foreach문 사용
            //var 대신 int 써도 됨
            //var= 변수 타입을 정하지 않았으나 대입되는 값에 따라서 타입이 변경됨
            //여기선 item이 num2라는 배열에 대해서 있으므로 
            sum = 0;
            foreach(var item in num2)
                sum+=item;

            Console.WriteLine("안녕");
            Console.WriteLine("안녕");
            Console.WriteLine("안녕");

            goto mytest;//원만하면 쓰지말 것

            Console.WriteLine("하세요"); // 이 부분 스킵

            mytest:
            Console.WriteLine("못해요");

            Console.WriteLine("hello World".ToUpper());
            Console.WriteLine("hello World".ToLower());

            //문자열을 배열로 분할
            string[] result = "이동준, 피강효, 권건모".Split(',');
            foreach(var item in result)
                Console.WriteLine(item);

            //배열을 문자열로 합침
            string myresult = string.Join(",", result);
            Console.WriteLine(myresult);
        }
    }
}
