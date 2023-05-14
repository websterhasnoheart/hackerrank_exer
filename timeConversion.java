import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String pmORam = s.substring(s.length() - 2);
        String time = s.substring(0, s.length() - 2);
        String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        if (pmORam.equalsIgnoreCase("PM") && hour != 12) {
            hour += 12;
        } else if (pmORam.equalsIgnoreCase("AM") && hour == 12) {
            hour = 0;
        }
        
        String formattedHour = String.format("%02d", hour);
        return formattedHour + time.substring(2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
