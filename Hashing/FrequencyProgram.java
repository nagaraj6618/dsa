import java.util.*;

class FrequencyProgram {
   void frequencyOfNumberExample(){
      int hash[] = new int[13]; //13 Because the element in the array at max 12 so the hash store 0-12;
      int n;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      n = sc.nextInt();
      int arr[] = new int[n];

      for(int i=0;i<n;i++){
         System.out.print("Element "+(i+1)+" : ");
         arr[i] = sc.nextInt();

         //PreCompute the frequencies of the elements;
         hash[arr[i]] +=1;
      }
      System.out.print("Enter the number to check frequency : ");
      int m = sc.nextInt();
      System.out.println("The frequency of "+m+ " is "+hash[m]);
      sc.close();
   }


   void frequencyofCharInStringOnlyLowerCaseAlphabets(){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string : ");
      String name = sc.next();
      
      //for an example the character contains in the string is only an lower case alphabet.
      //Totally we have 26 alphabets.

      int hash[] = new int[26];

      for(int i=0;i<name.length();i++){
         int index = name.charAt(i) -'a';
         hash[index]+=1; 
      }

      for(int i=0;i<hash.length;i++){
         System.out.println((char)(i+'a')+" -> "+hash[i]);
      }

      sc.close();
   }

   void frequencyofCharInString(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string : ");
      String name = sc.next();
      
      //Total number of character is 256;
      int hash[] = new int[256];

      for(int i=0;i<name.length();i++){
         int index = name.charAt(i);
         hash[index]++;
      }
      
      for(int i=0;i<hash.length;i++){
         System.out.println((char)(i)+" -> "+hash[i]);
      }


      int max = 0,min=name.length();
      int maxIndex = 0,minIndex = 0;
      
      for(int i=0;i<name.length();i++){
         int index = name.charAt(i);
         if(max<hash[index]){
            max = hash[index];
            maxIndex = index;
         }
         if(min>hash[index]){
            min = hash[index];
            minIndex = index;
         }
      }
      System.out.println("The Maximum repeated character is : "+(char)maxIndex);
      System.out.println("The Minimum Character repeated is : "+(char)minIndex);


      sc.close();
   }
}