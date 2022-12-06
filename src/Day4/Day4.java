package Day4;

import java.io.BufferedReader;
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

            String[] numbersFirstElf = elfs[0].split("-");
            String[] numbersSecondElf = elfs[1].split("-");

            int firstNumberFirstElf = Integer.parseInt(numbersFirstElf[0]);
            int secondNumberFirstElf = Integer.parseInt(numbersFirstElf[1]);

            int firstNumberSecondElf = Integer.parseInt(numbersSecondElf[0]);
            int secondNumberSecondElf = Integer.parseInt(numbersSecondElf[1]);

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

//TIME TAKEN 01:22:13
