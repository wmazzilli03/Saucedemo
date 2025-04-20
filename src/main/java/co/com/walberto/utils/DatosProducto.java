package co.com.walberto.utils;

import co.com.walberto.ui.Productos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.stream.Collectors;

public class DatosProducto {

    public static final List<String> PRODUCTOS = Arrays.asList(
            "Sauce Labs Backpack",
            "Sauce Labs Bike Light",
            "Sauce Labs Bolt T-Shirt",
            "Sauce Labs Fleece Jacket",
            "Sauce Labs Onesie",
            "Test.allTheThings() T-Shirt (Red)"
    );

    public static int obtenerNumeroRandomDel1Al6() {
        return new Random().nextInt(6) + 1;
    }

    public static String obtenerProductoAleatorio() {
        System.out.println("Producto al azar: " + PRODUCTOS.get(new Random().nextInt(PRODUCTOS.size())));
        for (int i = 0 ; i < PRODUCTOS.size() ;i++ ){
            System.out.println("Productos individuales" + PRODUCTOS.get(i));
        }
        return PRODUCTOS.get(new Random().nextInt(PRODUCTOS.size()));
    }

    public static void obtenerProductoAleatorio(Actor actor) {
        List<String> productosDesordenados = new ArrayList<>(PRODUCTOS);
        Collections.shuffle(productosDesordenados);
        int number = obtenerNumeroRandomDel1Al6();
        for (int i = 0 ; i < number ;i++ ){
            System.out.println("Productos individuales 2" + productosDesordenados.get(i));
            actor.attemptsTo(
                    Click.on(Productos.botonAgregarProductoAlAzar(productosDesordenados.get(i)))
            );
        }
        }

    }
