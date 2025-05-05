import java.util.*;

class SubArray{

   public int positiveLongestSubArray(int nums[],int k){
      int maxLen = 0;
      int sum = 0;
      Map <Integer,Integer> prefixSumMap = new HashMap<>();
      for(int i=0;i<nums.length;i++){

         sum += nums[i];

         //1. Check sum is equal to K
         if(sum == k){
            maxLen = i+1;
         }

         //2. Check the remainder is in map.
         int rem = sum - k;
         if(prefixSumMap.containsKey(rem)){
            maxLen = Math.max(maxLen,i-prefixSumMap.get(rem));
         }

         //3. Add to the map.

         //If use condition it use for both positive and negative.If not u can only use for positive
         if(!prefixSumMap.containsKey(sum)){
            prefixSumMap.put(sum,i);
         }

      }


      return maxLen;
   }
}