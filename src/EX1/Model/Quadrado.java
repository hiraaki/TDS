package EX1.Model;

import EX1.View.Preenchivel;

public class Quadrado extends Retangulo {

    public Quadrado(Ponto p1, int lado) {
        super(p1,
                new Ponto(p1.getX()+lado,
                        p1.getY()+lado));
    }
    @Override
    public void desenhar(){
        System.out.println("Quadrado");
        preencher();
    }
    @Override
    public void preencher(){
        System.out.println("Preencher");
        preencher();
    }


}
