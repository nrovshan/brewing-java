package b_java_basics.methods_and_call_stack.week1day5;

public class conditionalStatements {

    public static void main(String[] args) {
        Integer var1 = (Integer) 15;
        System.out.println(var1.getClass().getSimpleName());

        if (var1.getClass().getSimpleName().equals("Integer")) {
            System.out.println("False");
        }

        if (var1 instanceof Integer) {
            System.out.println("Second way: False");
        }
    }
}
