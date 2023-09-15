import java.util.ArrayList;
public class Mamifero extends Animal {
    private ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona[] zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
    }
    
    public static int cantidadMamiferos() {
        return Mamifero.caballos + Mamifero.leones;
    }

    public void crearCaballo(String nombre, int edad, String genero, Zona[] zona) {
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
        Mamifero.caballos += 1;
        listado.add(caballo);
    }

    public void crearLeon(String nombre, int edad, String genero, Zona[] zona) {
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
        Mamifero.leones += 1;
        listado.add(leon);
    }

}
