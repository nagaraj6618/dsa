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
   public static void main(String[] args){
      Permutation obj = new Permutation();

      int [] nums = {1,2,3};
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> ds = new ArrayList<>();
      boolean[]freq = new boolean[nums.length];

      obj.recurPermutation(nums, ans, ds, freq);
      System.out.println("All Permutation : "+ans);
   }
}