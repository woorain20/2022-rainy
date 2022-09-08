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
    public partial class Main : Form
    {
        
        public Main()
        {
            InitializeComponent();
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
            Manager mn = new Manager();
            label_Manage.Text = lookUser(mn.id);
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
        }

        private string lookUser(int id)
        {
            string user = "";
            try
            {
                foreach (var item in DataManager.managers)
                {
                    if (item.id == id)
                    {
                        user = item.name.ToString();
                        break;
                    }
                }
            }
            catch (Exception)
            {

            }
            return user;
        }

        private void 환자정보ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                PatientInfo paif = new PatientInfo();
                paif.ShowDialog();
                DataManager.PLoad();
                //dataGridView_Patient.DataSource = null;
                //dataGridView_Patient.DataSource = DataManager.patients;
            }
            catch (IndexOutOfRangeException ie)
            {

            }
            catch (Exception ex)
            {

            }
        }

        private void 약품정보ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                MedicineInfo meif = new MedicineInfo();
                meif.ShowDialog();
                DataManager.Load();
                //dataGridView_PatientList.DataSource = null;
                //dataGridView_PatientList.DataSource = DataManager.medicines;
            }
            catch (IndexOutOfRangeException ie)
            {

            }
            catch (Exception ex)
            {

            }
        }

        private void 대기자ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                WaitInfo waif = new WaitInfo();
                waif.ShowDialog();
                DataManager.Load();
                //dataGridView_PatientList.DataSource = null;
                //dataGridView_PatientList.DataSource = DataManager.waitings;
            }
            catch (IndexOutOfRangeException ie)
            {

            }
            catch (Exception ex)
            {

            }
        }

        private void 관리자정보ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                ManagerInfo maif = new ManagerInfo();
                maif.ShowDialog();
                DataManager.Load();
                //dataGridView_PatientList.DataSource = null;
                //dataGridView_PatientList.DataSource = DataManager.waitings;
            }
            catch (IndexOutOfRangeException ie)
            {

            }
            catch (Exception ex)
            {

            }
        }

        private void writeLog(String contents)
        {
            string logContents = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss tt")}]{contents}";
            DataManager.printLog(logContents);
        }
    }
}
