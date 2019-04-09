
package tarea_adapter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tarea_Adapter {

    
    public static void main(String[] args) {
        PersonaVieja personaVieja = new PersonaVieja();
        personaVieja.setApellido("Perez");
        personaVieja.setNombre("Maxi");
        GregorianCalendar g = new GregorianCalendar();
        g.set(2000,01,01);
        
        //seteamos que nacio en el año 2000
        
        Date d = g.getTime();
        personaVieja.setFechaDeNacimiento(d);
        //hasta aqui creamos una PersonaVieja como se hacia antes
        
        //ahora veremo omo funciona el adapter
        
        ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter (personaVieja);
        
        System.out.println(personaNueva.getEdad());
        System.out.println(personaNueva.getNombre());
          
        personaNueva.setEdad(10);
        personaNueva.setNombre("Juan Perez");
          
        System.out.println(personaNueva.getEdad());
        System.out.println(personaNueva.getNombre());
        
    }
    
}
