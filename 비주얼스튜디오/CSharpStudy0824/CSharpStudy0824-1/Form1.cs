
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CSharpStudy0824_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Animal an = new Animal();
            an.name = "두치";
            an.age = 7;
            an.sleep();
            Animal an2 = new Animal();
            an2.name = "뿌꾸";
            an2.age = 4;
            an2.sleep();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Cat c=new Cat();
            c.name = "하나";
            c.age = 5;
            c.eyeColor = "blue";
            c.meow();
            Cat c2 = new Cat();
            c2.name = "두리";
            c2.age = 3;
            c2.eyeColor = "red";
            c2.meow();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Dog d = new Dog();
            d.name = "석삼";
            d.age = 9;
            d.hairColor = "gold";
            d.bark();
            Dog d2 = new Dog();
            d2.name = "너구리";
            d2.age = 11;
            d2.hairColor = "white & black";
            d2.bark();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Hamster ha = new Hamster();
            ha.name = "오징어";
            ha.age = 2;
            ha.species = "친칠라";
            ha.lets();
            Hamster ha2 = new Hamster();
            ha2.name = "육개장";
            ha2.age = 1;
            ha2.species = "대형";
            ha2.lets();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            Lion li = new Lion();
            li.name = "라이";
            li.age = 5;
            li.eyeColor = "brown";
            li.countOfWife = 4;
            li.CryOut();
            Lion li2 = new Lion();
            li2.name = "이언";
            li2.age = 2;
            li2.eyeColor = "red";
            li2.countOfWife = 3;
            li2.CryOut();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            Tiger t = new Tiger();
            t.name = "타이";
            t.age = 8;
            t.eyeColor = "오드아이";
            t.pattern = "좌상";
            t.fight();
            Tiger t2 = new Tiger();
            t2.name = "이거";
            t2.age = 5;
            t2.eyeColor = "blue";
            t2.pattern = "평행";
            t2.fight();
        }
    }
}
