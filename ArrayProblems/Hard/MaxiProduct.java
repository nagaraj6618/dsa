public class MaxiProduct{
   public int maximumProduct(int nums[]){
      int n = nums.length;
      int i = 0;
      int j = n-1;
      int prefix = 1;
      int sufix = 1;
      int max = Integer.MIN_VALUE;
      while(i<n && j>=0){
         if(prefix == 0) prefix = 1;
         if(sufix==0) sufix = 1;
         prefix *= nums[i];
         sufix *= nums[j];
         max = Math.max(max,Math.max(prefix,sufix));
         i++;
         j--;
      }
      System.out.println("The Maximum product of given array : "+max);
      return max;
   }
   public static void main(String args[]){
      int nums[] = {1,2,3,4,5,0};
      MaxiProduct obj = new MaxiProduct();
      obj.maximumProduct(nums);
   }
}