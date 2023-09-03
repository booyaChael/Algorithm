import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static double findHighest (String[] subjects) throws IOException{
        double highest = 0;
        for(String subject:subjects){
            double cur = Double.parseDouble(subject);
            if(cur>highest) highest = cur;
        }
        return highest;
    }

    private static void calculateScore (String[] subjects, double highest){
        double sum=0;
        for(String subject:subjects){
            double cur = Long.parseLong(subject);
            sum += cur/highest *100;
        }
        System.out.println(sum/subjects.length);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] subjects = br.readLine().split(" ");
        double highest = findHighest(subjects);
        calculateScore(subjects, highest);
    }
}
