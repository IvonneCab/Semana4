package com.uped.proyecto.modelo;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<String> items = new ArrayList<>();

    public void agregar(String producto) {
        items.add(producto);
    }

    // Devuelve copia defensiva para proteger el encapsulamiento
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

}
