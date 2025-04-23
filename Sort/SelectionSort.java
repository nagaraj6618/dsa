class SelectionSort{
   void sort(int[]arr){
      int n = arr.length;
      for(int i=0;i<n;i++){

         int smallIndex=i;
         for(int j=i;j<=n-1;j++){
            if(arr[smallIndex] >arr[j]) {
               smallIndex = j;
            }
         }
         swap(arr,i, smallIndex);
      }
   }
   void printArray(int []arr){
      
      for(int i : arr){
         System.out.print(i+ " -> ");
      }
      System.out.println("");
   }
   void swap(int []arr, int a,int b){
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }

   void pattern(){
      int n = 5;
      for(int i=0;i<n;i++){
         for(int j=0;j<n-i;j++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }


   void sortUsingLargeElement(int arr[]){

      int n =arr.length;

      for(int i=0;i<n-1;i++){

         int largeIndex = 0;
         for(int j=0;j<n-i;j++){

            if(arr[largeIndex] < arr[j]) {
               largeIndex = j;
            }
         }
         swap(arr,  largeIndex,n-i-1);

      }
   }
}

/*
 * 
 *    ****  4-0      n-i
 *     ***  4-1
 *      **  4-2
 *       *  4-3
 */