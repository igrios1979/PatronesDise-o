package Composite;

public class EjemploComposite {

    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addHijos(new Archivo("Patrones.doc"));

        Directorio directorio = new Directorio("directorio_principal");
        directorio.addHijos(new Archivo("archivo1.txt")).addHijos(new Directorio("subdirectorio1")).addHijos(new Archivo("archivo2.txt"));
        System.out.println("//" + directorio.mostrar(0));


        boolean encontrado = directorio.buscar("archivo1.txt");

        System.out.println("encontrado = " + encontrado);



    }
}
