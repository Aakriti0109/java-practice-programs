import java.util.*;
public class Naturalno {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int sum=0;
        // System.out.println("The first " + n + " natural numbers are:");
        // for (int i = 1; i <= n; i++) {
        //    sum = sum+i;
        // }
        // System.out.println(sum);
        
        for(int i=1; i<=10; i++){
           
              System.out.println(n*i);
        }
    }       
}
