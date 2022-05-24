import java.io.*;
import java.util.LinkedList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        LinkedList<Integer> L = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            cin.nextToken();
            L.add((int) cin.nval);
        }
        int min = L.getFirst();
        int max = L.getFirst();
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = L.get(i);
            sum += temp;
            if (min < temp) {
                min = temp;
            }
            if (max > temp) {
                max = temp;
            }
        }
        cout.printf("%.2f", ((double) sum - (double) min - (double) max) / (double) (n - 2));
        cout.flush();
    }
}
