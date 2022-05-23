import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        int sum = 0;
        int k = 1;
        for (int i = 1; n != 0; i++) {
            for (int j = 1; j <= i; j++, n--) {
                if (n == 0) {
                    break;
                }
                sum += k;
            }
            k++;
        }
        cout.print(sum);
        cout.flush();
    }
}
