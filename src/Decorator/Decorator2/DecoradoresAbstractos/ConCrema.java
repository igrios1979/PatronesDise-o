package Decorator.Decorator2.DecoradoresAbstractos;

import Decorator.Decorator2.Configurable;

public class ConCrema extends Cafedecorador {


    public ConCrema(Configurable cafe) {
        super(cafe);
    }


    @Override
    public float getPrecio() {
        return cafe.getPrecio()+10.3f;
    }

    @Override
    public String getingrdientes() {
        return cafe.getingrdientes()+"crema de leche ";
    }
}
