package es.supermercados.mercadona;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private String numeroCajero;
    private Queue<Cliente> filaClientes;

    public Cajero(String numeroCajero, Queue<Cliente> filaClientes) {
        this.numeroCajero = numeroCajero;
        this.filaClientes = new LinkedList<>();
    }

    public String getNumeroCajero() {
        return this.numeroCajero;
    }

    public void setNumeroCajero(String numeroCajero) {
        this.numeroCajero = numeroCajero;
    }

    public Queue<Cliente> getFilaClientes() {
        return this.filaClientes;
    }

    public void setFilaClientes(Queue<Cliente> filaClientes) {
        this.filaClientes = filaClientes;
    }

    public Queue<Cliente> añadirClienteAleatorio() {
        Cliente clienteAñadido = new Cliente(null, null);
        this.filaClientes.add(clienteAñadido);
        return this.filaClientes;

    }

    @Override
    public String toString() {
        String mensaje = "\n===================================\n" + "* Número de caja: " + this.numeroCajero
                + "\n* Total de clientes: " + this.filaClientes.size() + "\n* Clientes en la fila:\n";
        for (Cliente listaDeClientes : filaClientes) {
            mensaje += "\t" + listaDeClientes.getNombre() + "\n";
        }
        return mensaje;
    }

}
