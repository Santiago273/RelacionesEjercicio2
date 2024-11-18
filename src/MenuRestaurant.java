import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> platos = new ArrayList<Plato>();
        int cantidadIngredientes = 0;
        int cantidadDePlatos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de platos:"));
        for (int i = 0; i < cantidadDePlatos; i++) {
            Plato plato = new Plato();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del plato");
            plato.setNombreCompleto(nombre);
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del plato "+nombre));
            plato.setPrecio(precio);
            String bebida = JOptionPane.showInputDialog("¿El plato ingresado es bebida?");
            String bebeidaMayus = bebida.toUpperCase();
            if(bebeidaMayus.equals("SI")){
                System.out.println("SI");
                plato.setEsBebida(true);
            }else {
                plato.setEsBebida(false);
                cantidadIngredientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ingredientes del plato "+nombre));
            }

            for (int j = 0; j < cantidadIngredientes; j++) {
                if(plato.isEsBebida()){
                    break;
                }
                String nombreIngrediente = JOptionPane.showInputDialog("Ingrese el ingrediente numero "+(j+1));
                double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad requerida de "+nombreIngrediente));
                String uMedida = JOptionPane.showInputDialog("¿En que unidad de medida se mide la cantidad del ingrediente?");
                plato.agregarIngredientes(nombreIngrediente,cantidad,uMedida);
            }

            platos.add(plato);
        }
        System.out.println("--------------MENU------------");
        for (Plato plato: platos) {
            if (plato.isEsBebida()){
                System.out.println(plato.getNombreCompleto());
                System.out.println("Precio: $ "+plato.getPrecio());
            }else{
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $ "+plato.getPrecio());
            System.out.println("Ingredientes");
            plato.imprimirIngredientes();
            System.out.println("-------------------------------");
            }
        }

    }
}
