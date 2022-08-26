using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSaharpStudy_practice
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(DateTime.Now.Year);
            Console.WriteLine(DateTime.Now.Month);

            Console.WriteLine("1번 탄생년도 띠");
            int by=int.Parse(Console.ReadLine());
            //조건문이 참이라서 수행헤야 할 코드가 1줄일 경우 중괄호 생략 가능
            if(by%12==0)
            {
                Console.WriteLine("원숭이띠");
            }
            else if (by %12== 1)
            {
                Console.WriteLine("닭띠");
            }
            else if (by %12== 2)
            {
                Console.WriteLine("개띠");
            }
            else if (by %12== 3)
            {
                Console.WriteLine("돼지띠");
            }
            else if (by %12== 4)
            {
                Console.WriteLine("쥐띠");
            }
            else if (by %12== 5)
            {
                Console.WriteLine("소띠");
            }
            else if (by % 12 == 6)
            {
                Console.WriteLine("호랑이띠");
            }
            else if (by % 12 == 7)
            {
                Console.WriteLine("토끼띠");
            }
            else if (by % 12 == 8)
            {
                Console.WriteLine("용띠");
            }
            else if (by % 12 == 9)
            {
                Console.WriteLine("뱀띠");
            }
            else if (by % 12 == 10)
            {
                Console.WriteLine("말띠");
            }
            else if (by % 12 == 11)
            {
                Console.WriteLine("양띠");
            }

            Console.WriteLine("2번 현재년도 띠");
            int year = DateTime.Now.Year;
            int ny = year % 12;
            switch (ny)
            {
                case 0:
                    Console.WriteLine("원숭이띠");
                        break;
                case 1:
                    Console.WriteLine("닭띠");
                    break;
                case 2:
                    Console.WriteLine("개띠");
                    break;
                case 3:
                    Console.WriteLine("돼지띠");
                    break;
                case 4:
                    Console.WriteLine("쥐띠");
                    break;
                case 5:
                    Console.WriteLine("소띠");
                    break;
                case 6:
                    Console.WriteLine("호랑이띠");
                    break;
                case 7:
                    Console.WriteLine("토끼띠");
                    break;
                case 8:
                    Console.WriteLine("용띠");
                    break;
                case 9:
                    Console.WriteLine("뱀띠");
                    break;
                case 10:
                    Console.WriteLine("말띠");
                    break;
                case 11:
                    Console.WriteLine("양띠");
                    break;

            }

            Console.WriteLine("3번 탄생 월 계절");
            int bm=int.Parse(Console.ReadLine());
            if (bm==12 || bm==1 || bm==2)
            {
                Console.WriteLine("겨울");
            }
            else if (bm>=3 && bm <= 5)
            {
                Console.WriteLine("봄");
            }
            else if (bm>=6 && bm <= 8)
            {
                Console.WriteLine("여름");
            }
            else if (bm>9 && bm <= 11)
            {
                Console.WriteLine("가을");
            }
            else
            {
                Console.WriteLine("잘못입력했습니다.");
            }

            Console.WriteLine("4번 현재 월 계절");
            int month=DateTime.Now.Month;
            int nm = month;
            switch (nm)
            {
                case 12:
                case 1:
                case 2:
                    Console.WriteLine("겨울");
                    break;
                case 3:
                case 4:
                case 5:
                    Console.WriteLine("봄");
                    break ;
                case 6:
                case 7:
                case 8:
                    Console.WriteLine("여름");
                    break;
                case 9:
                case 10:
                case 11:
                    Console.WriteLine("가을");
                    break;
            }
        }
    }
}
