class Quick{
   public void quickSort(int nums[],int low,int high){
      if(low<high){
         int pIndex = partition(nums, low, high);
         quickSort(nums, low, pIndex-1);
         quickSort(nums, pIndex+1, high);
      }
   }
   public int partition(int nums[],int low,int high){
      int pivot = nums[low];
      int i = low;
      int j = high;

      while(i<j){
         while(nums[i]<= pivot && i<high)i++;
         while(nums[j] >= pivot && j>low)j--;
         if(i<j){
            swap(nums,i,j);
         }
      }
      swap(nums, low, j);
      return j;

   }
   public void swap(int nums[],int i,int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }
}