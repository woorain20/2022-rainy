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
        public string doc = "";

        public Main()
        {
            InitializeComponent();
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
            this.Shown += Login_Show;
            textBox_Hospital.Text = "히포크라테스 병원";

            try
            {
                textBox_ChartNum.Text = DataManager.treatments[0].chartNum.ToString();
                textBox_Pcode.Text = DataManager.treatments[0].pCode.ToString();
                textBox_PName.Text = DataManager.treatments[0].pName;
                textBox_PBirth.Text = DataManager.treatments[0].pBirth.ToString();
                textBox_PGen.Text= DataManager.treatments[0].pGen;
                textBox_PPnum.Text= DataManager.treatments[0].pNum;
                textBox_PAddress.Text= DataManager.treatments[0].pAddress;
                textBox_PVisit.Text= DataManager.treatments[0].pVisit.ToString();
                textBox_PDia.Text = DataManager.treatments[0].pDiagnosis;
                textBox_PMedic.Text = DataManager.treatments[0].pMedicine;
            }
            catch (Exception)
            {
                
            }
            if (DataManager.medicines.Count > 0)
            {
                dataGridView_Medicine.DataSource = DataManager.medicines;
            }
            if (DataManager.treatments.Count > 0)
            {
                dataGridView_Treat.DataSource = DataManager.treatments;
            }
            if(DataManager.waitings.Count > 0)
            {
                dataGridView_Patient.DataSource = DataManager.waitings;
            }
        }

        private void Login_Show(object sender, EventArgs e)
        {
            textBox_Doctor.Text = doc;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
        }

        private void 환자정보ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                PatientInfo paif = new PatientInfo();
                paif.ShowDialog();
                DataManager.TLoad();
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
                DataManager.MLoad();
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

        private void dataGridView_Medicine_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Medicine medicines = dataGridView_Medicine.CurrentRow.DataBoundItem as Medicine;
                textBox_MedCode.Text = medicines.code;
                textBox_MedName.Text = medicines.name;
                textBox_MedAmount.Text = medicines.amount.ToString();
            }
            catch (Exception)
            {
                
            }
        }

        private void dataGridView_Patient_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Waiting wait = dataGridView_Patient.CurrentRow.DataBoundItem as Waiting;
                Treat treatments = dataGridView_Treat.CurrentRow.DataBoundItem as Treat;
                textBox_ChartNum.Text = wait.ChartNum.ToString();
                textBox_Pcode.Text = wait.Code.ToString();
                textBox_PName.Text = wait.Name;
                textBox_PBirth.Text = wait.Birth.ToString("yyyy-MM-dd");
                textBox_PGen.Text = wait.Gender;
                textBox_PPnum.Text = wait.Phone;
                textBox_PAddress.Text = wait.Address;
                textBox_PDia.Text = "";
                textBox_PMedic.Text = "";
                textBox_PVisit.Text = "";

                textBox_Chart.Text = wait.ChartNum.ToString();
                textBox_Code.Text = wait.Code.ToString();
                textBox_Name.Text = wait.Name;
                textBox_Birth.Text = wait.Birth.ToString("yyyy-MM-dd");
                textBox_Gen.Text = wait.Gender;
                textBox_Phone.Text = wait.Phone;
                textBox_Address.Text = wait.Address;
                textBox_Visit.Text = "";
                textBox_Pros.Text = "";

            }
            catch (Exception)
            {

            }
        }

        private void dataGridView_Treat_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Treat treatments = dataGridView_Treat.CurrentRow.DataBoundItem as Treat;         
                textBox_ChartNum.Text = treatments.chartNum.ToString();
                textBox_Pcode.Text = treatments.pCode.ToString();
                textBox_PName.Text = treatments.pName;
                textBox_PBirth.Text = treatments.pBirth.ToString("yyyy-MM-dd");
                textBox_PGen.Text = treatments.pGen;
                textBox_PPnum.Text = treatments.pNum;
                textBox_PAddress.Text = treatments.pAddress;
                textBox_PDia.Text = treatments.pDiagnosis;
                textBox_PMedic.Text = treatments.pMedicine.ToString();
                textBox_PVisit.Text = treatments.pVisit.ToString("yyyy-MM-dd");

                textBox_Chart.Text = treatments.chartNum.ToString();
                textBox_Code.Text = treatments.pCode.ToString() ;
                textBox_Name.Text = treatments.pName;
                textBox_Birth.Text = treatments.pBirth.ToString("yyyy-MM-dd");
                textBox_Gen.Text = treatments.pGen;
                textBox_Phone.Text = treatments.pNum;
                textBox_Address.Text = treatments.pAddress;
                textBox_Visit.Text = treatments.pVisit.ToString("yyyy-MM-dd");
                textBox_Pros.Text = treatments.pDiagnosis;
            }
            catch (Exception)
            {
                
            }
        }

        private void dataGridView_Treat_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void treat_add(string pCode, string pVisit, string pDiagnosis, string pMedicine, string command)
        {
            medic_modify(textBox_MedCode.Text, int.Parse(textBox_MedAmount.Text), int.Parse(textBox_MedUsed.Text), "update");

            pCode = pCode.Trim();

            string contents = "";

            DataManager.TSave(command, pCode, pVisit, pDiagnosis, pMedicine, out contents);
            button_Reset.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void button_Add_Click(object sender, EventArgs e)
        {
            wait_delete(textBox_Code.Text, "delete");        
        }

        private void button_Reset_Click(object sender, EventArgs e)
        {
            textBox_Chart.Text = "";
            textBox_Code.Text = "";
            textBox_Name.Text = "";
            textBox_Birth.Text = "";
            textBox_Gen.Text = "";
            textBox_Phone.Text = "";
            textBox_Visit.Text = "";
            textBox_Address.Text = "";
            textBox_Pros.Text = "";
            textBox_Medic.Text = "";
            textBox_MedCode.Text = "";
            textBox_MedName.Text = "";
            textBox_MedAmount.Text = "";
            textBox_MedUsed.Text = "";

            DataManager.TLoad();
            DataManager.WLoad();
            DataManager.MLoad();
            dataGridView_Treat.DataSource = null;
            dataGridView_Patient.DataSource = null;
            dataGridView_Medicine.DataSource = null;
            if (DataManager.treatments.Count > 0)
            {
                dataGridView_Treat.DataSource = DataManager.treatments;
            }
            if (DataManager.waitings.Count > 0)
            {
                dataGridView_Patient.DataSource = DataManager.waitings;
            }
            if (DataManager.medicines.Count > 0)
            {
                dataGridView_Medicine.DataSource = DataManager.medicines;
            }
        }

        private void medic_modify(string code, int amount, int use, string command)
        {
            code = code.Trim();
            string contents = "";

            DataManager.MSave(command, code, amount, use, out contents);
            button_Reset.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void wait_delete(string pCode, string command)
        {
            treat_add(textBox_Code.Text, textBox_Visit.Text, textBox_Pros.Text, textBox_MedName.Text, "update");
            pCode = pCode.Trim();

            string contents = "";

            DataManager.WSave(command, pCode, out contents);
            button_Reset.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

    }
}
