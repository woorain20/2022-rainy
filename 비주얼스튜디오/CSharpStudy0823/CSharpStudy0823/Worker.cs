using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy0823
{
    public class Worker
    {
        public int woNum { get; set; }
        public string woName { get; set; }
        public string department { get; set; }
        public string woRank { get; set; }
        public bool woGender { get; set; }
        public int woAge { get; set; }
        public int pay { get; set; }

        public void work()
        {
            pay = pay * 30;
        }
    }
}
