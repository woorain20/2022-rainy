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
    public partial class PatientInfo : Form
    {
        public PatientInfo()
        {
            InitializeComponent();

            try
            {
                textBox_PCode.Text = DataManager.patients[0].pCode.ToString();
                textBox_Name.Text = DataManager.patients[0].name;
                textBox_Age.Text = DataManager.patients[0].age.ToString();
                textBox_Gender.Text = DataManager.patients[0].gender;
                textBox_Phone.Text = DataManager.patients[0].phoneNum;
                textBox_Adress.Text = DataManager.patients[0].address;
                textBox_Visit.Text = DataManager.patients[0].visit.ToString();
                textBox_Prosc.Text = DataManager.charts[0].pDiagnosis;
            }
            catch (Exception)
            {

            }
            if (DataManager.patients.Count > 0)
            {
                dataGridView_PatientList.DataSource = DataManager.patients;
            }
        }

        private void dataGridView_PatientList_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Patient patients = dataGridView_PatientList.CurrentRow.DataBoundItem as Patient;
                textBox_PCode.Text = patients.pCode.ToString();
                textBox_Name.Text = patients.name;
                textBox_Age.Text = patients.age.ToString();
                textBox_Gender.Text = patients.gender;
                textBox_Phone.Text = patients.phoneNum;
                textBox_Adress.Text = patients.address;
                textBox_Visit.Text = patients.visit.ToString();
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
    }
}
