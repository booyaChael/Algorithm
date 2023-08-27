package Iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10951 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            System.out.println(a+b);
        }
    }
}
