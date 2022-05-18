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
        if (a % 400 == 0) {
            if (a % 4 == 0) {
                cout.print("1");
            } else {
                cout.print("0");
            }
        } else {
            if (a % 4 == 0) {
                if (a % 100 == 0) {
                    cout.print("0");
                } else {
                    cout.print("1");
                }
            } else {
                cout.print("0");
            }
        }
        cout.flush();
    }
}
