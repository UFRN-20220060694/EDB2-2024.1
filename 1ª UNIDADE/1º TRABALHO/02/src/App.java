import java.util.ArrayList;

import algorithms.BinarySearch;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adiciona os números manualmente à linked list
        list.add(5);
        list.add(17);
        list.add(30);
        list.add(42);
        list.add(55);
        list.add(68);
        list.add(73);
        list.add(86);
        list.add(91);
        list.add(100);

        int index = BinarySearch.search(list, 5);
        System.out.println(index);
    }
}
