package model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<String> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    // Copia profunda: crea una lista NUEVA con los mismos elementos
    public Inventario copiar() {
        Inventario copia = new Inventario();
        copia.items = new ArrayList<>(this.items);
        return copia;
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
