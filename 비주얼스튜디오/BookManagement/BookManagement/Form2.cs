using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BookManagement
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
            Text = "도서 관리";

            dataGridView_Book.DataSource = DataManager.books;
            dataGridView_Book.CurrentCellChanged += dataGridView_book_CurrentCellChanged;
        }

        private void button_add_Click(object sender, EventArgs e)
        {
            try
            {
                if (DataManager.books.Exists ((x) => x.Isbn == textBox_isbn.Text))
                {
                    MessageBox.Show("이미 존재하는 도서입니다.");
                }
                else
                {
                    Book book = new Book()
                    {
                        Isbn = textBox_isbn.Text,
                        name = textBox_bookName.Text,
                        publisher = textBox_publisher.Text,
                        page = int.Parse(textBox_page.Text)
                    };
                    DataManager.books.Add(book);

                    dataGridView_Book.DataSource = null;
                    dataGridView_Book.DataSource = DataManager.books;
                    DataManager.Save();
                }
            }
            catch (Exception exception)
            {

            }
        }

        private void button_modify_Click(object sender, EventArgs e)
        {
            try
            {
                Book book = DataManager.books.Single((x) => x.Isbn == textBox_isbn.Text);
                book.name = textBox_bookName.Text;
                book.publisher = textBox_publisher.Text;
                book.page = int.Parse(textBox_page.Text);

                dataGridView_Book.DataSource = null;
                dataGridView_Book.DataSource = DataManager.books;
                DataManager.Save();
            }
            catch (Exception)
            {
                MessageBox.Show("존재하지 않는 도서입니다.");
            }
        }

        private void button_delete_Click(object sender, EventArgs e)
        {
            try
            {
                Book book = DataManager.books.Single((x) => x.Isbn == textBox_isbn.Text);
                DataManager.books.Remove(book);

                dataGridView_Book.DataSource= null;
                dataGridView_Book.DataSource = DataManager.books;
                DataManager.Save();
            }
            catch (Exception)
            {
                MessageBox.Show("존재하지 않는 도서입니다.");
            }
        }

        private void dataGridView_book_CurrentCellChanged(object sender, EventArgs e)
        {
            try
            {
                Book book = dataGridView_Book.CurrentRow.DataBoundItem as Book;
                textBox_isbn.Text = book.Isbn;
                textBox_bookName.Text = book.name;
                textBox_publisher.Text = book.publisher;
                textBox_page.Text = book.page.ToString();

            }
            catch (Exception eee)
            {

            }

        }
    }
}
