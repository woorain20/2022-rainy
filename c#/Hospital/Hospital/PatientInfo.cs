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
                textBox_PCode.Text = DataManager.treatments[0].pCode.ToString();
                textBox_Name.Text = DataManager.treatments[0].pName;
                textBox_Birth.Text = DataManager.treatments[0].pBirth.ToString();
                textBox_Gender.Text = DataManager.treatments[0].pGen;
                textBox_Phone.Text = DataManager.treatments[0].pNum;
                textBox_Address.Text = DataManager.treatments[0].pAddress;
                textBox_Visit.Text = DataManager.treatments[0].pVisit.ToString();
            }
            catch (Exception)
            {

            }
            if (DataManager.treatments.Count > 0)
            {
                dataGridView_PatientList.DataSource = DataManager.treatments;
            }
        }

        private void dataGridView_PatientList_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Treat patients = dataGridView_PatientList.CurrentRow.DataBoundItem as Treat;
                textBox_PCode.Text = patients.pCode.ToString();
                textBox_Name.Text = patients.pName;
                textBox_Birth.Text=patients.pBirth.ToString("yyyy-MM-dd");
                textBox_Gender.Text = patients.pGen;
                textBox_Phone.Text = patients.pNum;
                textBox_Address.Text = patients.pAddress;
                textBox_Visit.Text = patients.pVisit.ToString("yyyy-MM-dd");
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

        private void pCode_modify(string pCode, string pName, string pGen, string pNum, string pAddress, string command)
        {
            pCode = pCode.Trim();

            string contents = "";

            DataManager.TSave(command, pCode, pName, pGen, pNum, pAddress, out contents);
            button_Reset.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void button_modify_Click(object sender, EventArgs e)
        {
            pCode_modify(textBox_PCode.Text, textBox_Name.Text, textBox_Gender.Text, textBox_Phone.Text, textBox_Address.Text, "update");
        }

        private void button_Reset_Click(object sender, EventArgs e)
        {
            DataManager.TLoad();
            dataGridView_PatientList.DataSource = null;
            if (DataManager.treatments.Count > 0)
            {
                dataGridView_PatientList.DataSource = DataManager.treatments;
            }
        }
    }
}
