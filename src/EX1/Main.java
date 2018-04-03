package EX1;

import EX1.Model.*;

public class Main {
    public void desenharPintar(){

    }
    public static void main(String[] args){
        Ponto p1,p2,p3;
        p1=new Ponto(0,0);
        p2=new Ponto(0,1);
        p3=new Ponto(1,1);
        Triangulo t=new Triangulo(p1,p2,p3);
        System.out.println(t.Area());
        Forma f = new Retangulo(p1,p3);
        f.desenhar();

    }
}
