using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824
{
    public class Lion : Cat
    {
        public int countOfWife { get; set; }

        public void CryOut()
        {
            Console.WriteLine($"{name}이/가 우두머리인 사자무리의 암사자는 {countOfWife}마리다");
        }
    }
}
