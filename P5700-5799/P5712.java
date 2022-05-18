import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String s = "Today, I ate 1 apple.";
        cin.nextToken();
        int n = (int) cin.nval;
        if (n == 1) {
            cout.print(s);
        } else if (n == 0) {
            s = s.replace('1', '0');
            cout.print(s);
        } else {
            String c = Integer.toString(n);
            s = s.replace("1", c);
            s = s.replace("apple.", "apples.");
            cout.print(s);
        }
        cout.flush();
    }
}
