import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    private static int jiecheng(int x){
        if (x==1){
            return 1;
        }
        return x*jiecheng(x-1);
    }

    public static void main(String[] args) throws Exception {
        int n,sum;
        cin.nextToken();
        n = (int) cin.nval;
        sum = jiecheng(n);
        cout.print(sum);
        cout.flush();
    }
}
