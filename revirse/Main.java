import java.util.ArrayList;

class Sort{

   void Selectionsort(int[]arr){
      
      for(int i=0;i<arr.length;i++){
         int sIndex = i;
         int small = arr[i];
         for(int j=i;j<arr.length;j++){
            if(small>arr[j]) {
               sIndex = j;
               small = arr[j];
            }
         }

         swap(arr,i,sIndex);
         
      }
   }

   void swap(int []arr,int i,int j){
      int temp  = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
   void printArray(int []arr){

      for(int i:arr){
         System.out.print(i + " ");
      }
   }


   void BubbleSort(int[]arr){
      for(int i=0;i<arr.length;i++){
         int flag = 0;
         for(int j = 0;j<arr.length-i-1;j++){
            if(arr[j] > arr[j+1]) {
               flag = 1;
               swap(arr,j,j+1);
            }
         }
         if(flag == 0){
            break;
         }
      }
   }

   void insertionSort(int[]arr){
      int n = arr.length;
      for(int i=0;i<n;i++){
         for(int j =i ;j>0;j--){
            if(arr[j]<arr[j-1]){
               swap(arr,j,j-1);
            }
         }
      }
   }

   void mergeSort(int []arr,int low,int high){
      if(low == high) return;

      int mid = (low+high)/2;
      mergeSort(arr,low,mid);
      mergeSort(arr,mid+1,high);
      merge(arr,low,mid,high);
   }
   void merge(int []arr,int low,int mid,int high){
      ArrayList<Integer> temp = new ArrayList<>();

      int l = low;
      int r = mid+1;

      while(l<=mid && r<=high){

         if(arr[l]<arr[r]){
            temp.add(arr[l]);
            l++;
         }
         else{
            temp.add(arr[r]);
            r++;
         }
      }
      while(l<=mid){
         temp.add(arr[l]);
         l++;
      }
      while(r<=high){
         temp.add(arr[r]);
         r++;
      }
      for(int i=low;i<=high;i++){
         arr[i] = temp.get(i-low);
      }
      
   }

   void QuickSort(int []arr,int low,int high){
      if(low<high){
         int pIndex = partition(arr,low,high); //Will return the correct index of pivot and put the pivot in the correct place.
         QuickSort(arr,low,pIndex-1); //Now pivot is in correct position so that no need to go upto pivot.
         QuickSort(arr,pIndex+1,high);
      }
   }
   int partition(int []arr,int low,int high){
      int i = low;
      int j = high;
      int pivot = arr[low];

      while(i<j){
         while(arr[i]<=pivot && i<=high){
            i++;
         }
         while(pivot<arr[j] && j>=low) j--;

         if(i<j) swap(arr,i,j);
      }
      swap(arr,low,j);
      return j;
   }
}

public class Main{
   public static void main(String[] args){

      int arr[] = {2,40,1,2,43,22,-10,0,16,2,4};

      Sort obj = new Sort();
      // obj.Selectionsort(arr);
      // obj.BubbleSort(arr);
      // obj.insertionSort(arr);
      // obj.mergeSort(arr, 0, arr.length-1);
      obj.QuickSort(arr, 0, arr.length-1);
      obj.printArray(arr);
   }
}