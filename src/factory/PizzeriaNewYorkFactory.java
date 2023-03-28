package factory;

import factory.producto.PizzaNewyorkVegetariana;
import factory.producto.pizzaNapolitana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    pizzaProducto crearPizza(String tipo) {
        pizzaProducto producto = switch (tipo) {
            case "vegetariana" -> new PizzaNewyorkVegetariana();
            case "napolitana"->   new pizzaNapolitana();
            default -> null;
        };

        return producto;
    }





}
