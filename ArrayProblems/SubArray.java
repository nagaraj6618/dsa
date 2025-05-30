import java.util.*;

class SubArray{

   public int positiveAndNegativeLongestSubArray(int nums[],int k){

      //TC -> O(n)
      //SC -> O(n)
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

         //For positive and negative it is the best solution.

         //If only positive ,it is not Optimal solution.
         if(!prefixSumMap.containsKey(sum)){
            prefixSumMap.put(sum,i);
         }

      }


      return maxLen;
   }
   public int positiveLongestSubArray(int nums[],int k){
      int n = nums.length;
      int i=0,j=0,maxLen=0,sum=0;

      while(i<n && j<n){
         sum += nums[j];

         if(sum == k){
            int len = j-i+1;
            maxLen = maxLen>len?maxLen:len;
         }
         while(i<j && sum>k){
            sum -= nums[i];
            i++;
         }
         j++;
      }
      return maxLen;
   }
}