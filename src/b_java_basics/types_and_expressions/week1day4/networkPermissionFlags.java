package b_java_basics.types_and_expressions.week1day4;

public class networkPermissionFlags {
    public static void main(String[] args) {
        int read = 1;
        int write = 2;
        int execute = 4;

        int userPerms = read | write;

        boolean checkExecute = (userPerms &  execute) == execute;
        boolean checkRead = (userPerms & read) == read;


        System.out.println("Result in boolean for execute check: " + checkExecute);
        System.out.println("Result in boolean for read check: " + checkRead);

        System.out.println("Binary perms: " + Integer.toBinaryString(userPerms));

        // test
        var a = 5;
        var b = 3;
        System.out.println("check test: " + (a | b));
    }
}