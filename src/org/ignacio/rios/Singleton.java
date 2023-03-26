package org.ignacio.rios;

public class Singleton {

    public static void main(String[] args) {
        
        for (int i = 0; i<100;i++){
            ConexionBDSingleton v = ConexionBDSingleton.getInstance();
            System.out.println("v = " + v);
                    }

    }
}
