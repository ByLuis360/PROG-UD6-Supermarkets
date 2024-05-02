package es.supermercados.mercadona;

import java.util.Random;

public class Tienda {
    private static String[] porductosDisponibles = { "doritos", "manzana", "chocolate", "helado", "papas fritas",
            "platano", "pan",
            "coca-cola", "agua", "leche", "queso"
    };

    private static String[] nombresDisponibles = { "Luis", "Marcelo", "JJ", "Astrid", "Jenny", "Sergio", "Jorge",
            "Enrique", "Ayoze", "Ian", "Kevin", "Fran", "Sebas", "Miguel", "Diego", "William", "Adri", "Edu", "Gabriel",
            "Bryan", "Pepe"
    };

    public static String productoAleatorio() {
        Random productoRandom = new Random();
        int posicionDelProductoAleatorio = productoRandom.nextInt(porductosDisponibles.length);
        return porductosDisponibles[posicionDelProductoAleatorio];
    }

    public static String personaAleatoria() {
        Random nombreRandom = new Random();
        int posicionDelNombreAleatorio = nombreRandom.nextInt(nombresDisponibles.length);
        return nombresDisponibles[posicionDelNombreAleatorio];
    }

}
