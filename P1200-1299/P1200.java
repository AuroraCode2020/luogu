import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        char[] a = in.readLine().toCharArray();
        char[] b = in.readLine().toCharArray();
        int sum1 = 1;
        int sum2 = 1;
        for (char c : a) {
            sum1 *= (c - 'A' + 1);
        }
        for (char c : b) {
            sum2 *= (c - 'A' + 1);
        }
        if (sum1 % 47 == sum2 % 47) {
            cout.print("GO");
        } else {
            cout.print("STAY");
        }
        cout.flush();
    }
}
