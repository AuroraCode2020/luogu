import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        int[] num = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            cin.nextToken();
            num[i] = (int) cin.nval;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (num[j] < num[i]) {
                    result[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                cout.printf("%d", result[i]);
            } else {
                cout.printf("%d ", result[i]);
            }
        }
        cout.flush();
    }
}
