public class CheckArraySortedOrNot {
   public boolean isArraySorted(int []arr,int n){
      //According to bubble sort.The right side Adjacent element should be greater;
      //If is not follows then the arry is not sorted.
      for(int i=0;i<n-1;i++){
         if(arr[i]>arr[i+1]) return false;
      }
      return true;
   }
}
