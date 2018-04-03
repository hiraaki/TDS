package EX1.Model;

import java.awt.*;

/*
* Classe abstrata para forma geometrica
* Pode conter me
*/
public abstract class Forma {
    private Color cor;
    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    //Metodo sem corpo para chamada genérica
    public abstract void desenhar();
}
