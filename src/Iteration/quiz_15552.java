package Iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_15552 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCase = Integer.parseInt(br.readLine());
        //수정을 여러번 할 것이기 때문에 수정이 빠른 StringBuilder 객체를 사용하였다.
        StringBuilder result = new StringBuilder();
        for(int i=0; i<numOfCase; i++){
            String[] arr = br.readLine().split(" ");
            result.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).append("\n");
        }
        System.out.println(result);
    }
}
