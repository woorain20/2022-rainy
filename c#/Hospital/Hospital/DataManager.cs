using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class DataManager
    {
        public static List<Manager> managers = new List<Manager>();
        public static List<Patient> patients = new List<Patient>();
        public static List<Medicine> medicines = new List<Medicine>();
        public static List<Waiting> waitings = new List<Waiting>();
        public static List<Treatment> treatments = new List<Treatment>();
        public static List<Chart> charts = new List<Chart>();

        static DataManager()
        {
            Load();
            PLoad();
            MLoad();
        }

        public static void Load()
        {
            try
            {
                DBHelper.selectQuery();
                managers.Clear();

                foreach (DataRow item in DBHelper.dt.Rows)
                {
                    Manager manager = new Manager();
                    manager.id = int.Parse(item["Id"].ToString());
                    manager.password = item["Password"].ToString();
                    manager.name = item["Name"].ToString();
                    manager.position = item["Position"].ToString();
                    managers.Add(manager);
                }
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }
        }

        public static void PLoad()
        {
            try
            {
                PDBHelper.selectQuery();
                patients.Clear();

                foreach (DataRow item in PDBHelper.dt.Rows)
                {
                    Patient patient = new Patient();
                    patient.pCode = int.Parse(item["Code"].ToString());
                    patient.name = item["Name"].ToString();
                    patient.age = int.Parse(item["Age"].ToString());
                    patient.gender = item["Gender"].ToString();
                    patient.address = item["Address"].ToString();
                    patient.phoneNum = item["PhoneNum"].ToString();
                    patient.visit = item["Visit"].ToString() == "" ? new DateTime() : DateTime.Parse(item["Visit"].ToString());
                    patients.Add(patient);
                }
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }
        }

        public static void MLoad()
        {
            try
            {
                MDBHelper.selectQuery();
                medicines.Clear();

                foreach (DataRow item in MDBHelper.dt.Rows)
                {
                    Medicine medicine = new Medicine();
                    medicine.code = item["Code"].ToString();
                    medicine.name = item["Name"].ToString();
                    medicine.amount = int.Parse(item["Amount"].ToString());
                    medicines.Add(medicine);
                }
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }
        }

        public static void printLog(string contents)
        {
            DirectoryInfo di = new DirectoryInfo("LogHistory");

            if (di.Exists == false)
            {
                di.Create();
            }

            using (StreamWriter w = new StreamWriter("LogHistory\\LogHistory.txt", true))
            {
                w.WriteLine(contents);
            }
        }

        public static void Save(string idText, string password, string name, string position, bool isRemove)
        {
            try
            {
                DBHelper.updateQuery(idText, password, name, position, isRemove);
            }
            catch (Exception)
            {

            }
        }

        public static void Save(string command, string id, string password, string name, string position, out string contents)
        {
            DBHelper.dataInsertQuery(id, password, name, position, command);
            contents = "";

            if (command == "insert")
            {
                DBInsert(id, password, name, position, ref contents);
            }
        }

        public static void Save(string command, string id, out string contents)
        {
            DBHelper.dataDeleteQuery(id, command);
            contents = "";

            if (command == "delete")
            {
                DBDelete(id, ref contents);
            }
        }

        private static bool DBDelete(string id, ref string contents)
        {
            if (DBHelper.dt.Rows.Count != 0)
            {
                DBHelper.deleteQuery(id);
                contents = $"관리자 번호 {id}이/가 삭제되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 관리자 번호 {id}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool DBInsert(string id, string password, string name, string position, ref string contents)
        {
            if (DBHelper.dt.Rows.Count !=0)
            {
                DBHelper.insertQuery(id, password, name, position);
                contents = $"관리자 번호 {id}이/가 추가되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 관리자 번호 {id}가 이미 존재합니다.";
                return false;
            }
        }

        public static void PSave(string codeText, string name, string age, string gender, string address, string phoneNum, string visit, bool isRemove)
        {
            try
            {
                PDBHelper.updateQuery(codeText, name, age, gender, address, phoneNum, visit, isRemove);
            }
            catch (Exception)
            {

            }
        }

        public static void PSave(string command, string pCode, string name, string age, string gender, string address, string phoneNum, string visit, out string contents)
        {
            PDBHelper.dataInsertQuery(pCode, name, age, gender, address, phoneNum, visit, command);
            contents = "";

            if (command == "insert")
            {
                PDBInsert(pCode, name, age, gender, address, phoneNum, visit, ref contents);
            }
        }

        public static void PSave(string command, string pCode, out string contents)
        {
            PDBHelper.dataDeleteQuery(pCode, command);
            contents = "";

            if (command == "delete")
            {
                PDBDelete(pCode, ref contents);
            }
        }

        private static bool PDBDelete(string pCode, ref string contents)
        {
            if (PDBHelper.dt.Rows.Count != 0)
            {
                PDBHelper.deleteQuery(pCode);
                contents = $"환자 번호 {pCode}이/가 삭제되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 번호 {pCode}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool PDBInsert(string pCode, string name, string age, string gender, string address, string phoneNum, string visit, ref string contents)
        {
            if (PDBHelper.dt.Rows.Count != 0)
            {
                PDBHelper.insertQuery(pCode, name, age, gender, address, phoneNum, visit);
                contents = $"환자 번호 {pCode}이/가 추가되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 번호 {pCode}가 이미 존재합니다.";
                return false;
            }
        }

        public static void MSave(string code, string name, string amount, bool isRemove)
        {
            try
            {
                MDBHelper.updateQuery(code, name, amount, isRemove);
            }
            catch (Exception)
            {

            }
        }

        public static void MSave(string command, string code, string name, string amount, out string contents)
        {
            MDBHelper.dataInsertQuery(code, name, amount, command);
            contents = "";

            if (command == "insert")
            {
                MDBInsert(code, name, amount, ref contents);
            }
        }

        public static void MSave(string command, string code, out string contents)
        {
            MDBHelper.dataDeleteQuery(code, command);
            contents = "";

            if (command == "delete")
            {
                MDBDelete(code, ref contents);
            }
        }

        public static void MSave(string command, string code, string amount, out string contents)
        {
            MDBHelper.dataUpdateQuery(code, amount, command);
            contents = "";

            if (command == "update")
            {
                MDBUpdate(code, amount, ref contents);
            }
        }

        private static bool MDBDelete(string code, ref string contents)
        {
            if (MDBHelper.dt.Rows.Count != 0)
            {
                MDBHelper.deleteQuery(code);
                contents = $"의약품 번호 {code}이/가 삭제되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 의약품 번호 {code}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool MDBUpdate(string code, string amount, ref string contents)
        {
            if (MDBHelper.dt.Rows.Count != 0)
            {
                MDBHelper.updateMQuery(code, amount);
                contents = $"의약품 번호 {code}의 수량이 {amount}로 수정되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 의약품 번호 {code}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool MDBInsert(string code, string name, string amount, ref string contents)
        {
            if (MDBHelper.dt.Rows.Count != 0)
            {
                MDBHelper.insertQuery(code, name, amount);
                contents = $"의약품 번호 {code}이/가 추가되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 의약품 번호 {code}가 이미 존재합니다.";
                return false;
            }
        }
    }
}
