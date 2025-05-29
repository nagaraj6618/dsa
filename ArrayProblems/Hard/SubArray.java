import java.util.*;
public class SubArray{

   public int longestLengthSubarrayWith0(int []nums){
      int n = nums.length;
      Map<Integer,Integer> temp = new HashMap<>();
      int length = 0;
      int maxLength = 0;
      int sum = 0;
      for(int i=0;i<n;i++){
         sum+=nums[i];
         if(sum == 0){
            length = i+1;
         }
         else{
            if(temp.containsKey(sum-0)){
               length = i-temp.get(sum-0);
            }
            else{
               temp.put(sum,i);
            }
         }
         
      }
      maxLength = maxLength>length?maxLength:length;
      System.out.println("The Maximum length is : "+maxLength);
      return maxLength;
   }
   public static void main(String[] args){
      int array[] =  {1, 0, -5};
      SubArray obj = new SubArray();
      obj.longestLengthSubarrayWith0(array);
   }
}