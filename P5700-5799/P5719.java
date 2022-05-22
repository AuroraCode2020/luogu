import java.io.*;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int n, k;
        cin.nextToken();
        n = (int) cin.nval;
        cin.nextToken();
        k = (int) cin.nval;
        int t1 = 0, t2 = 0;
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                t2++;
                sum2 += i;
            } else {
                t1++;
                sum1 += i;
            }
        }
        cout.printf("%.1f %.1f", (double) sum2/ t2, (double) sum1 / t1);
        cout.flush();
    }
}
