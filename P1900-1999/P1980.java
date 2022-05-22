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
        char x = (char) ((char) cin.nval + '0');
        char[] c;
        int t = 0;
        for (int i = 1; i <= n; i++) {
            c = Integer.toString(i).toCharArray();
            for (char j : c) {
                if (j == x) {
                    t++;
                }
            }
        }
        cout.print(t);
        cout.flush();
    }
}
