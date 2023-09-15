import java.util.ArrayList;
public class Reptil extends Animal {
    private ArrayList<Reptil> listado= new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero,  Zona[] zona, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles() {
        return Reptil.iguanas + Reptil.serpientes;
    }

    public String movimiento() {
        return "reptar";
    }

    public void crearIguana(String nombre, int edad, String genero, Zona[] zona) {
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
        Reptil.iguanas += 1;
        listado.add(iguana);
    }

    public void crearSerpiente(String nombre, int edad, String genero,  Zona[] zona) {
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
        Reptil.serpientes += 1;
        listado.add(serpiente);
    }

}
