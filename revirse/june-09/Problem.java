public class Problem {
   //Move Zeors
   public void moveZeros(int nums[]){
      int n = nums.length-1;
      int i = 0,j=1;
      while(i<n && j<n){
         if(nums[i] !=0)i++;
         if(nums[j] == 0) j++;

         if(nums[i] == 0 && nums[j] != 0){
            swap(nums,i,j);
         }
      }
   }
   public void swap(int nums[],int i,int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }
}
