package algorithms;

import java.util.ArrayList;

public class SortCheck {

    public static boolean check(ArrayList<Integer> list) {
        if(list.size() < 1) return true;

        Integer old = null;
        for (Integer item : list) {
            if (old == null) {
                old = item;
                continue;
            }

            if(old > item) return false;

            old = item;
        }

        return true;
    }
}
