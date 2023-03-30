package Decorator.Decorator2.DecoradoresAbstractos;

import Decorator.Decorator2.Configurable;

public abstract class Cafedecorador implements Configurable {

    protected   Configurable cafe;

    public Cafedecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}



