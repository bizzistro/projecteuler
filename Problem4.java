import java.io.*;

public class Problem4
{
  public static void main (String[] args) throws java.lang.Exception
  { 
    int largest = 0;
    for(int i = 100; i <= 999; i++){
      for(int j = 100; j <= 999; j++){
        if(i*j > largest && isPalindrome(i*j)){
          largest = i*j;
        }
      }
    }
    
    System.out.println("Largest: " + largest);
  }
  
  public static boolean isPalindrome(int number){
    String num = Integer.toString(number);
    int indexRight = num.length()-1;
    for(int i = 0; i < num.length(); i++){
      if(num.charAt(i) != num.charAt(indexRight)){
        return false;
      }
      indexRight--;
    }
    return true;
  }
   
}