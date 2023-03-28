package factory;

import java.util.ArrayList;
import java.util.List;

abstract public class pizzaProducto {


    protected String nombre;
    protected  String masa;
    protected  String salsa;
    protected List<String> ingredientes ;

    public pizzaProducto() {
        this.ingredientes = new ArrayList<>();

    }

    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println(" seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("ingredientes : " + nombre);
        this.ingredientes.forEach(i-> System.out.println("i = " + i));
            }

      public void empaquetas(){
          System.out.println("empaquetar en caja " + nombre);

      }

    public  abstract void cocinar();
    public  abstract void cortar();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "pizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
