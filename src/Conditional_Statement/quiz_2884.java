package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_2884 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int H = Integer.parseInt(inputArr[0]);
        int M = Integer.parseInt(inputArr[1]);

        if(M>=45) System.out.println(H+" "+(M-45));
        else{
            int changedH = (H==0)? 23: H-1;
            int changedM = M+60-45;
            System.out.println(changedH + " " + changedM);
        }

    }
}
