using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkingManagement
{
    public class DBHelper
    {
        private static SqlConnection conn = new SqlConnection();
        public static SqlDataAdapter da;
        public static DataSet ds;
        public static DataTable dt;

        public static void ConnectDB()
        {
            conn.ConnectionString = String.Format("Data Source=({0});" + "initial Catalog={1};" + "integrated Security={2};" + "Timeout=3", "local", "MYDB_Park", "SSPI");
            conn = new SqlConnection(conn.ConnectionString);
            conn.Open();
        }

        public static void selectQuery(int parkingSpot = -1)
        {
            try
            {
                ConnectDB();

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (parkingSpot == -1)   //매개변수 없이 selectQuery 실행
                {
                    cmd.CommandText = "select * from Parking";
                }
                else  //그게 아닌 경우는 특정 주차 공간 번호의 정보 조회
                {
                    cmd.CommandText = "select * from Parking " + " where parkingSpot =" + parkingSpot;
                }

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "Parking");
                dt = ds.Tables[0];
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
                return;
            }
            finally //try catch를 실행하든 안 하든 무조건 실행
            {
                conn.Close();
            }
        }

        public static void updateQuery(string parkingSpotText, string carNum, string driverName, string phoneNum, bool isRemove)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";

                if (isRemove) //출차
                {
                    sqlcommand = "update parking set carnum='', drivername='', parkingtime=null, where parkingspot=@p1";
                    cmd.Parameters.AddWithValue("@p1", parkingSpotText);
                }
                else
                {
                    sqlcommand = "update parking set carnum=@p1, drivername=@p2, phonenum=@p3, parkingtime=@p4, where parkingspot=@p5";
                    cmd.Parameters.AddWithValue("@p1", carNum);
                    cmd.Parameters.AddWithValue("@p2", driverName);
                    cmd.Parameters.AddWithValue("@p3", phoneNum);
                    cmd.Parameters.AddWithValue("@p4", DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff"));
                    cmd.Parameters.AddWithValue("@p5", parkingSpotText);
                }
                cmd.CommandText = sqlcommand;
                cmd.ExecuteNonQuery();
            }
            catch (Exception)
            {

            }
            finally
            {
                conn.Close();
            }
        }

        public static void executeQuery(string parkingSpot, string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into parking(parkingSpot) values (@p1)";
            }
            else
            {
                sqlcommand = "delete from parking where parkingSpot=@p1";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", parkingSpot);
                cmd.CommandText = sqlcommand;
                cmd.ExecuteNonQuery();
            }
            catch (Exception)
            {

            }
            finally
            {
                conn.Close();
            }
        }

        public static void deleteQuery(string parkingSpot)
        {
            executeQuery(parkingSpot, "delete");
        }

        public static void insertQuery(string parkingSpot)
        {
            executeQuery(parkingSpot, "insert");
        }
    }
}
