import java.util.*;
public class Revision{
   public void unionTwoArray(int []nums1,int []nums2){
      int n1 = nums1.length;
      int n2 = nums2.length;
      int l = 0,r=0;
      ArrayList <Integer> temp = new ArrayList<>();

      while(l<n1 && r<n2){
         int size = temp.size();
         if(nums1[l] <= nums2[r]){
            if(size==0 || nums1[l]!=temp.get(size-1)){
               temp.add(nums1[l]);
            }
            
            l++;
         }
         else{
            if(size == 0 || nums2[r] != temp.get(size-1)){
               temp.add(nums2[r]);
            }
            r++;
         }
      }
      while(l<n1){
         int size = temp.size();
         if(size==0 || nums1[l]!=temp.get(size-1)){
            temp.add(nums1[l]);
         }
         l++;
      }
      while(r<n2){
         int size = temp.size();
         if(size == 0 || nums2[r] != temp.get(size-1)){
            temp.add(nums2[r]);
         }
         r++;
      }
      for(int a:temp){
         System.out.print(a+" ");
      }
      System.out.println("");
   }

   public void intersectionTwoArray(int []nums1,int []nums2){
      int n1 = nums1.length;
      int n2 = nums2.length;
      int l = 0,r = 0;

      ArrayList <Integer> temp = new ArrayList<>();


      while(l<n1 && r<n2){
         int size = temp.size();

         if(nums1[l] == nums2[r]){
            if(size == 0 || temp.get(size-1)!=nums1[l]){
               temp.add(nums1[l]);
            }
            l++;
            r++;
         }
         else if(nums1[l] > nums2[r]) r++;
         else l++;
      }
      for(int a:temp){
         System.out.print(a+" ");
      }
      System.out.println("");
   }

   public void printArray(int nums[]) {
      for(int a:nums){
         System.out.print(a+" ");
      }
      System.out.println("");
   }
   public static void main(String []args){

      Revision obj = new Revision();
      int arr1[] = {1,2,3,4,4};
      int arr2[] = {1,3,4,5,6};

      obj.unionTwoArray(arr1,arr2);

      obj.intersectionTwoArray(arr1,arr2);
   }

}