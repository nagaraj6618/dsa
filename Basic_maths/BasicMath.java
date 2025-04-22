import java.util.ArrayList;
import java.util.Collections;

public class BasicMath {
   
   public int countDigitOfNumber (int n){
      int count = 0;
      //BFA
      // while(n>0){
      //    n = (int)n/10;
      //    count++;
      // }

      //Optimal Approach 
      if(n == 0){
         count= 1;
      }
      else{
         count = (int)(Math.log10(n) + 1);
      }
      
      System.out.println("The Digit count is : "+count);
      return count;
   }

   public void printAllDivisor(int n){
      System.out.print("The Divisor of "+n+" is : ");

      ArrayList <Integer> arrObj = new ArrayList<Integer>() ;
      for(int i=1;i<= Math.sqrt(n);i++){
         if(n%i == 0 ){
            // System.out.print(i+" ");
            arrObj.add(i);
            if(n/i != i){
               arrObj.add(n/i);
            }
         }
      }
      Collections.sort(arrObj);
      for(int i : arrObj){
         System.out.print(i +" ");
      }
   }

   public boolean isPrime(int n){

      for(int i=2 ; i*i <= n ; i++){
         if(n%i == 0){
            System.out.println("The Given Number is not prime.");
            return false;
         }
      }
      System.out.println("The Given Number is prime.");
      return true;
   }

   public boolean isArmstrongNumber(int n){
      int sum = 0,digit = 0;
      int p = (int)(Math.log10(n) +1) ;
      int temp = n;
      while(n>0){
         digit = n%10;
         sum = sum + (int)(Math.pow(digit, p));
         n = n/10;
      }
      if(temp == sum){
         System.out.println("The Given is an Armstrong Number..");
         return true;
      }
      System.out.println("The Given number is not an Armstrong Number...");
      return false;
   }

   public int GCD(int n,int m){

      //BFA

      int gcd = 1;
      // for(int i=1;i<=Math.min(n,m);i++){
      //    if(n%i == 0 && m%i==0) {
      //       gcd = i;
      //    }
      // }
      // System.out.println("The GCD is "+gcd);
      for(int i = Math.min(n,m);i>=1;i--){
         if(n%i ==0 && m%i==0){
            System.out.println("The GCD is "+i);
            break;
         }
      }
      


      //Optimal Approuch. by elucidean Theorem.

      // Method 1
      while(n>0 && m>0){

         if(n>m){
            n = n%m;
         }
         else{
            m= m%n;
         }
      }

      if(n==0){
         gcd = m;
      }
      else{
         gcd = n;
      }

      System.out.println("The GCD is "+ gcd);

      // Method 2

      // int temp1 = n;
      // int temp2 = m;
      // n = Math.max(temp1,temp2);
      // m = Math.min(temp1,temp2);
      // while(n>0&& m>0){
      //    int rem = n%m;
      //    n = m;
      //    m = rem;
      // }
      // System.out.println("The GCD is : "+n);
      return n;
   }
}
