import java.io.*;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            L.add(i);
        }
        int start = 1;
        for (Integer integer : L) {
            for (int j = 1; j <= integer; j++) {
                if (start < 10) {
                    cout.printf("0%d", start);
                } else {
                    cout.print(start);
                }
                start++;
            }
            cout.println();
        }
        cout.flush();
    }
}
