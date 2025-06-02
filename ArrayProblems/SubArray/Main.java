import java.util.*;
public class Main{
   public void longestSumKSubArray(int nums[],int k){
      int n = nums.length;
      int j = 0;
      int sum = 0;
      int length = 0;
      int maxLen = 0;
      for(int i=0;i<n;i++){
         sum+=nums[i];
         if(sum == k) {
            length = i-j+1;
            maxLen = maxLen>length?maxLen:length;
         }
         while(sum>k && j<i){
            sum-=nums[j];
            j++;
         }
      }
      System.out.println("The Longest sum is : "+maxLen);
   }
   public void longestSumKSubArrayUsingHash(int nums[],int k){
      int n = nums.length;
      Map<Integer,Integer> map = new HashMap<>();
      int sum = 0;
      int len = 0;
      int max = 0;
      for(int i=0;i<n;i++){
         sum += nums[i];
         if(sum == 0){
            len = i+1;
         }
         if(map.containsKey(sum-0)){
            len = i-map.get(sum-0);
         }
         if(!map.containsKey(sum)){
            map.put(sum,i);
         }
         max = len>max ?len:max;
      }
      System.out.println("The maximum subarray sum 0 is : "+max);
   }
   public void longestSubarraywithXor(int nums[],int k){
      int n = nums.length;
      int xor = 0;
      int count = 0;
      Map<Integer,Integer> map = new HashMap<>();
      map.put(0,1);
      for(int i=0;i<n;i++){
         xor^=nums[i];

         if(map.containsKey(xor^k)){
            count += map.get(xor^k);
         }
         if(map.containsKey(xor)){
            map.put(xor,map.get(xor)+1);
         }
         else{
            map.put(xor,1);
         }
      }
      System.out.println("The maximum count of subarray with xor k : "+count);
   }
   public static void main(String[]args){
      Main obj = new Main();
      int nums1[] = {2,3,5,1,7,1,1,9};
      obj.longestSumKSubArray(nums1, 10);
      int nums2[] = {6, -2, 2, -8, 1, 7, 4, -10};
      obj.longestSumKSubArrayUsingHash(nums2, 0);

      int nums3[] = {5, 6, 7, 8, 9};
      obj.longestSubarraywithXor(nums3, 5);
   }
}