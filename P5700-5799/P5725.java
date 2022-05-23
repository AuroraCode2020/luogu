import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    private static void zhengFangXing(int n) {
        int lawer = n;
        n = n * n;
        for (int i = 1; i <= n; i += lawer) {
            for (int j = i; j < i + lawer; j++) {
                if (j < 10) {
                    cout.printf("0%d", j);
                } else {
                    cout.print(j);
                }
            }
            cout.println();
        }
    }

    private static void sanJiaoXing(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int lawer = 1;
        int times;
        int j = 1;
        for (int i = 1 ; i <= n; i++, lawer++) {
            for (int k = 1; k <= n - lawer; k++) {
                cout.print("  ");
            }
            times = 0;
            for ( ; j <= sum && times < lawer; j++, times++) {
                if (j < 10) {
                    cout.printf("0%d", j);
                } else {
                    cout.print(j);
                }
            }
            cout.println();
        }
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        zhengFangXing(n);
        cout.println();
        sanJiaoXing(n);
        cout.flush();
    }
}
