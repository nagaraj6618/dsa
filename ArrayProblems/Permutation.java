import java.util.*;

public class Permutation{
   public void recurPermutation(int []nums,List<List<Integer>> ans,List<Integer>ds,boolean[] freq){
      int n = nums.length;
      if(ds.size() == n){
         ans.add(new ArrayList<>(ds));
         return;
      }
      
      for(int i=0;i<n;i++){
         if(!freq[i]){
            freq[i] = true;
            ds.add(nums[i]);
            recurPermutation(nums, ans, ds, freq);
            freq[i] = false;
            ds.remove(ds.size() - 1);
         }
         
      }
   }
   public void recurPermutationMethod2(int index,int []nums,List<List<Integer>> ans){
      int n = nums.length;
      
      if(index == n) {
         List<Integer> ds = new ArrayList<>();
         for(int a:nums){
            ds.add(a);
         }
         ans.add(new ArrayList<>(ds));
         // printArray(nums);
      }

      for(int i=index;i<n;i++){
         swap(nums,i,index);
         recurPermutationMethod2(index+1, nums, ans);
         swap(nums,i,index);
      }
   }
   public void swap(int[] nums,int i,int j){
      int temp=nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }
   public void printArray(int nums[]){
      for(int i:nums){
         System.out.print(i+" ");
      }
      System.out.println();
   }


   //Next Permutation
   public int [] nextPermutation(int nums[]){
      int n = nums.length;
      int index = -1;

      //Find the longest prefix nums[i]<nums[i+1]

      for(int i=n-2;i>=0;i--){
         if(nums[i]<nums[i+1]){
            System.out.println("Index : "+i);
            index = i;
            break;
         }
      }
      if(index == -1){
         reverseArray(nums,0,nums.length-1);
         printArray(nums);
         return nums;
      }
      for(int i=n-1;i>index;i--){
         if(nums[index]<nums[i]){
            swap(nums, index, i);
            break;
         }
      }
      reverseArray(nums, index+1, nums.length-1);
      printArray(nums);
      return nums;

   }
   public void reverseArray(int []nums,int i,int j){
      // int n = nums.length;
      
      while(i<j){
         swap(nums, i, j);
         i++;
         j--;
      }
   }
   public static void main(String[] args){
      Permutation obj = new Permutation();

      int [] nums = {2,1,5,4,3,0,0};
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> ds = new ArrayList<>();
      boolean[]freq = new boolean[nums.length];

      // obj.recurPermutation(nums, ans, ds, freq);
      // obj.recurPermutationMethod2(0, nums, ans);
      // System.out.println("All Permutation : "+ans);

      obj.nextPermutation(nums);
   }
}