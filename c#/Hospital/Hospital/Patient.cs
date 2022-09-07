using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hospital
{
    public class Patient
    {
        public int pCode { get; set; }
        public string name { get; set; }
        public int age { get; set; }
        public string gender { get; set; }
        public string address { get; set; }
        public string phoneNum { get; set; }
        public DateTime visit { get; set; }
    }
}
