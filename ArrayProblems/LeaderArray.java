import java.util.*;

public class LeaderArray {
   public List<Integer> printLeader(int nums[]){
      int n = nums.length;
      List<Integer> ans = new ArrayList<>();
      int max = nums[n-1];
      ans.add(max);
      for(int i=n-2;i>=0;i--){
         if(nums[i] > max){
            max = nums[i];
            ans.add(max);
         }
      }
      return ans;
   }

   public static void main(String[] args){

      LeaderArray obj = new LeaderArray();
      int []nums = {4,7,1,0};
      List <Integer> ans = obj.printLeader(nums);
      Collections.sort(ans,Collections.reverseOrder());

      for(int i :ans){
         System.out.print(i+" ");
      }
      System.out.println();
   }
}
