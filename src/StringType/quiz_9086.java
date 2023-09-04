package StringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(br.readLine());
        for(int i=0; i<numberOfCases; i++){
            String word = br.readLine();
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length()-1);
            System.out.println(firstChar+""+lastChar);

        }
    }
}
