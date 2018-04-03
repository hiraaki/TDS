package Ex3;

import java.util.HashSet;
import java.util.Scanner;

public class CadAlunos {
    static Scanner entrada = new Scanner(System.in);
    static HashSet<Aluno> alunos=new HashSet<>();
    private static void cadastrarAlunos(){
        System.out.println("Codigo: ");
        int codigo=entrada.nextInt();
        System.out.println("Nome: ");
        String nome=entrada.nextLine();
        Aluno a=new Aluno(codigo,nome);
        if(!alunos.contains(a)){
            alunos.add(a);
        }else {
            System.out.println("Alunos já cadastrado");
        }
    }
    private static void listarAlunos(){
        alunos.forEach(a->{
            System.out.println(a);
        });
    }
    public static void main(String[] args){

    }
}
