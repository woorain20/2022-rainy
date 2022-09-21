using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class DBHelper
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

        public static void selectQuery(int id=-1)
        {
            try
            {
                ConnectDB();

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if (id == -1)
                {
                    cmd.CommandText = "select * from HospitalManage order by Id";
                }
                else
                {
                    cmd.CommandText = "select * from HospitalManage " + " where Id =" + id;
                }

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "HospitalManage");
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

        public static void updateQuery(string idText, string password, string name, string position, bool isRemove)
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
                    sqlcommand = "update HospitalManage set Password=@p1, Name=@p2, Position=@p3 where Id=@p4";
                    cmd.Parameters.AddWithValue("@p1", password);
                    cmd.Parameters.AddWithValue("@p2", name);
                    cmd.Parameters.AddWithValue("@p3", position);
                    cmd.Parameters.AddWithValue("@p4", idText);
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

        public static void dataInsertQuery(string id, string password, string name, string position, string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into HospitalManage values (@p1, @p2, @p3, @p4)";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", id);
                cmd.Parameters.AddWithValue("@p2", password);
                cmd.Parameters.AddWithValue("@p3", name);
                cmd.Parameters.AddWithValue("@p4", position);
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

        public static void dataDeleteQuery(string id, string command)
        {
            string sqlcommand = "";
            if (command == "delete")
            {
                sqlcommand = "delete from HospitalManage where Id=@p1";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", id);
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

        public static void deleteQuery(string id)
        {
            dataDeleteQuery(id, "delete");
        }

        public static void insertQuery(string id, string password, string name, string position)
        {
            dataInsertQuery(id, password, name, position, "insert");
        }

    }
}
