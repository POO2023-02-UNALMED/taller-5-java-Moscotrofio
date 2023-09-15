import java.util.ArrayList;
public class Pez extends Animal {
    private ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero,  Zona[] zona, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces() {
        return Pez.salmones + Pez.bacalaos;

    }

    public String movimiento() {
        return "nadar";
    }

    public void crearSalmon(String nombre, int edad, String genero, Zona[] zona) {
        Pez salmon = new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
        Pez.salmones += 1;
        listado.add(salmon);

    }

    public void crearBacalao(String nombre, int edad, String genero, Zona[] zona) {
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
        Pez.bacalaos += 1;
        listado.add(bacalao);

    }

}
