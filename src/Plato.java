import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingrediente = new ArrayList<>();

    public Plato() {
    }

    public Plato(String nombreCompleto, double precio, boolean esBebida, ArrayList<Ingrediente> ingrediente) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingrediente = ingrediente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void agregarIngredientes(String nombre, double cantidad, String unidadDeMedida){
        ingrediente.add(new Ingrediente(nombre, cantidad, unidadDeMedida));
    }

    public void imprimirIngredientes(){
        System.out.println("Nombre\t\t\tCantidad\t\t\tUnidad de medida");
        for (Ingrediente ingredinte: ingrediente) {
            System.out.println(ingredinte.getNombre()+"\t\t"+ingredinte.getCantidad()+"\t\t"+ingredinte.getUnidadDeMedida());
        }
    }

}
