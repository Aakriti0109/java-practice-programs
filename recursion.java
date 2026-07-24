// public class recursion{
    // public static void moveAllX(String str, int idx, int count, String newString){
    //     //base case
    //     if(idx==str.length()){
    //         for(int i=0; i<count; i++){
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar= str.charAt(idx);
    //     if(currChar=='x'){
    //         count++;
    //         moveAllX(str, idx+1, count, newString);
    //     }
    //     else{
    //         newString += currChar;
    //         moveAllX(str, idx+1, count, newString);
    //     }
    // }
    // public static void main(String args[]){
    //     String str= "axbcxxd";
    //     moveAllX(str, 0, 0, "");
    // }
    //}
    // 2. remove duplicates from a string using recursion
    // public class recursion{
    //     public static boolean[] map= new boolean[26];
    //     public static void removeDuplicates(String str, int idx, String newString){
    //         //base case
    //         if(idx==str.length()){
    //             System.out.println(newString);
    //             return;
    //         }
    //         char currChar= str.charAt(idx);
    //         if(map[currChar-'a']==true){
    //             removeDuplicates(str, idx+1, newString);
    //         }else{
    //             newString += currChar;
    //             map[currChar-'a']=true;
    //             removeDuplicates(str, idx+1, newString);
    //         }
    //     }
    //     public static void main(String args[]){
    //         String str= "appnnacollege";
    //         removeDuplicates(str, 0, "");
    //     }
    // }
    //3. subsequences
    public class recursion{
        public static void subseq(String str, int idx, String newString){
            if(idx==str.length()){
                System.out.println(newString);
                return;
            }
            char currChar= str.charAt(idx);
            //to be
            subseq(str, idx+1, newString+currChar);
            //not to be
            subseq(str, idx+1, newString);
        }
        public static void main(String args[]){
            String str= "abcd";
            subseq(str,0,"");
        }
    }
