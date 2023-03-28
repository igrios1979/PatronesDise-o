package factory.EjemploFactory;

import factory.PizzeriaCaliforniaFactory;
import factory.PizzeriaNewYorkFactory;
import factory.PizzeriaZonaAbstractFactory;
import factory.pizzaProducto;

public class EjemploFactory {

    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory cal = new PizzeriaCaliforniaFactory();

        pizzaProducto pizzauno = cal.ordenarPizza("california");
        System.out.println("-------------------------------------------------------");
        System.out.println("Nombre pizza  " + pizzauno.getNombre());
        System.out.println("-------------------------------------------------------");


        pizzaProducto pizzados = ny.ordenarPizza("napolitana");
        pizzaProducto tres = ny.ordenarPizza("vegetariana");

        System.out.println("-------------------------------------------------------");
        System.out.println("Nombre pizza  " + pizzados.getNombre());
        System.out.println("-------------------------------------------------------");

        System.out.println("tres = " + tres);
        System.out.println("tres = " + pizzados);
        System.out.println("pizzauno = " + pizzauno);
    }


}
