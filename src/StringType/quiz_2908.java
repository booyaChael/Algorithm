package StringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_2908 {
    public static int makeReverse(String input){
        String reversedString = new StringBuilder(input).reverse().toString();
        return Integer.parseInt(reversedString);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = makeReverse(inputs[0]);
        int b = makeReverse(inputs[1]);
        if(a>b) System.out.println(a);
        else System.out.println(b);
    }
}
