using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Human h = new Human();
            h.name = "Tom";
            h.age = 25;
            h.sleep();

            Student s=new Student();
            s.score = 50;
            s.stName = "Tom";
            s.stNum = 11;
            s.stGrade = 7;
            s.stAge = 17;
            s.study(6, "Jack", 6, 16, 70);

            Worker w = new Worker();
            w.pay = 300;
            w.work();

            Dog ddd=new Dog();
            ddd.name = "멍뭉";
            ddd.bark();
            ddd.sleep();

            Cat cat=new Cat();
            cat.name = "냥이";
            cat.age = 5;
            cat.color = "치즈";
            cat.meow();
            cat.eat();
            Cat.jump();

            Cat cat1 = new Cat();
            cat1.name = "등어";
            cat1.age = 8;
            cat1.color = "고등어";
            cat1.meow();
            cat1.eat();
            Cat.jump();

            Car c=new Car();
            Car c2 = new Car();

            c.carNumber = 9284;
            c2.carNumber = 2123;

            //c와 c2는 서로 다른 자동차
            //carNumber를 같게 할 순 있지만 저장된 메모리가 달라서 서로 다른 변수임 완전히 똑같이 만들 순 있음

            Dog d=new Dog();
            d.age = 17;
            d.name = "니니"; // age, name은 Dog.cs에서 옴
            d.number = "2004";
            d.code = "maltize"; // number, code는 Dog2.cs에서 옴

            Dog d2=new Dog();
            d2.age = 1;
            d2.name = "꼬꼬";
            d2.number = "1997";
            d2.code = "chiwawa";

            Dog.species = "반려견";

            //인스턴스 변수
            //d와 d2에 들어가 있는 값이 다를 수 있다. d의 age와 d2의 age가 다르듯

            //클래스 변수
            //모든 클래스 가 다 같은 값을 가짐 여기선 Dog의 species 값을 모두 공유하는 공통된 값이다. 

            //여러 개의 숫자를 저장하는 list
            List<int> numbers = new List<int>();
            numbers.Add(10);
            numbers.Add(5);
            numbers.Add(7);

            //여러 개의 Dog를 저장하는 list
            List<Dog> dogs = new List<Dog>();
            dogs.Add(d);
            dogs.Add(d2);
            dogs.Add(new Dog());
            dogs[2].age = 20;
            dogs[2].name = "부스";
            dogs[2].number = "1989";
            dogs[2].code = "mix";


            //1. 숫자만 저장하는 리스트에 값 추가
            List<int> mynumbers = new List<int>();
            mynumbers.Add(10);
            mynumbers.Add(9);
            Console.WriteLine("숫자 하나 입력하세요");
            int num = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());
            mynumbers.Add(num);
            mynumbers.Add(num2);
            foreach (var item in mynumbers)
            {
                Console.WriteLine(item);
            }

            //2. 개만 저장하는 리스트에 값 추가
            List<Dog> mydogs = new List<Dog>();
            Dog md = new Dog();
            md.age = 5;
            md.name = "멍멍이";
            md.number = "01";
            md.code = "m01";
            mydogs.Add(md);

            mydogs.Add(new Dog() {age=10, name="뽀삐", number="02", code="m02" });

            Console.WriteLine("개 이름");
            string dogname = Console.ReadLine();
            Console.WriteLine("개 나이");
            int dog_age = int.Parse(Console.ReadLine());
            Console.WriteLine("개 번호");
            string dognum = Console.ReadLine();
            Console.WriteLine("개 코드");
            string dogcode=Console.ReadLine();

            Dog temp = new Dog();
            temp.name = dogname;
            temp.age = dog_age;
            temp.number = dognum;
            temp.code = dogcode;

            //3. 입력한 숫자 삭제하기
            Console.WriteLine("삭제하고 싶은 숫자 입력");
            int n = int.Parse(Console.ReadLine());
            mynumbers.Remove(n);

            //4. 입력한 나이 개 삭제하기
            Console.WriteLine("삭제하고 싶은 dog 나이");
            n=int.Parse(Console.ReadLine());

            //removeAt 이용
            //보통 뭔가 삭제할 때 역for문 쓴다
            for(int i = mydogs.Count - 1; i >= 0 ; i--)
            {
                if (mydogs[i].age == n)
                {
                    mydogs.RemoveAt(i);
                }
            }
            Console.WriteLine("또 다른 dog 나이");
            n = int.Parse(Console.ReadLine());
            //remove 이용
            for (int i = mydogs.Count - 1; i >= 0; i--)
            {
                if (mydogs[i].age == n)
                {
                    //변수 t가 mydogs의 i번째랑 완전히 동일
                    Dog t = mydogs[i];
                    //remove는 해당 객체를 직접 적어야 함
                    mydogs.Remove(t);

                    //만약 new 키워드 이용해서 인스턴스를 만들고 그걸 대입했다면 삭제가 안 됨
                }
            }

            foreach(var item in mynumbers)
            {
                Console.WriteLine(item);
            }
            foreach (var item in mydogs)
            {
                Dog mydog = item as Dog;
                Console.WriteLine(mydog.name + "_" + mydog.age);
            }
        }
    }
}
