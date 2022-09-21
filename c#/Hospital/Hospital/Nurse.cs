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
    public partial class Nurse : Form
    {
        public Nurse()
        {
            InitializeComponent();
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
            this.textBox_Finder.KeyDown += button_Find_KeyDown;

            try
            {
                textBox_Finder.Text = DataManager.treatments[0].pName;
                textBox_ChartNum.Text = DataManager.treatments[0].chartNum.ToString();
                textBox_Pcode.Text = DataManager.treatments[0].pCode.ToString();
                textBox_PName.Text = DataManager.treatments[0].pName;
                textBox_PBirth.Text = DataManager.treatments[0].pBirth.ToString();
                textBox_PGen.Text = DataManager.treatments[0].pGen;
                textBox_PPnum.Text = DataManager.treatments[0].pNum;
                textBox_PAddress.Text = DataManager.treatments[0].pAddress;
                textBox_PVisit.Text = DataManager.treatments[0].pVisit.ToString();
                textBox_PDia.Text = DataManager.treatments[0].pDiagnosis;
                textBox_PMed.Text = DataManager.treatments[0].pMedicine;
            }
            catch (Exception)
            {

            }

            if (DataManager.medicines.Count > 0)
            {
                dataGridView_Medic.DataSource = DataManager.medicines;
            }
            if (DataManager.waitings.Count > 0)
            {
                dataGridView_Waiting.DataSource = DataManager.waitings;
            }
            if (DataManager.treatments.Count > 0)
            {
                dataGridView_Find.DataSource = DataManager.treatments;
            }
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

        private void 의약품정보ToolStripMenuItem_Click(object sender, EventArgs e)
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

        private void timer1_Tick(object sender, EventArgs e)
        {
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
        }

        private void writeLog(String contents)
        {
            string logContents = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss tt")}]{contents}";
            DataManager.printLog(logContents);
        }

        private void button_Find_Click(object sender, EventArgs e)
        {
            dataGridView_Find.DataSource = null;
            find_name(textBox_Finder.Text);
            dataGridView_Find.DataSource = DataManager.treatments;
        }

        private void button_Find_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                button_Find_Click(sender, e);
            }
        }

        private void button_Reset_Click(object sender, EventArgs e)
        {
            DataManager.TLoad();
            dataGridView_Find.DataSource = null;
            if (DataManager.treatments.Count > 0)
            {
                dataGridView_Find.DataSource = DataManager.treatments;
            }
        }

        private void button_Regist_Click(object sender, EventArgs e)
        {
            treat_new(textBox_ChartNum.Text, textBox_Pcode.Text, textBox_PName.Text, textBox_PBirth.Text, textBox_PGen.Text, textBox_PPnum.Text, textBox_PAddress.Text, textBox_PVisit.Text, textBox_PDia.Text, textBox_PMed.Text, "insert");
        }

        private void button_Receipt_Click(object sender, EventArgs e)
        {
            wait_new(textBox_ChartNum.Text, textBox_Pcode.Text, textBox_PName.Text, textBox_PBirth.Text, textBox_PGen.Text, textBox_PPnum.Text, textBox_PAddress.Text, "insert");
        }

        private void button_Cancel_Click(object sender, EventArgs e)
        {
            wait_delete(textBox_Pcode.Text, "delete");
        }

        private void button_Refresh_Click(object sender, EventArgs e)
        {
            DataManager.TLoad();
            DataManager.WLoad();
            dataGridView_Find.DataSource = null;
            dataGridView_Waiting.DataSource = null;
            if (DataManager.waitings.Count > 0)
            {
                dataGridView_Waiting.DataSource = DataManager.waitings;
            }
            if (DataManager.treatments.Count > 0)
            {
                dataGridView_Find.DataSource = DataManager.treatments;
            }
        }

        private void dataGridView_Find_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Treat treatments = dataGridView_Find.CurrentRow.DataBoundItem as Treat;
                textBox_ChartNum.Text = treatments.chartNum.ToString();
                textBox_Pcode.Text = treatments.pCode.ToString();
                textBox_PName.Text = treatments.pName;
                textBox_PBirth.Text = treatments.pBirth.ToString("yyyy-MM-dd");
                textBox_PGen.Text = treatments.pGen;
                textBox_PPnum.Text = treatments.pNum;
                textBox_PAddress.Text = treatments.pAddress;
                textBox_PVisit.Text = treatments.pVisit.ToString("yyyy-MM-dd");
                textBox_PDia.Text = treatments.pDiagnosis;
                textBox_PMed.Text = treatments.pMedicine;
            }
            catch (Exception)
            {
                
            }
        }

        private string lookUpChartNum(int chartNum)
        {
            string usedChartNum = "";
            try
            {
                foreach (var item in DataManager.treatments)
                {
                    if (item.chartNum == int.Parse(chartNum.ToString()))
                    {
                        usedChartNum = item.chartNum.ToString();
                        break;
                    }
                }
            }
            catch (Exception)
            {
                
            }
            return usedChartNum;
        }

        private string lookUppCode(int pCode)
        {
            string usedpCode = "";
            try
            {
                foreach (var item in DataManager.treatments)
                {
                    if (item.pCode == int.Parse(pCode.ToString()))
                    {
                        usedpCode = item.pCode.ToString();
                        break;
                    }
                }
            }
            catch (Exception)
            {
                
            }
            return usedpCode;
        }

        private void find_name(string pName)
        {
            //pName = pName.Trim();
            if (pName == textBox_Finder.Text)
            {
                DataManager.FindLoad(pName);
                MessageBox.Show($"{pName} 환자를 찾았습니다.");
                writeLog($"{pName} 환자를 찾았습니다.");
            }
            else
            {
                writeLog($"{pName} 환자는 존재하지 않습니다.");
                MessageBox.Show($"{pName} 환자는 존재하지 않습니다.");
            }
        }

        private void treat_new(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string pVisit, string pDiagnosis, string pMedicine, string command)
        {
            chartNum = chartNum.Trim();
            int.TryParse(chartNum, out int pChartNum);
            int.TryParse(pCode, out int ppCode);
            string contents = "";
            string usedcn = lookUpChartNum(int.Parse(chartNum));
            string usedco = lookUppCode(int.Parse(pCode));
            if (pChartNum >= 10000)
            {
                if (ppCode >= 5000)
                {

                }
                else
                {
                    writeLog("환자 번호는 5000이상의 숫자여야 합니다.");
                    MessageBox.Show("환자 번호는 5000이상의 숫자여야 합니다.");
                    return;
                }
            }
            else
            {
                writeLog("차트 번호는 10000이상의 숫자여야 합니다.");
                MessageBox.Show("차트 번호는 10000이상의 숫자여야 합니다.");
                return;
            }

            if (chartNum == usedcn)
            {
                writeLog($"차트 번호 {chartNum}가 이미 존재합니다.");
                MessageBox.Show($"차트 번호 {chartNum}가 이미 존재합니다.");
                return;
            }
            else if (pCode == usedco)
            {
                writeLog($"환자 번호 {pCode}가 이미 존재합니다.");
                MessageBox.Show($"환자 번호 {pCode}가 이미 존재합니다.");
                return;
            }
            else
            {
                DataManager.TSave(command, chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, pVisit, pDiagnosis, pMedicine, out contents);
                button_Refresh.PerformClick();
                MessageBox.Show(contents);
                writeLog(contents);
            }
        }

        private void wait_new(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string command)
        {
            chartNum = chartNum.Trim();

            string contents = "";

            DataManager.WSave(command, chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, out contents);
            button_Refresh.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void wait_delete(string pCode, string command)
        {
            pCode = pCode.Trim();

            string contents = "";

            DataManager.WSave(command, pCode, out contents);
            button_Refresh.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

    }
}
