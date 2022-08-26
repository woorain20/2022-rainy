using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookManagement
{
    public class Book
    {
        public string Isbn { get; set; }
        public string name { get; set; }
        public string publisher { get; set; }
        public int page { get; set; }

        public int userId { get; set; }
        public string userName { get; set; }
        public bool isBorrowed { get; set; }
        public DateTime borrowedAt { get; set; }
    }
}
