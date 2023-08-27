package Iteration;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_2439 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            StringBuilder line=new StringBuilder();
            //띄어쓰기의 수
            for(int j=0; j<n-i;j++) line.append(" ");
            //별의 수
            for(int k=0; k<i; k++) line.append("*");
            System.out.println(line);
        }

    }
}
