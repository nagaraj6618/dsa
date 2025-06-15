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

   //Floor and Ceil in sorted array;
   public void floorAndCeil(int nums[],int target){
      int n = nums.length;
      int low = 0;
      int high = n-1;
      int floor = -1;
      int ceil = -1; 
      while(low<=high){
         int mid = (low+high)/2;

         if(nums[mid] == target){
            floor = nums[mid];
            ceil = nums[mid];
            break;
         }
         else if(target>nums[mid]){
            floor = nums[mid];
            low = mid+1;
         }else{
            ceil = nums[mid];
            high = mid-1;
         }
      }
      System.out.println("Floor and ceil is : "+floor+" "+ceil);
   }

   //Find the occurance of the element
   //Formula. = lastOccurance - firstOccurance+1 = Tot no of occurance.

   public int totalOccuranceOfNumber(int nums[],int target){
      int firstOccurance = -1;
      int lastOccurance = -1;
      int n = nums.length;
      int low = 0;
      int high = n-1;

      while(low<=high){
         int mid = (low+high)/2;

         if(nums[mid] >= target){
            if(nums[mid] == target){
               firstOccurance = mid;
            }
            high = mid-1;
         }else{
            low = mid+1;
         }
      }
      low = 0;
      high = n-1;
      while(low<=high){
         int mid = (low+high)/2;
         if(nums[mid]>target){
            high = mid-1;
         }else{
            if(nums[mid] == target){
               lastOccurance = mid;
            }
            low = mid+1;
         }
      }
      int tot = 0;
      if(firstOccurance != -1 && lastOccurance != -1){
         tot = lastOccurance - firstOccurance+1;
      }
      return tot;
   }
}
