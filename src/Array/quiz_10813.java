package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10813 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        //바구니의 개수
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        //바구니 배열 만들기
        int[] basketArr = new int[N];

        for(int i=0; i<N; i++){
            basketArr[i] = i+1;
        }

        for(int l=0; l<M; l++){
            String[] inputArr = br.readLine().split(" ");
            int i = Integer.parseInt(inputArr[0]);
            int j = Integer.parseInt(inputArr[1]);
            int numI = basketArr[i-1];
            int numJ = basketArr[j-1];

            basketArr[i-1] = numJ;
            basketArr[j-1] = numI;
        }

        StringBuilder result = new StringBuilder();
        for(int num:basketArr){
            result.append(num).append(" ");
        }
        System.out.println(result);
    }
}
