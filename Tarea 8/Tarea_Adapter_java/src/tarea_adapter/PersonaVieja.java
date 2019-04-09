
package tarea_adapter;

import java.util.Date;


public class PersonaVieja implements IPersonaVieja {
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
       return apellido;   
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setApellido(String apellido) {
            this.apellido = apellido;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getFechaDeNacimiento() {
          return fechaDeNacimiento;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechaDeNacimiento(Date fechaDeNaciemiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
