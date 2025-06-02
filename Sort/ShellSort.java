public class ShellSort{
   public void shellSort(int []nums){
      int n = nums.length;
      for(int gap = n/2;gap>0;gap = gap/2){
         for(int j = gap;j<n;j++){

            for(int i=j-gap;i>=0;i=i-gap){
               if(nums[i] <nums[i+gap]){
                  break;
               }
               else{
                  swap(nums,i,i+gap);
               }
            }
         }
      }
   }
   void swap(int nums[],int i,int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }
   public static void main(String[]args){
      int nums[] = {23,29,15,19,31,7,9,5,2};
      ShellSort obj = new ShellSort();
      obj.shellSort(nums);
      obj.printArray(nums);

   }
   public void printArray(int []nums){
      for(int i:nums){
         System.out.print(i+" ");
      }
      System.out.println();
   }
}