package Iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_25304 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int payedPrice = Integer.parseInt(br.readLine());
        int numOfItemTypes = Integer.parseInt(br.readLine());
        int calculatedPrice=0;
        for(int i=0; i<numOfItemTypes; i++){
            String[] arr = br.readLine().split(" ");
            int priceOfItem = Integer.parseInt(arr[0]);
            int numberOfItem = Integer.parseInt(arr[1]);
            calculatedPrice += priceOfItem * numberOfItem;
        }
        if(payedPrice == calculatedPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}
