public class BubbleSort {
   

   void sort(int[] arr){
      

      int n = arr.length;
      for(int i=0;i<n;i++){


         for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
               swap(arr,j,j+1);
            }
         }
      }
   }

   void swap(int []arr,int a,int b){

      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }

   void printArray(int[] arr){
      for(int i : arr){
         System.out.print(i+" ");
      }
   }
}
