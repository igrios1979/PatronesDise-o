package org.ignacio.rios;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectandose a BD ....");

    }


    public static ConexionBDSingleton getInstance(){
        // se podria preguntar instancia == null pero esta es mas elegante

        if(!(instancia instanceof  ConexionBDSingleton)){
            instancia = new ConexionBDSingleton();
        }

        return instancia;

    }





}
