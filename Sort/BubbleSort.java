public class BubbleSort {
   

   void sort(int[] arr){
      
      int n = arr.length;
      for(int i=0;i<n;i++){
         int isDidSwap = 0;

         for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
               swap(arr,j,j+1);
               isDidSwap = 1;
            }
         }
         
         if(isDidSwap == 0 && i==0 ) {
            System.out.println("\nNo Swap is done so it is already sorted.. Time Complexity O(n)");   
            break;
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

   void sortRecursive(int []arr,int i){

      int n = arr.length;
      if(i==n-1) return;
      int flag = 0;
      for(int j=0;j<n-i-1;j++){
         if(arr[j]>arr[j+1]){
            swap(arr, j, j+1);
            flag=1;
         }
      }
      if(flag == 0) {
         System.out.println("No more swap done so stoped at : "+i);
         return;
      };
      sortRecursive(arr,i+1);

   }
}
