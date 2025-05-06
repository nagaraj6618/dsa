import java.util.*;
public class TwoSum {
   public int [] twoSumOptimalMethod(int nums[] , int target){
      //Using two pointer
      //Sort the given array.
      Arrays.sort(nums);
      int i=0,j=nums.length-1;

      while(i<j){
         int sum = nums[i]+nums[j];
         if(sum == target) {
            System.out.println("The two sum values are : "+nums[i]+" "+nums[j]);
            return new int[] {nums[i],nums[j]};
         }
         else if (sum>target){
            j--;
         }
         else{
            i++;
         }
      }
      
      return new int[] {0,0};


   }
   public int [] twoSumUsingHashMap(int nums[],int target){
      Map<Integer,Integer> twoSumMap = new HashMap<>();
      int n = nums.length;
      for(int i=0;i<n;i++){
         Integer index = twoSumMap.get(nums[i]);
         if(index != null){
            System.out.println("The two sum are : "+nums[index]+" "+nums[i]);
            return new int[]{index,i};
         }
         twoSumMap.put(target-nums[i],i);
      }
      
      return new int[]{0,0};
   }
}
