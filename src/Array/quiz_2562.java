package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_2562 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int biggestIdx = 0;
        int biggest = 0;
        int curIdx=0;
        while(br.ready()){
            int cur = Integer.parseInt(br.readLine());
            curIdx++;
            if(cur > biggest) {
                biggest = cur;
                biggestIdx = curIdx;
            }

        }
        System.out.println(biggest);
        System.out.println(biggestIdx);
    }
}
