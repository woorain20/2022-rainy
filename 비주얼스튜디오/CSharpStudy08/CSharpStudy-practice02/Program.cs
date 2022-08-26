using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy_practice02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            if (false)
            {
            #region Q1.0603
            int[] numbers = new int[5];
            for(int i = 0; i < numbers.Length; i++)
            {
                Console.WriteLine("숫자입력("+i+")");
                numbers[i] = int.Parse(Console.ReadLine());
            }
            int max=numbers[0];
            int min = max;

            foreach(var item in numbers)
            {
                if(item> max)
                {
                    max = item;
                }
                if(item< min)
                {
                    min = item;
                }
            }
                Console.WriteLine("최댓값: "+max);
                Console.WriteLine("최솟값: "+min);
            #endregion

            #region Q2.0603
            for (char c = 'A'; c <= 'z'; c++)
            {
                if(c>'Z' && c < 'a')
                {
                    continue;
                }
                Console.Write(c);
            }
            #endregion

            #region Q3,4,5.0603
            Console.WriteLine("출력할 별의 높이 입력");
            int floor=int.Parse(Console.ReadLine());
            //3
            Console.WriteLine("3번");
            for (int i = 0; i < floor; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
            Console.WriteLine();
            //4.
            Console.WriteLine("4번");
            for (int i = 0; i < floor; i++)
            {
                for (int j = floor - i; j > 0; j--)
                {
                    Console.Write(" ");
                }
                for(int j=0; j<=i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
            Console.WriteLine();
            //5.
            Console.WriteLine("5번");
            for(int i = 0; i < floor; i++)
            {
                for(int j = floor - i - 1; j > 0; j--)
                {
                    Console.Write(" ");
                }
                for(int j=0; j<=2*i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
                Console.WriteLine();
            #endregion

            #region Q6.0603
            Console.WriteLine("6번");
            int[] mynumbers = new int[7];
            //contain 이용
            for(int n = 0; n < mynumbers.Length; n++)
            {
                Console.WriteLine("숫자입력");
                int num = int.Parse(Console.ReadLine());
                if (mynumbers.Contains(num))
                {
                    Console.WriteLine("중복");
                    n--;
                    continue;
                }
                mynumbers[n] = num;
            }
            foreach(var item in mynumbers)
            {
                Console.WriteLine(item);
            }
            //직접 체크
            mynumbers = new int[7];
            for(int i=0; i < mynumbers.Length; i++)
            {
                Console.WriteLine("값 입력");
                int k=int.Parse(Console.ReadLine());
                bool isduplicate=false;
                for(int j=0; j < i; j++)
                {
                    if (mynumbers[j] == k)
                    {
                        Console.WriteLine("중복");
                        isduplicate=true;
                        i--;
                        break;
                    }
                }
                if (isduplicate == false)
                {
                    mynumbers[i] = k;
                }
                foreach (var item in mynumbers)
                {
                    Console.WriteLine(item);
                }
            }
                Console.WriteLine();
            #endregion

            #region Q7.0603
            Console.WriteLine("7번");
            string start = "1";
            for(int i = 0; i < 20; i++)
            {
                Console.WriteLine($"{i+1}번째 : {start}");
                string end = ""; // 누적값 저장, 읽어들이는 숫자가 달라지거나 수열이 끝났을 때 그동안 누적된 값을 적거나 누적하는 것
                char num = start[0]; // 읽어들이는 숫자
                int count = 0; // 읽어들인 숫자의 개수

                for(int j=0; j<start.Length; j++)
                {
                    if(start[j] != num)
                    {
                        end = end + num + count;
                        num = start[j];
                        count = 1;
                    }
                    else
                    {
                        count++;
                    }
                }
                end = end + num + count;
                start = end;
            }
            #endregion
            }
            /*디버깅하기
            ctrl+F5 말고 F5를 눌러야 함
            숫자 옆에 점 찍거나 해당 라인에 대고 F9 누르기
            빨간점 = break point
            */
        }
    }
}
