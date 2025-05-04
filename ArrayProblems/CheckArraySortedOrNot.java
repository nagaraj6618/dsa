public class CheckArraySortedOrNot {
   public boolean isArraySorted(int []arr,int n){
      //According to bubble sort.The right side Adjacent element should be greater;
      //If is not follows then the arry is not sorted.
      for(int i=0;i<n-1;i++){
         if(arr[i]>arr[i+1]) return false;
      }
      return true;
   }

   public void rotateArray(int []arr,int d){
      int rotateTime = d%arr.length;
      if(rotateTime == 0) {
         System.out.println("No Rotate done.");
         return;
      }
      for(int i=0;i<rotateTime;i++){
         int x = arr[0];
         for(int j=0;j<arr.length-1;j++){
            arr[j] = arr[j+1];
         }
         arr[arr.length-1] = x;
      }
   }

   public void printArray(int []arr){
      for(int i:arr){
         System.out.print(i+ " ");
      }
   }
   public boolean checkArraySortedAndRotated(int[] nums) {

      //O(n^3) - Time Complexity
      for(int i=0;i<nums.length;i++){
          int flag = 0;
          for(int j=0;j<nums.length-1;j++){
              if(nums[j]>nums[j+1]){
                  flag = 1;
                  System.out.println("Flag  become 1 when j = "+j);
                  // break;
              }
          }
          if(flag == 1){

            System.out.println("The Rotate function called at i = "+i);
            rotate(nums);
          }
          else return true;


      }
      return false;
  }
  public void rotate(int []nums){
      int x = nums[0];
      for(int i=0;i<nums.length-1;i++){
          nums[i] = nums[i+1];
      }
      nums[nums.length-1] = x;
      printArray(nums);
  }


  //Optimized Approach
  public boolean checkArraySortedAndRotatedOptimized(int[]arr){
   int count = 0;
   int n = arr.length;

   for(int i=0;i<n;i++){
      if(arr[i]>arr[(i+1)%n]){
         count++;
      }
   }
   if(count>1) return false;
   return true;
  }
}
