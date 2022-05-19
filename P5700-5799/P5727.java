import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        ArrayList<Integer> L = new ArrayList<>();
        while (n != 1) {
            L.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        L.add(1);
        for (int i = L.size() - 1; i >= 0; i--) {
            if (i == 0) {
                cout.print(L.get(i));
            } else {
                cout.printf("%d ", L.get(i));
            }
        }
        cout.flush();
    }
}
