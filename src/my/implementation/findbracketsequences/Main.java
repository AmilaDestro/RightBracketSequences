package my.implementation.findbracketsequences;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

    private static int N; // number of opening and closing brackets

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(reader.readLine());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        BracketSequenceCalculator bracket = new BracketSequenceCalculator();
        try {
            System.out.println("N = " + N);
            BigInteger correctSequences = bracket.getNumberOfCorrectSequences(N);
            System.out.println("Possible correct bracket sequences: " + correctSequences);
        }catch (WrongBracketPairNumber e) {
            System.out.println(e.getMessage());
        }
    }
}
