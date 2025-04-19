package co.com.walberto.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DatosProducto {

    public static final List<String> PRODUCTOS = Arrays.asList(
            "Sauce Labs Backpack",
            "Sauce Labs Bike Light",
            "Sauce Labs Bolt T-Shirt",
            "Sauce Labs Fleece Jacket",
            "Sauce Labs Onesie",
            "Test.allTheThings() T-Shirt (Red)"
    );

    public static String obtenerProductoAleatorio() {
        return PRODUCTOS.get(new Random().nextInt(PRODUCTOS.size()));
    }

}
