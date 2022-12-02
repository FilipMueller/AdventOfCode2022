package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CalorieCounting {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Programming\\Advent of Code\\2022\\src\\Day1\\Calories.txt");
        BufferedReader buffRd = new BufferedReader(fileReader);
        String line;
        int compare = 0;
        List<Integer> calories = new ArrayList<>();
        while ((line = buffRd.readLine()) != null) {
            int sum = Integer.parseInt(line);
            while (!Objects.equals(line = buffRd.readLine(), "")) {
                if (line == null) {
                    break;
                }
                sum += Integer.parseInt(line);
            }
            calories.add(sum);
            if (sum > compare) {
                compare = sum;
            }
        }
        calories.sort(Collections.reverseOrder());
        int threeLast = calories.get(0) + calories.get(1) + calories.get(2);
        System.out.println("Highest Calories: " + compare);
        System.out.println("Sum of highest three: " + threeLast);
    }
}

//TIME TAKEN:   1:06:35.55