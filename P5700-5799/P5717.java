import java.io.*;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    private static boolean judgeYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            } else {
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int a = (int) cin.nval;
        cin.nextToken();
        int b = (int) cin.nval;
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (judgeYear(i)) {
                L.add(i);
            }
        }
        cout.println(L.size());
        for (int i = 0; i < L.size(); i++) {
            if (i == L.size() - 1) {
                cout.print(L.get(i));
            } else {
                cout.printf("%d ", L.get(i));
            }
        }
        cout.flush();
    }
}
