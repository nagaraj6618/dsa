import java.util.Scanner;

public class Main{
   public static void main(String args[]){
      BasicMath obj = new BasicMath();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number : ");
      int n = sc.nextInt();

      // obj.countDigitOfNumber(n);
      // obj.printAllDivisor(n);
      // obj.isPrime(n);
      // obj.isArmstrongNumber(n);
      obj.GCD(n, 20);
      sc.close();
   }
}