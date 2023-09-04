package StringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] inputArr = br.readLine().split("");
        int sum = 0;
        for(String input:inputArr){
            int cur = Integer.parseInt(input);
            sum += cur;
        }
        System.out.println(sum);
    }
}
