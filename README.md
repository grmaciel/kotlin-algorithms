# Small playground for algorthims :) 

## Strings
* Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.

* Given two strings s and t, write a function to determine if t is an anagram of s.<br>

* Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.<br>

* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases. For example, "Red rum, sir, is murder" is a palindrome, while "Programcreek is awesome" is not.<br>

## Array
* Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

* Given an array of integers, find two numbers such that they add up to a specific target number. The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.<br> 
Example:

```
Input: numbers={2, 7, 11, 15}, 
target=9 
Output: index1=0, index2=1
```

* Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element. For example, given [3,2,1,5,6,4] and k = 2, return 5. Note: You may assume k is always valid, 1 ≤ k ≤ array's length.

## Next problems:

* Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
Example:
```
Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).
Input: arr[] = {10, 4, 6, 12, 5}
Output: False
There is no Pythagorean triplet.  
```

* Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time. The converted array should be in form a < b > c < d > e < f.
<br>Example:
```
Input:  arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: arr[] = {3, 7, 4, 8, 2, 6, 1}

Input:  arr[] =  {1, 4, 3, 2}
Output: arr[] =  {1, 4, 2, 3}
```