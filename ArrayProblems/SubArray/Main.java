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
   public static void main(String[]args){
      Main obj = new Main();
      int nums1[] = {2,3,5,1,7,1,1,9};
      obj.longestSumKSubArray(nums1, 10);
   }
}