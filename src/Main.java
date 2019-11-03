import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<String>();
        lista1.add("1");
        lista1.add("2");
        lista1.add("3");
        lista1.add("4");

        System.out.println("kopiowanie jendnej listy do drugiej");

        System.out.println(lista1);

        List<String> lista2 = new ArrayList<String>();
        lista2.add("A");
        lista2.add("B");
        lista2.add("C");
        lista2.add("D");

        System.out.println(lista2);

        Collections.copy(lista1, lista2);

        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println();

        System.out.println("tasowanie elementow listy");

        Collections.shuffle(lista1);

        System.out.println(lista1);

        System.out.println("wypisanie odwrotnosci elementow listy");

        Collections.reverse(lista2);

        System.out.println(lista2);
        System.out.println();

        System.out.println("odjecie elementow listy");

        List<String> substract_list = lista2.subList(2, 4);

        System.out.println("odjalem dwa pierwsze elementy wiec zostaje:" + substract_list);
        System.out.println();


    }
}