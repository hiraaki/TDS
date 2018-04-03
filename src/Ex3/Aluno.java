package Ex3;

public class Aluno {
    private int id;
    private String nome;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o){
        //reflexivo
        if (o==null)
            return false;
        if (o.getClass()!=this.getClass())
            return false;
        if(o==this) {
            Aluno other = (Aluno) o;
            if (this.id == other.id && this.nome.equals(other.nome)) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

    //retorna sempre um valor unico para o objeto em questão
    @Override
    public int hashCode(){
        return 29*id+13*nome.hashCode();
    }
}
