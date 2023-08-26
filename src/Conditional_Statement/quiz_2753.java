package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_2753 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        //윤년과 아닌 것의 기준은 '4의 배수인지' 이므로
        //이를 기준으로 조건문을 나눈 다음, 이중 조건문을 작성해도 가독성이 좋을 것 같다.
        if(year%400 ==0) System.out.println(1);
        else if(year%100 == 0) System.out.println(0);
        else if(year%4 ==0) System.out.println(1);
        else System.out.println(0);

    }
}
