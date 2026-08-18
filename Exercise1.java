import java.util.*;
public class Exercise1 {
    //Question 1: Enter 3 numbers from user and make a function to find their average
    // public static double findAverage(double a, double b, double c){
    //    double sum= a+b+c;
    //    double average = sum/3;
    //    return average;
    // }
    // public static void main(String args[]){
    //     System.out.println("Enter three numbers:");
    //     Scanner sc = new Scanner(System.in);
    //     double a = sc.nextDouble();
    //     double b = sc.nextDouble();
    //     double c = sc.nextDouble();
    //    double average = findAverage(a,b,c);
    //    System.out.println("The average of three numbers is: " + average);
    // }

    //Question 2: Write a function to print the sum of all odd numbers from 1 to n
    // public static int sumOfOddNumbers(int n){
    //     int sum =0;
    //     for (int i=0; i<=n; i++){
    //         if(i%2 !=0){
    //             sum = sum +i;
    //              }
    //     }
    //     return sum;
    // }
    // public static void main(String args[]){
    //     System.out.println("Enter a number:");
    //     Scanner sc = new Scanner(System.in);
    //     int n= sc.nextInt();
    //     int sum = sumOfOddNumbers(n);
    //     System.out.println("The sum of all odd numbers from 1 to " +n+ " is " +sum);
    // }
    // Question 3. Write a function that takes in 2 numbers and returns the greater of those two
    // public static int findGreater( int a, int b){
    //     if (a>b){
    //         return a;
    //     }
    //     else{
    //         return b;
    //     }

    // }
    // public static void main(String args[]){
    //     System.out.println("Enter two numbers:");
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //    int greater = findGreater(a,b);
    //    System.out.println("The greater of the two numbers is: " + greater);
    // }
    
    //Question 4: Write a function that takes in the radius as iinput and returns the circumference of a circle
    // public static double calculateCircumference( double radius){
    //     double circumference = 2* Math.PI* radius;

    //     return circumference;   
    // }
    // public static void main ( String args[]){
    //     System.out.println("Enter the radius of the circle:");
    //     Scanner sc = new Scanner(System.in);
    //     double radius = sc.nextDouble();
    //     double circumference = calculateCircumference(radius);
    //     System.out.println("The circumference of the circle is: " + circumference);
    // }
    // Question 5 : Write a function that takes in age as input and returns if that person is eligible to vote or not. 
    // public static boolean isEligibleToVote(int age){
    //     if(age<0){
    //         System.out.println("Invalid age");
    //     return false;
    //     }
    //     if (age>=18){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
            
    //     public static void main(String args[]){
    //         System.out.println("Enter your age:");
    //         Scanner sc = new Scanner(System.in);
    //         int age = sc.nextInt();
    //         boolean eligible = isEligibleToVote(age);
    //         if (eligible){
    //             System.out.println("You are eligible to vote.");
    //         }
    //         else{
    //             System.out.println("You are not eligible to vote.");
    //         }
    //     }
// q=Question 6 Write an infinite loop using do while condition
//    public static void main(String args[]){
//     int i=1;
//     do{
//         System.out.println("This is an infinite loop.");
//         i++;
//     }
//     while (i>=1);
//    }


//QUESTION 7: Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int positiveCount =0;
        int negativeCount =0;
        int zeroCount =0;
        char choice;
        do{
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            if (number>0){
                positiveCount++;
            }
            else if (number<0){
                negativeCount++;
            }
            else{
                zeroCount++;
            }
            System.out.println("Do you want to enter another number? (y/n)");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);
    }
}