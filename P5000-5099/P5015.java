import java.io.*;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String s = in.readLine();
        int sum = 0;
        char[] c = s.toCharArray();
        for (char i : c) {
            if (i != ' ' && i != '\n') {
                sum ++;
            }
        }
        cout.print(sum);
        cout.flush();
    }
}
