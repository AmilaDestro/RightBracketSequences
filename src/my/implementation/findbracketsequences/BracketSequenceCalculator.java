package my.implementation.findbracketsequences;


import java.math.BigInteger;


public class BracketSequenceCalculator {

    /*
     * As number of correct bracket sequences for brackets of one type matches to Catalan numbers,
     * method getNumberOfCorrectSequences(int n) implements formula C(n) = (2n)! / (n! * (n + 1)!)
     * and returns actual number of possible correct bracket sequences for n bracket pairs.
     */
    protected BigInteger getNumberOfCorrectSequences(int n) throws WrongBracketPairNumber {
        return factorial(2 * n).divide(factorial(n).multiply(factorial(n + 1)));
    }


    /*
     * Method factorial(int n) calculates factorial of transmitted number
     */
    private BigInteger factorial(int n) throws WrongBracketPairNumber {
        BigInteger factorial = BigInteger.ONE;
        if (n == 0) {
            return factorial;
        }
        if (n < 0) {
            throw new WrongBracketPairNumber("Number of bracket pairs cannot be negative");
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
