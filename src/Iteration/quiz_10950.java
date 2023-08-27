package Iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10950 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTest = Integer.parseInt(br.readLine());
        for(int i=0; i<numberOfTest; i++){
            String[] numArr= br.readLine().split(" ");
            int firstNum = Integer.parseInt(numArr[0]);
            int secondNum = Integer.parseInt(numArr[1]);
            System.out.println(firstNum + secondNum);
        }
    }
}
