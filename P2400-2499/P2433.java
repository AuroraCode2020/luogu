import java.io.*;
import java.math.BigInteger;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int a = (int) cin.nval;
        switch (a) {
            case 1:cout.printf("I love Luogu!");break;
            case 2:cout.printf("6 4");break;
            case 3:cout.printf("3\n12\n2");break;
            case 4:cout.printf("166.667");break;
            case 5:cout.printf("15");break;
            case 6:cout.printf("10.8167");break;
            case 7:cout.printf("110\n90\n0");break;
            case 8:cout.printf("31.4159\n78.5398\n523.599");break;
            case 9:cout.printf("22");break;
            case 10:cout.printf("9");break;
            case 11:cout.printf("33.3333");break;
            case 12:cout.printf("13\nR");break;
            case 13:cout.printf("16");break;
            case 14:cout.printf("50");break;
        }
        cout.flush();
    }
}
