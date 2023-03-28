package factory.producto;

import factory.pizzaProducto;

public class PizzaNewyorkVegetariana extends pizzaProducto {

    public PizzaNewyorkVegetariana() {
        super();
        nombre = "Pizza de vegetales new york";
        masa = "Masa Integral vegan NY";
        salsa = "Tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("aceitunas");
        ingredientes.add("rucula");
        ingredientes.add("berenjenas");


    }

    @Override
    public void cocinar() {
        System.out.println("5 minutos a 300 grados centigrados " );

    }

    @Override
    public void cortar() {
        System.out.println("12 porciones grandes triangulo");
    }
}
