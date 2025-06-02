public class RepeatedAndMissing{
   public void repeatedAndMissingElement(int nums[]){
      int n = nums.length;
      long sn = (n*(n+1))/2;
      long sn2 = (n*(n+1)*(2*n+1))/6;
      long s = 0;
      long s2 = 0; 
      for(int i=0;i<n;i++){
         s +=nums[i];
         s2 += nums[i]*nums[i];
      }

      //Let x be the repeated element and y be the missing element;
      long val1 = s-sn; // x-y
      long val2 = s2-sn2; //x^2 - y^2

      long val3 = val2/val1;
      long x = (val1+val3)/2; //x-y+x+y/2 => 2x/x => x;
      long y = x-val1;

      System.out.println("The repeated Element is x : "+x);
      System.out.println("The missing Element is y : "+y);


   }
   public static void main(String []args){
      int nums[] = {4,3,6,2,1,1};
      RepeatedAndMissing obj = new RepeatedAndMissing();
      obj.repeatedAndMissingElement(nums);
   }
}