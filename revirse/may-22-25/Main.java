import java.util.*;
public class Main{
   public void union(int []nums1,int[]nums2){
      int n1 = nums1.length;
      int n2 = nums2.length;

      List<Integer> ans = new ArrayList<>();

      int l = 0,r=0;
      while(l<n1 && r<n2){
         if(nums1[l] == nums2[r]){
            if(ans.isEmpty() || ans.get(ans.size()-1) != nums1[l]){
               ans.add(nums1[l]);
              
            }
            l++;
            r++;
         }
         else if(nums1[l]<nums2[r]){
            if(ans.isEmpty()||ans.get(ans.size()-1) != nums1[l]){
               ans.add(nums1[l]);
            }
            l++;
         }
         else{
            if(ans.isEmpty()||ans.get(ans.size()-1) != nums2[r]){
               ans.add(nums2[r]);
            }
            r++;
         }
      }
      while(l<n1){
         if(ans.isEmpty()||ans.get(ans.size()-1) != nums1[l]){
               ans.add(nums1[l]);
         }
         l++;
      }
      while(r<n2){
         if(ans.isEmpty()|| ans.get(ans.size()-1) != nums2[r]){
               ans.add(nums2[r]);
            }
         r++;
      }
      System.out.println("The union of array : ");
      for(int a:ans){
         System.out.print(a+" ");
      }
      System.out.println("");
   }

   public void printArray(int arr[]){
      for(int a: arr){
         System.out.print(a+" ");
      }
      System.out.println();
   }

   public void maxSumSubarrayM1(int []arr,int k){
      //Only for positive element in the array.
      int n = arr.length;
      int sum = 0;
      int i=0,j=0;
      int maxC = 0,count = 0;
      while(i<n && j<n){
         sum+=arr[j];

         if(sum == k){
            count = j-i+1;
         }
         while(sum>k && i<n){
            sum -= arr[i];
            i++;
         }
         j++;
         maxC = maxC < count ? count : maxC;
      }

      System.out.println("The maximum subarray with the sum k : "+maxC);
   }
   public static void main(String args[]){
      Main obj = new Main();

      //Union
      // int []nums1 = {1,1,2,3,4,5};
      // int []nums2 = {2,2,3,6,7};
      // obj.union(nums1, nums2);

      //max Sum subarray;
      int []nums3 = {2,3,5,1,9,10};
      obj.maxSumSubarrayM1(nums3, 10);
   }
}