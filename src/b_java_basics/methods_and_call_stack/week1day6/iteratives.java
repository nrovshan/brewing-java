package b_java_basics.methods_and_call_stack.week1day6;

import java.util.ArrayList;
import java.util.Scanner;


public class iteratives {
    //while loop
    public static void whileLoop() {

        ArrayList<Object> names = new ArrayList<>();
        names.add("Ali");
        names.add(19.95);
        names.add("Narmin");

        int i = 0;
        //System.out.println(names.size());

        while (i < names.size()) {

            if (names.get(i).equals("Narmin")){
                names.set(i, "narmin");
            }

            i++;
            System.out.println(names);
        }

    }

    public static void doWhileLoop() {

        Scanner scanner = new Scanner(System.in);
        String parol;

        do {
            System.out.println("parolu daxil edin:");
            parol = scanner.nextLine();
        } while (!parol.equals("1234"));

        System.out.println("Accepted!");
        scanner.close();
    }

    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
    }
}