import java.util.*;
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


   //Aggresive Cows;

   public int aggresiveCowsMinOfMaxDistance(int nums[],int cows){
      int n = nums.length;
      //Get The sorted array;
      int maxValue = 0;
      int maxLimit = nums[n-1] - nums[0];
      // for(int i=1;i<=maxLimit;i++){

      //    if(cowCanBePlace(nums,i,cows) == false){
      //       maxValue = i-1;
      //       break;
      //    }
      // }

      int low = 1;
      int high = maxLimit;
      while(low<=high){
         int mid = (low+high)/2;
         if(cowCanBePlace(nums,mid,cows) == true){
            maxValue = mid;
            low = mid+1;
         }else{
            high = mid-1;
         }
      }

      return maxValue;

   }
   public boolean cowCanBePlace(int []nums,int minDistance,int cows){
      int cntCows = 1;
      int n = nums.length;
      int lastCord = nums[0];
      

      for(int i=1;i<n;i++){
         int distance = nums[i] - lastCord;
         if(distance>= minDistance){
            cntCows++;
            lastCord = nums[i];
         }

         
      }
      if(cntCows >= cows) {
            return true;
         }
      return false;
   }
}