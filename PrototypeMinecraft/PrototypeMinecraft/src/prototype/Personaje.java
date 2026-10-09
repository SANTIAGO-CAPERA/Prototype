package prototype;

import model.Inventario;

public class Personaje implements Cloneable {

    private String nombre;
    private String clase;
    private Inventario inventario;

    public Personaje(String nombre, String clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.inventario = new Inventario();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public Inventario getInventario() {
        return inventario;
    }

   
    public Personaje clonar() {
        try {
            Personaje copia = (Personaje) super.clone();
            copia.inventario = this.inventario.copiar(); 
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Clase: " + clase + " | Inventario: " + inventario;
    }
}
