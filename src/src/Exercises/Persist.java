package Exercises;

public class Persist {

    //https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/java

    public int persistence(long n) {

        if(n > 9)
        {
            char[] longCharArray = Long.toString(n).toCharArray();
            long tempValue = 1;
            for (int i = 0; i < longCharArray.length; i++) {
                tempValue *= Character.getNumericValue(longCharArray[i]);
            }
            return persistence(tempValue) + 1 ;
        }

        return 0; // your code
    }

}
