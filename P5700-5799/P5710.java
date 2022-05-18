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
        int a = (int) cin.nval;
        int x, y;
        if (a % 2 == 0) {
            x = 1;
        } else {
            x = 0;
        }
        if (a > 4 && a <= 12) {
            y = 1;
        } else {
            y = 0;
        }
        if (x == 1 && y == 1) {
            cout.print("1 ");
        } else {
            cout.print("0 ");
        }
        if (x == 1 || y == 1) {
            cout.print("1 ");
        } else {
            cout.print("0 ");
        }
        if ((x == 1 && y != 1) || (x != 1 && y == 1)) {
            cout.print("1 ");
        } else {
            cout.print("0 ");
        }
        if (x != 1 && y != 1) {
            cout.print("1");
        } else {
            cout.print("0");
        }
        cout.flush();
    }
}
