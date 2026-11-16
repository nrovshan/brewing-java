package b_java_basics.methods_and_call_stack.week1day6;

import java.util.Scanner;

public class excercisesIterative {

    public static void numberPatternAnalyzer() {
        Scanner start = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        String input = start.nextLine();

        //System.out.println(input.length());

        while (i < input.length()){
            char ch = input.charAt(i);
            int digit = Character.getNumericValue(ch);

            sum = sum + digit;
            //System.out.println(ch);
            i++;
        }

        System.out.println("Sum: " + sum);

        start.close();

    }

    public static void main(String[] args) {
        numberPatternAnalyzer();
    }

}