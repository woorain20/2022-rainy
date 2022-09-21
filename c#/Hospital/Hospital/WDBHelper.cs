using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class WDBHelper
    {
        private static SqlConnection conn = new SqlConnection();
        public static SqlDataAdapter da;
        public static DataSet ds;
        public static DataTable dt;

        public static void ConnectDB()
        {
            conn.ConnectionString = String.Format("Data Source=({0});" + "initial Catalog={1};" + "integrated Security={2};" + "Timeout=3", "local", "Hospital", "SSPI");
            conn = new SqlConnection(conn.ConnectionString);
            conn.Open();
        }

        public static void selectQuery(int chartNum = -1)
        {
            try
            {
                ConnectDB();

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (chartNum == -1)
                {
                    cmd.CommandText = "select * from Waiting";
                }
                else
                {
                    cmd.CommandText = "select * from Waiting " + " where ChartNum =" + chartNum;
                }

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "Waiting");
                dt = ds.Tables[0];
            }
            catch (Exception)
            {

            }
            finally
            {
                conn.Close();
            }
        }

        public static void updateQuery(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, bool isRemove)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                string sqlcommand = "";

                if (!isRemove)
                {
                    sqlcommand = "update Waiting set Code=@p1, Name=@p2, Birth=@p3, Gender=@p4, Phone=@p5, Address=@p6 where ChartNum=@p7";
                    cmd.Parameters.AddWithValue("@p1", pCode);
                    cmd.Parameters.AddWithValue("@p2", pName);
                    cmd.Parameters.AddWithValue("@p3", pBirth);
                    cmd.Parameters.AddWithValue("@p4", pGen);
                    cmd.Parameters.AddWithValue("@p5", pNum);
                    cmd.Parameters.AddWithValue("@p6", pAddress);
                    cmd.Parameters.AddWithValue("@p7", chartNum);
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

        public static void dataInsertQuery(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into Waiting values (@p1, @p2, @p3, @p4, @p5, @p6, @p7)";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", chartNum);
                cmd.Parameters.AddWithValue("@p2", pCode);
                cmd.Parameters.AddWithValue("@p3", pName);
                cmd.Parameters.AddWithValue("@p4", pBirth);
                cmd.Parameters.AddWithValue("@p5", pGen);
                cmd.Parameters.AddWithValue("@p6", pNum);
                cmd.Parameters.AddWithValue("@p7", pAddress);
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

        public static void dataDeleteQuery(string pCode, string command)
        {
            string sqlcommand = "";
            if (command == "delete")
            {
                sqlcommand = "delete from Waiting where Code=@p1";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", pCode);
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

        public static void dataUpdateQuery(string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string command)
        {
            string sqlcommand = "";
            if (command == "update")
            {
                sqlcommand = "update Waiting set Name=@p1, Birth=@p2, Gender=@p3, Phone=@p4, Address=@p5 where Code=@p6";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", pName);
                cmd.Parameters.AddWithValue("@p2", pBirth);
                cmd.Parameters.AddWithValue("@p3", pGen);
                cmd.Parameters.AddWithValue("@p4", pNum);
                cmd.Parameters.AddWithValue("@p5", pAddress);
                cmd.Parameters.AddWithValue("@p6", pCode);
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

        public static void deleteQuery(string pCode)
        {
            dataDeleteQuery(pCode, "delete");
        }
        public static void updateQuery(string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress)
        {
            dataUpdateQuery(pCode, pName, pBirth, pGen, pNum, pAddress, "update");
        }

        public static void insertQuery(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress)
        {
            dataInsertQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, "insert");
        }
    }
}
