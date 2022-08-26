using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824
{
    public class Cat : Animal
    {
        public string eyeColor { get; set; }

        public void meow()
        {
            Console.WriteLine($"{name} 이름의 가진 고양이과 동물은 {eyeColor} 눈을 가졌다.");
        }
    }
}
