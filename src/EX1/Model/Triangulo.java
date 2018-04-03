package EX1.Model;

public class Triangulo extends Forma{
    private Reta R1;
    private Reta R2;
    private Reta R3;

    public Reta getR1() {
        return R1;
    }

    public void setR1(Reta r1) {
        R1 = r1;
    }

    public Reta getR2() {
        return R2;
    }

    public void setR2(Reta r2) {
        R2 = r2;
    }

    public Reta getR3() {
        return R3;
    }

    public void setR3(Reta r3) {
        R3 = r3;
    }

    public Triangulo(Ponto p1,Ponto p2,Ponto p3) {
        R1 = new Reta(p1,p2);
        R2 = new Reta(p2,p3);
        R3 = new Reta(p3,p1);
    }

    /*
    * Area soma dos produtos dividido por dois
    *
    * */
    public double Area(){
        double p1=0.0;
        double p2=0.0;
        p1=R1.getP1().getX()*R1.getP2().getY();
        p1+=R2.getP1().getX()*R2.getP2().getY();
        p1+=R3.getP1().getX()*R3.getP2().getY();
        p1+=R3.getP1().getX()*R1.getP1().getY();

        p2=R1.getP1().getY()*R1.getP2().getX();
        p2+=R2.getP1().getY()*R2.getP2().getX();
        p2+=R3.getP1().getY()*R3.getP2().getX();
        p2+=R3.getP1().getY()*R1.getP2().getX();

        return (p2-p1)/2;
    }
    public double Perimetro(){
        return this.R1.tamanho()+this.R2.tamanho()+this.R3.tamanho();
    }
    @Override
    public void desenhar(){
        System.out.println("Triangulo");
    }
}
