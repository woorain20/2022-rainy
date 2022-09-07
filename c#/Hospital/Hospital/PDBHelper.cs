using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class PDBHelper
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

        public static void selectQuery(int pCode = -1)
        {
            try
            {
                ConnectDB();

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (pCode == -1)
                {
                    cmd.CommandText = "select * from Patient";
                }
                else
                {
                    cmd.CommandText = "select * from Patient " + " where Code =" + pCode;
                }

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "Patient");
                dt = ds.Tables[0];
            }
            catch (Exception)
            {

            }
        }

        public static void updateQuery(string pCode, string name, string age, string gender, string address, string phoneNum, string visit, bool isRemove)
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
                    sqlcommand = "update Patient set Name=@p1, Age=@p2, Gender=@p3, Address=@p4, PhoneNum=@p5, Visit=@p6 where Code=@p7";
                    cmd.Parameters.AddWithValue("@p1", name);
                    cmd.Parameters.AddWithValue("@p2", age);
                    cmd.Parameters.AddWithValue("@p3", gender);
                    cmd.Parameters.AddWithValue("@p4", address);
                    cmd.Parameters.AddWithValue("@p5", phoneNum);
                    cmd.Parameters.AddWithValue("@p6", visit);
                    cmd.Parameters.AddWithValue("@p7", pCode);
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

        public static void dataInsertQuery(string pCode, string name, string age, string gender, string address, string phoneNum, string visit, string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into Patient values (@p1, @p2, @p3, @p4, @p5, @p6, @p7)";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", pCode);
                cmd.Parameters.AddWithValue("@p2", name);
                cmd.Parameters.AddWithValue("@p3", age);
                cmd.Parameters.AddWithValue("@p4", gender);
                cmd.Parameters.AddWithValue("@p5", address);
                cmd.Parameters.AddWithValue("@p6", phoneNum);
                cmd.Parameters.AddWithValue("@p7", visit);
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
                sqlcommand = "delete from Patient where Code=@p1";
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

        public static void deleteQuery(string pCode)
        {
            dataDeleteQuery(pCode, "delete");
        }

        public static void insertQuery(string pCode, string name, string age, string gender, string address, string phoneNum, string visit)
        {
            dataInsertQuery(pCode, name, age, gender, address, phoneNum, visit, "insert");
        }
    }
}
