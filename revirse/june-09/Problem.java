import java.util.*;

public class Problem {
   //Move Zeors
   public void moveZeros(int nums[]){
      int n = nums.length;
      int i = 0;
      for(int j=0;j<n;j++){
         if(nums[j] != 0){
            swap(nums,i,j);
            i++;
         }
      }
   }

   //union of two sorted arrays;
   public List<Integer> union(int nums1[],int nums2[]){
      List<Integer> temp = new ArrayList<>();
      int n = nums1.length;
      int m = nums2.length;

      int i=0,j=0;
      while(i<n && j<m){
         if(nums1[i]<=nums2[j]){
            if(temp.size()==0 ||temp.get(temp.size()-1) != nums1[i]){
               temp.add(nums1[i]);
            }
            i++;
         }else{
            if(temp.size()==0 || temp.get(temp.size()-1) != nums2[j]){
               temp.add(nums2[j]);
            }
            j++;
         }
      }
      while (i<n) {
         if(temp.size()==0 ||temp.get(temp.size()-1) != nums1[i]){
            temp.add(nums1[i]);
         }     
         i++;
      }
      while(j<n){
         if(temp.size()==0 || temp.get(temp.size()-1) != nums2[j]){
            temp.add(nums2[j]);
         }
         j++;
      }
      return temp;
   }
   //Intersection of two sorted arrays
   public List<Integer> intersection(int nums1[],int nums2[]){
      List<Integer> temp = new ArrayList<>();

      int n = nums1.length;
      int m = nums2.length;

      int i=0,j=0;
      while(i<n&&j<m){
         if(nums1[i] == nums2[j]){
            if(temp.size()==0 || temp.get(temp.size()-1) != nums1[i]){
               temp.add(nums1[i]);
            }
            i++;
            j++;
         }
         else if(nums1[i]<nums2[j]){
            i++;
         }
         else{
            j++;
         }
      }
      return temp;
   }

   //Missing Element in the array
   public int missingElement(int nums[]){
      int tot = 0,sum=0;
      int n = nums.length;
      tot = n*(n+1)/2;
      for(int i=0;i<n;i++){
         sum += nums[i];
      }
      return tot-sum;
   }
   //Swap function
   public void swap(int nums[],int i,int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }

   //Longest subarray sum for positive numbers

   public int LongestSubArraySumKM1(int nums[],int k){
      int n = nums.length;
      int i=0,j=0;
      int len = 0;
      int maxLen = 0;
      int sum = 0;
      while(i<n && j<n){
         sum += nums[j];
         if(sum==k){
            len = j-i+1;
         }
         while(i<j && sum>k){
            sum -= nums[i];
            i++;
         }
         j++;
         maxLen = Math.max(maxLen,len);
      }
      return maxLen;
   }

   //Longest subarray sum with given k for negative and positive;
   public int LongestSubArraySumKM2(int nums[],int k){
      int len = 0;
      int maxLen = 0;
      int sum = 0;
      Map<Integer,Integer> mapSum = new HashMap<>();
      int n = nums.length;
      for(int i=0;i<n;i++){
         sum += nums[i];
         if(sum == k){
            len = i+1;
         }
         if(mapSum.containsKey(sum-k)){
            len = i - mapSum.get(sum-k);
         }
         if(!mapSum.containsKey(sum)){
            mapSum.put(sum,i);
         }
         maxLen = Math.max(len,maxLen);
      }
      
      return maxLen;
   }
}
