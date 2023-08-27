package Exercises;

public class SquareEveryDigit {

//https://www.codewars.com/kata/546e2562b03326a88e000020/train/


    public int squareDigits(int n) {
        int result = 0;
        char[] integerCharArray = Integer.toString(n).toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < integerCharArray.length; i++) {
            int temp = (int) Math.pow(Character.getNumericValue(integerCharArray[i]),2);
            builder.append(temp);
        }
        result = Integer.parseInt(builder.toString());

        return result;
    }
}
