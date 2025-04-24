public class InsertionSort {
   void sort(int []arr){


      int n = arr.length;

      for(int i=1;i<n;i++){
         int j=i;

         //If the arr is already sorted then the while loop will not execute.So it is O(n) Time complex
         while(j>0 && arr[j]<arr[j-1]){
            // if(arr[j]<arr[j-1]) {
               swap(arr,j,j-1);
            // }
            j--;
         }
         
         // for(int j=i;j>0;j--){
         //    if(arr[j]<arr[j-1]) {
         //       swap(arr,j,j-1);
         //    }
         // }
      }
   }
   void swap(int[]arr,int a,int b){
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }

   void printArray(int []arr){
      for(int i:arr){
         System.out.print(i+" ");
      }
   }

   void sortRecursive(int []arr,int i){

      int n = arr.length;
      if(i == n-1)return;

      int j = i;
      while(j>0 && arr[j]<arr[j-1]){
         swap(arr,j,j-1);
         j--;
      }
      sortRecursive(arr,i+1);
   }
}
