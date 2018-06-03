import java.math.BigInteger;

public class SumOfDigitsOfFactorial {

     /* Method calculate factorial of input number
     * and calculate the sum of all factorial number's digits.
     */

    public int getSumOfDigits(int number) {

        /*Need to use BigInteger class, becouse  factorial may be is
        *large to handled by long, int or any other primitive data type in java.
        */
        BigInteger sum = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;
        // Calculate the factorial of number
        for (; number > 0; number--) {
            result = result.multiply(BigInteger.valueOf(number));
        }

        /*Calculate sum of all digits in the factorial of number
         *by receiving the remainder of the division by 10
         */
        while (result != BigInteger.ZERO) {
            sum = sum.add(result.remainder(BigInteger.TEN));
            result = result.divide(BigInteger.TEN);
        }
        /*Also I can present BigInteger sum like a string and parse
        *characters  of string to int  and  add to sum
        */
        return sum.intValue();
    }
}