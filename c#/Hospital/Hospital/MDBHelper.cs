using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class MDBHelper
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

        public static void selectQuery(int code = -1)
        {
            try
            {
                ConnectDB();

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (code == -1)
                {
                    cmd.CommandText = "select * from Medicine";
                }
                else
                {
                    cmd.CommandText = "select * from Medicine " + " where Code =" + code;
                }

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "Medicine");
                dt = ds.Tables[0];
            }
            catch (Exception)
            {

            }
        }

        public static void updateQuery(string code, string name, string amount, bool isRemove)
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
                    sqlcommand = "update Medicine set Name=@p1, Amount=@p2 where Code=@p3";
                    cmd.Parameters.AddWithValue("@p1", name);
                    cmd.Parameters.AddWithValue("@p2", amount);
                    cmd.Parameters.AddWithValue("@p3", code);
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

        public static void dataInsertQuery(string code, string name, string amount, string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into Medicine values (@p1, @p2, @p3)";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", code);
                cmd.Parameters.AddWithValue("@p2", name);
                cmd.Parameters.AddWithValue("@p3", amount);
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

        public static void dataDeleteQuery(string code, string command)
        {
            string sqlcommand = "";
            if (command == "delete")
            {
                sqlcommand = "delete from Medicine where Code=@p1";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", code);
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

        public static void dataUpdateQuery(string code, string amount, string command)
        {
            string sqlcommand = "";
            if (command == "update")
            {
                sqlcommand = "update Medicine set Amount=@p1 where Code=@p2";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", amount);
                cmd.Parameters.AddWithValue("@p2", code);
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

        public static void deleteQuery(string code)
        {
            dataDeleteQuery(code, "delete");
        }

        public static void updateMQuery(string code, string amount)
        {
            dataUpdateQuery(code, amount, "update");
        }

        public static void insertQuery(string code, string name, string amount)
        {
            dataInsertQuery(code, name, amount, "insert");
        }
    }
}
