using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApiPra
{
    public class Locale
    {
        public string Name { get; set; }

        public double Lat { get; set; }

        public double Lng { get; set; }

        public Locale(string name, double lat, double lng)
        {
            Name = name;
            Lat = lat;
            Lng = lng;
        }

        //object 클래스(=모든 객체의 조상)의 tostring을 덮어씀

        public override string ToString()
        {
            return Name;
        }
    }
}
