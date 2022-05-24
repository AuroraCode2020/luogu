import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int sum = 0;
        int cost = 0;
        int chuxu = 0;
        boolean flag = false;
        for (int i = 1; i <= 12; i++) {
            sum -= cost;
            sum += 300;
            cin.nextToken();
            cost = (int) cin.nval;
            if (sum >= cost) {
                if (sum - cost >= 100) {
                    chuxu += (sum - cost) / 100 * 100;
                    sum -= (sum - cost) / 100 * 100;
                }
            } else {
                cout.printf("-%d", i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            cout.printf("%.0f\n", (double) chuxu * 1.2 + (double) sum - (double) cost);
        }
        cout.flush();
    }
}
