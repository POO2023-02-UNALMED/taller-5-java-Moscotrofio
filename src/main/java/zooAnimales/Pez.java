package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.listado.add(this);
    }

    public Pez() {
        this(null, 0, null, null, null, 0);
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        Pez.salmones += 1;
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        Pez.bacalaos += 1;
        return bacalao;
    }

    public static ArrayList<Pez> getListado() {
        return Pez.listado;
    } 

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return this.cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
