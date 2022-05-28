import java.io.*;
import java.util.ArrayDeque;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String s = "";
        while (cin.nextToken() != StreamTokenizer.TT_EOF) {
            s += cin.sval;
        }
        char[] c = s.toCharArray();
        int a = 0, b = 0;
        for (char i : c) {
            if (i == 'E') {
                cout.printf("%d:%d\n\n", a, b);
                break;
            } else {
                if (i == 'W') {
                    a++;
                } else if (i == 'L') {
                    b++;
                }
                if ((a >= 11 && a - b >= 2) || (b >= 11 && b - a >= 2)) {
                    cout.printf("%d:%d\n", a, b);
                    a = b = 0;
                }
            }
        }
        a = b = 0;
        for (char i : c) {
            if (i == 'E') {
                cout.printf("%d:%d", a, b);
                break;
            } else {
                if (i == 'W') {
                    a++;
                } else if (i == 'L') {
                    b++;
                }
                if ((a >= 21 && a - b >= 2) || (b >= 21 && b - a >= 2)) {
                    cout.printf("%d:%d\n", a, b);
                    a = b = 0;
                }
            }
        }
        cout.flush();
    }
}
