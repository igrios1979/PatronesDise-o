package Decorator.Decorator2;

import Decorator.Decorator2.DecoradoresAbstractos.CafeConChocolate;
import Decorator.Decorator2.DecoradoresAbstractos.ConCrema;

public class EjemploCafedecorador {

    public static void main(String[] args) {

        Configurable cafe = new Cafe(10,"CAFE MOKA: ");
        ConCrema conCrema = new ConCrema(cafe);
        CafeConChocolate cafechoco = new CafeConChocolate(conCrema);


        System.out.println("el precio es " + cafechoco.getPrecio());
        System.out.println("Ingredientes  " + cafechoco.getingrdientes());
        
    }

   
    
    



}
