import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        String[] str = in.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        char[][] c = new char[n][m];
        for (int i = 0; i < n; i++) {
            c[i] = in.readLine().toCharArray();
        }
        char[][] r = new char[n + 2][m + 2];
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < m + 2; j++) {
                r[i][j] = '0';
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (c[i - 1][j - 1] == '*') {
                    r[i][j] = '*';
                    for (int a = i - 1; a < i - 1 + 3; a++) {
                        for (int b = j - 1; b < j - 1 + 3; b++) {
                            if (r[a][b] != '*') r[a][b]++;
                        }
                    }
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                cout.print(r[i][j]);
            }
            cout.println();
        }
        cout.flush();
    }
}
