import java.util.*;
public class inbuiltmethods {
    public static void main(String args[]){
        //Concatenation of two strings
    //     String firstname = "Aakriti";
    //     String Lastname = "Singh";
    //     String fullname = firstname + " " + Lastname;
    //     System.out.println("Your full name is: ");
    //     System.out.println(fullname);

    //     //Finding the length of a string    
    //     System.out.println("The length of your full name is: " + fullname.length());
    //     //Finding the index of a character in a string
    //     for(int i=0; i<fullname.length(); i++){
    //         System.out.println("Character at index " + i + " is: " + fullname.charAt(i));
    //     }
    //     //comparing two string
    //     if (firstname.compareTo(Lastname)==0){
    //         System.out.println("Strings firstname and lastname are of equal length");
    //     }
    //     else{
    //         System.out.println("Strings firstname and lastname are of different lengths");
    //     }
    // }
    //fiinding a  substring
    String sentence = "My name is Aakriti Singh";
    String substring = sentence.substring(11, 18);
    System.out.println("The substring is: " + substring);
    
}
}