package Decorator.Decorator2.DecoradoresAbstractos;

import Decorator.Decorator2.Configurable;

public class CafeConChocolate extends Cafedecorador{


    public CafeConChocolate(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio()+6f;
    }

    @Override
    public String getingrdientes() {
        return cafe.getingrdientes()+"Chocolate";
    }
}
