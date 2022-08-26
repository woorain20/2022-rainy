using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CStudy
{
    public class Student
    {
        //변수: 인스턴스 변수, 클래스 변수
        //메소드: 인스턴스 메소드, 클래스 메소드

        //static: 클래스 변수나 클래스 메소드
        public string Name { get; set; }    //인스턴스 변수

        public static int count { get; set; }   //클래스 변수

        //public 클래스명() {} <- 생성자
        //오버로딩 - 똑같은 이름의 메소드를 만드는 것(오버라이드와 헷갈리면 안 됨)
        //조건: 매개변수의 타입이나 개수가 다르면 된다.
        public Student()
        {
            count++;
        }
        public void Study()
        {
            System.Windows.Forms.MessageBox.Show(Name + " 학생은 공부한다");
        }

        public void Study(int a)
        {
            for(int i = 0; i < a; i++)
            {
                System.Windows.Forms.MessageBox.Show(Name + "의 공부");
            }
        }

        public static void ShowCount()
        {
            System.Windows.Forms.MessageBox.Show("이 학교의 인원은 " + count + " 이다.");
        }

        protected void sleep()
        {
            System.Windows.Forms.MessageBox.Show(Name + "은 잔다.");
            System.Windows.Forms.MessageBox.Show(hakbeon + "학번이 빠져가지고");
        }
    }
}
