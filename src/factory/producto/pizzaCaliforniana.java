package factory.producto;

import factory.pizzaProducto;

public class pizzaCaliforniana extends pizzaProducto {

    public pizzaCaliforniana() {
        super();
        nombre = "Pizza californiana";
        masa = "Masa pizza Comun";
        ingredientes.add("Queso mozzarella comun");
        ingredientes.add("aceitunas verdes y anana ");
        ingredientes.add("Masa comun california");
        ingredientes.add("algo de oregano y salame");
    }

    @Override
    public void cocinar() {
        System.out.println("5 minutos a 200 grados centigrados " );

    }

    @Override
    public void cortar() {
        System.out.println("Corte porciones cuadradas " );
    }
}
