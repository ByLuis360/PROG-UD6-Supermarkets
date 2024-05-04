import java.util.Scanner;

import es.supermercados.mercadona.Cajero;
import es.supermercados.mercadona.menu.Menu;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Menu MENU = new Menu();
        Cajero caja = new Cajero("1", null, false);
        boolean seguirPreguntando = true;
        String opcion;
        while (seguirPreguntando) {
            System.out.println(MENU.mostrarMenu());
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    caja.abrirCaja();
                    break;
                case "2":
                    caja.añadirClienteAleatorio();
                    break;
                case "3":
                    caja.atenderCliente();
                    break;
                case "4":
                    System.out.println(caja);
                    break;
                case "5":

                    break;

                default:
                    break;
            }
        }

    }
}
