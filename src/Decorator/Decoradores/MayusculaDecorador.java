package Decorator.Decoradores;

import Decorator.Formateable;

import java.util.Locale;

//Decorador concreto: agrega responsabilidades adicionales al componente.

public class MayusculaDecorador extends TextoDecorador {

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }
}
