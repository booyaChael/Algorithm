package Iteration;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class quiz_2438 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCase = Integer.parseInt(br.readLine());

        for(int i=1; i<=numOfCase; i++){
            StringBuilder line = new StringBuilder();
            for(int j=1; j<=i;j++){
                line.append("*");
            }
            System.out.println(line);
        }

    }
}
