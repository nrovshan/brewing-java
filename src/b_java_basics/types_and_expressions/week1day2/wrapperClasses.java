package b_java_basics.types_and_expressions.week1day2;

public class wrapperClasses {

    public static void basics() {

        int primitiveInt = 100;
        Integer wrapperInt = Integer.valueOf(100);
        Integer missingValue = null;
       //  int missingValuePrimitive = null; error: incompatible types: <null> cannot be converted to int

        // (Object)primitiveInt ===== (Object)Integer.valueOf(primitiveInt) the same thing
        System.out.println("Primitive type:" + ((Object)primitiveInt).getClass().getName());
        System.out.println("Wrapper type:" + wrapperInt.getClass().getName());
        System.out.println("Null value:" + missingValue);
    }

    public static void test()  {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Maximum int capacity: " + maxInt);
        System.out.println("Minimum int capacity: " + minInt);
        System.out.println("Maximum double capacity: " + maxDouble);
    }

    public static void conversion() {
        //rule 1: unboxing does not wide directly
        Integer intObj = 12;
        double intObjtwo = intObj;  // unboxes 12 to int, then convert to double 12.0

        //rule 2: widening + boxing error
        //Long longObj = 12; //error --> because 12 is int, not long. we should define it as long
        Long longObj = 12L;

        //rule 3: unboxing + narrowing error
        // byte byteObj = intObj --> error it does not narrow directly to byte
        byte byteObj = (byte) (int) intObj;

    }

    public static void main(String[] args) {
        basics();
        test();
        conversion();
    }
}