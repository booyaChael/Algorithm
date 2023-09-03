package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_5597_2 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] totalStudents = new boolean[30];
        for(int i=0; i<28; i++){
            int cur = Integer.parseInt(br.readLine());
            totalStudents[cur-1] = true;
        }

        StringBuilder result = new StringBuilder();

        for(int i=0; i<30; i++){
            if(!totalStudents[i]) {
                result.append(i + 1).append("\n");
            }
        }

        System.out.println(result);
    }
}
