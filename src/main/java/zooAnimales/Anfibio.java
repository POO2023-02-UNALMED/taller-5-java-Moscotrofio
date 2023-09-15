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
    }

    public static int cantidadAnfibios() {
        return Anfibio.salamandras + Anfibio.ranas;
    }

    public String movimiento() {
        return "saltar";
    }

    public void crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas += 1;
        listado.add(rana);

    }

    public void crearSalamandra(String nombre, String habitat, int edad, String genero) {
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, null, listado, ranas, salamandras, "negro y amarillo", false);
        salamandras += 1;
        listado.add(salamandra);
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
