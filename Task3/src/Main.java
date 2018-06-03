
/**
 * Created by Alexey Lyapin on 01.06.2018.
 */
public class Main {
    public static void main(String[] args) {
        SumOfDigitsOfFactorial sumOfDigitsOfFactorial  = new SumOfDigitsOfFactorial();
        int sumOfDigits =  sumOfDigitsOfFactorial.getSumOfDigits(100);
        System.out.println(sumOfDigits);
    }

}
