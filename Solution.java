import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String ar[]){
    
         Scanner s = new Scanner(System.in);
         int num = s.nextInt();
         String[] arr = new String[num];
         for(int i=0;i<arr.length;i++){
             arr[i] = s.next();
         }
         for(String i:arr){
             alternatingChar(i);
         }
     }
    
    public static void alternatingChar(String st){
        int counter = 0;
        char[] chararr = st.toCharArray();
        char ch = chararr[0];
        for(int i=1;i<chararr.length;i++){
            
            if(ch == chararr[i]){
                counter++;
            }else{
                ch = chararr[i];
            }
            if(ch != chararr[i]){
                System.out.println(counter);
                return;
            }
            /*else if(){
                
            }*/
        }
        System.out.println(counter);
    }
    
}