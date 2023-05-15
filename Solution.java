import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        String regex = "^[A-Z]{5}[0-9]{4}[A-Z]$";
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        
        for (int i = 0; i < num; i++) {
            String PAN = reader.nextLine();
            Matcher m = Pattern.compile(regex).matcher(PAN);
            if (m.find()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}