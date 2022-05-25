import java.io.*;
import java.util.LinkedList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        int[] num = new int[n * n];
        int sum = 0;
        int temp;
        boolean flag = false;
        int j = 0;
        while (sum != n * n) {
            cin.nextToken();
            temp = (int) cin.nval;
            sum += temp;
            for (int i = 0; i < temp; i++) {
                if (!flag) {
                    num[j] = 0;
                } else {
                    num[j] = 1;
                }
                j++;
            }
            flag = !flag;
        }
        j = 0;
        for (int i = 0; i < n * n; i++) {
            cout.print(num[j]);
            if ((j + 1) % n == 0) cout.println();
            j++;
        }
        cout.flush();
    }
}
