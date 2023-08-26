package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_2525 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] timeArr = br.readLine().split(" ");
        int howLong = Integer.parseInt(br.readLine());
        int H = Integer.parseInt(timeArr[0]);
        int M = Integer.parseInt(timeArr[1]);

        //애초에 input으로 받은 시간을 모두 분으로 변환한 뒤 계산도 가능
        if(M+howLong >= 60) {
            int changedH = H + (M+howLong)/60;
            int changedM = (M+howLong)%60;
            if(changedH>=24) System.out.println(changedH-24 + " " + changedM);
            else System.out.println(changedH + " " + changedM);
        }else{
            System.out.println(H + " " + (M+howLong));
        }

    }
}
