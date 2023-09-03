package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class quiz_5597_1 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> currentStudents = new HashSet<>();
        for(int i=0; i<28; i++){
            int cur = Integer.parseInt(br.readLine());
            currentStudents.add(cur);
        }

        HashSet<Integer> totalStudents = new HashSet<>();
        for(int i=1; i<=30; i++){
            totalStudents.add(i);
        }

        StringBuilder result =new StringBuilder();

        for(int totalStudent:totalStudents){
            if(!currentStudents.contains(totalStudent)){
                result.append(totalStudent).append("\n");
            }
        }
        System.out.println(result);

    }
}
