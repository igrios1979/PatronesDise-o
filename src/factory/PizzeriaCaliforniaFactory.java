package factory;

import factory.producto.PizzaNewyorkVegetariana;
import factory.producto.pizzaCaliforniana;
import factory.producto.pizzaNapolitana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{


    @Override
    pizzaProducto crearPizza(String tipo) {

        pizzaProducto producto = switch (tipo) {
            case "california" -> new pizzaCaliforniana();
            default -> null;
        };
        return producto;
    }

}
