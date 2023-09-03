package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10871 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int X = Integer.parseInt(arr[1]);
        StringBuilder result =new StringBuilder();

        String[] input = br.readLine().split(" ");
        for(int i=0; i<N; i++) {
            int cur = Integer.parseInt(input[i]);
            if(cur < X) result.append(cur).append(" ");
        }
        System.out.println(result);

    }
}
