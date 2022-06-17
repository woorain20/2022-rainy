using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPJ_lotto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[7];
     
            Random r = new Random();
            if (true) { 

            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = r.Next(1, 46);

                for (int j = 0; j < i; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        i--;
                    }
                }

            //    Console.WriteLine(arr[i]);
            }
            }
            if (true) { 
            int nTemp;
            //int nCount = 0;

            for (int i = 0; i < arr.Length - 2; i++)
            {
                for (int j = 0; j < arr.Length - 2; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        nTemp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = nTemp;
                    }
            //        nCount++;
                }
            }

            //Console.WriteLine("Count : {0}", nCount);

            for (int i = 0; i < arr.Length; i++)
                Console.Write(arr[i] + "\t");
            }

        }
    }
}
