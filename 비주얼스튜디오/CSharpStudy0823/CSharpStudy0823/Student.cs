using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823
{
    public class Student
    {
        public int stNum { get; set; }
        public string stName { get; set; }
        public int stGrade { get; set; }
        public int stAge { get; set; }
        public int score { get; set; }

        public void study(int stNum, string stName, int stGrade, int stAge, int score)
        {
            Console.WriteLine($"Hello my name is {stName}");
        }
    }
}
