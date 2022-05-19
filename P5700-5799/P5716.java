import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static int judge(int year,int month){
        if(year%100==0){
            if(year%400==0){
                return 29;
            }
            else{
                return 28;
            }
        }
        else{
            if(year%4==0){
                return 29;
            }
            return 28;
        }
    }

    public static void main(String[] args) throws Exception {
        int year, month;
        cin.nextToken();
        year = (int) cin.nval;
        cin.nextToken();
        month = (int) cin.nval;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:cout.print("31");break;
            case 4:
            case 6:
            case 9:
            case 11:cout.print("30");break;
            case 2:cout.printf("%d", judge(year,month));
        }
        cout.flush();
    }
}
