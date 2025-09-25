# Floor in a Sorted Array

- Problem: [GeeksforGeeks - Floor in a Sorted Array](https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/0)  
- Description: Given a **sorted array** `arr[]` and an integer `x`, find the **index** (0-based) of the **largest element less than or equal to `x`**.  
  If no such element exists, return `-1`.  

---

## Examples
- Input: `arr = [1,2,8,10,10,12,19], x = 5` → Output: `1`  
  Explanation: Largest number ≤ 5 is `2`, index `1`.  

- Input: `arr = [1,2,8,10,10,12,19], x = 11` → Output: `4`  
  Explanation: Largest number ≤ 11 is `10`, last occurrence at index `4`.  

- Input: `arr = [1,2,8,10,10,12,19], x = 0` → Output: `-1`  

---

## Constraints
- 1 ≤ arr.length ≤ 10⁶  
- 1 ≤ arr[i] ≤ 10⁶  
- 0 ≤ x ≤ arr[n-1]  

---

## Approaches

### 1. Linear Search
- Traverse array from left to right, return index of last element ≤ `x`.  
- Time: **O(n)**, Space: **O(1)**  

### 2. Binary Search
- Efficient search using **binary search** to find last element ≤ `x`.  
- Time: **O(log n)**, Space: **O(1)**  
- Recommended for large arrays.
