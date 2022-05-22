import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int k = (int) cin.nval;
        double sum = 0;
        int i;
        for (i = 1; sum < k; i++) {
            sum += 1 / (double) i;
        }
        cout.print(i - 1);
        cout.flush();
    }
}
