using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tarea1_Adapter
{
    class Program
    {
        static void Main(string[] args)
        {
            // Instanciamos enchufe y taladro
            IEnchufeIngles enchufe = new EnchufeBritanico();
            Taladro taladro = new Taladro(enchufe);

            // Encendemos el taladro
            taladro.Encender();

            Console.ReadLine();
        }
    }
}
