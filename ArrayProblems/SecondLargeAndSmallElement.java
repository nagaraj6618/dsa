public class SecondLargeAndSmallElement {

   public int secondLargestElement(int []arr){
      int sMax = Integer.MIN_VALUE;
      int max = Integer.MIN_VALUE;
      for(int i:arr){

         if(i>max) {
            //Change sMax to old max value;
            sMax = max;

            //Change max to current max value
            max = i;
         }
         else if(i>sMax && i<max) sMax = i;
      }
      return (sMax==Integer.MIN_VALUE) ? -1 : sMax;
   }

   public int secondSmallestElement(int []arr){
      int small = Integer.MAX_VALUE;
      int sSmall = Integer.MAX_VALUE;

      for(int i:arr){
         if(i<small){
            sSmall = small;
            small = i;
         }
         else if(i<sSmall && i>small)sSmall = i;
      }
      return sSmall == Integer.MAX_VALUE ? -1 : sSmall;
   }
}