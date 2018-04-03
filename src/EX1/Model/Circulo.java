package EX1.Model;

import EX1.View.Preenchivel;

public class Circulo extends Forma implements Preenchivel{
    private Ponto centro;
    private int raio;

    public Circulo(Ponto centro, int raio) {
        this.centro = centro;
        this.raio = raio;
    }

    /**
     * Calcula o diâmetro da circunferência.
     * @return Diametro=2*raio
     */
    public double diametro() {
        return 2 * raio;
    }

    /**
     * Calcula o comprimento da circunferencia
     * @return 2*pi*raio
     */
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    /**
     * Calcula a area da circunferência.
     * @return Area = PI * raio^2
     */
    public double area() {
        return Math.PI * (raio*raio);
    }
    @Override
    public void desenhar(){
        System.out.println("Circulo");
        preencher();
    }
    @Override
    public void preencher(){
        System.out.println("Preencher");
    }

}