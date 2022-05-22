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
        int m = (int) cin.nval;
        int[] num = new int[n];
        int[] t = new int[m];
        for (int i = 0; i < n; i++) {
            cin.nextToken();
            num[i] = (int) cin.nval;
        }
        for (int i = 0; i < m; i++) {
            cin.nextToken();
            t[i] = (int) cin.nval;
        }
        for (int i = 0; i < m; i++) {
            cout.println(num[t[i] - 1]);
        }
        cout.flush();
    }
}
