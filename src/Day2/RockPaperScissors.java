package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RockPaperScissors {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Programming\\Advent of Code\\2022\\src\\Day2\\RPSRounds.txt");
        BufferedReader buffRd = new BufferedReader(fileReader);
        String line;
        int score = 0;
        int score2 = 0;

        while ((line = buffRd.readLine()) != null) {
            char[] round = line.toCharArray();
            if (round[0] == 'A' && round[2] == 'X') {
                score += 1 + 3;
                score2 += 3;
            }
            if (round[0] == 'A' && round[2] == 'Y') {
                score += 2 + 6;
                score2 += 1 + 3;
            }
            if (round[0] == 'A' && round[2] == 'Z') {
                score += 3;
                score2 += 2 + 6;
            }
            if (round[0] == 'B' && round[2] == 'X') {
                score += 1;
                score2 += 1;
            }
            if (round[0] == 'B' && round[2] == 'Y') {
                score += 2 + 3;
                score2 += 2 + 3;
            }
            if (round[0] == 'B' && round[2] == 'Z') {
                score += 3 + 6;
                score2 += 3 + 6;
            }
            if (round[0] == 'C' && round[2] == 'X') {
                score += 1 + 6;
                score2 += 2;
            }
            if (round[0] == 'C' && round[2] == 'Y') {
                score += 2;
                score2 += 3 + 3;
            }
            if (round[0] == 'C' && round[2] == 'Z') {
                score += 3 + 3;
                score2 += 1 + 6;
            }
        }
        System.out.println(score);
        System.out.println(score2);
    }
}

//TIME TAKEN:   00:31:45
