import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String s = in.readLine();
        String[] str = s.split(" ");
        for (int i = str.length - 2; i >= 0; i--) {
            if (i == 0) {
                cout.print(str[i]);
            } else {
                cout.printf("%s ",str[i]);
            }
        }
        cout.flush();
    }
}
