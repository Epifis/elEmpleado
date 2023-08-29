package elempleado;

/**
 *
 * @author Alexandra Tinjaca
 */
public class Empresa {
    
    private String nombre, correo;
    private int id;
    
    //Declaracion constructor
    
    public Empresa(){     
    }
    public Empresa(String unNombre, String unCorreo){
        this.nombre=unNombre;
        this.correo=unCorreo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getId() {
        return id;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo= correo;
    }
    public void setId(int id) {
        this.id = id;
    }

        @Override
        public String toString() {
            return "empresa{" + "nombre=" + nombre + ", correo=" + correo + ", id=" + id + '}';
        }

}
