package StringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases =Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for(int i=0; i<numberOfCases; i++){
            String[] input = br.readLine().split(" ");
            int numberOfIteration = Integer.parseInt(input[0]);
            String[] word = input[1].split("");
            for(String alphabet:word){
                for(int j=0; j<numberOfIteration; j++){
                    result.append(alphabet);
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
