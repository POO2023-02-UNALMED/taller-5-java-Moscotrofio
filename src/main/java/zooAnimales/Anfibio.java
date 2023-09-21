import java.util.ArrayList;
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero,  Zona[] zona, String colorPiel, boolean venenoso){
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
    } 

    public static int cantidadAnfibios() {
        return Anfibio.listado.size();
    }

    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas += 1;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, String habitat, int edad, String genero) {
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, null, listado, ranas, salamandras, "negro y amarillo", false);
        salamandras += 1;
        return salamandra;
    }

    public String getColorPiel() {
        return this.colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean getVenenoso() {
        return this.venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
