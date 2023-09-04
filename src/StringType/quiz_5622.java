package StringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_5622 {
    public static int returnTimeOfDial(String input) {
        switch(input){
            //return을 사용하면 break가 필요가 없다.
            case "A": case"B": case"C":
                return 3;
            case "D": case"E": case"F":
                return 4;
            case "G": case"H": case"I":
                return 5;
            case "J": case"K": case"L":
                return 6;
            case "M": case"N": case"O":
                return 7;
            case "P": case"Q": case"R": case"S":
                return 8;
            case "T": case"U": case"V":
                return 9;
            case "W": case"X": case"Y": case"Z":
                return 10;
            default:
                throw new IllegalArgumentException("Invalid input: " + input);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");
        int result =0;
        for(String input:inputs) {
            int timeOfDial = returnTimeOfDial(input);
            result += timeOfDial;
        }
        System.out.println(result);
    }
}
