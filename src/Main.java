import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] diceNumArr = br.readLine().split(" ");
        int a = Integer.parseInt(diceNumArr[0]);
        int b = Integer.parseInt(diceNumArr[1]);
        int c = Integer.parseInt(diceNumArr[2]);
        int[] intDiceNumArr = {a,b,c};
        Arrays.sort(intDiceNumArr);
        int smallestNum = intDiceNumArr[0];
        int middleNum = intDiceNumArr[1];
        int biggestNum = intDiceNumArr[2];

        if(biggestNum==middleNum && middleNum==smallestNum) System.out.println(10000+1000*middleNum);
        else if(biggestNum==middleNum || middleNum==smallestNum) System.out.println(1000+100*middleNum);
        else System.out.println(biggestNum*100);

    }
}