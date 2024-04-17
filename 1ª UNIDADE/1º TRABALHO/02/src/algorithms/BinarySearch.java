package algorithms;

import java.util.ArrayList;

public class BinarySearch {

    public static int search(ArrayList<Integer> list, int key) {
        if (list.size() == 0)
            return -1;

        int begin = 0, end = list.size() - 1;

        while (true) {
            int i = (begin + end) / 2;
            int v = list.get(i);

            if (key == v) {
                return i;
            } else if (v > key) {
                end = i - 1;
                continue;
            } else {
                begin = i + 1;
            }

            if (begin == end) {
                v = list.get(begin);
                if (v == key) {
                    return begin;
                }
                break;
            }
        }
        return -1;
    }
}
