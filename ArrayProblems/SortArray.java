public class SortArray {
   //Sort an arrays 0's ,1's & 2's
   public void sortArray(int []nums){
      int n = nums.length;
      int mid = 0;
      int high = n-1;
      int low = 0;
      while(mid<=high){
         if(nums[mid] == 0){
            swap(nums,low,mid);
            low++;
            mid++;
         }
         else if(nums[mid] == 1){
            mid++;
         }
         else{
            swap(nums,mid,high);
            high--;
         }
      }
      printArray(nums);
   }
   void swap(int nums[],int i,int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }
   void printArray(int nums[]){
      for(int i:nums){
         System.out.print(i+" ");
      }
      System.out.println("");
   }
}
