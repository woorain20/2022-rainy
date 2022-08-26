using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace BookManagement
{
    public class DataManager
    {
        public static List<Book> books = new List<Book>();
        public static List<User> users = new List<User>();

        static DataManager()
        {
            Load();
        }

        public static void Load()
        {
            try
            {
                string booksOutput = File.ReadAllText(@"./Books.xml");
                XElement booksXEIement = XElement.Parse(booksOutput);
                books = (from item in booksXEIement.Descendants("book") select new Book()
                {
                    Isbn=item.Element("Isbn").Value,
                    name=item.Element("name").Value,
                    publisher=item.Element("publisher").Value,
                    page=int.Parse(item.Element("page").Value),
                    borrowedAt=DateTime.Parse(item.Element("borrowedAt").Value),
                    isBorrowed=item.Element("isBorrowed").Value !="0" ? true : false,
                    userId = int.Parse(item.Element("userId").Value),
                    userName = item.Element("userName").Value
                }).ToList<Book>();

                string userOutput = File.ReadAllText(@"./Users.xml");
                XElement usersXEIement = XElement.Parse(userOutput);
                users = (from item in usersXEIement.Descendants("user") select new User()
                {
                    id=int.Parse(item.Element("id").Value),
                    name=item.Element("name").Value
                }).ToList<User>();
            }
            catch (Exception exception)
            {
                System.Windows.Forms.MessageBox.Show("Warning 파일 누락");
                Save();
                Load();
            }
        }

        public static void Save()
        {
            string booksOutput = "";
            booksOutput += "<books>\n";

            foreach (var item in books)
            {
                booksOutput += "<book>\n";
                booksOutput = booksOutput + "<Isbn>" + item.Isbn + "</Isbn>\n";
                booksOutput += "<name>" + item.name + "</name>\n";
                booksOutput += "<publisher>" + item.publisher + "</publisher>\n";
                booksOutput += "<page>" + item.page + "</page\n>";
                booksOutput += "<borrowedAt>" + item.borrowedAt + "</borrowedAt>\n";
                booksOutput += "<isBorrowed>" + (item.isBorrowed ? 1 : 0) + "</isBorrowed>\n";
                booksOutput += "<userId>" + item.userId + "</userId>\n";
                booksOutput += "<userName>" + item.userName + "</userName>\n";
                booksOutput += "</book>\n";
            }
            booksOutput += "</books>";

            string usersOutput = "";
            usersOutput += "<users>\n";

            foreach (var item in users)
            {
                usersOutput += "<user>\n";
                usersOutput += "<id>" + item.id + "</id>\n";
                usersOutput += "<name>" + item.name + "</name>\n";
                usersOutput += "</user>\n";
            }
            usersOutput += "</users>";

            File.WriteAllText(@"./Books.xml", booksOutput);
            File.WriteAllText(@"./Users.xml", usersOutput);
        }
    }
}
