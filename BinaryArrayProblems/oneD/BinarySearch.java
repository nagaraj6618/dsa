public class BinarySearch {
   public int search1(int nums[],int target){

      int n = nums.length;
      int low = 0;
      int high = n-1;
      int mid = (low+high)/2;
      while(low<=high){
         mid = (low+high)/2;
         if(nums[mid] == target) return mid;
         else if(target>nums[mid]){
            low = mid+1;
         }else{
            high = mid-1;
         }
      }
      return -1;
   }
   public int recursiveMethod(int nums[],int low,int high,int target){
      if(low<=high){
         int mid = (low+high)/2;
         if(nums[mid] == target) return mid;
         else if(target > nums[mid]){
            return recursiveMethod(nums,mid+1,high,target);
         }else{
            return recursiveMethod(nums,low,mid-1,target);
         }
      }
      return -1;
      
   }

   //Implement Lower bound
   public int loweBound(int nums[],int target){
      int n = nums.length;
      int low = 0;
      int high = n-1;
      int ans = n;
      while(low<=high){
         int mid = (low+high)/2;

         if(nums[mid] > target) {
            ans = mid;
            high = mid-1;
            
         }
         else {
            low = mid+1;
         }
      }
      return ans;
   }
}
