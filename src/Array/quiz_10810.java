package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10810 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        //바구니의 개수
        int N = Integer.parseInt(line[0]);
        //바구니 배열 만들기
        int[] basketArr = new int[N];

        String inputLine;
        while((inputLine = br.readLine()) != null){
            String[] curArr = inputLine.split(" ");
            int i = Integer.parseInt(curArr[0]);
            int j = Integer.parseInt(curArr[1]);
            int k = Integer.parseInt(curArr[2]);
            for(int cur=i-1; cur<j; cur++){
                basketArr[cur] = k;
            }
        }

        StringBuilder result = new StringBuilder();

        for(int i=0; i<basketArr.length; i++){
            result.append(basketArr[i]).append(" ");
        }
        System.out.println(result);
    }
}
