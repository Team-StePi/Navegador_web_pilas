package src;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Pagina> PaginasWeb = new Stack<>();
        boolean GoOn = true;
        while (GoOn) {
            try {
                System.out.println("\n==========================================================\n");
                System.out.println("           BIENVENIDO AL INTENTO DE NAVEGADOR WEB          ");
                System.out.println("\n==========================================================\n");
                System.out.println("Ingrese el número de la funcionalidad que desea ejecutar (1-3): ");
                System.out.println("1. Ingresar a una nueva página web");
                System.out.println("2. Retroceder a la página anterior");
                System.out.println("3. Ver historial de navegación");
                System.out.println("Presione 0 para salir.");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        GoOn = false;
                        break;
                    case 1:
                        NuevaPagina(PaginasWeb, sc);
                        break;
                    case 2:
                        Retroceder(PaginasWeb);
                        break;
                    case 3:
                        VerHistorial(PaginasWeb);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 3.");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                sc.nextLine(); // Clear the buffer
            }

        }
    }
}