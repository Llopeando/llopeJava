package dev.llopeando.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaCompra {

    private final ArrayList<String> lista;
    public ListaCompra() {
        this.lista = new ArrayList<>();
    }

    public void crearLista() {
        System.out.println("👋 ¿Qué quieres añadir a la lista de la compra? (escribe 'hecho' para terminar)");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String producto = scanner.nextLine().trim();
            if (producto.equalsIgnoreCase("hecho")) {
                break;
            } else {
                this.lista.add(producto);
            }
        }
    }

    public void verLista() {
        System.out.println("\nℹ️ En la lista hay " + this.lista.size() + " cosas.");
        for (String producto : this.lista) {
            System.out.println(producto);
        }
        System.out.println("\n❓ ¿Vamos a comprar 'Patatas'? " + this.lista.contains("Patatas"));
        quitarAlgoDeLista();
    }

    void quitarAlgoDeLista() {
        System.out.println("❔ ¿Quieres quitar algo de la lista? (s/n)");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext("s")) {
            System.out.println("❔ ¿Que quieres quitar? (escribe 'hecho' para terminar)");
            Scanner scanner2 = new Scanner(System.in);
            while (true) {
                String productoAQuitar = scanner2.nextLine().trim();
                if (productoAQuitar.equalsIgnoreCase("hecho")) {
                    break;
                } else {
                    this.lista.remove(productoAQuitar);
                }
            }
            verLista();
        } else {
            System.out.println("👋 ¡Hasta la próxima compra!");
        }
    }
}
