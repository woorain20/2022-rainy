using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CSharpStudy0823_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //button도 c#에서 만든 클래스
        private void button1_Click(object sender, EventArgs e)
        {
            new Form1().ShowDialog();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Cat c = new Cat();
            c.name = textBox1.Text;
            int.TryParse(textBox2.Text, out int age);
            c.age = age;

            c.meow();
            string message = c.eat();
            MessageBox.Show(message);

            Cat.jump();

            Cat c2 = new Cat();
            c2.name = textBox3.Text;
            int.TryParse(textBox4.Text, out int age2);
            c2.age = age2;

            c2.meow();
            string message2 = c2.eat();
            MessageBox.Show(message2);

            Cat.jump();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Cat c1=new Cat();
            c1.color = "red";
            c1.name = "asd";
            c1.age = 12;
            c1.test(3);
        }
    }
}
