public class Persona {
 String nombre;
 int edad;
 
 public void saludar() {
    System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años.");

 }

 public String toString() {
    return "Persona[nombre=" + this.nombre + ", edad=" + this.edad + "]";
 }
 public static void main(String[] args) {
    Persona persona = new Persona();
    persona.nombre = "Juan";
    persona.edad = 25;
    persona.saludar();
    System.out.println(persona.toString());

    Persona otraPersona = new Persona();
    otraPersona.nombre = "María";
    otraPersona.edad = 30;
    otraPersona.saludar();
 }
}
