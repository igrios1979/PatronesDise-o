package factory.producto;

import factory.pizzaProducto;

public class pizzaNapolitana extends pizzaProducto {


    public pizzaNapolitana() {
        super();
        nombre = "Pizza napolitana";
        masa = "Masa pizza margarita con bordes";
        salsa = "Tomate crudo";
        ingredientes.add("Queso mozzarella bufala");
        ingredientes.add("aceitunas verdes y negras ");
        ingredientes.add("Masa madre leudada");
        ingredientes.add("algo de oregano");


    }

    @Override
    public void cocinar() {
        System.out.println("10 minutos a 300 grados centigrados " );
    }

    @Override
    public void cortar() {
        System.out.println("8 porciones" );
    }
}
