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
   public static void main(String[] args){
      Permutation obj = new Permutation();

      int [] nums = {1,2,3};
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> ds = new ArrayList<>();
      boolean[]freq = new boolean[nums.length];

      // obj.recurPermutation(nums, ans, ds, freq);
      obj.recurPermutationMethod2(0, nums, ans);
      System.out.println("All Permutation : "+ans);
   }
}