using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class Treat
    {
        public int chartNum { get; set; }
        public int pCode { get; set; }
        public string pName { get; set; }
        public DateTime pBirth { get; set; }
        public string pGen { get; set; }
        public string pNum { get; set; }
        public string pAddress { get; set; }
        public DateTime pVisit { get; set; }
        public string pDiagnosis { get; set; }
        public string pMedicine { get; set; }
    }
}
