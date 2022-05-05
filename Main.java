public class Main {
    public static void main(String args[]){
        Persona persona = new Persona();

        persona.setNombre("Carmelo");
        String nombre = persona.getNombre();
        System.out.println(nombre); //(persona.getNombre());

        persona.setEdad(50);
        int edad = persona.getEdad();
        System.out.println(edad);

        persona.setTelefono(1121896633);
        int telefono = persona.getTelefono();
        System.out.println(telefono);
    }
}
class Persona {

    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
  }

