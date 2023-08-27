package Iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_25314 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfLong = Integer.parseInt(br.readLine())/4;
        String longTxt="";
        for(int i=0; i<numOfLong; i++) longTxt += "long"+" ";
        System.out.println(longTxt + "int");
    }
}
