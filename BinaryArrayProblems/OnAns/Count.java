import java.util.*;
public class Count {
   public static void main(String[] args){
      Count obj = new Count();
      int cnt = obj.noOfDigits(123);
      System.out.println("The no of digit is : "+cnt);

      System.out.println("The NO of digits is : "+obj.noOfDigitsMethod2(123));

   }

   public int noOfDigits(int n){
      //Tc - O(log10(n))
      //SC - O(1)
      int count = 0;
      if(n==0) return 1;
      while(n>0){
         n=n/10;
         count++;
      }
      return count;
   }
   public int noOfDigitsMethod2(int n){
      return (int)Math.log10(n)+1;
   }
}
