package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
    }

    public Ave() {
        this(null, 0, null, null, null);
    }

    public static int cantidadAves() {
        return Ave.halcones + Ave.aguilas;
    }

    public String movimiento() {
        return "volar";
    }

    public static Ave crearhalcon(String nombre, int edad, String genero, Zona[] zona) {
        Ave halcon = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
        Ave.halcones += 1;
        return halcon;
    }

    public static Ave creaAguila(String nombre, int edad, String genero, Zona[] zona) {
        Ave aguila = new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
        Ave.aguilas += 1;
        return aguila;
    }

    public static ArrayList<Ave> getListado() {
        return Ave.listado;
    } 

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return this.colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
