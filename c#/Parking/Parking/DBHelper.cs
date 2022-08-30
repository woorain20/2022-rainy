using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parking
{
    public class DBHelper
    {
        private static SqlConnection conn = new SqlConnection();
        public static SqlDataAdapter da;
        public static DataSet ds;
        public static DataTable dt;

        public static void ConnectDB()
        {
            conn.ConnectionString = String.Format("Data Source=({0});" + "initial Catalog={1};" + "integrated Security={2};" + "Timeout=3", "local", "MYPARKING", "SSPI");
            conn = new SqlConnection(conn.ConnectionString);
            conn.Open();
        }

        internal static void selectQuery(int ParkingSpot=-1 )
        {
            try
            {
                ConnectDB();

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (ParkingSpot == -1) 
                {
                    cmd.CommandText = "select * from ParkingManager";
                }
                else 
                {
                    cmd.CommandText = "select * from ParkingManager " + " where ParkingSpot =" + ParkingSpot;
                }

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "ParkingManager");
                dt = ds.Tables[0];
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
                return;
            }
            finally
            {
                conn.Close();
            }
        }

        public static void updateQuery(string ParkingSpotText, string CarNum, string DriverName, string PhoneNum, bool isRemove)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";

                if (isRemove)
                {
                    sqlcommand = "update ParkingManager set CarNum='', DriverName='', ParkingTime=null, where Parkingspot=@p1";
                    cmd.Parameters.AddWithValue("@p1", ParkingSpotText);
                }
                else
                {
                    sqlcommand = "update ParkingManager set CarNum=@p1, DriverName=@p2, PhoneNum=@p3, ParkingTime=@p4 where Parkingspot=@p5";
                    cmd.Parameters.AddWithValue("@p1", CarNum);
                    cmd.Parameters.AddWithValue("@p2", DriverName);
                    cmd.Parameters.AddWithValue("@p3", PhoneNum);
                    cmd.Parameters.AddWithValue("@p4", DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff"));
                    cmd.Parameters.AddWithValue("@p5", ParkingSpotText);
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

        public static void deleteQuery(string parkingSpot)
        {
            executeQuery(parkingSpot, "delete");
        }

        private static void executeQuery(string ParkingSpot, string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into parkingManager(parkingSpot) values (@p1)";
            }
            else
            {
                sqlcommand = "delete from parkingManager where parkingSpot=@p1";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", ParkingSpot);
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

        public static void insertQuery(string parkingSpot)
        {
            executeQuery(parkingSpot, "insert");
        }
    }
}
