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
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
            Text = "사용자관리";

            dataGridView_User.DataSource = DataManager.users;
            dataGridView_User.CurrentCellChanged += DataGridView_User_CurrentCellChanged;

            button_add.Click += (sender, e) =>
            {
                try
                {
                    if (DataManager.users.Exists((x) => x.id == int.Parse(textBox_id.Text)))
                    {
                        MessageBox.Show("사용자 ID가 겹칩니다.");
                    }
                    else
                    {
                        User user = new User()
                        {
                            id = int.Parse(textBox_id.Text),
                            name = textBox_name.Text
                        };
                        DataManager.users.Add(user);

                        dataGridView_User.DataSource = null;
                        dataGridView_User.DataSource = DataManager.users;
                        DataManager.Save();
                    }
                }
                catch (Exception)
                {

                }
            };
            button_modify.Click += (sender, e) =>
            {
                try
                {
                    User user=DataManager.users.Single((x) => x.id == int.Parse(textBox_id.Text));
                    user.name = textBox_name.Text;
                   
                    try
                    {
                        Book book=DataManager.books.Single((x)=>x.userId == int.Parse(textBox_id.Text));
                        book.userName = textBox_name.Text;
                    }
                    catch (Exception)
                    {

                    }
                    dataGridView_User.DataSource=null;
                    dataGridView_User.DataSource = DataManager.users;
                    DataManager.Save();
                }
                catch (Exception exception)
                {
                    MessageBox.Show("존재하지 않는 사용자입니다." + Environment.NewLine+ exception.GetType()+ Environment.NewLine + exception.Message + Environment.NewLine + exception.StackTrace);
                }
            };
            button_delete.Click += (sender, e) =>
            {
                try
                {
                    User user = DataManager.users.Single((x) => x.id == int.Parse(textBox_id.Text));
                    DataManager.users.Remove(user);

                    dataGridView_User.DataSource = null;
                    dataGridView_User.DataSource = DataManager.users;
                    DataManager.Save();
                }
                catch (Exception)
                {
                    MessageBox.Show("존재하지 않는 사용자입니다.");
                }
            };
        }

        private void DataGridView_User_CurrentCellChanged(object sender, EventArgs e)
        {
            try
            {
                User user = dataGridView_User.CurrentRow.DataBoundItem as User;
                textBox_id.Text = user.id.ToString();
                textBox_name.Text = user.name;
            }
            catch (Exception ee)
            {

            }
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}
