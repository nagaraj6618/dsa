import java.util.*;

class Recursion{

   void printName(int n){
      if(n==0) return;
      System.out.println("Nagaraj S");
      printName(n-1);
   }
   void print(int n) {
      if (n == 0) return;
      
      print(n - 1);     
      System.out.println(n);  

  }

  int sumOfN(int n){
      if(n==1) return 1;
      return sumOfN(n-1)+n;
  }

  int factorial(int n){
   if(n==1) return 1;

   return factorial(n-1)*n;
  }

  void reverseAArray(int start,int end,int []arr){

   if(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      reverseAArray(start+1, end-1, arr);
   }
  }

  void printArray(int []arr){
   System.out.print("The Arrays elements are : ");
   for(int i:arr){
      System.out.print(i+" ");
   }
  }

//   void reverseString(int start,int end,String name){

//    if(start<end){

//       char temp = name.charAt(start);


//    }
//   }

  String reverseString(int i,String name){
   int n = name.length()-1;
   if(i>n) return "";
   return name.charAt(n-i) + reverseString(i+1, name);
  }
  boolean palindrome(int i,String name){

   //Two Pointer Approach using loop

   // int n = name.length();
   // while(i<n/2){
   //    if(name.charAt(i) != name.charAt(n-i-1)){
   //       return false;
   //    }
   //    i++;
   // }

   // Two pointer Approach using recursion
   int n = name.length();
   if(i>=n/2) return true;

   if(name.charAt(i) != name.charAt(n-i-1)) return false;

   return palindrome(i+1, name);

   // Reversing a string using loop
//    String temp = "";
//    for(int j=name.length()-1;j>=0;j--){
//       temp = temp + name.charAt(j);
//    }
//    if(!temp.equals(name)){
//       return false;
//    }
//    return true;

      //Reversing a string using recursion 
      // String temp = reverseString(i, name);
      // if(temp.equals(name)){
      //    return true;
      // }
      // return false;
  }

  void fib(int i,int n,int f1,int f2){

   if(i>n) return;
   System.out.print(f1+" ");
   fib(i+1,n,f2,f1+f2);
   
  }
  int fibonacci(int N){
        
   // Base Condition.
   if(N <= 1){
       
       return N;
   }
   
   // Problem broken down into 2 functional calls
   // and their results combined and returned.
   int last = fibonacci(N-1);
   int slast = fibonacci(N-2);
   
   return last + slast;
   

}
  
}

public class Main{
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number : ");
      int n = sc.nextInt();

      Recursion obj = new Recursion(); 
      // obj.print( n);
      // System.out.println(obj.sumOfN(n));
      // obj.printName(n);

      // System.out.println(obj.factorial(n));
      int []arr = {1,2,3,4,5};
      obj.reverseAArray(0, arr.length-1, arr);
      obj.printArray(arr);

      System.out.println(" " + obj.palindrome(0, "1211"));

      String name = "Nagaraj";
      System.out.println(obj.reverseString(0, name));

      obj.fib(0,n,0,1);


      System.out.print(obj.fibonacci(n));
      sc.close();
   }
}