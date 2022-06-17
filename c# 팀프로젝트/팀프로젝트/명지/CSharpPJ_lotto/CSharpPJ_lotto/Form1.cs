using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CSharpPJ_lotto
{
    public partial class Form1 : Form
    {
        ///Form2 child1 = new Form2();
        //Form3 child2 = new Form3();
        //Form4 child3 = new Form4();

        public Form1()
        {
            InitializeComponent();

            panelLeft.Height = button1.Height;
            panelLeft.Top = button1.Top;
            userControl_Home1.BringToFront();
        }

        //마우스 드래그로 폼 이동하기
        private Point mousePoint; // 현재 마우스 포인터의 좌표저장 변수 선언

        // 마우스 누를때 현재 마우스 좌표를 저장한다 
        private void Form1_MouseDown(object sender, MouseEventArgs e)
        {
            mousePoint = new Point(e.X, e.Y); //현재 마우스 좌표 저장
        }

        // 마우스 왼쪽 버튼을 누르고 움직이면 폼을 이동시킨다
        private void Form1_MouseMove(object sender, MouseEventArgs e)
        {
            if ((e.Button & MouseButtons.Left) == MouseButtons.Left) //마우스 왼쪽 클릭 시에만 실행
            {
                //폼의 위치를 드래그중인 마우스의 좌표로 이동 
                Location = new Point(Left - (mousePoint.X - e.X), Top - (mousePoint.Y - e.Y));
            }
        }
        //Form2.cs [디자인] - 이벤트 - MouseDown, MouseMove 설정

        //출처: https://1dongminno1.tistory.com/8 [동민이의 개발일지:티스토리]
        //출처:https://wookoa.tistory.com/98

        private void button4_Click(object sender, EventArgs e) //종료
        {
            Application.Exit();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            panelLeft.Height = button1.Height;
            panelLeft.Top = button1.Top;

            userControl_Home1.BringToFront();

            //child1.Show();
            //child2.Hide();
            //child3.Hide();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            panelLeft.Height = button2.Height;
            panelLeft.Top = button2.Top;

            //child1.Hide();
            //child2.Show();
            //child3.Hide();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            panelLeft.Height = button3.Height;
            panelLeft.Top = button3.Top;
            
            //child1.Hide();
            //child2.Hide();
            //child3.Show();
        }
        //출처:https://youtu.be/K9Ps66GoD-k

        //private void Form1_Load(object sender, EventArgs e)
        //{
        //    child1.TopLevel = false;
        //    child2.TopLevel = false;
        //    child3.TopLevel = false;

        //    this.Controls.Add(child1);
        //    this.Controls.Add(child2);
        //    this.Controls.Add(child3);

        //    child1.Parent = this.panel3;
        //    child2.Parent = this.panel3;
        //    child3.Parent = this.panel3;

        //    // 자식 폼의 타이틀을 없앤다
        //    child1.Text = child2.Text = child3.Text = "";
        //    child1.ControlBox = child2.ControlBox = child3.ControlBox = false;
        //}
        //[Reference] : WhiteAT, 「C# .NET 자료실 - C#, Form 속에 Form 넣기 (Page형태)」 http://whiteat.com/?mid=WhiteAT_Csharp&document_srl=56999.
        //출처: https://pcsak3.com/454 [PC 싹쓸이:티스토리]
    }
}
