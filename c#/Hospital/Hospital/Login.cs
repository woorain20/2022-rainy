using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Hospital
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
        }

        private void timer_Now_Tick(object sender, EventArgs e)
        {
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
        }

        private void textBox_Id_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox_Password_TextChanged(object sender, EventArgs e)
        {

        }

        private void button_Login_Click(object sender, EventArgs e)
        {
            if(textBox_Id.Text.Trim() == "")
            {
                MessageBox.Show("ID를 입력해주세요.");
            }
            else
            {
                try
                {
                    Manager manage=DataManager.managers.Single(x => x.id.ToString() == textBox_Id.Text);
                    if (textBox_Password.Text.Trim() == "")
                    {
                        MessageBox.Show("비밀번호를 입력해주세요.");
                    }
                    else
                    {
                        if (manage.id==int.Parse(textBox_Id.Text))
                        {
                            if(manage.password==textBox_Password.Text)
                            {
                                if (manage.position == "간호사")
                                {
                                    MessageBox.Show($"{manage.name}님 환영합니다.");
                                    Nurse nurse = new Nurse();
                                    nurse.ShowDialog();
                                    DataManager.Load();
                                    textBox_Id.Text = "";
                                    textBox_Password.Text = "";
                                }
                                else
                                {
                                    MessageBox.Show($"{manage.name}님 환영합니다.");
                                    Main main = new Main();
                                    main.doc = manage.name;
                                    main.ShowDialog();
                                    DataManager.Load();
                                    textBox_Id.Text = "";
                                    textBox_Password.Text = "";
                                }

                            }
                            else
                            {
                                MessageBox.Show("비밀번호가 다릅니다.");
                            }
                        }
                        else
                        {
                            MessageBox.Show("존재하지 않는 ID입니다.");
                        }
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"ID와 비밀번호가 올바르지 않습니다.");
                }
            }

        }
    }
}
