package Iteration;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class quiz_2739 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<10; i++){
            int result = num*i;
            String printedTxt = String.format("%s * %s = %s", num, i, result);
            System.out.println(printedTxt);
        }
    }
}
