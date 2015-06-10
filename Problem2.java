import java.io.*;

public class Problem2
{
  public static void main (String[] args) throws java.lang.Exception
  { 
    int prevprev = 1;
    int prev = 2;
    
    int sum = 2;
    while(prev + prevprev <= 4000000){
      int curr = prev + prevprev;
      prevprev = prev;
      prev = curr;
      
      if(curr % 2 == 0){
        sum += curr;
      }
    }
    
    System.out.println("Sum: " + sum);
  }
}
