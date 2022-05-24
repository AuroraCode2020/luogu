import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return 1;
            } else if (o1 == o2) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        cin.nextToken();
        int min = (int) cin.nval, max = (int) cin.nval;
        int temp;
        for (int i = 1; i < n; i++) {
            cin.nextToken();
            temp = (int) cin.nval;
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        cout.print(max - min);
        cout.flush();
    }
}
