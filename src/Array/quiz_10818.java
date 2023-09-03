package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10818 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long smallest = Long.MAX_VALUE;
        long biggest = Long.MIN_VALUE;

        String[] inputArr = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            long cur = Integer.parseInt(inputArr[i]);
            if(cur>biggest) biggest=cur;
            if(cur<smallest) smallest=cur;
        }
        System.out.println(smallest+" "+biggest);

    }
}
