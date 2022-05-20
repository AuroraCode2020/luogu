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
        cin.nextToken();
        int c = (int) cin.nval;
        int min = 0,max = 0;
        min = getMin(a, b, c, min, a < b, a < c, b < a, b < c, c < a, c < b);
        max = getMin(a, b, c, max, a>b, a>c, b>a, b>c, c>a, c>b);
        int i = min;

        while (i > 0){
            if(min % i==0 && max % i == 0){
                break;
            }
            i--;
        }
        max=max/i;
        min=min/i;
        cout.printf("%d/%d", min, max);
        cout.flush();
    }
    private static int getMin(int a, int b, int c, int min, boolean b2, boolean b3,
                              boolean b4, boolean b5, boolean b6, boolean b7) {
        if(b2 && b3){
            min=a;
        }
        if(b4 && b5){
            min=b;
        }
        if(b6 && b7){
            min=c;
        }
        return min;
    }
}
