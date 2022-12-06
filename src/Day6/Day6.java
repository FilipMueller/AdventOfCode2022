package Day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Day6 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Programming\\Advent of Code\\2022\\src\\Day6\\Day6.txt");
        BufferedReader buffRd = new BufferedReader(fileReader);
        String line;
        int startOfFirstMarker;
        HashSet<Character> set = new HashSet<>();

        while ((line = buffRd.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                for (int j = i; j < i + 14; j++) {
                    set.add(line.charAt(j));
                    if (set.size() == 14) {
                        startOfFirstMarker = i + 14;
                        System.out.println(startOfFirstMarker);
                        return;
                    }
                }
                set.clear();
            }
        }
    }
}

//TIME TAKEN: 01:35:17
