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
        public static List<Medicine> medicines = new List<Medicine>();
        public static List<Treat> treatments = new List<Treat>();
        public static List<Waiting> waitings = new List<Waiting>();

        static DataManager()
        {
            Load();
            MLoad();
            TLoad();
            WLoad();
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
                //System.Windows.Forms.MessageBox.Show("Load오류");
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
                //System.Windows.Forms.MessageBox.Show("MLoad오류");
            }
        }

        public static void TLoad()
        {
            try
            {
                TDBHelper.selectQuery();
                treatments.Clear();

                foreach (DataRow item in TDBHelper.dt.Rows)
                {
                    Treat treat = new Treat();
                    treat.chartNum = int.Parse(item["ChartNum"].ToString());
                    treat.pCode = int.Parse(item["Code"].ToString());
                    treat.pName = item["Name"].ToString();
                    treat.pBirth = DateTime.Parse(item["Birth"].ToString());
                    treat.pGen = item["Gender"].ToString();
                    treat.pNum = item["Phone"].ToString();
                    treat.pAddress = item["Address"].ToString();
                    treat.pVisit = DateTime.Parse(item["Visit"].ToString());
                    treat.pDiagnosis = item["Diagnosis"].ToString();
                    treat.pMedicine = item["Medicine"].ToString();
                    treatments.Add(treat);
                }
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
                //System.Windows.Forms.MessageBox.Show("TLoad오류");
            }
        }

        public static void WLoad()
        {
            try
            {
                WDBHelper.selectQuery();
                waitings.Clear();

                foreach (DataRow item in WDBHelper.dt.Rows)
                {
                    Waiting wait = new Waiting();
                    wait.ChartNum = int.Parse(item["ChartNum"].ToString());
                    wait.Code = int.Parse(item["Code"].ToString());
                    wait.Name = item["Name"].ToString();
                    wait.Birth = DateTime.Parse(item["Birth"].ToString());
                    wait.Gender = item["Gender"].ToString();
                    wait.Phone = item["Phone"].ToString();
                    wait.Address = item["Address"].ToString();
                    waitings.Add(wait);
                }
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
                //System.Windows.Forms.MessageBox.Show("WLoad오류");
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

        public static void MSave(string command, string code, int amount, int use, out string contents)
        {
            MDBHelper.dataUpdateQuery(code, amount, use, command);
            contents = "";

            if (command == "update")
            {
                MDBUpdate(code, amount, use, ref contents);
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
                MDBHelper.updateQuery(code, amount);
                contents = $"의약품 번호 {code}의 수량이 {amount}로 수정되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 의약품 번호 {code}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool MDBUpdate(string code, int amount, int use, ref string contents)
        {
            if (MDBHelper.dt.Rows.Count != 0)
            {
                MDBHelper.updateQuery(code, amount, use);
                contents = $"의약품 번호 {code}의 수량이 {amount-use}로 수정되었습니다.";
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

        public static void TSave(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string pVisit, string pDiagnosis, string pMedicine, bool isRemove)
        {
            try
            {
                TDBHelper.updateQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, pVisit, pDiagnosis, pMedicine, isRemove);
            }
            catch (Exception)
            {

            }
        }

        public static void TSave(string command, string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string pVisit, string pDiagnosis, string pMedicine, out string contents)
        {
            TDBHelper.dataInsertQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, pVisit, pDiagnosis, pMedicine, command);
            contents = "";

            if (command == "insert")
            {
                TDBInsert(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, pVisit, pDiagnosis, pMedicine, ref contents);
            }
        }

        public static void TSave(string command, string chartNum, out string contents)
        {
            TDBHelper.dataDeleteQuery(chartNum, command);
            contents = "";

            if (command == "delete")
            {
                TDBDelete(chartNum, ref contents);
            }
        }

        public static void TSave(string command, string pCode, string pVisit, string pDiagnosis, string pMedicine, out string contents)
        {
            TDBHelper.dataUpdateQuery(pCode, pVisit, pDiagnosis, pMedicine, command);
            contents = "";

            if (command == "update")
            {
                TDBUpdate(pCode, pVisit, pDiagnosis, pMedicine, ref contents);
            }
        }

        public static void TSave(string command, string pCode, string pName, string pGen, string pNum, string pAddress, out string contents)
        {
            TDBHelper.dataUpdateQuery(pCode, pName, pGen, pNum, pAddress, command);
            contents = "";

            if (command == "update")
            {
                TDBUpdate(pCode, pName, pGen, pNum, pAddress, ref contents);
            }
        }

        public static void TView(string command, string pName, out string contents)
        {
            TDBHelper.dataViewQuery(pName, command);
            contents = "";

            if (command == "view")
            {
                TDBView(pName, ref contents);
            }
        }

        private static bool TDBDelete(string chartNum, ref string contents)
        {
            if (TDBHelper.dt.Rows.Count != 0)
            {
                TDBHelper.deleteQuery(chartNum);
                contents = $"환자 차트 번호 {chartNum}이/가 삭제되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 차트 번호 {chartNum}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool TDBUpdate(string pCode, string pVisit, string pDiagnosis, string pMedicine, ref string contents)
        {
            if (TDBHelper.dt.Rows.Count != 0)
            {
                TDBHelper.updateQuery(pCode, pVisit, pDiagnosis, pMedicine);
                contents = $"환자 번호 {pCode}이 수정되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 번호 {pCode}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool TDBUpdate(string pCode, string pName, string pGen, string pNum, string pAddress, ref string contents)
        {
            if (TDBHelper.dt.Rows.Count != 0)
            {
                TDBHelper.updateQuery(pCode, pName, pGen, pNum, pAddress);
                contents = $"환자 번호 {pCode}이 수정되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 번호 {pCode}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool TDBInsert(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, string pVisit, string pDiagnosis, string pMedicine, ref string contents)
        {
            if (TDBHelper.dt.Rows.Count != 0)
            {
                TDBHelper.insertQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, pVisit, pDiagnosis, pMedicine);
                contents = $"환자 차트 번호 {chartNum}이/가 추가되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 차트 번호 {chartNum}가 이미 존재합니다.";
                return false;
            }
        }

        private static bool TDBView(string pName, ref string contents)
        {
            if(TDBHelper.dt.Rows.Count != 0)
            {
                TDBHelper.viewQuery(pName);
                contents = $"환자 이름 {pName}를 찾았습니다.";
                return true;
            }
            else
            {
                contents = $"환자 이름 {pName}은 존재하지 않습니다.";
                return false;
            }
        }

        public static void WSave(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, bool isRemove)
        {
            try
            {
                WDBHelper.updateQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, isRemove);
            }
            catch (Exception)
            {

            }
        }

        public static void WSave(string command, string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, out string contents)
        {
            WDBHelper.dataInsertQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, command);
            contents = "";

            if (command == "insert")
            {
                WDBInsert(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress, ref contents);
            }
        }

        public static void WSave(string command, string pCode, out string contents)
        {
            WDBHelper.dataDeleteQuery(pCode, command);
            contents = "";

            if (command == "delete")
            {
                WDBDelete(pCode, ref contents);
            }
        }

        public static void WSave(string command, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, out string contents)
        {
            WDBHelper.dataUpdateQuery(pCode, pName, pBirth, pGen, pNum, pAddress, command);
            contents = "";

            if (command == "update")
            {
                WDBUpdate(pCode, pName, pBirth, pGen, pNum, pAddress, ref contents);
            }
        }
        private static bool WDBDelete(string pCode, ref string contents)
        {
            if (WDBHelper.dt.Rows.Count != 0)
            {
                WDBHelper.deleteQuery(pCode);
                contents = $"환자 번호 {pCode}이/가 대기자 명단에서 삭제되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 번호 {pCode}가 대기자 명단에 존재하지 않습니다.";
                return false;
            }
        }

        private static bool WDBUpdate(string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, ref string contents)
        {
            if (WDBHelper.dt.Rows.Count != 0)
            {
                WDBHelper.updateQuery(pCode, pName, pBirth, pGen, pNum, pAddress);
                contents = $"환자 번호 {pCode}이 수정되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 번호 {pCode}가 존재하지 않습니다.";
                return false;
            }
        }

        private static bool WDBInsert(string chartNum, string pCode, string pName, string pBirth, string pGen, string pNum, string pAddress, ref string contents)
        {
            if (WDBHelper.dt.Rows.Count != 0)
            {
                WDBHelper.insertQuery(chartNum, pCode, pName, pBirth, pGen, pNum, pAddress);
                contents = $"환자 차트 번호 {chartNum}이/가 추가되었습니다.";
                return true;
            }
            else
            {
                contents = $"해당 환자 차트 번호 {chartNum}가 이미 존재합니다.";
                return false;
            }
        }
    }
}
