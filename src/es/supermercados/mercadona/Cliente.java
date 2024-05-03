package es.supermercados.mercadona;

import java.util.Stack;

public class Cliente {
    private String nombre;
    private Stack<String> cestaDeLaCompra = new Stack<>();


    public Cliente(String nombre) {
        this.nombre = Tienda.personaAleatoria();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = Tienda.personaAleatoria();
    }

    public Stack<String> getCestaDeLaCompra() {
        return this.cestaDeLaCompra;
    }

    public void setCestaDeLaCompra(Stack<String> cestaDeLaCompra) {
        this.cestaDeLaCompra = cestaDeLaCompra;
    }

    public int productosTotalesEnLaCesta() {
        int espacioTotal = (int) (Math.random() * 10) + 1;
        return espacioTotal;
    }

    public void añadirProductosACesta() {
        for (int i = 0; i < productosTotalesEnLaCesta(); i++) {
            this.cestaDeLaCompra.add(Tienda.productoAleatorio());
        }
    }

    @Override
    public String toString() {
        String mensaje = "\n===================================\n" + "* Nombre: " + this.nombre + "\n"
                + "*Total de productos: " + this.cestaDeLaCompra.size() + "\n" + "*Lista de artículos en la cesta:\n";
        for (String listaDeArticulos : cestaDeLaCompra) {
            mensaje += "\t" + listaDeArticulos + "\n";
        }
        mensaje += "===================================";
        return mensaje;

    }

}
