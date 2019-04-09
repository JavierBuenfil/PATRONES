
package tarea_adapter;


public class PersonaNueva implements IPersonaNueva {
   private String nombre;
   private int edad;
   
   public String getNombre()
   {
       return nombre;
   }
   
   public void setNombre(String nombre)
   {
       this.nombre = nombre;
   }

    @Override
    public int getEdad() {
       return edad;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
