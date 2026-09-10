package src;

import java.util.Stack

public class Metodos {
    public void VerHistorial(Stack<Pagina> Pgs){
        Stack<Pagina> PilaAux = new Stack<>;
        for (int i = 0; i < Pgs.size(); i++) {
            System.out.println(Pgs.peek());
            PilaAux.push(Pgs.peek());
            Pgs.pop();
        }
    }

}