package b_java_basics.types_and_expressions.week1day4;

public class planetaryGravityCalculator {
    public static void main(String[] args) {
        var earthGravity = 9.81;
        var marsGravity = 3.73;
        var earthWeight = 85.5;

        var marsWeight = earthWeight * (marsGravity / earthGravity);
        int displayWeight = (int) marsWeight;

        System.out.println("double result: " + marsWeight);
        System.out.println("int result: " + displayWeight);
    }

}