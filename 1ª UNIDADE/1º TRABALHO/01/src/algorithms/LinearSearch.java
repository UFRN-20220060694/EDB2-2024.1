package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinearSearch {

    public static int search(ArrayList<Integer> list, int key) {
        return search(list, list.size(), key);
    }

    private static int search(ArrayList<Integer> list, int size, int key) {

        if (size == 0)
            return -1;

        int index = size - 1;

        if (list.get(index) == key)
            return index;

        return search(list, index, key);
    }
}
