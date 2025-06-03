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
   public void repeatedAndMissingElementXor(int nums[]){
      int n = nums.length;
      int xr = 0;

      for(int i=0;i<n;i++){
         xr ^= nums[i];
         xr ^= (i+1);
      }

      int bitNo = 0;
      while(true){
         if((xr & (1 << bitNo)) != 0){
            break;
         }
         bitNo++;
      }
      int one = 0;
      int zero = 0;
      for(int i=0;i<n;i++){
         if((nums[i] &(1<<bitNo))!=0){
            one ^= nums[i];
         }
         else{
            zero ^= nums[i];
         }
      }
      for(int i=1;i<=n;i++){
         if(((i) &(1<<bitNo))!=0){
            one ^= i;
         }
         else{
            zero ^= i;
         }
      }
      int cnt = 0;
      for(int i=0;i<n;i++){
         if(one == nums[i]) cnt++;
      }
      int rep = zero;
      int miss = one;
      if(cnt==2){
         rep = one;
         miss =zero;
         
      }
      System.out.println("The repeated Element is  :"+rep);
      System.out.println("The Missing Element is : "+miss);
      return;
   }
   public static void main(String []args){
      int nums[] = {4,3,6,2,1,1};
      RepeatedAndMissing obj = new RepeatedAndMissing();
      obj.repeatedAndMissingElement(nums);
      obj.repeatedAndMissingElementXor(nums);
   }
}