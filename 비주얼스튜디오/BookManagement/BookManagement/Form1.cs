using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BookManagement
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            Text = "도서관 관리";

            label_allBookCount.Text=DataManager.books.Count.ToString();
            label_allUserCount.Text=DataManager.users.Count.ToString();
            label_allBorrowedBook.Text = DataManager.books.Where((x) => x.isBorrowed).Count().ToString();
            label_allDelayedBook.Text = DataManager.books.Where((x) =>
            {
                return x.isBorrowed && x.borrowedAt.AddDays(7) < DateTime.Now;
            }).Count().ToString();

            dataGridView_bookManager.DataSource=DataManager.books;
            dataGridView_userManager.DataSource=DataManager.users;
            dataGridView_bookManager.CurrentCellChanged += DataGridView_bookManager_CurrentCellChanged;
        }

        private void DataGridView_bookManager_CurrentCellChanged(object sender, EventArgs e)
        {
            try
            {
                Book book = dataGridView_bookManager.CurrentRow.DataBoundItem as Book;
                //Book book2 = (Book)dataGridView_BookManager.CurrentRow.DataBoundItem;
                textBox_isbn.Text = book.Isbn;
                textBox_bookName.Text = book.name;
            }
            catch (Exception)
            {

            }
        }

        private void dataGridView_UserManager_CurrentCellChanged(object sender, EventArgs e)
        {
            try
            {
                User user = dataGridView_userManager.CurrentRow.DataBoundItem as User;
                textBox_id.Text = user.id.ToString();
            }
            catch (Exception)
            {

            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button_borrow_Click(object sender, EventArgs e)
        {
            if (textBox_isbn.Text.Trim() == "")
            {
                MessageBox.Show("Isbn을 입력해주세요");
            }
            else if (textBox_id.Text.Trim() == "")
            {
                MessageBox.Show("사용자 id를 입력해주세요");
            }
            else
            {
                try
                {
                    Book book = DataManager.books.Single((x) => x.Isbn.ToString() == textBox_isbn.Text);
                    if (book.isBorrowed)
                    {
                        MessageBox.Show("이미 대여 중인 도서입니다.");
                    }
                    else
                    {
                        User user=DataManager.users.Single((x)=>x.id.ToString()==textBox_id.Text);
                        book.userId = user.id;
                        book.userName = user.name;
                        book.isBorrowed = true;
                        book.borrowedAt = DateTime.Now;

                        dataGridView_bookManager.DataSource = null;
                        dataGridView_bookManager.DataSource = DataManager.books;
                        DataManager.Save();

                        MessageBox.Show("\"" + book.name + "\"이/가\"" + user.name + "\"님께 대여되었습니다.");
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show("존재하지 않는 도서 또는 사용자입니다.");
                }
            }
        }

        private void button_return_Click(object sender, EventArgs e)
        {
            if (textBox_isbn.Text.Trim() == "")
            {
                MessageBox.Show("Isbn을 입력해주세요");
            }
            else
            {
                try
                {
                    Book book = DataManager.books.Single((x) => x.Isbn.ToString() == textBox_isbn.Text);
                    if (book.isBorrowed)
                    {
                        DateTime oldDay = book.borrowedAt;
                        book.userId = 0;
                        book.name = "";
                        book.isBorrowed = false;
                        book.borrowedAt=new DateTime();

                        dataGridView_bookManager.DataSource = null;
                        dataGridView_bookManager.DataSource= DataManager.books;
                        DataManager.Save();

                        TimeSpan timeDiff=DateTime.Now - oldDay;
                        int diffDays=timeDiff.Days;

                        if(diffDays > 7)
                        {
                            MessageBox.Show("\"" + book.name + "\"이/가 연체 상태로 반납되었습니다.");
                        }
                        else
                        {
                            MessageBox.Show("\"" + book.name + "\"이/가 반납되었습니다.");
                        }
                    }
                    else
                    {
                        MessageBox.Show("대여상태가 아닙니다.");
                    }
                }
                catch (Exception)
                {

                }
            }
        }

        private void 도서관리ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                //new Form2().ShowDialog();
                Form2 temp=new Form2();
                temp.ShowDialog();
                DataManager.Load();
                dataGridView_bookManager.DataSource = null;
                dataGridView_bookManager.DataSource = DataManager.books;
            }
            catch (IndexOutOfRangeException ie)
            {

            }
            catch (Exception ex)
            {

            }
        }

        private void 사용자관리ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                new Form3().ShowDialog();
                DataManager.Load();
                dataGridView_userManager.DataSource = null;
                dataGridView_userManager.DataSource= DataManager.users;
                dataGridView_bookManager.DataSource = null;
                dataGridView_bookManager.DataSource = DataManager.books;
            }
            catch (IndexOutOfRangeException ie)
            {

            }
            catch (Exception exception)
            {

            }
        }

        private void dataFileBackUp(string folderName)
        {
            DirectoryInfo di = new DirectoryInfo(folderName);
            if (!di.Exists)
            {
                di.Create();
            }
            string fileName_book = "Books.xml";
            string fileName_user = "Users.xml";
            string sourcePath = @",";
            string targetPath = @".\" + folderName;

            string sourceFile = Path.Combine(sourcePath, fileName_book);
            string destFile = Path.Combine(targetPath, fileName_book);
            File.Copy(sourceFile, destFile, true);

            sourceFile = Path.Combine(sourcePath, fileName_user);
            destFile = Path.Combine(targetPath, fileName_user);
            File.Copy(sourceFile, destFile, true);
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            try
            {
                dataFileBackUp("backupWhenLoad");
            }
            catch (Exception execption)
            {

            }
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            try
            {
                dataFileBackUp("backupWhenClose");
            }
            catch (Exception execp)
            {

            }
        }
    }
}
