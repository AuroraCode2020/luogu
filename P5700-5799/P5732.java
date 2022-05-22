import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int layer = (int) cin.nval;
        int[][] num = new int[layer][layer];
        int temp;
        for(int i=0;i<layer;i++){
            for(int j=0;j<i+1;j++){
                if(i==0){
                    num[i][j] = 1;
                    break;
                }
                if(i==1){
                    num[i][j] = 1;
                    num[i][j+1] = 1;
                    break;
                }
                if(j==0 || j==i){
                    num[i][j] = 1;
                }
                else{
                    temp = num[i-1][j-1]+num[i-1][j];
                    num[i][j] = temp;
                }
            }
        }
        for(int i=0;i<layer;i++){
            for(int j=0;j<i+1;j++){
                if(j!=i){
                    cout.printf("%d ", num[i][j]);
                }
                else{
                    cout.println(num[i][j]);
                }
            }
        }
        cout.flush();
    }
}
