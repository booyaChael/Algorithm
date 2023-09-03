package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz_10811 {
    private static int[] initializeArr(int numberOfBaskets) throws IOException{
        int[] basketsArr = new int[numberOfBaskets];
        for(int x=0; x<numberOfBaskets; x++){
            basketsArr[x] = x+1;
        }
        return basketsArr;
    }

    private static void switchBaskets(BufferedReader br, int[] basketsArr, int operationCount) throws IOException{
        for (int x = 0; x < operationCount; x++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);

            for (int y = i; y <= (i + j) / 2; y++) {
                int temp = basketsArr[y - 1];
                basketsArr[y - 1] = basketsArr[(i + j) - y - 1];
                basketsArr[(i + j) - y - 1] = temp;
            }
        }
    }

    private static void printBaskets(int[] basketsArr){
        StringBuilder result = new StringBuilder();

        for (int x = 0; x < basketsArr.length; x++) {
            result.append(basketsArr[x]).append(" ");
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int numberOfBaskets = Integer.parseInt(line[0]);
        int operationCount = Integer.parseInt(line[1]);
        int[] basketsArr = initializeArr(numberOfBaskets);
        switchBaskets(br, basketsArr, operationCount);
        printBaskets(basketsArr);
    }
}
