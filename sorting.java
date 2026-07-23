import java.util.*;
public class sorting {
    public static void main(String args[]){
        int arr[]= {7,8,3,1,2};
        //bubble sort
        // for(int i=0; i<arr.length-1;i++){
        //     for(int j=0; j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             //swap
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }

        //selection sort
        for(int i=0;i<arr.length-1; i++){
            int smallest= i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap
           
                int temp = arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
        
        }
        //print sorted array
        System.out.println("Sorted array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
