import java.util.*;

public class MergeSort{
   

   void merge(int[]arr,int low,int mid,int high){
      //Merge the array.

      // int []temp = new int[high-low];

      ArrayList<Integer>temp = new ArrayList<>();

      int left = low;
      int right = mid+1;
      
      while(left<=mid && right<=high){

         if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
         }
         else{
            temp.add(arr[right]);
            right++;
         }
        
      }
      while(left<=mid){
         temp.add(arr[left]);
         left++;
        
      }
      while(right<=high){
         temp.add(arr[right]);
         right++;
      }

      for(int i=low;i<=high;i++){
         arr[i] = temp.get(i-low);
      }

   }
   void mergeSort(int []arr,int low,int high){

      //Divide the array.

      //Using Recursion

      //Base Condition.
      if(low == high){
         return;
      }
      //or
      // if(arr.length == 1){
      //    return;
      // }

      int mid = (low+high)/2;

      mergeSort(arr,low,mid);
      mergeSort(arr,mid+1,high);

      merge(arr,low,mid,high);
   }

   void printArray(int[]arr){
      for(int i:arr){
         System.out.print(i+" ");
      }
   }
}