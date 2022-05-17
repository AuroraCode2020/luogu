import java.io.*;
import java.math.BigInteger;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int m = (int) cin.nval;
        cin.nextToken();
        int t = (int) cin.nval;
        cin.nextToken();
        int s = (int) cin.nval;

        if (t == 0) {
            cout.print("0");
        } else {
            if (s % t == 0) {
                if (m - s / t <= 0) {
                    cout.print("0");
                } else {
                    cout.printf("%d", m - s/ t);
                }
            } else {
                if (m - (s / t + 1) <= 0) {
                    cout.print("0");
                } else {
                    cout.printf("%d", m - (s / t + 1));
                }
            }
        }
        cout.flush();
    }
}
