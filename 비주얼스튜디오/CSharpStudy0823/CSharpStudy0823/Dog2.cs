using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823
{
    public partial class Dog
    {
        //생성자는 아무것도 안 적으면 아래와 같이 아무 것도 없는 생성자가 자동으로 만들어져 있다.
        public Dog()
        {

        }

        public string number { get; set; }

        public string code { get; set; }


        //종 이름
        //앞에 static이 붙어서 모든 Dog에서 공통적으로 쓰임
        //static이 붙은 것을 클래스 변수 안 붙으면 인스턴스 변수
        public static string species { get; set; }
    }
}
