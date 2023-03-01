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
    public partial class ManagerInfo : Form
    {
        public ManagerInfo()
        {
            InitializeComponent();
            try
            {
                textBox_Id.Text = DataManager.managers[0].id.ToString();
                textBox_Password.Text = DataManager.managers[0].password;
                textBox_Name.Text = DataManager.managers[0].name;
                textBox_Position.Text = DataManager.managers[0].position;
            }
            catch (Exception)
            {

            }
            if (DataManager.managers.Count > 0)
            {
                dataGridView_ManagerList.DataSource = DataManager.managers;
            }
        }

        private void dataGridView_ManagerList_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Manager managers = dataGridView_ManagerList.CurrentRow.DataBoundItem as Manager;
                textBox_Id.Text = managers.id.ToString();
                textBox_Password.Text = managers.password;
                textBox_Name.Text = managers.name;
                textBox_Position.Text = managers.position;
            }
            catch (Exception)
            {

            }
        }
        private void writeLog(String contents)
        {
            string logContents = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss tt")}]{contents}";
            DataManager.printLog(logContents);
        }

        private void id_delete(string id, string command)
        {
            id = id.Trim();

            string contents = "";

            DataManager.Save(command, id, out contents);
            button_Refresh.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }        
        
        private void id_add(string id, string password, string name, string position, string command)
        {
            id = id.Trim(); 
            int.TryParse(id, out int pId);
            string contents = "";
            string used = lookUpId(int.Parse(id));
            if (pId <= 1000)
            {
                writeLog("관리자 번호는 1000이상의 숫자여야 합니다.");
                MessageBox.Show("관리자 번호는 1000이상의 숫자여야 합니다.");
                return;
            }

            if (id == used)
            {
                writeLog($"관리자 번호 {id}가 이미 존재합니다.");
                MessageBox.Show($"관리자 번호 {id}가 이미 존재합니다.");
                return;
            }
            else
            {
                DataManager.Save(command, id, password, name, position, out contents);
                button_Refresh.PerformClick();
                MessageBox.Show(contents);
                writeLog(contents);
            }
        }

        private string lookUpId(int id)
        {
            string usedId="";
            try
            {
                foreach (var item in DataManager.managers)
                {
                    if (item.id == id)
                    {
                        usedId = item.id.ToString();
                        break;
                    }
                }
            }
            catch (Exception)
            {

            }
            return usedId;
        }

        private void button_Add_Click(object sender, EventArgs e)
        {
            id_add(textBox_Id.Text, textBox_Password.Text, textBox_Name.Text, textBox_Position.Text, "insert");
        }

        private void button_Modify_Click(object sender, EventArgs e)
        {
            
        }

        private void button_Delete_Click(object sender, EventArgs e)
        {
            id_delete(textBox_Id.Text, "delete");
        }

        private void button_Refresh_Click(object sender, EventArgs e)
        {
            DataManager.Load();
            dataGridView_ManagerList.DataSource = null;
            if (DataManager.managers.Count > 0)
            {
                dataGridView_ManagerList.DataSource = DataManager.managers;
            }
        }

        private void dataGridView_ManagerList_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
