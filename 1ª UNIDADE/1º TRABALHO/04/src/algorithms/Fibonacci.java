package algorithms;

public class Fibonacci {

    public static int getSequence(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int old = 0, current = 1;
            for (int i = 2; i < n; i++) {
                int aux = current;
                current = old + current;
                old = aux;
            }
            return current;
        }
    }
}
