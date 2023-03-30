package Decorator;

public class Texto implements Formateable{

    //Componente concreto: implementa la interfaz del componente
    // y proporciona una implementación básica de la funcionalidad.

    private String texto;

    public Texto(String frase) {
     this.texto = frase;
        
    }

    @Override
    public String darFormato() { // texto sin formato
        return getTexto();
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
