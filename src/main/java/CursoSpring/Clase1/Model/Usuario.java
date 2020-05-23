
package CursoSpring.Clase1.Model;


public class Usuario {
    private String id;
    private String Nombre;
    private String apellido;

    public Usuario() {
    }

    public Usuario(String id, String Nombre, String apellido) {
        this.id = id;
        this.Nombre = Nombre;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", Nombre=" + Nombre + ", apellido=" + apellido + '}';
    }
    
    
}
