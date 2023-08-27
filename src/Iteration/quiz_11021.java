package Iteration;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_11021 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCase = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for(int i=1; i<=numOfCase; i++){
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            result.append(String.format("Case #%s: %s", i, a+b)).append("\n");
        }
        System.out.println(result);
    }
}
