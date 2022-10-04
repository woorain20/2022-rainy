using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Parking
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
         
            try
            {
                textBox_ParkingSpot.Text = DataManager.Cars[0].ParkingSpot.ToString();
                textBox_CarNum.Text = DataManager.Cars[0].CarNum;
                textBox_DriverName.Text = DataManager.Cars[0].DriverName;
                textBox_PhoneNum.Text = DataManager.Cars[0].PhoneNum;

                textBox_FindSpot.Text = textBox_ParkingSpot.Text;
                textBox_CostSpot.Text = textBox_ParkingSpot.Text;
            }
            catch (Exception)
            {

            }
            if (DataManager.Cars.Count > 0)
            {
                dataGridView_ParkingManager.DataSource = DataManager.Cars;
            }
        }

        private void label_Now_Click(object sender, EventArgs e)
        {

        }

        private void timer_Now_Tick(object sender, EventArgs e)
        {
            label_Now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초 tt");
        }

        private void button_Parking_Click(object sender, EventArgs e)
        {
            if (textBox_ParkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("주차 공간을 입력하세요(주차)");
            }
            else if (textBox_ParkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("차량 번호를 입력하세요");
            }
            else
            {
                try
                {
                    ParkingCar car = DataManager.Cars.Single(x => x.ParkingSpot.ToString() == textBox_ParkingSpot.Text);

                    if (car.CarNum.Trim() != "")
                    {
                        MessageBox.Show("해당 공간엔 이미 차가 있습니다.");
                    }
                    else
                    {
                        car.CarNum = textBox_CarNum.Text;
                        car.DriverName = textBox_DriverName.Text;
                        car.PhoneNum = textBox_PhoneNum.Text;
                        car.ParkingTime = DateTime.Now;

                        dataGridView_ParkingManager.DataSource = null;
                        dataGridView_ParkingManager.DataSource = DataManager.Cars;

                        DataManager.Save(textBox_ParkingSpot.Text, textBox_CarNum.Text, textBox_DriverName.Text, textBox_PhoneNum.Text);
                        string contents = $"주차공간 {textBox_ParkingSpot.Text}에" + $"{textBox_CarNum.Text}차를 주차했습니다.";
                        writeLog(contents);
                        MessageBox.Show(contents);
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간 {textBox_ParkingSpot.Text}은/는 없습니다.");
                }
            }
        }

        private void writeLog(string contents)
        {
            string logContents = $"[{DateTime.Now.ToString("yyyy/MM/dd hh:mm:ss tt")}]{contents}";
            DataManager.printLog(logContents);
            listBox_log.Items.Insert(0, logContents);
        }

        private void button_Remove_Click(object sender, EventArgs e)
        {
            if (textBox_ParkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("주차 공간을 입력하세요(출차)");
            }
            else
            {
                try
                {
                    ParkingCar car = DataManager.Cars.Single(x => x.ParkingSpot.ToString() == textBox_ParkingSpot.Text);
                    if (car.CarNum.Trim() == "")
                    {
                        MessageBox.Show("해당 공간엔 아직 차가 없습니다.");
                    }
                    else
                    {
                        string oldCar = car.CarNum;
                        int basicCharge = 2000;
                        TimeSpan duration = DateTime.Now - car.ParkingTime;
                        int durationM = (int)duration.TotalMinutes;
                        int totalCharge = basicCharge + ((durationM - 30) / 10) * 200;
                        car.CarNum = "";
                        car.DriverName = "";
                        car.PhoneNum = "";
                        car.ParkingTime = new DateTime();

                        dataGridView_ParkingManager.DataSource = null;
                        dataGridView_ParkingManager.DataSource = DataManager.Cars;

                        if (durationM <= 30)
                        {
                            DataManager.Save(textBox_ParkingSpot.Text, "", "", "", false);
                            string contents = $"주차공간 {textBox_ParkingSpot.Text}에 {oldCar}차를 출차했습니다. 요금은 {basicCharge}원입니다.";
                            writeLog(contents);
                            MessageBox.Show(contents);
                        }
                        else
                        {
                            DataManager.Save(textBox_ParkingSpot.Text, "", "", "", false);
                            string contents = $"주차공간 {textBox_ParkingSpot.Text}에 {oldCar}차를 출차했습니다. 요금은 {totalCharge}원입니다.";
                            writeLog(contents);
                            MessageBox.Show(contents);
                        }
                       
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간 {textBox_ParkingSpot.Text}은/는 없습니다.");
                }
            }
        }

        private void dataGridView_ParkingManager_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {    
                ParkingCar car = dataGridView_ParkingManager.CurrentRow.DataBoundItem as ParkingCar;
                textBox_ParkingSpot.Text = car.ParkingSpot.ToString();
                textBox_CarNum.Text = car.CarNum;
                textBox_DriverName.Text = car.DriverName;
                textBox_PhoneNum.Text = car.PhoneNum;
                textBox_FindSpot.Text = car.ParkingSpot.ToString();
                textBox_CostSpot.Text = car.ParkingSpot.ToString();
            }
            catch (Exception)
            {

            }
        }

        private void button_Check_Click(object sender, EventArgs e)
        {
            try
            {
                int parkingSpot = int.Parse(textBox_FindSpot.Text);
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

        private string lookUpParkingSpot(int parkingSpot)
        {
            string parkedCarNum = "";
            try
            {
                foreach (var item in DataManager.Cars)
                {
                    if (item.ParkingSpot == parkingSpot)
                    {
                        parkedCarNum = item.CarNum;
                        break;
                    }
                }
            }
            catch (Exception)
            {

            }
            return parkedCarNum;
        }

        private void button_Add_Click(object sender, EventArgs e)
        {
            spot_add_delete(textBox_FindSpot.Text, "insert");
        }

        private void button_Delete_Click(object sender, EventArgs e)
        {
            spot_add_delete(textBox_FindSpot.Text, "delete");
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
                button_Refresh.PerformClick();
            }
            MessageBox.Show(contents);
            writeLog(contents);
        }

        private void button_Refresh_Click(object sender, EventArgs e)
        {
            DataManager.Load();
            dataGridView_ParkingManager.DataSource = null;
            if (DataManager.Cars.Count > 0)
            {
                dataGridView_ParkingManager.DataSource = DataManager.Cars;
            }
        }

        private void button_Cost_Click(object sender, EventArgs e)
        {
            try
            {
                ParkingCar car = DataManager.Cars.Single(x => x.ParkingSpot.ToString() == textBox_ParkingSpot.Text);
                int parkingSpot = int.Parse(textBox_CostSpot.Text);
                string parkingCar = lookUpParkingSpot(parkingSpot);
                string contents = "";
                int basicCharge = 2000;
                TimeSpan duration = DateTime.Now - car.ParkingTime;
                int durationM=(int)duration.TotalMinutes;
                int totalCharge=basicCharge+((durationM-30)/10)*200;
                if (parkingCar.Trim() != "")
                {
                    if (durationM <= 30)
                    {
                        textBox_Cost.Text = $"{basicCharge}원";
                        MessageBox.Show($"현재 요금은 {basicCharge}원 입니다.");
                        writeLog($"현재 요금은 {basicCharge}원 입니다.");
                    }
                    else
                    {
                        textBox_Cost.Text = $"{totalCharge}원";
                        MessageBox.Show($"현재 요금은 {totalCharge}원 입니다.");
                        writeLog($"현재 요금은 {totalCharge}원 입니다.");
                    }
                }
                else
                {
                    textBox_Cost.Text = null;
                    contents = "해당 공간에 차가 없습니다.";
                    MessageBox.Show(contents);
                    writeLog(contents);
                }
            }
            catch (Exception ex)
            {
                
            }
            
        }

        private void dataGridView_ParkingManager_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
        }
    }
}
