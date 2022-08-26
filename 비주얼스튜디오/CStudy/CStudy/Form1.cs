using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CStudy
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        int abs_multipl(string a1, string a2)
        {
            int a = int.Parse(a1);
            int b = int.Parse(a2);

            if (a < 0)
            {
                a *= -1;
            }
            if (b < 0)
            {
                b *= -1;
            }
            return a*b;
        }

        void abs_multi(string a1, string a2)
        {
            //값을 어딘가에 주진 않고 여기서 자체적으로 바로 메시지박스를 띄워버림
            //받은 값들을 곱해서....
            //tryparse의 경우 숫자 외에는 0으로 저장
            int.TryParse(a1, out int a);
            int.TryParse(a2, out int b);
            MessageBox.Show("Test => " + (a * b));
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("" + int.Parse(textBox1.Text) * int.Parse(textBox2.Text));
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("" + abs_multipl(textBox1.Text,textBox2.Text));
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Random r = new Random();
            MessageBox.Show("Test: " + r.Next());

            abs_multi(textBox1.Text,textBox2.Text);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Student s1 = new Student();
            s1.Name = textBox3.Text;
            s1.Study();     //static없는 애들(인스턴스 메소드, 인스턴스 변수)
            //new 키워드를 통해서 인스턴스를 만든 다음에서야 사용 가능

            //static 붙은 것(클래스 메소드나 클래스 변수 모두..)
            //클래스이름.메소드명() 혹은 변수 바로 적을 수 있다.
            Student.ShowCount();

            Student s2 = new Student();
            s2.Name = s1.Name + "짱짱맨";
            s2.Study();

            Student.ShowCount();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            EliteStudent student = new EliteStudent();
            student.Name = textBox4.Text;
            student.hakbeon = textBox5.Text;

            student.Study();
            //student.대학생활();
        }
    }
}
