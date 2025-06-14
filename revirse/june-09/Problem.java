import java.util.*;

public class Problem {
   // Move Zeors
   public void moveZeros(int nums[]) {
      int n = nums.length;
      int i = 0;
      for (int j = 0; j < n; j++) {
         if (nums[j] != 0) {
            swap(nums, i, j);
            i++;
         }
      }
   }

   // union of two sorted arrays;
   public List<Integer> union(int nums1[], int nums2[]) {
      List<Integer> temp = new ArrayList<>();
      int n = nums1.length;
      int m = nums2.length;

      int i = 0, j = 0;
      while (i < n && j < m) {
         if (nums1[i] <= nums2[j]) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != nums1[i]) {
               temp.add(nums1[i]);
            }
            i++;
         } else {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != nums2[j]) {
               temp.add(nums2[j]);
            }
            j++;
         }
      }
      while (i < n) {
         if (temp.size() == 0 || temp.get(temp.size() - 1) != nums1[i]) {
            temp.add(nums1[i]);
         }
         i++;
      }
      while (j < n) {
         if (temp.size() == 0 || temp.get(temp.size() - 1) != nums2[j]) {
            temp.add(nums2[j]);
         }
         j++;
      }
      return temp;
   }

   // Intersection of two sorted arrays
   public List<Integer> intersection(int nums1[], int nums2[]) {
      List<Integer> temp = new ArrayList<>();

      int n = nums1.length;
      int m = nums2.length;

      int i = 0, j = 0;
      while (i < n && j < m) {
         if (nums1[i] == nums2[j]) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != nums1[i]) {
               temp.add(nums1[i]);
            }
            i++;
            j++;
         } else if (nums1[i] < nums2[j]) {
            i++;
         } else {
            j++;
         }
      }
      return temp;
   }

   // Missing Element in the array
   public int missingElement(int nums[]) {
      int tot = 0, sum = 0;
      int n = nums.length;
      tot = n * (n + 1) / 2;
      for (int i = 0; i < n; i++) {
         sum += nums[i];
      }
      return tot - sum;
   }

   // Swap function
   public void swap(int nums[], int i, int j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }

   // Longest subarray sum for positive numbers

   public int LongestSubArraySumKM1(int nums[], int k) {
      int n = nums.length;
      int i = 0, j = 0;
      int len = 0;
      int maxLen = 0;
      int sum = 0;
      while (i < n && j < n) {
         sum += nums[j];
         if (sum == k) {
            len = j - i + 1;
         }
         while (i < j && sum > k) {
            sum -= nums[i];
            i++;
         }
         j++;
         maxLen = Math.max(maxLen, len);
      }
      return maxLen;
   }

   // Longest subarray sum with given k for negative and positive;
   public int LongestSubArraySumKM2(int nums[], int k) {
      int len = 0;
      int maxLen = 0;
      int sum = 0;
      Map<Integer, Integer> mapSum = new HashMap<>();
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         sum += nums[i];
         if (sum == k) {
            len = i + 1;
         }
         if (mapSum.containsKey(sum - k)) {
            len = i - mapSum.get(sum - k);
         }
         if (!mapSum.containsKey(sum)) {
            mapSum.put(sum, i);
         }
         maxLen = Math.max(len, maxLen);
      }

      return maxLen;
   }

   // Permutation
   public void recurPermutation(int nums[], int index, List<List<Integer>> ans) {
      int n = nums.length;
      if (index == n) {
         List<Integer> temp = new ArrayList<>();
         for (int a : nums) {
            temp.add(a);
         }
         ans.add(temp);
      }

      for (int i = index; i < n; i++) {
         swap(nums, index, i);
         recurPermutation(nums, index + 1, ans);
         swap(nums, index, i);
      }
   }

   public void recurPermutationMethod2(int nums[], List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {
      int n = nums.length;
      if (ds.size() == n) {
         ans.add(new ArrayList<>(ds));
         return;
      }
      for (int i = 0; i < n; i++) {
         if (!freq[i]) {
            freq[i] = true;
            ds.add(nums[i]);
            recurPermutationMethod2(nums, ans, ds, freq);
            ds.remove(ds.size() - 1);
            freq[i] = false;
         }
      }
   }

   public void nextPermutation(int nums[]) {
      int n = nums.length;

      int small = 0;
      int flag = 0;

      for (int i = n - 1; i > 0; i--) {
         if (nums[i] > nums[i - 1]) {
            small = i - 1;
            flag = 1;
            break;
         }
      }
      if (flag == 0) {
         reverseArray(nums, 0, n - 1);
         return;
      }
      for (int i = n - 1; i > small; i--) {
         if (nums[small] < nums[i]) {
            swap(nums, small, i);
            break;
         }
      }
      reverseArray(nums, small + 1, n - 1);
   }

   public void reverseArray(int nums[], int start, int end) {
      while (start < end) {
         swap(nums, start, end);
         start++;
         end--;
      }
   }

   // Leaders in arrays
   public List<Integer> leaders(int nums[]) {
      int n = nums.length;
      int max = nums[n - 1];
      List<Integer> temp = new ArrayList<>();
      temp.add(max);
      for (int i = n - 2; i > 0; i--) {
         if (max < nums[i]) {
            temp.add(nums[i]);
            max = nums[i];
         }
      }
      reverseList(temp, 0, temp.size() - 1);
      return temp;
   }

   // Reverse List;
   public void reverseList(List<Integer> list, int start, int end) {
      while (start < end) {
         int temp = list.get(start);
         list.set(start, list.get(end));
         list.set(end, temp);
         start++;
         end--;
      }
   }

   // Longest Consecutive Sequence in an Array
   public int longestConsecutiveSequence(int nums[]) {
      int n = nums.length;
      int len = 0;
      int maxLen = 0;
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
         set.add(nums[i]);
      }

      for (int num : set) {
         if (!set.contains(num - 1)) {
            len = 1;
            while (set.contains(num + 1)) {
               num = num + 1;
               len++;
            }
            maxLen = Math.max(maxLen, len);
         }
      }
      return maxLen;
   }

   // Set matrix zero;
   public void setMatrixZeroM1(int nums[][]) {
      int n = nums.length;
      int m = nums[0].length;
      int row[] = new int[n];
      int col[] = new int[m];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (nums[i][j] == 0) {
               row[i] = 1;
               col[j] = 1;
            }
         }
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (row[i] == 1 || col[j] == 1) {
               nums[i][j] = 0;
            }
         }
      }

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            System.out.print(nums[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("****************");
   }

   // SetMatrix zero method 2
   public void setMatrixZeroM2(int nums[][]) {
      int n = nums.length;
      int m = nums[0].length;

      int col0 = 1;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (nums[i][j] == 0) {
               nums[i][0] = 0;
               if (j == 0) {
                  col0 = 0;
               } else {
                  nums[0][j] = 0;
               }
            }

         }

      }

      for (int i = 1; i < n; i++) {
         for (int j = 1; j < m; j++) {
            if (nums[i][j] != 0) {
               if (nums[i][0] == 0 || nums[0][j] == 0) {
                  nums[i][j] = 0;
               }
            }

         }
      }
      if (nums[0][0] == 0) {
         for (int j = 0; j < m; j++) {
            nums[0][j] = 0;
         }
      }
      if (col0 == 0) {
         for (int i = 0; i < n; i++) {
            nums[i][0] = 0;
         }
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            System.out.print(nums[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("****************");
   }

   // Rotate by 90 deg matrix
   public void rotateMatrix(int[][] nums) {
      int n = nums.length;
      int m = nums[0].length;

      for (int i = 0; i < n; i++) {
         for (int j = i; j < n; j++) {
            swapMatrix(nums, i, j);
         }
      }
      for (int i = 0; i < n; i++) {
         reverseMatrix(nums, i, 0, m - 1);
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            System.out.print(nums[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("****************");

   }

   public void reverseMatrix(int nums[][], int i, int start, int end) {
      while (start < end) {
         swap(nums, i, start, end);
         start++;
         end--;
      }
   }

   public void swap(int nums[][], int i, int start, int end) {
      int temp = nums[i][start];
      nums[i][start] = nums[i][end];
      nums[i][end] = temp;
   }

   public void swapMatrix(int nums[][], int i, int j) {
      int temp = nums[i][j];
      nums[i][j] = nums[j][i];
      nums[j][i] = temp;
   }

   //Count total subarray Sum
   public int countSubarraySum(int[] nums, int k) {
      Map<Integer, Integer> mapSum = new HashMap<>();
      mapSum.put(0, 1);
      int n = nums.length;
      int sum = 0;
      int cnt = 0;
      for (int i = 0; i < n; i++) {
         sum += nums[i];
         if (mapSum.containsKey(sum - k)) {
            cnt += mapSum.get(sum - k);
         }
         if (mapSum.containsKey(sum)) {
            mapSum.put(sum, mapSum.get(sum) + 1);
         } else {
            mapSum.put(sum, 1);
         }
      }
      return cnt;
   }

   //Pascal Triangle
   
   //Variation 1 row = 5 col = 3 to print the value of given place;
   public int pascalVariation1(int row,int col){
      int value = 1;
      row = row-1;
      col = col-1;
      for(int i=0;i<col;i++){
         value *= (row-i);
         value /= (i+1);
      }
      System.out.println("The value of give place is : "+value);
      return value;
   }
   
   //Variation 2 to print all the elements in the row;
   public List<Integer> pascalVariation2(int rowIndex) {
      long value = 1;
      List<Integer> list = new ArrayList<>();
      list.add(1);

      for (int i = 0; i < rowIndex; i++) {
         value *= (long) (rowIndex - i);
         value /= (long) (i + 1);
         list.add((int) value);
      }
      return list;
   }

   // Variation to generate all values;
   public List<List<Integer>> pascalVariation3(int numRows) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < numRows; i++) {
         int value = 1;
         list.add(value);

         for (int j = 0; j < i; j++) {
            value *= (i - j);
            value /= (j + 1);
            list.add(value);
         }
         ans.add(new ArrayList<>(list));
         list.clear();
      }
      return ans;
   }
   //3-Sum
   public Set<List<Integer>> threeSum(int nums[]){
      int n = nums.length;
      Set<List<Integer>> ans = new HashSet<>();
      for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
               int sum = 0;
               sum = nums[i]+nums[j]+nums[k];
               if(sum == 0){
                  List<Integer> list = new ArrayList<>();
                  list.add(nums[i]);
                  list.add(nums[j]);
                  list.add(nums[k]);
                  list.sort(null);
                  ans.add(list);
               }
            }
         }
      }
      return ans;
   }
   public Set<List<Integer>> threeSumM2(int nums[]){
      int n = nums.length;
     Set<List<Integer>> ans = new HashSet<>();

     for(int i=0;i<n;i++){
      Set<Integer> hashSet = new HashSet<>();
      for(int j=i+1;j<n;j++){
         List<Integer> list = new ArrayList<>();
         int third = -(nums[i]+nums[j]);
         if(hashSet.contains(third)){
            list.add(nums[i]);
            list.add(third);
            list.add(nums[j]);
            list.sort(null);
            ans.add(list);
         }
         hashSet.add(nums[j]);
      }
     }
     return ans;
   }
   public Set<List<Integer>> threeSumM3(int nums[]){
      Arrays.sort(nums);
      Set<List<Integer>> ans = new HashSet<>();
      int n = nums.length;

      for(int i = 0;i<n;i++){
         if(i>0 && nums[i] == nums[i-1]){
            continue;
         }
         int j = i+1;
         int k = n-1;

         while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum<0){
               j++;
            }
            else if(sum>0){
               k--;
            }
            else{
               List<Integer> list = new ArrayList<>();
               list.add(nums[i]);
               list.add(nums[j]);
               list.add(nums[k]);
               ans.add(list);
               k--;
               j++;

               while(j<k && nums[k]==nums[k+1])k--;
               while(j<k && nums[j] == nums[j-1])j++;
            }
         }
      }
      return ans;
   }

   //4-Sum
   public Set<List<Integer>> fourSumM1(int nums[],int target){
      int n = nums.length;
      Set<List<Integer>> ans = new HashSet<>();
      for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
               for(int l=k+1;l<n;l++){
                  int sum = nums[i]+nums[j]+nums[k]+nums[l];
                  if(sum == target){
                     List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                     list.sort(null);
                     ans.add(list);
                  }
               }
            }
         }
      }
      return ans;
   }

   public Set<List<Integer>> fourSumM2(int nums[],int target){
      Set<List<Integer>> ans = new HashSet<>();

      int n = nums.length;
      for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
            Set<Integer> track = new HashSet<>();
            for(int k=j+1;k<n;k++){
               int fourth = target-(nums[i]+nums[j]+nums[k]);
               if(track.contains(fourth)){
                  List<Integer> list = Arrays.asList(nums[i],nums[j],fourth,nums[k]);
                  list.sort(null);
                  ans.add(list);
               }
               track.add(nums[k]);
            }
         }
      }
      
      return ans;

   }
   public List<List<Integer>> fourSumM3(int nums[],int target){
      List<List<Integer>> ans = new ArrayList<>();
      int n = nums.length;
      Arrays.sort(nums);
      for(int i=0;i<n;i++){
         if(i>0 && nums[i] == nums[i-1]) continue;
         for(int j=i+1;j<n;j++){

            if(j>i+1 && nums[j] == nums[j-1]) continue;
            int k = j+1;
            int l = n-1;

            while(k<l){
               int sum = nums[i]+nums[j]+nums[k]+nums[l];
               if(sum>target) l--;
               else if(sum<target)k++;
               else{
                  List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                  k++;
                  l--;
                  ans.add(list);
                  while(k<l && nums[k] == nums[k-1])k++;
                  while(k<l && nums[l] == nums[l+1])l--;
               }
            }
         }
      }
      return ans;
   }
   //Longest Subarray sum k=0
   public int longestSubarraySum0(int nums[]){
      int n = nums.length;
      int sum = 0;
      int len = 0;
      int maxLen = 0;
      Map<Integer,Integer> mapSum = new HashMap<>();
      for(int i=0;i<n;i++){
         sum += nums[i];

         if(sum == 0){
            len = i+1;
         }
         if(mapSum.containsKey(sum - 0)){
            len = i - mapSum.get(sum-0);
         }
         if(!mapSum.containsKey(sum)){
            mapSum.put(sum,i);
         }
         maxLen = Math.max(maxLen,len);
      }
      return maxLen;
   }
   
   //Merge Overlapping subintervals
   public List<List<Integer>> mergeOverLapInterval(int nums[][]){
      int n = nums.length;
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(nums,(a,b) -> a[0]-b[0]);
      int i=0,j=1;
      while(i<n){
         int max = nums[i][1];
         List<Integer> list = new ArrayList<>();
         while(j<n && max>nums[j][0]){
            max = Math.max(max,nums[j][1]);
            j++;
         }
         list.add(nums[i][0]);
         list.add(max);
         ans.add(list);
         i=j;
         j++;
      }
      return ans;
   }

   //Merge Two Sorted array
   public List<Integer>mergeTwoSortedArray(int nums1[],int nums2[]){
      int n = nums1.length;
      int m = nums2.length;

      List<Integer> list = new ArrayList<>();

      int l = n-1;
      int r = 0;
      while(l>=0 && r<m){
         if(nums1[l]<=nums2[r]){
            break;
         }
         else{
            swapTwoArrays(nums1,nums2,l,r);
            r++;
            l--;
         }
      }
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      for(int i=0;i<n;i++){
         list.add(nums1[i]);
      }
      for(int i=n;i<n+m;i++){
         list.add(nums2[i-n]);
      }
      return list;
   }

   //Swap two arrays
   public void swapTwoArrays(int nums1[],int nums2[],int l,int r){
      int temp = nums1[l];
      nums1[l] = nums2[r];
      nums2[r] = temp;
   }

   //Shell Sorting;
   public void shellSorting(int nums[]){
      int n = nums.length;

      for(int gap = n/2;gap>=1;gap=gap/2){

         for(int j = gap;j<n;j++){
            for(int i=j-gap;i>=0;i=i-gap){
               if(nums[i+gap] > nums[i]){
                  break;
               }else{
                  swap(nums,i+gap,i);
               }
            }
         }
      }
   }

   //Merge two sorted arrays;
   //Using gap method(Shell sorting);

   public List<Integer> mergeTwoSortedArrayUsingShellSort(int nums1[],int nums2[]){
      int n = nums1.length;
      int m = nums2.length;
      int len = n+m;
      int gap = len/2 +(len%2);
      while(gap>0){

         int left = 0;
         int right = left+gap;

         while(right<len){

            if(left<n && right>=n){
               swapIfGreater(nums1,nums2,left,right-n);
            }
            else if(left>=n){
               swapIfGreater(nums2,nums2,left-n,right-n);
            }else{
               swapIfGreater(nums1,nums1,left,right);
            }
            left++; right++;
            
         }
         if (gap == 1) break;
         gap = (gap / 2) + (gap % 2);
      }
      
      List<Integer> list = new ArrayList<>();
      for(int aa : nums1){
         list.add(aa);
      }
      for(int bb:nums2){
         list.add(bb);
      }
      return list;

   }
   //SwapIfGreater
   public void swapIfGreater(int nums1[],int nums2[],int a,int b){
      if(nums1[a]>nums2[b]){
         int temp = nums1[a];
         nums1[a] = nums2[b];
         nums2[b] = temp;
      }
   }

   //Find the repeating element and missing element;
   public void repeatingAndMissingElementUsingMaths(int nums[]){
      int n = nums.length;
      int sn = (n*(n+1))/2;
      int sn2 = (n*(n+1)*((2*n)+1))/6;
      int sum = 0;
      int sum2 = 0;
      for(int i=0;i<n;i++){
         sum += nums[i];
         sum2 += nums[i]*nums[i];
      }
      //x -> Repeating element , y -> Missing Element;
      int value1 = sum - sn; //x-y
      int value2 = sum2 - sn2; //x^2 - y^2;
      value2 = value2/value1 ;// x+y;

      int x = (value1+value2)/2;
      int y = x - value1;
      System.out.println("The Repeating element is : "+x);
      System.out.println("The missing element is : "+y);
   }

   //Find repeated and missing elements using xor;

   public void repeatingAndMissingElementUsingXor(int nums[]){
      int n = nums.length;
      int xor = 0;

      for(int i=0;i<n;i++){
         xor ^= nums[i];
         xor ^= (i+1);
      }
      int bitNo = 0;
      while(true){
         if((xor & (1<<bitNo)) != 0 ){
            break;
         }
         bitNo++;
      }
      int one  = 0;
      int zero = 0;

      for(int i=0;i<n;i++){
         if((nums[i] & (1<<bitNo)) == 1){
            one ^= nums[i];
         }else{
            zero ^= nums[i];
         }
         if(((i+1)&(1<<bitNo)) == 1){
            one ^= (i+1);
         }else{
            zero ^= (i+1);
         }
      }
      int miss = one;
      int repeat = zero;
      for(int i=0;i<n;i++){
         if(one == nums[i]){
            miss = zero;
            repeat = one;
            break;
         }
      }
      System.out.println("The Missing element is : "+miss);
      System.out.println("The Repeating element is :"+repeat);
   }

   //Count inversion pairs i<j but nums[i] > nums[j];
   public void countInversion(int nums[]){
      //using merge sort
      int count = mergeSortForCountInversionPairs(nums,0,nums.length-1);
      System.out.println("The count Inversion pair : "+ count);
   }
   //Count reverse pair
   public void countReversePair(int nums[]){
      int countReverse = mergeSortForCountReversePairs(nums,0,nums.length-1);
      System.out.println("The count Reverse pair : "+ countReverse);
   }
   public int reversePairs(int nums[],int low,int mid,int high){
      int cntReverse = 0;
      int left = low;
      int right = mid+1;
      while(left<=mid && right<=high){
         if(nums[left]> 2*nums[right]){
            cntReverse +=(mid-left+1);
         }
         // if(nums[left]>nums[right]){
            right++;
         // }else{
            left++;
         // }
      }
      return cntReverse;
   }
   public int mergeSortForCountReversePairs(int nums[],int low,int high){
      int cnt = 0;
      if(low>= high) return cnt; 
      
      int mid = (low+high)/2;

      cnt += mergeSortForCountInversionPairs(nums,low,mid);
      cnt += mergeSortForCountInversionPairs(nums,mid+1,high);
      cnt += reversePairs(nums,low,mid,high);
      merge(nums,low,mid,high);
      return cnt;


   }
   public int mergeSortForCountInversionPairs(int nums[],int low,int high){
      int cnt = 0;
      if(low>= high) return cnt; 
      
      int mid = (low+high)/2;

      cnt += mergeSortForCountInversionPairs(nums,low,mid);
      cnt += mergeSortForCountInversionPairs(nums,mid+1,high);
      cnt += merge(nums,low,mid,high);
      return cnt;


   }
   public int merge(int nums[],int low,int mid,int high){
      int left = low;
      int right = mid+1;
      int cnt = 0;
      List<Integer> temp = new ArrayList<>();
      while(left<=mid && right<=high){
         if(nums[left]>nums[right]){
            cnt += (mid-left+1);
            temp.add(nums[right]);
            right++;
         }else{
            temp.add(nums[left]);
            left++;
         }
      }
      while(left<=mid){
         temp.add(nums[left]);
         left++;
      }
      while(right<=high){
         temp.add(nums[right]);
         right++;
      }

      for(int i=low;i<=high;i++){
         nums[i] = temp.get(i-low);
      }
      return cnt;
   }

}
