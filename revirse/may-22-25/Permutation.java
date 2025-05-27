import java.util.*;
class Permutation{
   public void permutation(List<List<Integer>> ans,int[] arr,int index){
      int n = arr.length;
      if(index == n){
         ans.add(convertArrayToList(arr));
         return;
      }
      for(int i=index;i<n;i++){
         swap(arr,i,index);
         permutation(ans, arr, index+1);
         swap(arr,i,index);
      }
   }
   public List<Integer> convertArrayToList(int []arr){
      List<Integer> list = new ArrayList<>();
      for(int a:arr){
         list.add(a);
      } 
      return list;
   }
   public void swap(int []arr,int i,int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
   public void permutationM2(List<List<Integer>> ans,List<Integer> ds,int []arr,boolean[] freq){
      if(ds.size() == arr.length && !ans.contains(ds)){
         ans.add(new ArrayList<>(ds));
         return;
      }

      for(int i=0;i<arr.length;i++){
         if(!freq[i]){
            ds.add(arr[i]);
            freq[i] = true;

            permutationM2(ans, ds, arr, freq);

            freq[i] = false;
            ds.remove(ds.size()-1);
         }
      }
   }

   public static void main(String []args){
      List<List<Integer>> ans = new ArrayList<>();
      int arr [] = {1,2,2};

      List<Integer> ds = new ArrayList<>();
      boolean[] freq = new boolean[3];
      Permutation obj = new Permutation();
      
      // obj.permutation(ans, arr, 0);
      obj.permutationM2(ans, ds, arr, freq);
      System.out.println(ans);
   }
}