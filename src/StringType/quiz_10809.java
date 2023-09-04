package StringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();
        for(int i=97; i<=122; i++){
            char alphabet = (char) i;
            int idx = input.indexOf(alphabet);
            result.append(idx).append(" ");
        }
        System.out.println(result);
    }
}
