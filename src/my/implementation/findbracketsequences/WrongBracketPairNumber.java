package my.implementation.findbracketsequences;

import java.io.IOException;

/*
  Exception which is thrown if user inputs number of brackets' pairs less than 0
 */
public class WrongBracketPairNumber extends IOException {
    WrongBracketPairNumber(String message) {
        System.out.println(message);
    }
}
