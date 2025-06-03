import java.util.*;
public class Inversion {
   public void countInversions(int nums[]){
      int n = nums.length;
      int count = 0;
      for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
            if(nums[i]>nums[j]) count++;
         }
      }
      System.out.println("The count of inversion is : "+count);
   }
   public int mergeSort(int nums[],int low,int high){
      int mid = (low+high)/2;
      int count = 0;
      if(low>=high) {
         return count;
      }
      count += mergeSort(nums, low, mid);
      count += mergeSort(nums, mid+1, high);
      count += merge(nums,low,mid,high);
      return count;
   }
   public int merge(int nums[],int low,int mid,int high){
      int left = low;
      int right = mid+1;
      int count = 0;
      List<Integer> temp= new ArrayList<>();
      while(left<=mid && right<=high){
         if(nums[left]<=nums[right]){
            temp.add(nums[left]);
            left++;
         }else{
            temp.add(nums[right]);
            count += (mid-left+1);
            right++;
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
      return count;
   }
   public static void main(String[] args){
      int nums[] = {5,3,2,4,1};
      Inversion obj = new Inversion();
      obj.countInversions(nums);
      int count = obj.mergeSort(nums, 0, nums.length-1);
      System.out.println("The Inversion count is  "+count);
   }   
}
