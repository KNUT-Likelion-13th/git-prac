package 윤정환;
import java.io.*;

public class Star1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int j = 0; j < n; j++) {

            for (int i = 0; i <= j; i++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();

    }
}
