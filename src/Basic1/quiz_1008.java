package Basic1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_1008 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] d = br.readLine().split(" ");
        //0.333333333의 결과가 나오려면 String을 double로 바꾸주어야 한다.
        System.out.println(Double.parseDouble(d[0])/Double.parseDouble(d[1]));
    }
}
