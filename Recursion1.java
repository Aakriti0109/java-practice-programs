import java.util.Scanner;
public class Recursion1 {
//     public static void printNum(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printNum(n+1);    }
// public static void main(String args[]){
//     int n=1;
//     printNum(n);
// }
// public static void printSum(int i, int n, int sum){
//     if(i>n){
//         System.out.println(sum);
//         return;
//     }
//     sum += i;
//     printSum(i+1, n, sum);
// }
// public static void main(String args[]){
//     System.out.println("Enter the value of n:");
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     printSum(1, n, 0);
// }
// public static void fact(int n, int i){

//     if(i==0){
//         System.out.println(n);
//         return;
//     }
//         n=n*i;
//         fact(n, i-1);
//     }

//     public static void main(String args[]){
//         System.out.println("Enter the value of n:");
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         fact(1, n);
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1= power(x, n-1);
        int xPown= x*xPownm1;
        return xPown;
    }
     public static void main(String args[]){
        System.out.println("Enter the value of x and n:");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n= sc.nextInt();
        int ans= power(x,n);
        System.out.println(ans);
     }
}
    
