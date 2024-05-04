package es.supermercados.mercadona.menu;

public class Menu {
    public String mostrarMenu() {
        final String MENU = """
                Seleccione una opción:
                1.- Abrir caja
                2.- Añadir cliente
                3.- Atender un cliente
                4.- Ver clientes pendientes
                5.- Cerrar supermercado
                """;
        return MENU;
    }
}
