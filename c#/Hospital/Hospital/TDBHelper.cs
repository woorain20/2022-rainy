using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class TDBHelper
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
                    cmd.CommandText = "select * from Treatment order by ChartNum";
                }
                else
                {
                    cmd.CommandText = "select * from Treatment " + " where ChartNum =" + chartNum;
                }

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "Treatment");
                dt = ds.Tables[0];
            }
            catch (Exception)
            {

            }
        }

        public static void updateQuery(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string pVisit, string pDiagnosis, string pMedicine, bool isRemove)
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
                    sqlcommand = "update Treatment set Code=@p1, Name=@p2, Birth=@p3, Gender=@p4, Phone=@p5, Address=@p6, Visit=@p7, Diagnosis=@p8, Medicine=@p9 where ChartNum=@p10";
                    cmd.Parameters.AddWithValue("@p1", pCode);
                    cmd.Parameters.AddWithValue("@p2", pName);
                    cmd.Parameters.AddWithValue("@p3", pBirth);
                    cmd.Parameters.AddWithValue("@p4", pGen);
                    cmd.Parameters.AddWithValue("@p5", pNum);
                    cmd.Parameters.AddWithValue("@p6", pAddress);
                    cmd.Parameters.AddWithValue("@p7", pVisit);
                    cmd.Parameters.AddWithValue("@p8", pDiagnosis);
                    cmd.Parameters.AddWithValue("@p9", pMedicine);
                    cmd.Parameters.AddWithValue("@p10", chartNum);
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

        public static void dataInsertQuery(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string pVisit, string pDiagnosis, string pMedicine, string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into Treatment values (@p1, @p2, @p3, @p4, @p5, @p6, @p7, @p8, @p9, @p10)";
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
                cmd.Parameters.AddWithValue("@p8", pVisit);
                cmd.Parameters.AddWithValue("@p9", pDiagnosis);
                cmd.Parameters.AddWithValue("@p10", pMedicine);
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

        public static void dataDeleteQuery(string chartNum, string command)
        {
            string sqlcommand = "";
            if (command == "delete")
            {
                sqlcommand = "delete from Treatment where ChartNum=@p1";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", chartNum);
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

        public static void dataUpdateQuery(string pCode, string pVisit, string pDiagnosis, string pMedicine, string command)
        {
            string sqlcommand = "";
            if (command == "update")
            {
                sqlcommand = "update Treatment set Visit=@p1, Diagnosis=@p2, Medicine=@p3 where Code=@p4";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", pVisit);
                cmd.Parameters.AddWithValue("@p2", pDiagnosis);
                cmd.Parameters.AddWithValue("@p3", pMedicine);
                cmd.Parameters.AddWithValue("@p4", pCode);
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

        public static void dataUpdateQuery(string pCode, string pName, string pGen, string pNum, string pAddress, string command)
        {
            string sqlcommand = "";
            if (command == "update")
            {
                sqlcommand = "update Treatment set Name=@p1, Gender=@p2, Phone=@p3, Address=@p4 where Code=@p5";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", pName);
                cmd.Parameters.AddWithValue("@p2", pGen);
                cmd.Parameters.AddWithValue("@p3", pNum);
                cmd.Parameters.AddWithValue("@p4", pAddress);
                cmd.Parameters.AddWithValue("@p5", pCode);
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

        public static void dataViewQuery(string pName)
        {           
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandText = "SELECT * FROM Treatment where Name=@p1";
                cmd.Parameters.AddWithValue("@p1", pName);

                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds, "Treatment");
                dt = ds.Tables[0];
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }
            finally
            {
                conn.Close();
            }
        }

        public static void deleteQuery(string chartNum)
        {
            dataDeleteQuery(chartNum, "delete");
        }

        public static void updateQuery(string pCode, string pVisit, string pDiagnosis, string pMedicine)
        {
            dataUpdateQuery(pCode, pVisit, pDiagnosis, pMedicine, "update");
        }

        public static void updateQuery(string pCode, string pName, string pGen, string pNum, string pAddress)
        {
            dataUpdateQuery(pCode, pName, pGen, pNum, pAddress, "update");
        }

        public static void insertQuery(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string pVisit, string pDiagnosis, string pMedicine)
        {
            dataInsertQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, pVisit, pDiagnosis, pMedicine, "insert");
        }

        public static void viewQuery(string pName)
        {
            dataViewQuery(pName);
        }
    }
}
