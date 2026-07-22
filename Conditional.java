import java.util.*;
public class Conditional{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //  int age = sc.nextInt();
    //  if (age>= 18)
    //     {
    //         System.out.println("You are an adult");
    //     }
    //     else
    //     {
    //         System.out.println("You are a minor");
    //     }
    int button = sc.nextInt();
    switch (button){
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("Namaste");
            break;
        case 3:
            System.out.println("Bonjour");
            break;
        default:
            System.out.println("Invalid button");
    }
}
}