package factory;

abstract public class PizzeriaZonaAbstractFactory {


public pizzaProducto ordenarPizza(String tipo){
    pizzaProducto pizza = crearPizza(tipo);
    System.out.println("Fabricando la pizza " + pizza.getNombre());
    pizza.preparar();
    pizza.cocinar();
    pizza.cortar();
    return pizza;
}


    abstract pizzaProducto crearPizza(String tipo);


}





