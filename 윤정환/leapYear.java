package 윤정환;

import java.io.*;

public class leapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if (a % 4 == 0 && a % 100 != 0) {
            bw.write("1");
        } else if (a % 400 == 0) {
            bw.write("1");
        } else  {
            bw.write("0");
        }

        bw.flush();

    }
}
