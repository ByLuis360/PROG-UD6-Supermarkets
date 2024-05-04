package es.supermercados.mercadona;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private String numeroCajero;
    private Queue<Cliente> filaClientes;
    private boolean cajaAbierta;

    public Cajero(String numeroCajero, Queue<Cliente> filaClientes, boolean cajaAbierta) {
        this.numeroCajero = numeroCajero;
        this.filaClientes = new LinkedList<>();
        this.cajaAbierta = false;
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

    public boolean isCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }

    public void abrirCaja() {
        if (cajaAbierta) {
            System.out.println("La caja ya estaba abierta antes");
        } else {
            cajaAbierta = true;
            System.out.println("Se ha abierto la caja");
        }
    }

    public void añadirClienteAleatorio() {
        if (cajaAbierta) {
            Cliente clienteAñadido = new Cliente(null, null);
            this.filaClientes.add(clienteAñadido);
            System.out.println(clienteAñadido);
        } else {
            System.out.println("No se puede añadir un cliente a la cola porque la caja está cerrada");
        }
    }

    public void atenderCliente() {
        if (!filaClientes.isEmpty()) {
            Cliente clienteAtendido = filaClientes.poll();
            System.out.println("El cliente " + clienteAtendido.getNombre() + " ha sido atendido");
        } else {
            System.out.println("No hay ningún cliente en la fila");
        }
    }

    public boolean cerrarSupermercado() {
        if (filaClientes.isEmpty()) {
            cajaAbierta = false;
            System.out.println("La caja está cerrada y el mercadona también cierra por hoy hasta pornto!");
            return false;
        } else {
            System.out.println(
                    "No se puede cerrar la caja hasta que no termines de atender a todos los clientes, anda espabila que la vida te va a coméh");
            return true;
        }
    }

    @Override
    public String toString() {
        String mensaje = "\n===================================\n" + "* Número de caja: " + this.numeroCajero
                + "\n* Total de clientes: " + this.filaClientes.size() + "\n* Clientes en la fila:\n";
        for (Cliente listaDeClientes : filaClientes) {
            mensaje += "\t" + listaDeClientes.getNombre() + "\n";
        }
        mensaje += "\n===================================\n";
        if (filaClientes.isEmpty()) {
            System.out.println("No quedan clientes pendientes");
        }
        return mensaje;
    }

}
