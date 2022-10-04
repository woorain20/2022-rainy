using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkingManagement
{
    public class DataManager
    {
        public static List<ParkingCar> Cars = new List<ParkingCar>();

        static DataManager()
        {
            Load();
        }

        public static void Load()
        {
            try
            {
                DBHelper.selectQuery();
                Cars.Clear();

                foreach (DataRow item in DBHelper.dt.Rows)
                {
                    ParkingCar car = new ParkingCar();
                    car.ParkingSpot = int.Parse(item["parkingSpot"].ToString());
                    car.carNumber = item["carNumber"].ToString();
                    car.driverName = item["driverName"].ToString();
                    car.phoneNumber = item["phoneNumber"].ToString();
                    car.parkingTime = item["parkingTime"].ToString() == "" ? new DateTime() : DateTime.Parse(item["parkingTime"].ToString());
                    Cars.Add(car);

                }
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }
        }

        public static void printLog(string contents)
        {
            DirectoryInfo di = new DirectoryInfo("ParkingHistory");

            if (di.Exists == false)
            {
                di.Create();
            }

            using (StreamWriter w = new StreamWriter("ParkingHistory\\ParkingHistory.txt", true))
            {
                w.WriteLine(contents);
            }
        }

        public static void Save(string parkingSpotText, string carNumber, string driverName, string phoneNumber, bool isRemove = false)
        {
            try
            {
                DBHelper.updateQuery(parkingSpotText, carNumber, driverName, phoneNumber, isRemove);
            }
            catch (Exception)
            {

            }
        }

        public static bool Save(string command, string parkingSpot, out string contents)
        {
            DBHelper.selectQuery(int.Parse(parkingSpot));
            contents = "";

            if (command == "insert")
            {
                return DBInsert(parkingSpot, ref contents);
            }
            else
            {
                return DBDelete(parkingSpot, ref contents);
            }
        }

        private static bool DBDelete(string parkingSpot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count != 0)
            {
                DBHelper.deleteQuery(parkingSpot);
                contents = $"주차공간 {parkingSpot}이/가 삭제되었습니다.";
                return true;
            }
            else
            {
                contents = "해당 주차 공간이 존재하지 않습니다.";
                return false;
            }
        }

        private static bool DBInsert(string parkingSpot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count == 0)
            {
                DBHelper.insertQuery(parkingSpot);
                contents = $"주차공간 {parkingSpot}이/가 추가되었습니다.";
                return true;
            }
            else
            {
                contents = "해당 주차 공간이 이미 존재합니다.";
                return false;
            }
        }
    }
}
