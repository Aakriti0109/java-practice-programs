import java.util.Scanner;

public class LogicalOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean b = sc.nextBoolean();

        
        System.out.println("a AND b: " + (a && b));
        System.out.println("a OR b: " + (a || b));
        System.out.println("NOT a: " + (!a));
        System.out.println("NOT b: " + (!b));

        sc.close();
    }
}