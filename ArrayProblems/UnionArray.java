//Union two sorted array;

import java.util.ArrayList;

class UnionArray{
   public int[] unionTwoArray(int[] nums1, int[] nums2) {
      ArrayList <Integer> temp = new ArrayList<>();
      int n1 = nums1.length;
      int n2 = nums2.length;
      int i = 0;
      int j = 0;
      
      while(i<n1 && j<n2){
         int size = temp.size();
         if(nums1[i]<=nums2[j]){
            if(size == 0 || temp.get(size-1) != nums1[i]){
               temp.add(nums1[i]);
            }
            i++;
         }
         else{
            if(size == 0 || temp.get(size-1) != nums2[j]){
               temp.add(nums2[j]);
            }
            j++;
         }
      }
      while(i<n1){
         int size = temp.size();
         if(size==0 || temp.get(size-1) != nums1[i]){
            temp.add(nums1[i]);
         }
         i++;
      }
      while(j<n2){
         int size = temp.size();
         if(size == 0 || temp.get(size-1)!= nums2[j]){
            temp.add(nums2[j]);
         }
         j++;
      }
      int tempArr[] = new int[temp.size()];
      i=0;
      for(int a:temp){
         tempArr[i] = a;
         i++;
         // System.out.println(a);
      }

      printArray(tempArr);
      return tempArr;
  }
  void printArray(int []arr){
   for(int i:arr){
      System.out.print(i+" ");
   }
   System.out.println("");
  }

  public int[] intersectionTwoArray(int []nums1,int [] nums2){
   int n1 = nums1.length;
   int n2 = nums2.length;

   ArrayList <Integer> temp = new ArrayList<>();

   int i=0,j=0;

   while(i<n1 && j<n2){
      int size = temp.size();
      if(nums1[i] == nums2[j]){
         if(size == 0 || temp.get(size-1) != nums1[i]){
            temp.add(nums1[i]);
         }
         i++;
         j++;
         
      }
      else if(nums1[i] < nums2[j]){

         i++;
         
      }
      else{
         j++;
      }
      
   }
   int [] tempArr = new int[temp.size()]; 
   i=0;
   for(int a : temp){
      tempArr[i++] = a;
      // i++;
   }
   printArray(tempArr);
   return tempArr;
  }
}