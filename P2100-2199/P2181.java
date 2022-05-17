import java.io.*;
import java.math.BigInteger;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        long n = (long) cin.nval;
        if (n<4){
            System.out.println(0);
            return;
        }
        else {
            BigInteger bigInteger1 = new BigInteger(String.valueOf(n));
            BigInteger bigInteger2 = new BigInteger(String.valueOf(n-1));
            BigInteger bigInteger3 = new BigInteger(String.valueOf(n-2));
            BigInteger bigInteger4 = new BigInteger(String.valueOf(n-3));
            BigInteger bigInteger5 = new BigInteger(String.valueOf(24));
            BigInteger result = bigInteger4.multiply(bigInteger3.multiply(bigInteger1.multiply(bigInteger2))).divide(bigInteger5);
            cout.print(result);
        }
        cout.flush();
    }
}
