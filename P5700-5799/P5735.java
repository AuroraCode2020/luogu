import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double x1,y1,x2,y2,x3,y3;
        cin.nextToken();
        x1 = cin.nval;
        cin.nextToken();
        y1 = cin.nval;
        cin.nextToken();
        x2 = cin.nval;
        cin.nextToken();
        y2 = cin.nval;
        cin.nextToken();
        x3 = cin.nval;
        cin.nextToken();
        y3 = cin.nval;
        double s = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))+ Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))+ Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        cout.printf("%.2f",s);
        cout.flush();
    }
}
