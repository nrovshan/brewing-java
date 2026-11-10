package b_java_basics_week_3_11.types_and_expressions.week1day1;

public class typeCasting {
    public static void intCharDiff() {
        char letter = 'A';
        int sum = letter + 1;

        //casting to char
        char sum2 = (char) (letter + 1);

        System.out.println("Code for int:" + sum);
        System.out.println("Code for char:" + sum2);
    }

    public static void expCasting() {

        long longNum = 10_000_000L;

        short shortNum = (short) longNum;
        System.out.println("apply explicit converting:" + ((Object)shortNum).getClass().getSimpleName());
        System.out.println("look full class name:" + ((Object)shortNum).getClass().getName());
    }

    public static void main(String[] args){
        intCharDiff();
        expCasting();
    }

}

