public class QuickSort {
   void swap(int []arr,int i,int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

   int partition(int []arr,int low,int high){
      int pivot = arr[low];
      int i = low,j = high;


      //i - goes from the left to right;
      //j - goes from the right to left;
      
      //Iterate until j cross i;
      while(i<j){

         //Findthe element which is higher that pivot on left side.
         while(arr[i]<=pivot && i<=high-1){
            i++;
         }

         //Find the element which is lesser than pivot on right side.
         while(arr[j] > pivot && j>=low+1){
            j--;
         }

         if(i<j) {
            swap(arr,i,j);
         }
      }

      swap(arr,low,j);
      //Swap the pivot to correct position
      return j;
   }

   void quickSort(int []arr,int low,int high){

      if(low<high){
         int pIndex = partition(arr,low,high);
         quickSort(arr,low,pIndex-1);
         quickSort(arr,pIndex+1,high);
      }

   }
   void printArray(int []arr){

      for(int i:arr){
         System.out.print(i+" ");
      }
      System.out.println("");
   }
}
