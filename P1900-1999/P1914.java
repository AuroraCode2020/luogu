import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        cin.nextToken();
        String s = cin.sval;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] + n > 'z') {
                c[i] = (char) ('a' + c[i] + n - 'z' - 1);
            } else {
                c[i] += n;
            }
        }
        cout.print(new String(c));
        cout.flush();
    }
}
