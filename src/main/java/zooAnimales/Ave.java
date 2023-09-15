import java.util.ArrayList;
public class Ave extends Animal {
    private ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, Zona[] zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
    }

    public int cantidadAves() {
        return Ave.halcones + Ave.aguilas;
    }

    public String movimiento() {
        return "volar";
    }
    
    public void crearhalcon(String nombre, int edad, String genero, Zona[] zona) {
        Ave halcon = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
        Ave.halcones += 1;
        listado.add(halcon);
    }

    public void creaAguila(String nombre, int edad, String genero, Zona[] zona) {
        Ave aguila = new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
        Ave.aguilas += 1;
        listado.add(aguila);
    }


}
