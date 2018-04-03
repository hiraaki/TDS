package EX1.Model;

import EX1.View.Preenchivel;

public class Retangulo extends Forma implements Preenchivel {
    private Reta altura;
    private Reta largura;

    public Retangulo(Ponto p1, Ponto p2) {
        Ponto p3 = new Ponto(p1.getX(),
                p2.getY());
        this.altura = new Reta(p1, p3);
        this.largura = new Reta(p2, p3);
    }

    public double perimetro() {
        return 2 * altura.tamanho()
                + 2 * largura.tamanho();
    }

    public double area() {
        return largura.tamanho()
                * altura.tamanho();
    }
    @Override
    public void desenhar(){
        System.out.println("Retangulo");
        preencher();
    }

    @Override
    public void preencher(){
        System.out.println("Preencher");
    }
}

