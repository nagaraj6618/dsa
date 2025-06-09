import java.util.*;
class Merge{
   public void mergeSort(int nums[],int low,int high){
      if(low==high)return;

      int mid = (low+high)/2;

      mergeSort(nums, low, mid);
      mergeSort(nums, mid+1, high);
      merge(nums,low,mid,high);
   }
   public void merge(int nums[],int low,int mid,int high){
      int left = low;
      int right = mid+1;
      List<Integer> temp = new ArrayList<>();

      while(left<=mid && right<=high){
         if(nums[left]>nums[right]){
            temp.add(nums[right]);
            right++;
         }
         else{
            temp.add(nums[left]);
            left++;
         }

      }
      while(left<=mid){
         temp.add(nums[left]);
         left++;
      }
      while(right<=high){
         temp.add(nums[right]);
         right++;
      }

      for(int i=low;i<=high;i++){
         nums[i] = temp.get(i-low);
      }
   }
}
