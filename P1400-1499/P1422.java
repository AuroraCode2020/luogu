import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double a = cin.nval;
        double sum = 0;
        if(a > 150){
            if(a > 400){
                sum = 150 * 0.4463 + 250 * 0.4663 + (a - 400) * 0.5663;
            }
            else{
                sum = 150 * 0.4463 + (a - 150) * 0.4663;
            }
        }
        else{
            sum = 0.4463 * a;
        }
        cout.printf("%.1f",sum);
        cout.flush();
    }
}
