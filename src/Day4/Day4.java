package Day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day4 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Programming\\Advent of Code\\2022\\src\\Day4\\Day4.txt");
        BufferedReader buffRd = new BufferedReader(fileReader);
        String line;

        int howManyPairs = 0;

        while ((line = buffRd.readLine()) != null) {
            String[] elfs = line.split(",");


            String[] NumbersFirstElf = elfs[0].split("-");
            String[] NumbersSecondElf = elfs[1].split("-");

            int firstNumberFirstElf = Integer.parseInt(NumbersFirstElf[0]);
            int secondNumberFirstElf = Integer.parseInt(NumbersFirstElf[1]);

            int firstNumberSecondElf = Integer.parseInt(NumbersSecondElf[0]);
            int secondNumberSecondElf = Integer.parseInt(NumbersSecondElf[1]);

            //FIRST RIDDLE
//            if (firstNumberFirstElf <= firstNumberSecondElf && secondNumberFirstElf >= secondNumberSecondElf) {
//                howManyPairs++;
//            }
//            else if (firstNumberSecondElf <= firstNumberFirstElf && secondNumberSecondElf >= secondNumberFirstElf) {
//                howManyPairs++;
//            }

            if (secondNumberFirstElf >= firstNumberSecondElf && (firstNumberFirstElf <= firstNumberSecondElf || firstNumberFirstElf <= secondNumberSecondElf)) {
                howManyPairs++;
            }
        }
        System.out.println(howManyPairs);
    }
}

//TIME TAKEN 00:46:04:36
