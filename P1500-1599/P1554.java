import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int a = (int) cin.nval;
        cin.nextToken();
        int b = (int) cin.nval;
        char[] c;
        int[] num = new int[10];
        for (int i = a; i <= b; i++) {
            c = Integer.toString(i).toCharArray();
            for (char item : c) {
                if (item == '0') num[0]++;
                else if (item == '1') num[1]++;
                else if (item == '2') num[2]++;
                else if (item == '3') num[3]++;
                else if (item == '4') num[4]++;
                else if (item == '5') num[5]++;
                else if (item == '6') num[6]++;
                else if (item == '7') num[7]++;
                else if (item == '8') num[8]++;
                else if (item == '9') num[9]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                cout.print(num[i]);
            } else {
                cout.printf("%d ", num[i]);
            }
        }
        cout.flush();
    }
}
