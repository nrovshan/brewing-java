package b_java_basics.methods_and_call_stack.week1day6;

import java.util.Scanner;

public class excercisesIterative {

    public static void numberPatternAnalyzer() {
        Scanner start = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int maxDigit = 0;
        int minDigit = 9;

        String input = start.nextLine();

        //System.out.println(input.length());

        while (i < input.length()){
            char ch = input.charAt(i);
            int digit = Character.getNumericValue(ch);


            sum = sum + digit;
            //System.out.println(ch);

            if (digit % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }

            if (digit > maxDigit) {
                maxDigit =  digit;
            } else { }

            if (digit < minDigit) {
                minDigit = digit;
            } else { }

            i++;
            //System.out.println("digits " + digit);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
        System.out.println("Largest digits: " + maxDigit);
        System.out.println("Smallest digits: " + minDigit);


        start.close();

    }

    public static void main(String[] args) {

        numberPatternAnalyzer();

    }

}