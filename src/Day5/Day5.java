package Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day5 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Programming\\Advent of Code\\2022\\src\\Day5\\Day5.txt");
        BufferedReader buffRd = new BufferedReader(fileReader);
        String line;

        List<Character> crates1 = new ArrayList<>();
        List<Character> crates2 = new ArrayList<>();
        List<Character> crates3 = new ArrayList<>();
        List<Character> crates4 = new ArrayList<>();
        List<Character> crates5 = new ArrayList<>();
        List<Character> crates6 = new ArrayList<>();
        List<Character> crates7 = new ArrayList<>();
        List<Character> crates8 = new ArrayList<>();
        List<Character> crates9 = new ArrayList<>();

        List<List<Character>> stacks = new ArrayList<>();

        while ((line = buffRd.readLine()) != null) {
            if (line.length() == 0) {
                Collections.reverse(crates1);
                Collections.reverse(crates2);
                Collections.reverse(crates3);
                Collections.reverse(crates4);
                Collections.reverse(crates5);
                Collections.reverse(crates6);
                Collections.reverse(crates7);
                Collections.reverse(crates8);
                Collections.reverse(crates9);

                stacks.add(crates1);
                stacks.add(crates2);
                stacks.add(crates3);
                stacks.add(crates4);
                stacks.add(crates5);
                stacks.add(crates6);
                stacks.add(crates7);
                stacks.add(crates8);
                stacks.add(crates9);
                line = buffRd.readLine();
            }
            if (line.charAt(0) != 'm' && line.charAt(1) != '1') {
                if (line.charAt(1) != ' ') {
                    crates1.add(line.charAt(1));
                }
                if (line.charAt(5) != ' ') {
                    crates2.add(line.charAt(5));
                }
                if (line.charAt(9) != ' ') {
                    crates3.add(line.charAt(9));
                }
                if (line.charAt(13) != ' ') {
                    crates4.add(line.charAt(13));
                }
                if (line.charAt(17) != ' ') {
                    crates5.add(line.charAt(17));
                }
                if (line.charAt(21) != ' ') {
                    crates6.add(line.charAt(21));
                }
                if (line.charAt(25) != ' ') {
                    crates7.add(line.charAt(25));
                }
                if (line.charAt(29) != ' ') {
                    crates8.add(line.charAt(29));
                }
                if (line.charAt(33) != ' ') {
                    crates9.add(line.charAt(33));
                }
            }
            if (line.charAt(0) == 'm') {
                int numberOfCrates;
                int startStack;
                int destinationStack;
                if (line.length() > 18) {
                    numberOfCrates = Integer.parseInt(line.substring(5,7));
                } else {
                    numberOfCrates = Integer.parseInt(line.substring(5,6));
                }
                if (numberOfCrates > 9) {
                    startStack = Integer.parseInt(line.substring(13,14)) - 1;
                    destinationStack = Integer.parseInt(line.substring(18)) - 1;
                } else {
                    startStack = Integer.parseInt(line.substring(12,13)) - 1;
                    destinationStack = Integer.parseInt(line.substring(17)) - 1;
                }
                if (numberOfCrates == 1) {
                    for (int i = 0; i < numberOfCrates; i++) {
                        int sizeCurrent = stacks.get(startStack).size() - 1;

                        stacks.get(destinationStack).add(stacks.get(startStack).get(sizeCurrent));
                        stacks.get(startStack).remove(sizeCurrent);
                    }
                } else {
                    int sizeCurrent = stacks.get(startStack).size();
                    int sizeCurrentCount = sizeCurrent - numberOfCrates;
                    if (sizeCurrentCount < 0) {
                        sizeCurrentCount = 0;
                    }
                    for (int i = 0; i < numberOfCrates; i++) {
                        stacks.get(destinationStack).add(stacks.get(startStack).get(sizeCurrentCount));
                        stacks.get(startStack).remove(sizeCurrentCount);
                    }
                }
                //first part
//                for (int i = 0; i < numberOfCrates; i++) {
//                    int sizeCurrent = stacks.get(startStack).size() - 1;
//
//                    stacks.get(destinationStack).add(stacks.get(startStack).get(sizeCurrent));
//                    stacks.get(startStack).remove(sizeCurrent);
//                }
            }
        }

        for (int i = 0; i < 9; i++) {
            int size = stacks.get(i).size() -1;
            System.out.println("LAST OF STACK " + (i+1) + " " + stacks.get(i).get(size));
        }
    }
}

//TIME TAKEN: 02:47:21
