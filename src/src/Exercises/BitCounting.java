package Exercises;

public class BitCounting {

    //https://www.codewars.com/kata/526571aae218b8ee490006f4/java
    public  int countBits(int n){

        String binaryString = Integer.toBinaryString(n);
        int total = 0;

        for(int i = 0; i< binaryString.length(); i++) {

            total += Character.getNumericValue(binaryString.charAt(i));
        }

        return total;
    }
}
