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

    public static void main(String[] args) {
        basics();
    }
}