package elempleado;

/**
 *
 * @author Alexandra Tinjaca
 */
public class Empleado {
    private int id;
    private double salario;
    private String nombre, apellido, cargo;
    private char genero;
    
    public Empleado(){
        
        }
    public Empleado(int id, double salario, String nombre, String apellido, String cargo, char genero) {
        this.id = id;
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getCargo() {
        return cargo;
    }

    public char getGenero() {
        return genero;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setSalario(double salario) {
        this.salario= salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", salario=" + salario + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", genero=" + genero + '}';
    }
    
    
    
}
