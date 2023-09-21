package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
    }
    
    public Mamifero() {
        this(null, 0, null, null, false, 0);
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        Mamifero.caballos += 1;
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        Mamifero.leones += 1;
        return leon;
    }

    public static ArrayList<Mamifero> getListado() {
        return Mamifero.listado;

    } 

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public boolean isPelaje() {
        return this.pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
