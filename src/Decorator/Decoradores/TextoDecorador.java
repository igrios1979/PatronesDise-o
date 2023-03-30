package Decorator.Decoradores;

import Decorator.Formateable;

abstract public class TextoDecorador implements Formateable {

     protected Formateable texto;
     // atributo del tipo de la interfaz
    // mantiene una referencia al componente y
    // define una interfaz que se ajusta a la interfaz del componente.

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
