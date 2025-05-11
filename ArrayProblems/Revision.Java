import java.util.*;
public class Revision{
   public void unionTwoArray(int []nums1,int []nums2){
      int n1 = nums1.length;
      int n2 = nums2.length;
      int l = 0,r=0;
      ArrayList <Integer> temp = new ArrayList<>();

      while(l<n1 && r<n2){
         int size = temp.size();
         if(nums1[l] <= nums2[r]){
            if(size==0 || nums1[l]!=temp.get(size-1)){
               temp.add(nums1[l]);
            }
            
            l++;
         }
         else{
            if(size == 0 || nums2[r] != temp.get(size-1)){
               temp.add(nums2[r]);
            }
            r++;
         }
      }
      while(l<n1){
         int size = temp.size();
         if(size==0 || nums1[l]!=temp.get(size-1)){
            temp.add(nums1[l]);
         }
         l++;
      }
      while(r<n2){
         int size = temp.size();
         if(size == 0 || nums2[r] != temp.get(size-1)){
            temp.add(nums2[r]);
         }
         r++;
      }
      for(int a:temp){
         System.out.print(a+" ");
      }
      System.out.println("");
   }

   public void intersectionTwoArray(int []nums1,int []nums2){
      int n1 = nums1.length;
      int n2 = nums2.length;
      int l = 0,r = 0;

      ArrayList <Integer> temp = new ArrayList<>();


      while(l<n1 && r<n2){
         int size = temp.size();

         if(nums1[l] == nums2[r]){
            if(size == 0 || temp.get(size-1)!=nums1[l]){
               temp.add(nums1[l]);
            }
            l++;
            r++;
         }
         else if(nums1[l] > nums2[r]) r++;
         else l++;
      }
      for(int a:temp){
         System.out.print(a+" ");
      }
      System.out.println("");
   }

   public void printArray(int nums[]) {
      for(int a:nums){
         System.out.print(a+" ");
      }
      System.out.println("");
   }

   public int findingMissingNumberArray(int nums[]){

      int n = nums.length;
      int sum = 0;
      int totSum = (n*(n+1))/2;

      System.out.println(totSum);
      for(int i=0;i<n;i++){
         sum+=nums[i];
      }
      return totSum - sum;
   }


   public int positiveLongestSubArraySum(int nums[],int k){
      //It is only for positive number from 0 to +infinity
      int maxLen = 0,l=0,r=0,n=nums.length;
      int sum = 0;

      while(l<n && r<n){
         sum += nums[r];
         while(l<=r && sum>k){
            sum -= nums[l];
            l++;
         }
         if(sum == k){
            int len = r-l+1;
            maxLen = Math.max(maxLen,len);
         }
         r++;
      }
      return maxLen;
   }

   public int longestSubArraySum(int nums[],int k){
      //It will work for both positive and negative numbers;

      Map<Integer,Integer> temp = new HashMap<>();
      int n = nums.length;
      int sum = 0;
      int maxLen = 0;
      for(int i=0;i<n;i++){
         sum += nums[i];
         if(temp.containsKey(sum-k)){
            int len = i-temp.get(sum-k);
            maxLen = Math.max(maxLen , len);
         }
         else{
            temp.put(sum,i);
         }
      }
      return maxLen;
   }
   public static void main(String []args){

      Revision obj = new Revision();
      // int arr1[] = {1,2,3,4,4};
      // int arr2[] = {1,3,4,5,6};

      // obj.unionTwoArray(arr1,arr2);

      // obj.intersectionTwoArray(arr1,arr2);

      // int nums1 []= {0,1,4,2,3};
      // System.out.println("The missing number is : "+obj.findingMissingNumberArray(nums1)); 

      int nums2[] = {2,1,1,1,5,9,9,1,2,6,0,0,1};
      int nums3[] = {1,9,-9,9,-2,2,1,3,-2,8};
      int k = 10;
      System.out.println("The Max length of subarray : "+obj.positiveLongestSubArraySum(nums2,k));
      System.out.println("The Max length of subarray : "+obj.longestSubArraySum(nums3,k));
   }

}