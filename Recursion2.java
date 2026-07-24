import java.util.*;
public class Recursion2 {
    // public static void TowerOfHanoi(int n, String src, String dest, String helper){
    //     if(n==1){
    //         System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
    //         return;
    //     }
    //     TowerOfHanoi(n-1, src, helper, dest);
    //     System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
    //     TowerOfHanoi(n-1, helper, dest, src);
    // }
    // public static void main(String args[]){
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter the number of disks:");
    //     int n= sc.nextInt();
    //     TowerOfHanoi(n, "S", "D", "H");
    // }
    // 2.Reverse a string using recursion
    public static void printRev(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        printRev(str, str.length()-1);
    }
}
   