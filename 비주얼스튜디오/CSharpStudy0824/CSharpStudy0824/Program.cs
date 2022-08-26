using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0824
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region MyRegion

            Human h =new Human();
            h.name = "Tom";
            h.age = 1;
            h.sleep();            

            Student s=new Student();
            s.name = "Jack";
            s.age = 21;
            s.sleep();  //name age, sleep은 Human에서 상속
            s.score = 80;
            s.study(4);            

            Worker w=new Worker();
            w.name = "Danny";
            w.age = 35;
            w.sleep();
            //pay값이 정해진 전후 work 출력 비교
            int money = w.work();   //이 때는 w.pay=0
            Console.WriteLine("money="+money);
            w.pay = 7000;
            money=w.work(); //pay가 정해진 시점의 돈
            Console.WriteLine("money="+money);

            Console.WriteLine("=======================");
            Human h2 = new Human();
            h2.name = "Dan";
            h2.age = 14;
            Human h3= new Human();
            h3.name = "Aaron";
            h3.age = 19;

            Student s2 = new Student();
            s2.name = "Frank";
            s2.age = 27;
            s2.score = 75;
            Student s3 = new Student();
            s3.name = "Steven";
            s3.age = 32;
            s3.score = 85;

            Worker w2 = new Worker();
            w2.name = "Henry";
            w2.age = 25;
            w2.pay = 25000;            
            Worker w3 = new Worker();
            w3.name = "Harry";
            w3.age = 22;
            w3.pay = 500;

            List<Human>hms=new List<Human>();
            hms.Add(h);
            hms.Add(h2);
            hms.Add(h3);
            List<Student>sts=new List<Student>();
            sts.Add(s);
            sts.Add(s2);
            sts.Add(s3);
            List<Worker>wks=new List<Worker>();
            wks.Add(w);
            wks.Add(w2);
            wks.Add(w3);

            foreach(var item in hms)
            {
                item.sleep();
            }
            foreach (var item in sts)
            {
                item.sleep();
                item.study(3);
            }
            foreach (var item in wks)
            {
                item.sleep();
                int mymoney = item.work();
                Console.WriteLine(mymoney);
            }

            //다형성을 활용하면 1개의 foreach문, 1개의 list에 9개의 데이터 모두 넣을 수 있음
            //다형성: 다양한 형태를 띌 가능성으로 왼쪽은 조상클래스 오른쪽은 왼쪽의 자손이어야 함
            Human ex1 = new Student();
            Human ex2 = new Worker();

            //ex1, ex2 모두 Human 타입의 변수이며 오른쪽 부분이 자손 클래스 그래서 자손으로 형변환이 가능함
            //즉 인스턴스는 자손 클래스로 만들어짐
            ((Student)ex1).study(4);
            (ex1 as Student).sleep();

            //영어로 치면 is 법칙 성립
            //Student is Human / Worker is Human 오른쪽꺼 is 왼쪽꺼

            List<Human>people=new List<Human>(){ h, h2, h3, s, s2, s3, w, w2, w3};

            foreach (var item in people)
            {
                item.sleep();
                if(item is Student)
                {
                    (item as Student).study(1);
                }
                if(item is Worker)
                {
                    int m = (item as Worker).work();
                    Console.WriteLine(m);
                }
            }
            #endregion

            List<Animal> ani = new List<Animal>();

            Animal an = new Animal();
            an.name = "두치";
            an.age = 7;           
            Animal an2 = new Animal();
            an2.name = "뿌꾸";
            an2.age = 4;

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

            Dog d=new Dog();
            d.name = "석삼";
            d.age = 9;
            d.hairColor = "gold";
            d.bark();
            Dog d2=new Dog();
            d2.name = "너구리";
            d2.age = 11;
            d2.hairColor = "white & black";
            d2.bark();

            Hamster ha = new Hamster();
            ha.name = "오징어";
            ha.age = 2;
            ha.species = "친칠라";            
            Hamster ha2 = new Hamster();
            ha2.name = "육개장";
            ha2.age = 1;
            ha2.species = "대형";

            Lion li=new Lion();
            li.name = "라이";
            li.age = 5;
            li.eyeColor = "brown";
            li.countOfWife = 4;
            li.CryOut();            
            Lion li2=new Lion();
            li2.name = "이언";
            li2.age = 2;
            li2.eyeColor = "red";
            li2.countOfWife = 3;
            li2.CryOut();

            Tiger t = new Tiger();
            t.name = "타이";
            t.age = 8;
            t.eyeColor = "오드아이";
            t.pattern = "좌상";
            t.fight();
            Tiger t2=new Tiger();
            t2.name = "이거";
            t2.age = 5;
            t2.eyeColor = "blue";
            t2.pattern = "평행";
            t2.fight();

            List<Animal> animals = new List<Animal>() { an,an2,c,c2,d,d2,ha,ha2,li,li2,t,t2};
            foreach (var item in animals)
            {
                item.sleep();
                if (item is Cat)
                {
                    (item as Cat).meow();
                    if(item is Lion)
                    {
                        ((Lion)item).meow();
                        (item as Lion).CryOut();                        
                    }
                    if(item is Tiger)
                    {
                        ((Tiger)item).meow();
                        (item as Tiger).fight();
                    }
                }
                if (item is Dog)
                {
                    (item as Dog).bark();
                }
                if( item is Hamster)
                {
                    ((Hamster)item).lets();
                }
            }
        }
    }
}
