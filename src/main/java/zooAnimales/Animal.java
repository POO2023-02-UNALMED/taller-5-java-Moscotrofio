package zooAnimales;
import java.util.ArrayList;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales += 1;
    }

    public Animal(){
        this(null, 0, null, null, null);
    }

    public String movimiento() {
        return "desplazarse";
    }

    public String totalPorTipo() {
        return "Mamiferos: "+ Mamifero.cantidadMamiferos() +"\nAves: "+ Ave.cantidadAves() +"\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: "+ Pez.cantidadPeces() +"\nAnfibios:" + Anfibio.cantidadAnfibios();
    }

    public String toString(){
        if (this.getZona() != null) {
            return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + "y mi genero es " + this.getGenero() + ", la zona en la que me ubico es " + this.getZona().getNombre() + ", en el "+ getZona().getZoo().getNombre();
        } else {
            return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + "y mi genero es " + this.getGenero();
        }

    }

    public static int getTotalAnimales() {
        return Animal.totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return this.zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
