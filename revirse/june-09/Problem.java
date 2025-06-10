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

   //Permutation
   public void recurPermutation(int nums[],int index,List<List<Integer>> ans){
      int n = nums.length;
      if(index == n){
         List<Integer> temp = new ArrayList<>();
         for(int a : nums){
            temp.add(a);
         }
         ans.add(temp);
      }

      for(int i=index;i<n;i++){
         swap(nums,index,i);
         recurPermutation(nums,index+1,ans);
         swap(nums,index,i);
      }
   }
   public void recurPermutationMethod2(int nums[],List<List<Integer>> ans,List<Integer> ds,boolean[] freq){
      int n = nums.length;
      if(ds.size() == n){
         ans.add(new ArrayList<>(ds));
         return;
      }
      for(int i=0;i<n;i++){
         if(!freq[i]){
            freq[i] = true;
            ds.add(nums[i]);
            recurPermutationMethod2(nums,ans,ds,freq);
            ds.remove(ds.size()-1);
            freq[i] = false;
         }
      }
   }
   public void nextPermutation(int nums[]){
      int n = nums.length;

      int small=0;
      int flag = 0;

      for(int i=n-1;i>0;i--){
         if(nums[i] > nums[i-1]){
            small = i-1;
            flag=1;
            break;
         }
      }
      if(flag==0){
         reverseArray(nums,0,n-1);
         return;
      }
      for(int i=n-1;i>small;i--){
         if(nums[small] <nums[i]){
            swap(nums,small,i);
            break;
         }
      }
      reverseArray(nums,small+1,n-1);
   }
   public void reverseArray(int nums[],int start,int end){
      while(start<end){
         swap(nums,start,end);
         start++;
         end--;
      }
   }

   //Leaders in arrays
   public List<Integer> leaders(int nums[]){
      int n = nums.length;
      int max = nums[n-1];
      List<Integer> temp = new ArrayList<>();
      temp.add(max);
      for(int i=n-2;i>0;i--){
         if(max <nums[i]){
            temp.add(nums[i]);
            max = nums[i];
         }
      }
      reverseList(temp,0,temp.size()-1);
      return temp;
   }

   //Reverse List;
   public void reverseList(List<Integer> list,int start,int end){
      while(start<end){
         int temp = list.get(start);
         list.set(start,list.get(end));
         list.set(end,temp);
         start++;
         end--;
      }
   }
   
   //Longest Consecutive Sequence in an Array
   public int longestConsecutiveSequence(int nums[]){
      int n = nums.length;
      int len = 0;
      int maxLen = 0;
      Set<Integer> set = new HashSet<>();
      for(int i=0;i<n;i++){
         set.add(nums[i]);
      }

      for(int num : set){
         if(!set.contains(num-1)){
            len = 1;
            while(set.contains(num+1)){
               num = num+1;
               len++;
            }
            maxLen = Math.max(maxLen,len);
         }
      }
      return maxLen;
   }
}
