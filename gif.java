import java.util.*;
public class gif {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        if(n>0){
            System.out.println("1");
        }
        else if(n<0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
    }
}
