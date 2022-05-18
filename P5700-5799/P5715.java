import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int[] num = new int[3];
        cin.nextToken();
        num[0] = (int) cin.nval;
        cin.nextToken();
        num[1] = (int) cin.nval;
        cin.nextToken();
        num[2] = (int) cin.nval;
        Arrays.sort(num);
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                cout.print(num[2]);
            } else {
                cout.printf("%d ", num[i]);
            }
        }
        cout.flush();
    }
}
