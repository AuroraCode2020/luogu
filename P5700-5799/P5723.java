import java.io.*;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    private static boolean[] isPrimerNumber(int n) {
        boolean[] b = new boolean[n + 1];
        b[0] = false;
        b[1] = false;
        for (int i = 2; i < n; i++) {
            b[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (b[i]) {
                for (int j = 2; j * i <= n; j++) {
                    b[i * j] = false;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        ArrayList<Integer> L = new ArrayList<>();
        int sum = 0;
        boolean[] f = isPrimerNumber(n);
        for (int i = 0; i < n + 1; i++) {
            if (f[i] && sum + i > n) {
                break;
            } else if (f[i] && sum + i <= n) {
                sum += i;
                L.add(i);
            }
        }
        for (int i : L) {
            cout.println(i);
        }
        cout.print(L.size());
        cout.flush();
    }
}
