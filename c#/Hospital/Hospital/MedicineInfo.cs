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
                textBox_Code.Text = DataManager.medicines[0].code.ToString();
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
                textBox_Code.Text = medicines.code.ToString();
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
    }
}
