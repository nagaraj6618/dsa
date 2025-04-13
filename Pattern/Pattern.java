public class Pattern{
   public void pattern1(int N){
      /*
         Example 2:
         Input: N = 6
         Output:
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
       */

      for(int i=0;i<N;i++){
         for(int j=0;j<N;j++){
            System.out.print("* ");
         }
         System.out.println("");
      }
   }
   public void pattern2(int N){
      /*
         Input Format: N = 6
         Result:
         * 
         * * 
         * * *
         * * * *
         * * * * *
         * * * * * *
       */

       for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print("* ");
         }
         System.out.println("");
       }
   }

   public void pattern3(int N){
      /*
         Input Format: N = 6
         Result:
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         1 2 3 4 5 6
       */

      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print(j+1+" ");
         }
         System.out.println("");
      }
   }
   public void pattern4(int N){
      /*
         Input Format: N = 6
         Result:
         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5
         6 6 6 6 6 6
       */
      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print(i+1+" ");
         }
         System.out.println("");
      }
   }

   public void pattern5(int N){
      /*
         Input Format: N = 6
         Result:
         * * * * * *
         * * * * * 
         * * * * 
         * * * 
         * * 
         * 
       */

      for(int i=0;i<N;i++){
         // for(int j=0;j<N-i;j++){
         //    System.out.print("* ");
         // }
         for(int j=N;j>i;j--){
            System.out.print("* ");
         }
         System.out.println("");
      }
   }

   public void pattern6(int N){
      /*
         Input Format: N = 6
         Result:
         1 2 3 4 5 6
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2 
         1
       */

      for(int i=0;i<N;i++){
         // for(int j=0;j<N-i;j++){
         //    System.out.print(j+1+" ");
         // }

         for(int j=N;j>i;j--){
            System.out.print(N-j+1+" ");
         }
         System.out.println("");
      }
   }

   public void pattern7(int N){
      /*
         Input Format: N = 6
Result:
     *     
    ***    
   *****   
  *******  
 ********* 
***********
       */

      for(int i=0;i<N;i++){
         for(int k = 0;k<N-1-i;k++){
            System.out.print(" ");
         }
         for(int j=0;j<(i*2)+1;j++){
            System.out.print("*");
         }
         for(int k = 0;k<N-1-i;k++){
            System.out.print(" ");
         }
         System.out.println("");
      }
   }
   public void pattern8(int N){
      /*
         Input Format: N = 6
Result:     
***********
 *********
  *******
   ***** 
    ***    
     *
       */

      for(int i=0;i<N;i++){
         for(int k=0;k<i;k++){
            System.out.print(" ");
         }
         
         // for(int j=N*2-1;j>i*2;j--){
         //    System.out.print("*");
         // }

         for(int j=0;j<((N-i)*2)-1;j++){
            System.out.print("*");
         }
         
         for(int k=0;k<i;k++){
            System.out.print(" ");
         }
         System.out.println("");
      }
   }

   public void pattern9(int N){
      /*
         Input Format: N = 6
Result:   
     *
    ***
   ***** 
  *******
 *********
***********  
***********
 *********
  *******
   ***** 
    ***    
     *
       */

      for(int i=0;i<N;i++){
         for(int k=0;k<N-i-1;k++){
            System.out.print(" ");
         }

         for(int j=0;j<((i+1)*2)-1;j++){
            System.out.print("*");
         }
         // for(int k=0;k<N-i-1;k++){
         //    System.out.print(" ");
         // }

         System.out.println("");
         
      }
      int n=N-1;
      for(int i=0;i<n;i++){
         // System.out.print(" ");
         for(int k=0;k<i+1;k++){
            System.out.print(" ");
         }

         for(int j=0;j<((n-i)*2)-1;j++){
            System.out.print("*");
         }

         // for(int k=0;k<i;k++){
         //    System.out.print(" ");
         // }
         System.out.println("");
      }
   }

   public void pattern10(int N){
      /*
         Input Format: N = 6
Result:   
     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *
       */

      // for(int i=0;i<N;i++){
      //    for(int j=0;j<=i;j++){
      //       System.out.print("*");
      //    }
      //    System.out.println("");
      // }
      // for(int i=0;i<N-1;i++){
      //    int star = N-i-1;
      //    for(int j=0;j<star;j++){
      //       System.out.print("*");
      //    }
      //    System.out.println("");
      // }

      for(int i=0;i<2*N-1;i++){
         int star = i;
         if(i>=N) star = 2*N-i-2;
         for(int j=0;j<=star;j++){
            System.out.print("*");
         }
         System.out.println("");
      }
   }

   public void pattern11(int N){
      /*
       Input Format: N = 6
Result:   
1
01
101
0101
10101
010101
       */

      
      for(int i=0;i<N;i++){
         int type = i;
         for(int j=0;j<=i;j++){
            // if(type%2 == 0){
               System.out.print((int)(type+1)%2);
            // }
            // else{
               // System.out.print(0);
            // }
            type++;
            
         }
         
         System.out.println("");
      }
   }
   public void pattern12(int N){
      /*
Input Format: N = 6
Result:   
1          1
12        21
12       321
1234    4321
12345  54321
123456654321
       */

      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print(j+1);
         }
         for(int k=0;k<(N-i)*2-2;k++){
            System.out.print(" ");
         }
         for(int j=0;j<=i;j++){
            System.out.print(i-j+1);
         }
         System.out.println("");
      }
   }
   public void pattern13(int N){
      /*
         Input Format: N = 6
Result:   
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21
       */
      int num=1;
      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print(num+" ");
            num++;
         }
         System.out.print("\n");
      }
   }

   public void pattern14(int N){
      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print((char)(64+j+1)+" ");
         }
         System.out.println("");
      }
   }
   public void pattern15(int N){
      for(int i=0;i<N;i++){
         for(int j=0;j<N-i;j++){
            System.out.print((char)(64+j+1)+" ");
         }
         System.out.println();
      }
   }
   public void pattern16(int N){
      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print((char)(64+i+1)+" " );
         }
         System.out.println();
      }
   }
   public void pattern17(int N){
      /*
        Enter the N value : 4
   A
  ABA
 ABCBA
ABCDCBA 
       */

      for(int i=0;i<N;i++){
         
         for(int k=0;k<N-i-1;k++){
            System.out.print(" ");
         }
         for(int j=0;j<=i;j++){
            System.out.print((char)(64+j+1));
         }
         for(int j=0;j<i;j++){
            System.out.print((char)(64+i-j));
         }
         // for(int j=i;j>0;j--){
         //    System.out.print(j);
         // }
         System.out.print("\n");
      }
   }

   public void pattern18(int N){
      /*
         Enter the N value : 5
E 
D E
C D E
B C D E
A B C D E
       */
      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print((char)(64+N-i+j)+" ");
         }
         System.out.print("\n");
      }
   }

   public void pattern19(int N){

      /*
         Enter the N value : 6
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
       */

      for(int i=0;i<N;i++){
         for(int j=0;j<N-i;j++){
            System.out.print("*");
         }
         for(int k=0;k<2*i;k++){
            System.out.print(" ");
         }
         for(int j=0;j<N-i;j++){
            System.out.print("*");
         }
         System.out.println();
      }

      for(int i=0;i<N;i++){
         for(int j=0;j<=i;j++){
            System.out.print("*");
         }
         for(int k=0;k<2*(N-i)-2;k++){
            System.out.print(" ");
         }

         for(int j=0;j<=i;j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }

   public void pattern20(int N){

      /*
         Enter the N value : 6
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
       */
      for(int i=0;i<N;i++){

         for(int j=0;j<=i;j++){
            System.out.print("*");
         }

         for(int k=0;k<2*(N-i)-2;k++){
            System.out.print(" ");
         }

         for(int j=0;j<=i;j++){
            System.out.print("*");
         }
         System.out.println("");
      }

      for(int i=0;i<N-1;i++){

         for(int j=0;j<N-i-1;j++){
            System.out.print("*");
         }

         for(int k=0;k<2*i+2;k++){
            System.out.print(" ");
         }
         for(int j=0;j<N-i-1;j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }

   public void pattern21(int N){
      /*
         Enter the N value : 6
******
*    *
*    *
*    *
*    *
******
       */
      for(int i=0;i<N;i++){
         for(int j=0;j<N;j++){
            if(i==0 || j==0 || j==N-1 || i==N-1){
               System.out.print("*");
            }
            else System.out.print(" ");
         }
         System.out.println();
      }
   }

   public void pattern22(int N){

      for(int i=0;i<((2*N)-1);i++){
         for(int j=0;j<(2*N)-1;j++){
           int top = i;
           int bottom = (2*N)-2-i;
           int left = j;
           int right = (2*N)-2-j;

           System.out.print(N-Math.min(Math.min(top,right),Math.min(left,bottom))+" ");
         }
         System.out.println("");
      }
   }

}