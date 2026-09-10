package src;

import java.util.Stack;

public class Metodos {
    
    public Stack<Pagina> Retroceder(Stack<Pagina> pila){
        Stack<Pagina> pilas_anterior = new Stack<>();
        while(!pila.isEmpty()){
            Pagina o = pila.pop();
            pilas_anterior.push(o);
            System.out.println("Pagina actual: "+pila.peek());
        }
        return pilas_anterior;
    }
}
