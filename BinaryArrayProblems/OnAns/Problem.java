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
}