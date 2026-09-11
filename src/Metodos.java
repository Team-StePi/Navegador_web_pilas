package src;

import src.Clases.*;
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
  
    public Stack<Pagina> Retroceder(Stack<Pagina> pila){
        Stack<Pagina> pilas_anterior = new Stack<>();
        while(!pila.isEmpty()){
            Pagina o = pila.pop();
            pilas_anterior.push(o);
            System.out.println("Pagina actual: "+pila.peek());
        }
        return pilas_anterior;
    }
  
    public void VerHistorial(Stack<Pagina> Pgs){
        Stack<Pagina> PilaAux = new Stack<>();
        for (int i = 0; i < Pgs.size(); i++) {
            System.out.println(Pgs.peek());
            PilaAux.push(Pgs.peek());
            Pgs.pop();
        }
    }

    public void VerPaginaActual(Stack<Pagina> Pgs){
        String paginaActual = Pgs.peek().getTitulo();
        System.out.println("Pagina actual: " + paginaActual);
    }
}


