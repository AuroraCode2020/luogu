import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        char[] c = in.readLine().toCharArray();
        int boy = 0, girl = 0;
        for (int i = 0; i < c.length - 2; i++) {
            if (c[i] == 'b' || c[i + 1] == 'o' || c[i + 2] == 'y') boy++;
        }
        for (int i = 0; i < c.length - 3; i++) {
            if (c[i] == 'g' || c[i + 1] == 'i' || c[i + 2] == 'r' || c[i + 3] == 'l') girl++;
        }
        cout.println(boy);
        cout.print(girl);
        cout.flush();
    }
}
