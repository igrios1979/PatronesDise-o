package Decorator.Decorator2;

public class Cafe implements  Configurable {

private float precio;
private String nombre;

    public Cafe(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }

    @Override
    public String getingrdientes() {
        return this.nombre;
    }
}
