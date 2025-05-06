# 🚀 Longest Subarray with Sum K — Sliding Window Approach

## 🔍 Problem Statement

Given an array of **positive integers**, find the **length of the longest contiguous subarray** whose sum equals a given target value `k`.

---

## ✅ Assumptions

- All elements in the array are **positive integers**
- Target sum `k` is a non-negative integer

---

## 💡 Approach: Sliding Window

The **sliding window technique** is ideal for this problem because all elements are positive. This ensures:

- Expanding the window (moving the right pointer `j`) increases the sum
- Shrinking the window (moving the left pointer `i`) decreases the sum

This property allows us to efficiently find valid subarrays.

---

## 🧠 Algorithm

1. Initialize two pointers: `i` (start of window) and `j` (end of window), both at 0
2. Maintain a running sum of the current window
3. Expand the window by moving `j` and adding `nums[j]` to `sum`
4. If `sum > k`, shrink the window by moving `i` forward and subtracting `nums[i]`
5. If `sum == k`, update `maxLen` with the current window size
6. Continue until `j` reaches the end of the array

---

## 🧾 Code

```java
public int positiveLongestSubArray(int[] nums, int k) {
    int i = 0, j = 0, sum = 0, maxLen = 0;
    
    while (j < nums.length) {
        sum += nums[j];

        while (i <= j && sum > k) {
            sum -= nums[i++];
        }

        if (sum == k) {
            maxLen = Math.max(maxLen, j - i + 1);
        }

        j++;
    }

    return maxLen;
}
