package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente { // se compone de un listade componentes y hereda tambien de componente

    /*
    *  El método "addHijos(Componente c)" no devuelve una lista, sino una instancia de la
    *  clase "Directorio" actual.
    *  La palabra clave "this" se refiere al objeto actual de la clase "Directorio".
    *  Cuando se llama al método "addHijos", se agrega el componente secundario "c"
    *  a la lista de componentes secundarios "hijos" y luego se devuelve el objeto actual
    *  "Directorio" con la instrucción "return this".
    *   El propósito de devolver el objeto actual "Directorio"
    *   es permitir el encadenamiento de métodos. Es decir, después de llamar
    *   al método "addHijos" en un objeto "Directorio", se puede llamar inmediatamente
    *   a otro método en ese mismo objeto sin tener que almacenar la referencia del objeto
    *   en una variable separada.
    * */

    private List<Componente> hijos; // Lista de componentes

    public Directorio(String nombre) { // constructor instancia al padre Super
        super(nombre);
        this.hijos = new ArrayList<>(); // inicializa la lista de componentes

    }

    public Directorio addHijos(Componente c) {
        hijos.add(c);
        return this;

    }

    public void eliminarhijos(Componente c){
        hijos.remove(c);



    }

    @Override
    public String mostrar(int nivel) {
       StringBuilder sb = new StringBuilder("\t".repeat(nivel));
       sb.append(nombre)
               .append("/")
               .append("\n");
       for(Componente hijo : this.hijos){
           sb.append(hijo.mostrar(nivel+1));
           if(hijo instanceof Archivo){
                sb.append("\n");

           }


       }
         return sb.toString();




    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
     /*    for(Componente h : this.hijos){
             if(h.buscar(nombre)){
                 return true;
             }

         }*/
        return hijos.stream().anyMatch(h->h.buscar(nombre));

         }

    }



