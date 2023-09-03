package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class quiz_10807 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        List<Integer> arr = new ArrayList<>();
        String[] values = br.readLine().split(" ");
        for(String value:values){
            arr.add(Integer.parseInt(value));
        }

        int v = Integer.parseInt(br.readLine());
        int result =0;

        for(int cur: arr){
            if(v==cur)result++;
        }
        System.out.println(result);
    }
}
