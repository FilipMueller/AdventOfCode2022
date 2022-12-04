package Day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Programming\\Advent of Code\\2022\\src\\Day3\\Day3.txt");
        BufferedReader buffRd = new BufferedReader(fileReader);
        String line;

        int sum = 0;
        while ((line = buffRd.readLine()) != null) {
            int mid = line.length() / 2;
            String compartment1 = line.substring(0, mid);
            String compartment2 = line.substring(mid);
            List<String> addedChars = new ArrayList<>();

            int count = 0;
//            for (int i = 1; i < compartment1.length() + 1; i++) {
//                String currentChar = compartment1.substring(count,i);
//                if (compartment2.contains(currentChar) && !addedChars.contains(currentChar)) {
//                    addedChars.add(currentChar);
//                    char ch = compartment1.charAt(i - 1);
//                    if (ch >= 97 && ch <= 122) {
//                        sum += ch - 96;
//                    }
//                    if (ch >= 65 && ch <= 90) {
//                        sum += ch - 38;
//                    }
//                }
//                count++;
//            }

            String line2 = buffRd.readLine();
            String line3 = buffRd.readLine();
            List<String> strList = new ArrayList<>();
            strList.add(line);
            strList.add(line2);
            strList.add(line3);
            strList.sort(Comparator.comparingInt(String::length));
            String longest = strList.get(2);

            for (int i = 1; i < longest.length() + 1; i++) {
                String currentChar = longest.substring(count,i);
                if (strList.get(0).contains(currentChar) && strList.get(1).contains(currentChar) && !addedChars.contains(currentChar)) {
                    addedChars.add(currentChar);
                    char ch = longest.charAt(i - 1);
                    if (ch >= 97 && ch <= 122) {
                        sum += ch - 96;
                    }
                    if (ch >= 65 && ch <= 90) {
                        sum += ch - 38;
                    }
                }
                count++;
            }
            System.out.println(sum);
        }
    }
}

//TIME TAKEN 3:48:55.17
