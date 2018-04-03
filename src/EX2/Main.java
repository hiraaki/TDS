package EX2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        //Integer[] intsVet = new Integer[10];
        ArrayList<Integer> ints=new ArrayList<>();
        ints.add(10); //Autoboxing int->Interger
        ints.add(7);
        ints.add(7);
        ints.add(4);
        System.out.println("ints:"+ints);
        ints.add(0,50);
        System.out.println("ints:"+ints);
        //ints.remove(7); tenta remover a primeira ocorrencia, senão o index
        if(ints.contains(7)){
            ints.remove(new Integer(7));
        }
        System.out.println("ints:"+ints);
        ints.remove(new Integer(7));
        System.out.println(Collections.binarySearch(ints,50));
        Collections.sort(ints);
        System.out.println(Collections.binarySearch(ints,50));
        System.out.println("ints:"+ints);
        //remover a ultima posição
        ints.remove(ints.size()-1);
        System.out.println("ints:"+ints);
        ints.clear();
        System.out.println("ints:"+ints);
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Verde");
        strings.add("Branco");
        strings.add("Azul");
        strings.add("Amarelo");
        System.out.println("Strings:"+strings);
        strings.remove("Azul");
        System.out.println("Strings:"+strings);
        Collections.sort(strings);
        System.out.println("Strings:"+strings);

    }
}
