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
    public partial class MedicineInfo : Form
    {
        public MedicineInfo()
        {
            InitializeComponent();

            try
            {
                textBox_Code.Text = DataManager.medicines[0].code;
                textBox_Name.Text = DataManager.medicines[0].name;
                textBox_Amount.Text = DataManager.medicines[0].amount.ToString();
            }
            catch (Exception)
            {

            }
            if (DataManager.medicines.Count > 0)
            {
                dataGridView_MedicineList.DataSource = DataManager.medicines;
            }
        }

        private void dataGridView_MedicineList_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                Medicine medicines = dataGridView_MedicineList.CurrentRow.DataBoundItem as Medicine;
                textBox_Code.Text = medicines.code;
                textBox_Name.Text = medicines.name;
                textBox_Amount.Text = medicines.amount.ToString();
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

        private void code_delete(string code, string command)
        {
            code = code.Trim();

            string contents = "";

            DataManager.MSave(command, code, out contents);
            button_refresh.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void code_modify(string code, string amount, string command)
        {
            code = code.Trim();

            string contents = "";

            DataManager.MSave(command, code, amount, out contents);
            button_refresh.PerformClick();
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void code_add(string code, string name, string amount, string command)
        {
            code = code.Trim();
            int.TryParse(code, out int pCode);
            string contents = "";
            string used = lookUpId(int.Parse(code));
            if (pCode <= 3000)
            {
                writeLog("의약품 번호는 3000이상의 숫자여야 합니다.");
                MessageBox.Show("의약품 번호는 3000이상의 숫자여야 합니다.");
                return;
            }

            if (code == used)
            {
                writeLog($"의약품 번호 {code}가 이미 존재합니다.");
                MessageBox.Show($"의약품 번호 {code}가 이미 존재합니다.");
                return;
            }
            else
            {
                DataManager.MSave(command, code, name, amount, out contents);
                button_refresh.PerformClick();
                MessageBox.Show(contents);
                writeLog(contents);
            }
        }

        private string lookUpId(int code)
        {
            string usedCode = "";
            try
            {
                foreach (var item in DataManager.medicines)
                {
                    if (item.code == code.ToString())
                    {
                        usedCode = item.code.ToString();
                        break;
                    }
                }
            }
            catch (Exception)
            {

            }
            return usedCode;
        }

        private void button_Add_Click(object sender, EventArgs e)
        {
            code_add(textBox_Code.Text, textBox_Name.Text, textBox_Amount.Text, "insert");
        }

        private void button_modify_Click(object sender, EventArgs e)
        {
            code_modify(textBox_Code.Text, textBox_Amount.Text, "update");
        }

        private void button_Delete_Click(object sender, EventArgs e)
        {
            code_delete(textBox_Code.Text, "delete");
        }

        private void button_refresh_Click(object sender, EventArgs e)
        {
            DataManager.MLoad();
            dataGridView_MedicineList.DataSource = null;
            if (DataManager.medicines.Count > 0)
            {
                dataGridView_MedicineList.DataSource = DataManager.medicines;
            }
        }
    }
}
