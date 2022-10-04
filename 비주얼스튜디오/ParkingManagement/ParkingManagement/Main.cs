using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ParkingManagement
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
            label_timeNow.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");

            try
            {
                textBox_parkingSpot.Text = DataManager.Cars[0].ParkingSpot.ToString();
                textBox_carNum.Text = DataManager.Cars[0].carNumber;
                textBox_driverName.Text = DataManager.Cars[0].driverName;
                textBox_phoneNum.Text = DataManager.Cars[0].phoneNumber;   

                textBox_findNum.Text = textBox_parkingSpot.Text;

                textBox_costSpot.Text = textBox_parkingSpot.Text;
                textBox_findCost.Text = "";
            }
            catch (Exception)
            {

            }
            if (DataManager.Cars.Count > 0)
            {
                dataGridView_parkingManagement.DataSource = DataManager.Cars;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox_parkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("주차 공간을 입력하세요(주차)");
            }
            else if (textBox_parkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("차량 번호를 입력하세요");
            }
            else
            {
                try
                {
                    ParkingCar car = DataManager.Cars.Single(x => x.ParkingSpot.ToString() == textBox_parkingSpot.Text);

                    if (car.carNumber.Trim() != "")
                    {
                        MessageBox.Show("해당 공간엔 이미 차가 있습니다.");
                    }
                    else
                    {
                        car.carNumber = textBox_carNum.Text;
                        car.driverName = textBox_driverName.Text;
                        car.phoneNumber = textBox_phoneNum.Text;
                        car.parkingTime = DateTime.Now;

                        dataGridView_parkingManagement.DataSource = null;
                        dataGridView_parkingManagement.DataSource = DataManager.Cars;

                        DataManager.Save(textBox_parkingSpot.Text, textBox_carNum.Text, textBox_driverName.Text, textBox_phoneNum.Text);
                        string contents = $"주차공간 {textBox_parkingSpot.Text}에" + $"{textBox_carNum.Text}차를 주차했습니다.";
                        writeLog(contents);
                        MessageBox.Show(contents);
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간 {textBox_parkingSpot.Text}은/는 없습니다.");
                }
            }
        }

        private void writeLog(string contents)
        {
            string logContents = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss tt")}]{contents}";
            DataManager.printLog(logContents);
            listBox_log.Items.Insert(0, logContents);
        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label_timeNow.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
        }

        private void button_remove_Click(object sender, EventArgs e)
        {
            if (textBox_parkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("주차 공간을 입력하세요(출차)");
            }
            else
            {
                try
                {
                    ParkingCar car = DataManager.Cars.Single(x => x.ParkingSpot.ToString() == textBox_parkingSpot.Text);
                    if (car.carNumber.Trim() == "")
                    {
                        MessageBox.Show("해당 공간엔 아직 차가 없습니다.");
                    }
                    else
                    {
                        string oldCar = car.carNumber;
                        car.carNumber = "";
                        car.driverName = "";
                        car.phoneNumber = "";
                        car.parkingTime = new DateTime();

                        dataGridView_parkingManagement.DataSource = null;
                        dataGridView_parkingManagement.DataSource = DataManager.Cars;

                        DataManager.Save(textBox_parkingSpot.Text, "", "", "", false);
                        string contents = $"주차공간 {textBox_parkingSpot.Text}에" + $"{oldCar}차를 출차했습니다.";
                        writeLog(contents);
                        MessageBox.Show(contents);
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간 {textBox_parkingSpot.Text}은/는 없습니다.");
                }
            }
        }

        private void dataGridView_parkingManagement_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                //내가 클릭한 행(=row)의 데이터들을 ParkingCar로 형변환 한 것(as = 형변환 키워드)
                ParkingCar car = dataGridView_parkingManagement.CurrentRow.DataBoundItem as ParkingCar;
                textBox_parkingSpot.Text = car.ParkingSpot.ToString();
                textBox_carNum.Text = car.carNumber;
                textBox_driverName.Text = car.driverName;
                textBox_phoneNum.Text = car.phoneNumber;
                textBox_findNum.Text = car.ParkingSpot.ToString();
            }
            catch (Exception)
            {

            }
        }

        private string lookUpParkingSpot(int parkingSpot)
        {
            string parkedCarNum = "";
            try
            {
                foreach (var item in DataManager.Cars)
                {
                    if (item.ParkingSpot == parkingSpot)
                    {
                        parkedCarNum = item.carNumber;
                        break;
                    }
                }
            }
            catch (Exception)
            {

            }
            return parkedCarNum;
        }

        private void button_find_Click(object sender, EventArgs e)
        {
        }

        private void button_refresh_Click(object sender, EventArgs e)
        {
        }

        private void spot_add_delete(string parkingSpot, string command)
        {
            parkingSpot = parkingSpot.Trim();
            int.TryParse(parkingSpot, out int pSpot);
            if (pSpot <= 0)
            {
                writeLog("주차 공간 번호는 0이상의 숫자여야 합니다.");
                MessageBox.Show("주차 공간 번호는 0이상의 숫자여야 합니다.");
                return;
            }
            string contents = "";

            bool check = DataManager.Save(command, parkingSpot, out contents);

            if (check)
            {
                button_refresh.PerformClick();
            }
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void button_add_Click(object sender, EventArgs e)
        {
        }

        private void button_delete_Click(object sender, EventArgs e)
        {
        }

        private void button_findCost_Click(object sender, EventArgs e)
        {
            if (textBox_costSpot.Text.Trim() == "")
            {
                MessageBox.Show("주차 공간을 입력하세요");
            }
            else
            {
                try
                {
                    ParkingCar car = DataManager.Cars.Single(x => x.ParkingSpot.ToString() == textBox_parkingSpot.Text);
                    TimeSpan duration = DateTime.Now - car.parkingTime;
                    int totalTime=(int)duration.TotalMinutes;
                    if(totalTime < 30)
                    {
                        int charge = 2000;
                        textBox_findCost.Text = $"{charge}원";
                    }
                    else
                    {
                        int addTime = (totalTime - 30) / 10;
                        int addCharge = addTime * 200;
                        int charge = 2000 + addCharge;
                    }
                }
                catch (Exception)
                {

                }

            }
        }

        private void button_add_Click_1(object sender, EventArgs e)
        {
            spot_add_delete(textBox_findNum.Text, "insert");
        }

        private void button_delete_Click_1(object sender, EventArgs e)
        {
            spot_add_delete(textBox_findNum.Text, "delete");
        }

        private void button_find_Click_1(object sender, EventArgs e)
        {
            try
            {
                int parkingSpot = int.Parse(textBox_findNum.Text);
                string parkingCar = lookUpParkingSpot(parkingSpot);
                string contents = "";
                if (parkingCar.Trim() != "")
                {
                    contents = $"주차공간 {parkingSpot}에 주차된 차는 {parkingCar}입니다.";
                }
                else
                {
                    contents = $"주차공간 {parkingSpot}에 차가 없습니다.";
                }
                writeLog(contents);
                MessageBox.Show(contents);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button_refresh_Click_1(object sender, EventArgs e)
        {
            DataManager.Load();
            dataGridView_parkingManagement.DataSource = null;
            if (DataManager.Cars.Count > 0)
            {
                dataGridView_parkingManagement.DataSource = DataManager.Cars;
            }
        }
    }
}
