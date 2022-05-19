import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double m, h, BMI;
        cin.nextToken();
        m = cin.nval;
        cin.nextToken();
        h = cin.nval;
        BMI = m / (h * h);
        if(BMI < 18.5){
            cout.print("Underweight");
        }
        else if(BMI >= 18.5 && BMI < 24){
            cout.print("Normal");
        }
        else{
            cout.printf("%.4f\n", BMI);
            cout.print("Overweight");
        }
        cout.flush();
    }
}
