package Ex3;

public class Main {
    public static void main(String[] args){
        Integer i0= new Integer(10);
        Integer i1= new Integer(10);
        System.out.println(i0==i1);
        System.out.println(i0.equals(i1));
        Aluno a0= new Aluno(1,"Aluno1");
        Aluno a1= new Aluno(1,"Aluno1");
        System.out.println(a0==a1);
        System.out.println(a0.equals(a1));
        a0.setNome("Aluno2");
        System.out.println(a0.equals(a1));
        Aluno a2=null;
        System.out.println(a0.equals(a0));
        System.out.println(a0.equals(i0));
        System.out.println(a0.equals(a2));
    }
}
