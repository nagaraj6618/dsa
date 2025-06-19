public class Problem{

   //Find the squart of the given number;
   public int squrtOfNumber(int n){
      
      int low = 1;
      int high = n/2;
      int ans = 1;
      while(low<=high){
         int mid = (low+high)/2;
         if(mid*mid > n) high = mid-1;
         else{
            ans = Math.max(ans,mid);
            low = mid+1;
         } 
      }
      

      System.out.println("The squart of the given number is : "+ans);
      return ans;
   }

   //find the Nth root of M
   //n=3 and m = 27 find 3root of 27 = 3;
   //n=3 and m=8 3root of 8 = 2;
   //Using Linear search.
   public int nthRootOfM(int n,int m){
      
      for(int i=1;i<m;i++){
         int ans = findPowerValue(i,n);
         if(ans == m) return i;
         else if(ans>m) break;
      }
      return -1;
   }
   public int findPowerValue(int base,int power){
      int ans = 1;
      while(power>0){
         if(power % 2 == 1){
            ans = ans * base;
            power--;
         }else{
            power /= 2;
            base = base * base;
         }
      }
      return ans;
   }
}