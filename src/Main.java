/*
We'll say that a number is a "teen" if it is in the range of 13-19 inclusive.
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in the range 13 inclusive
to 19 inclusive. Otherwise return false.

Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter is in range 13 inclusive to 19 inclusive.
Otherwise return false.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(9,99,159));
    }
}
