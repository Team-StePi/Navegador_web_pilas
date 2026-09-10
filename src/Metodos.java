package src;

import Clases.Pagina;
import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<Pagina> NuevaPagina(Stack<Pagina> pila, Scanner sc){
        System.out.println("Ingrese la URL de la página web: ");
        String url = sc.nextLine();
        System.out.println("Ingrese el título de la página web: ");
        String titulo = sc.nextLine();
        Pagina pagina = new Pagina(url, titulo);
        pila.push(pagina);
        System.out.println("Página ingresada correctamente.");
        return pila;
    }
  
    public void VerHistorial(Stack<Pagina> Pgs){
        Stack<Pagina> PilaAux = new Stack<>;
        for (int i = 0; i < Pgs.size(); i++) {
            System.out.println(Pgs.peek());
            PilaAux.push(Pgs.peek());
            Pgs.pop();
        }
    }  
}


