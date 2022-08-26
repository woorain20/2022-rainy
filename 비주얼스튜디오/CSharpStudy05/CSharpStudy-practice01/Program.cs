using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy_practice01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //1. 5개 숫자 입력받고 그 중 최댓값 최솟값 출력
            int[] num = new int[5];
            num[0]=int.Parse(Console.ReadLine());
            num[1]=int.Parse(Console.ReadLine());
            num[2]=int.Parse(Console.ReadLine());
            num[3]=int.Parse(Console.ReadLine());
            num[4]=int.Parse(Console.ReadLine());
            Console.WriteLine("최대: "+num.Max());
            Console.WriteLine("최소: "+num.Min());

            //2. 대소문자 반복문 이용해서 출력
            for(char c= 'a'; c <= 'z';c++)
                Console.Write(c);
            Console.WriteLine();
            for(char b='A';b <= 'Z';b++)
                Console.Write(b);
            Console.WriteLine();
            //3. 삼각형 출력
            int a=int.Parse(Console.ReadLine());
            for (int i = 0; i < a; i++)
            {
                for (int j = 0; j < i; j++)
                    Console.Write("*");
                Console.WriteLine();
            }
            //4. 역삼각형 출력
            int d = int.Parse(Console.ReadLine());
            for (int i = 0; i < d; i++)
            {
                for (int j = i + 1; j < d; j++)
                {
                    Console.Write(" ");
                }
                for (int k = 0; k < i + 1; k++)
                {
                    Console.Write("*");
                }
                Console.Write("\n");
            }

            //5. 삼각형 모양 피라미드 출력
            int e = int.Parse(Console.ReadLine());
            for (int i = 0; i < e; i++)
            {
                for (int j = 0; j < e - i; j++)
                {
                    Console.Write(" ");
                }
                for (int h = 0; h < 2 * i - 1; h++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            //6. 임의 숫자 7개를 배열에 집어넣어(중복되면 안됨) 오름차순으로 정렬
            int[] list = { 15, 37, 45, 78, 17, 36, 49 };
            Array.Sort(list);
            Console.WriteLine($"{String.Join(",",list)}");

            //7.규칙 따르는 수열의 20번째 숫자를 프로그램으로 만들어 찾을 것
            String sequence = "1";
            int n = 1;
            while(n<=20)
            {
                Console.WriteLine(n+"번째 수열"+sequence);
                char token = sequence[0];
                int count = 0;
                string tempsequence = "";
                for(int i = 0; i < sequence.Length; i++)
                {
                    if (token == sequence[i])
                    {
                        count++;
                    }
                    else
                    {
                        tempsequence += "" + token + count;
                        count = 0;
                        token = sequence[i];
                        count++;
                    }
                    if (i + 1 == sequence.Length)
                        tempsequence += "" + token + count;
                }
                sequence = tempsequence;
                n++;
            }

        }
    }
}
