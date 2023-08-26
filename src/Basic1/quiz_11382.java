package Basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_11382 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");

        //숫자가 클 수 있기 때문에 int가 아닌 Long을 사용해야 한다.
        long firstNum = Long.parseLong(inputArr[0]);
        long secondNum = Long.parseLong(inputArr[1]);
        long thirdNum = Long.parseLong(inputArr[2]);

        System.out.println(firstNum + secondNum + thirdNum);

    }
}
