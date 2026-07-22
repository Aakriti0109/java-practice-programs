import java.util.*;
public class Comparison {
    public static void main(String[] args){
        System.out.println("Enter two numbers a and b:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if (a<b){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a and b are equal");
        }
        }
    }

    

