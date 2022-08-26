using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823
{
    public class Car
    {
        public int carNumber { get; set; }
        public int inTime { get; set; }
        public int outTime { get; set; }

        //{ get; set; } - java의 Getter, Setter랑 똑같음
        // get; set; 유래
        //그냥 public을 쓸 경우, 휴먼 오류 났을 때 예외처리 할 수 없음 그리고 외부 클래스에서 이 부분은 안 건드렸으면 할 때 그 때는 private을 적거나 아무 것도 적지 않는다

        //public int score; 참고로 아무것도 안 적으면 기본 값은 private

        //java 스타일은 Getter Setter
    }
}
