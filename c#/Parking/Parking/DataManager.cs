using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parking
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
                    car.ParkingSpot = int.Parse(item["ParkingSpot"].ToString());
                    car.CarNum = item["CarNum"].ToString();
                    car.DriverName = item["DriverName"].ToString();
                    car.PhoneNum = item["PhoneNum"].ToString();
                    car.ParkingTime = item["ParkingTime"].ToString() == "" ? new DateTime() : DateTime.Parse(item["ParkingTime"].ToString());
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

        public static void Save(string ParkingSpotText, string CarNum, string DriverName, string PhoneNum, bool isRemove = false)
        {
            try
            {
                DBHelper.updateQuery(ParkingSpotText, CarNum, DriverName, PhoneNum, isRemove);
            }
            catch (Exception)
            {

            }
        }

        public static bool Save(string command, string ParkingSpot, out string contents)
        {
            DBHelper.selectQuery(int.Parse(ParkingSpot));
            contents = "";

            if (command == "insert")
            {
                return DBInsert(ParkingSpot, ref contents);
            }
            else
            {
                return DBDelete(ParkingSpot, ref contents);
            }
        }

        private static bool DBDelete(string ParkingSpot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count != 0)
            {
                DBHelper.deleteQuery(ParkingSpot);
                contents = $"주차공간 {ParkingSpot}이/가 삭제되었습니다.";
                return true;
            }
            else
            {
                contents = "해당 주차 공간이 존재하지 않습니다.";
                return false;
            }
        }

        private static bool DBInsert(string ParkingSpot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count == 0)
            {
                DBHelper.insertQuery(ParkingSpot);
                contents = $"주차공간 {ParkingSpot}이/가 추가되었습니다.";
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
