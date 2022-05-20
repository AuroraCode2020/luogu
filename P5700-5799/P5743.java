import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int n, sum = 1, i = 0;
        cin.nextToken();
        n = (int) cin.nval;
        while (i < n - 1) {
            sum = (sum + 1) * 2;
            i++;
        }
        cout.print(sum);
        cout.flush();
    }
}
