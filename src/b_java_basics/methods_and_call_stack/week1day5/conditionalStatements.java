package b_java_basics.methods_and_call_stack.week1day5;

public class conditionalStatements {

    public static void ifStatements() {
        //Integer var1 = (Integer) 15;
        Object var1 = 15;

        System.out.println(var1.getClass().getSimpleName());

        if (var1.getClass().getSimpleName().equals("Integer")) {
            System.out.println("False");
        }

        if (var1 instanceof Integer) {
            System.out.println("Second way: False");
        }

        if (var1 instanceof String) {
            System.out.println("False");
        } else {
            System.out.println(var1.getClass().getSimpleName());
        }
    }

    public static void switchStatements() {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1 -> System.out.println("pilates");
            case 2 -> System.out.println("4 hours java");
            case 3 -> System.out.println("pilates and java");
            case 4 -> System.out.println("gym");
            case 5 -> System.out.println("rest");

            default -> System.out.println("Free Time");

        }
    }

    public static void main(String[] args) {
        ifStatements();
        switchStatements();
    }
}

