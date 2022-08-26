using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824
{
    public class Animal
    {
        public string name { get; set; }
        public int age { get; set; }

        public void sleep()
        {
            Console.WriteLine($"{name} is sleeping");
        }
    }
}
