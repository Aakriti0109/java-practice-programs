import java.util.*;
public class array{
    public static void main(String args[]){
        System.out.println("Enter the size of the array:");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
           arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search:");
         int x = sc.nextInt();
         for(int i=0; i<size; i++){
             if(arr[i]==x){
                    System.out.println("Element found at index: " + i);
                    return;
             }
         }
    }
}