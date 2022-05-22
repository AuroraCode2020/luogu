import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    private static int add(char[] a, char item, int n) {
        int sum = 0;
        for (char value : a) {
            if (value == item) {
                sum += n;
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        char[] a = new char[]{' ', 'a', 'd', 'g', 'j', 'm', 'p', 't', 'w'};
        char[] b = new char[]{'b', 'e', 'h', 'k', 'n', 'q', 'u', 'x'};
        char[] c = new char[]{'c', 'f', 'i', 'l', 'o', 'r', 'v', 'y'};
        char[] d = new char[]{'s', 'z'};
        int sum = 0;
        String s = in.readLine();
        char[] t = s.toCharArray();
        for (char item : t) {
            sum += add(a, item, 1);
            sum += add(b, item, 2);
            sum += add(c, item, 3);
            sum += add(d, item, 4);
        }
        cout.print(sum);
        cout.flush();
    }
}
