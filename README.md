# LeetCode 

- Leetcode Daily, weekly and bi-weekly challenges 
- Didn't want to make this repo public, but it'll probably guilt me into leetcod-ing regularly, so eh, might as well make a nice README.
- Collapsable markdown?? Nice.
- No support for css, but has emojis :expressionless:. Great. 

<!-------------- Daily challanges  ------------>

<details>
<summary>Daily Challanges </summary>

# Daily Challange 2021

*
   <details>
   <summary>Feb 2021 </summary>

   ## February 2021

   *
      <details>
      <summary> Feb 1: Number of 1 Bits</summary>

      ### 191. Number of 1 Bits
      
      A function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

      Click [here](https://leetcode.com/problems/number-of-1-bits/) for more details

      </details>

   *
      <details>
      <summary> Feb 2: Trimming a binary tree</summary>

      ### 669. Trimming a binary tree 

      Given the `root` of a binary search tree and the lowest and highest boundaries as `low` and `high`, trim the tree so that all its elements lies in `[low, high]`. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.

      Click [here](https://leetcode.com/problems/trim-a-binary-search-tree/) for more details

      </details>

   *
      <details>
      <summary> Feb 3: Linked List Cycle</summary>

      ### 141. Linked List Cycle

      Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

      There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed as a parameter**.

      Click [here](https://leetcode.com/problems/linked-list-cycle/) for more details

      </details>

   *
      <details>
      <summary> Feb 4: Longest Harmonious Subsequence</summary>

      ### 594. Longest Harmonious Subsequence
      We define a harmonious array as an array where the difference between its maximum value and its minimum value is **exactly** 1.

      Given an integer array `nums`, return the *length of its longest harmonious subsequence among all its possible subsequences*.

      A **subsequence** of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

      Click [here](https://leetcode.com/problems/longest-harmonious-subsequence/) for more details

      </details>
      
   *
      <details>
      <summary> Feb 5. Simplify Path</summary>

      ### 71. Simplify Path
      Given a string `path`, which is an **absolute path** (starting with a slash `'/'`) to a file or directory in a Unix-style file system, convert it to the simplified **canonical path**.

      - `'.'` : current directory 
      - `'..'`: refers to the directory up a level
      - `'//'`: treated as a single slash '/'
      - `'...'`: any other format of periods are treated as file/directory names.

      *Return the simplified **canonical path**.*

      Click [here](https://leetcode.com/problems/simplify-path/) for more details

      </details>

   *
      <details>
      <summary> Feb 6: Binary Tree Right Side View</summary>

      ### 199. Binary Tree Right Side View

      Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

      Click [here](https://leetcode.com/problems/binary-tree-right-side-view/) for more details

      </details>
      
   *
      <details>
      <summary> Feb 7: Peeking Iterator</summary>

      ### 284. Peeking Iterator 

      Given an Iterator class interface with methods: `next()` and `hasNext()`, design and implement a PeekingIterator that support the `peek()` operation -- it essentially peek() at the element that will be returned by the next call to next().

      Click [here](https://leetcode.com/problems/peeking-iterator/) for more details

      </details>

   *
      <details>
      <summary> Feb 8: Shortest Distance to a Character </summary>

      ### 821. Shortest Distance to a Character

      Given a string `s` and a character `c` that occurs in `s`, return an *array of integers answer* where `answer.length == s.length` and `answer[i]` is the shortest distance from `s[i]` to the character `c` in `s`.

      Click [here](https://leetcode.com/problems/shortest-distance-to-a-character/) for more details

      </details>

   *
      <details>
      <summary> Feb 9: Convert BST to Greater Tree</summary>

      ### 1038. Convert BST to Greater Tree
            
      Given the `root` of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

      Click [here](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/) for more details

      </details>

   *
      <details>
      <summary> Feb 10: Copy List with Random Pointer</summary>

      ### 138. Copy List with Random Pointer

      A linked list of length `n` is given such that each node contains an additional random pointer, which could point to any node in the list, or `null`.

      Construct a deep copy of the list. The deep copy should consist of exactly `n` brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the `next` and `random` pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. **None of the pointers in the new list should point to nodes in the original list**.
      

      Click [here](https://leetcode.com/problems/copy-list-with-random-pointer/) for more details

      </details>

   *
      <details>
      <summary> Feb 11: Valid Anagram</summary>

      ### 242. Valid Anagram

      Given two strings s and t , write a function to determine if t is an anagram of s.

      Click [here](https://leetcode.com/problems/valid-anagram/) for more details

      </details>

   *
      <details>
      <summary> Feb 12: Number of Steps to Reduce a Number to Zero</summary>

      ### 1342. Number of Steps to Reduce a Number to Zero
      
      Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

      Click [here](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/) for more details

      </details>

   *
      <details>
      <summary> Feb 13: Shortest Path in Binary Matrix</summary>

      ### 1091. Shortest Path in Binary Matrix
      
      In an N by N square grid, each cell is either empty (0) or blocked (1). Return the length of the shortest such clear path from top-left to bottom-right.  If such a path does not exist, return -1.

      Click [here](https://leetcode.com/problems/shortest-path-in-binary-matrix/) for more details

      </details>

   *
      <details>
      <summary> Feb 14: Is Graph Bipartite?</summary>

      ### 785. Is Graph Bipartite?
      
      There is an undirected graph with `n` nodes, where each node is numbered between `0` and `n - 1`.
      Return `true` if and only if it is *bipartite*.

      Click [here](https://leetcode.com/problems/is-graph-bipartite/) for more details

      </details>

   *
      <details>
      <summary> Feb 15: The K Weakest Rows in a Matrix</summary>

      ### 1337. The K Weakest Rows in a Matrix

      Given a `m * n` matrix `mat` of ones (representing soldiers) and zeros (representing civilians), return the indexes of the `k` weakest rows in the matrix ordered from the weakest to the strongest.

      Click [here](https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/) for more details

      </details>

   *
      <details>
      <summary> Feb 16: Letter Case Permutation</summary>

      ### 784. Letter Case Permutation

      Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.

      Return a list of all possible strings we could create. 

      Click [here](https://leetcode.com/problems/letter-case-permutation/) for more details

      </details>

   *
      <details>
      <summary> Feb 17: Container With Most Water</summary>

      ### 11. Container With Most Water

      Given n non-negative integers `a1, a2, ..., an` , where each represents a point at coordinate `(i, ai)`. `n` vertical lines are drawn such that the two endpoints of the line `i` is at `(i, ai)` and `(i, 0)`. Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

      Click [here](https://leetcode.com/problems/container-with-most-water/) for more details

      </details>

   *
      <details>
      <summary> Feb 18: Arithmetic Slices</summary>

      ### 413. Arithmetic Slices
      
      A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

      Click [here](https://leetcode.com/problems/arithmetic-slices/) for more details

      </details>

   *
      <details>
      <summary> Feb 19: Minimum Remove to Make Valid Parentheses</summary>

      ### 1249. Minimum Remove to Make Valid Parentheses

      Given a string s of `'('` , `')'` and lowercase English characters. 

      Your task is to remove the minimum number of parentheses ( `'('` or `')'`, in any positions ) so that the resulting parentheses string is valid and return **any** valid string.

      Click [here](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/) for more details

      </details>

   *
      <details>
      <summary> Feb 20: Roman to Integer</summary>

      ### 13. Roman to Integer

      Given a roman numeral, convert it to an integer.

      Click [here](https://leetcode.com/problems/roman-to-integer/) for more details

      </details>

   *
      <details>
      <summary> Feb 21: Broken calculator</summary>

      ### 991. Broken calculator

      On a broken calculator that has a number showing on its display, we can perform two operations.

      Click [here](https://leetcode.com/problems/broken-calculator/) for more details

      </details>

   *
      <details>
      <summary> Feb 22: Longest Word in Dictionary through Deleting</summary>

      ### 524. Longest Word in Dictionary through Deleting

      Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

      Click [here](https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/) for more details

      </details>

   *
      <details>
      <summary> Feb 23: Search a 2D Matrix II</summary>

      ### 240. Search a 2D Matrix II

      Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties.

      Click [here](https://leetcode.com/problems/search-a-2d-matrix-ii/) for more details

      </details>

   *
      <details>
      <summary> Feb 24: Score of Parentheses</summary>

      ### 856. Score of Parentheses

      Given a balanced parentheses string S, compute the score of the string based on the following rule:

      Click [here](https://leetcode.com/problems/score-of-parentheses/) for more details

      </details>

   *
      <details>
      <summary> Feb 25: Shortest unsorted continuous subarray</summary>

      ### 581. Shortest unsorted continuous subarray

      Click [here](https://leetcode.com/problems/shortest-unsorted-continuous-subarray/) for more details

      </details>

   *
      <details>
      <summary> Feb 26: Validate Stack Sequences</summary>

      ### 964. Validate Stack Sequences

      Click [here](https://leetcode.com/problems/validate-stack-sequences/) for more details

      </details>

   *
      <details>
      <summary> Feb 27: Divide two Integers </summary>

      ### 29. Divide two Integers

      Click [here](https://leetcode.com/problems/divide-two-integers/) for more details

      </details>

   *
      <details>
      <summary> Feb 28: Maximum frequency stack </summary>

      ### 895. Maximum Frequency Stack

      Click [here](https://leetcode.com/problems/maximum-frequency-stack/) for more details

      </details>

   </details>

*
   <details>
   <summary>Mar 2021 </summary>

   ## March 2021

   *
      <details>
      <summary> Mar 1 : Distribute Candies </summary>

      ### 575. Distribute Candies

      Click [here](https://leetcode.com/problems/distribute-candies/) for more details

      </details>

   *
      <details>
      <summary> Mar 2 : Set Mismatch </summary>

      ### 645. Set Mismatch

      Click [here](https://leetcode.com/problems/set-mismatch/) for more details

      </details>

   *
      <details>
      <summary> Mar 3 : Missing Number </summary>

      ### 268. Missing Number 

      Click [here](https://leetcode.com/problems/missing-number/) for more details

      </details>

   *
      <details>
      <summary> Mar 4 :  Intersection of Two Linked Lists</summary>

      ### 160. Intersection of Two Linked Lists

      Click [here](https://leetcode.com/problems/intersection-of-two-linked-lists/) for more details

      </details>

   *
      <details>
      <summary> Mar 5 : Average of Levels in Binary Tree </summary>

      ### 637. Average of Levels in Binary Tree

      Click [here](https://leetcode.com/problems/average-of-levels-in-binary-tree/) for more details

      </details>

   *
      <details>
      <summary> Mar 6 : Short Encoding of Words </summary>

      ### 820. Short Encoding of Words

      Click [here](https://leetcode.com/problems/short-encoding-of-words) for more details

      </details>

   </details>

   *
      <details>
      <summary> Mar 7 : Design HashMap
￼
  </summary>

      ### 706. Design HashMap

      Click [here](https://leetcode.com/problems/design-hashmap/) for more details

      </details>

   </details>

   *
      <details>
      <summary> Mar 8 : Remove Palindromic Subsequences </summary>

      ### 1332. Remove Palindromic Subsequences

      Click [here](https://leetcode.com/problems/remove-palindromic-subsequences/) for more details

      </details>

   </details>

</details>

---

<!-------------- Weekly challanges  ------------>

<details>
<summary>Weekly Challanges</summary>

# Weekly Challenges

*
   <details>
   <summary>Weekly Contest 227</summary>

   ## Weekly Contest 227

   *
      <details>
      <summary>Check if Array Is Sorted and Rotated (3 points)</summary>

      ### 1752. Check if Array Is Sorted and Rotated

      Given an array `nums`, return `true` if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return `false`.

      There may be **duplicates** in the original array.

      Note: An array `A` rotated by `x` positions results in an array `B` of the same length such that `A[i] == B[(i+x) % A.length]`, where % is the modulo operation.

      Click [here](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/) for more details

      </details>

   *
      <details>
      <summary>Maximum Score From Removing Stones (4 points)</summary>

      ### 1753. Maximum Score From Removing Stones

      **Time limit exceeded**

      You are playing a solitaire game with three piles of stones of sizes `a`, `b`, and 'c' respectively. Each turn you choose two different non-empty piles, take one stone from each, and add 1 point to your score. The game stops when there are fewer than two non-empty piles (meaning there are no more available moves).

      Given three integers `a`, `b`, and `c`, return the maximum score you can get.

      Click [here](https://leetcode.com/problems/maximum-score-from-removing-stones/) for more details

      </details>

   *
      <details>
      <summary>Largest Merge Of Two Strings (5 points)</summary>

      ### 1754. Largest Merge Of Two Strings

      **Didnt do**

      Click [here](https://leetcode.com/problems/largest-merge-of-two-strings/) for more details

      </details>

   *
      <details>
      <summary>Closest Subsequence Sum (6 points)</summary>

      ### 1755. Closest Subsequence Sum

      **Didnt do**

      You are given an integer array `nums` and an integer `goal`.

      You want to choose a subsequence of `nums` such that the sum of its elements is the closest possible to `goal`. That is, if the `sum` of the subsequence's elements is sum, then you want to minimize the absolute difference `abs(sum - goal)`.

      Return the minimum possible value of `abs(sum - goal)`.


      Click [here](https://leetcode.com/contest/weekly-contest-227/problems/closest-subsequence-sum/) for more details

      </details>

   </details>

*
   <details>
   <summary>Weekly Contest 228</summary>

   ## Weekly Contest 228

   *
      <details>
      <summary>Minimum Changes To Make Alternating Binary String</summary>

      ### 1758. Minimum Changes To Make Alternating Binary String

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/minimum-changes-to-make-alternating-binary-string/) for more details

      </details>

   *
      <details>
      <summary>Count Number of Homogenous Substrings</summary>

      ### 1759. Count Number of Homogenous Substrings

      **Didnt do**

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/count-number-of-homogenous-substrings/) for more details

      </details>

   *
      <details>
      <summary>Minimum Limit of Balls in a Bag</summary>

      ### 1760. Minimum Limit of Balls in a Bag

      **Didnt do**

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/minimum-limit-of-balls-in-a-bag/) for more details

      </details>

   *
      <details>
      <summary>Minimum Degree of a Connected Trio in a Graph5</summary>

      ### 1761. Minimum Degree of a Connected Trio in a Graph5 

      **Didnt do**

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/minimum-degree-of-a-connected-trio-in-a-graph/) for more details

      </details>

   </details>
   
*
   <details>
   <summary>Weekly Contest 229</summary>

   ## Weekly Contest 229

   *
      <details>
      <summary>Merge Strings Alternately</summary>

      ### 1768. Merge Strings Alternately

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/minimum-changes-to-make-alternating-binary-string/) for more details

      </details>

   *
      <details>
      <summary>Minimum Number of Operations to Move All Balls to Each Box</summary>

      ### 1769. Minimum Number of Operations to Move All Balls to Each Box

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/count-number-of-homogenous-substrings/) for more details

      </details>

   *
      <details>
      <summary>Maximum Score from Performing Multiplication Operations</summary>

      ### 1770. Maximum Score from Performing Multiplication Operations

      **didnt work**

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/minimum-limit-of-balls-in-a-bag/) for more details

      </details>

   *
      <details>
      <summary>Maximize Palindrome Length From Subsequences</summary>

      ### 1771. Maximize Palindrome Length From Subsequences

      **Didnt do**

      Click [here](https://leetcode.com/contest/weekly-contest-228/problems/minimum-degree-of-a-connected-trio-in-a-graph/) for more details

      </details>

   </details>
      
*
   <details>
   <summary>Weekly Contest 230</summary>

   ## Weekly Contest 230

   *
      <details>
      <summary>Count Items Matching a Rule</summary>

      ### 1773. Count Items Matching a Rule

      Click [here](https://leetcode.com/problems/count-items-matching-a-rule/) for more details

      </details>

   *
      <details>
      <summary>Closest Dessert Cost</summary>

      ### 1774. Closest Dessert Cost

      **Didnt do**

      Click [here](https://leetcode.com/problems/closest-dessert-cost/) for more details

      </details>

   *
      <details>
      <summary>Equal Sum Arrays With Minimum Number of Operations</summary>

      ### 1775. Equal Sum Arrays With Minimum Number of Operations

      **Didnt do**

      Click [here](https://leetcode.com/problems/equal-sum-arrays-with-minimum-number-of-operations/) for more details

      </details>

   *
      <details>
      <summary>Car Fleet II</summary>

      ### 1776. Car Fleet II

      **Didnt do**

      Click [here](https://leetcode.com/problems/car-fleet-ii/) for more details

      </details>

   </details>

</details>

---

<!-------------- Bi weekly challanges  ------------>

<details>
<summary>Bi-weekly Challanges </summary>

# Bi-weekly Challanges 

*
   <details>
   <summary>Bi-weekly Contest 45</summary>

   ## Bi-weekly Contest 45

   *
      <details>
      <summary>Sum of Unique Elements (3 points)</summary>

      ### 1748. Sum of Unique Elements

      You are given an integer array `nums`. The unique elements of an array are the elements that appear exactly once in the array.

      Return the sum of all the unique elements of `nums`.

      Click [here](https://leetcode.com/problems/sum-of-unique-elements/) for more details

      </details>

   *
      <details>
      <summary> Maximum Absolute Sum of Any Subarray (4 points)</summary>

      ### 1749. Maximum Absolute Sum of Any Subarray

      **Time limit exceeded**  

      You are given an integer array `nums`. The absolute sum of a subarray `[numsl, numsl+1, ..., numsr-1, numsr]` is `abs(numsl + numsl+1 + ... + numsr-1 + numsr)`.

      Return the maximum absolute sum of any (possibly empty) subarray of `nums`.
      
      Click [here](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/) for more details

      </details>

   *
      <details>
      <summary>Minimum Length of String After Deleting Similar Ends (4 points)</summary>

      ### 1750. Minimum Length of String After Deleting Similar Ends

      Given a string s consisting only of characters `'a'`, `'b'`, and `'c'`. You are asked to apply the following algorithm on the string any number of times:

      - Pick a **non-empty** prefix from the string `s` where all the characters in the prefix are equal.
      - Pick a **non-empty** suffix from the string `s` where all the characters in this suffix are equal.
      - The prefix and the suffix should not intersect at any index.
      - The characters from the prefix and suffix must be the same.
      - Delete both the prefix and the suffix.
      
      Return the minimum length of s after performing the above operation any number of times (possibly zero times).

      Click [here](https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/) for more details

      </details>

   *
      <details>
      <summary>Maximum Number of Events That Can Be Attended II (6 points)</summary>

      ### 1751. Maximum Number of Events That Can Be Attended II

      **Didnt do**

      You are given an array of `events` where `events[i] = [startDayi, endDayi, valuei]`. The ith event starts at startDayi and ends at endDayi, and if you attend this event, you will receive a value of valuei. You are also given an integer `k` which represents the maximum number of events you can attend.

      You can only attend one event at a time. If you choose to attend an event, you must attend the entire event. Note that the end day is inclusive: that is, you cannot attend two events where one of them starts and the other ends on the same day.

      Return the maximum sum of values that you can receive by attending events.

      Click [here](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended-ii/) for more details

      </details>

*
   <details>
   <summary>Bi-weekly Contest 46</summary>

   ## Bi-weekly Contest 46

   *
      <details>
      <summary>Longest Nice Substring (3 points)</summary>

      ### 1763. Longest Nice Substring

      **Didnt do**
      
      A string `s` is nice if, for every letter of the alphabet that `s` contains, it appears both in uppercase and lowercase. For example, `"abABB"` is nice because `'A'` and `'a'` appear, and `'B'` and `'b'` appear. However, `"abA"` is not because `'b'` appears, but `'B'` does not.

      Click [here](https://leetcode.com/problems/longest-nice-substring/) for more details

      </details>

   *
      <details>
      <summary> Form Array by Concatenating Subarrays of Another Array (4 points)</summary>

      ### 1764. Form Array by Concatenating Subarrays of Another Array

      You are asked if you can choose `n` disjoint subarrays from the array `nums` such that the `ith` subarray is equal to `groups[i]` (0-indexed), and if `i > 0`, the `(i-1)th` subarray appears before the `ith` subarray in `nums` (i.e. the subarrays must be in the same order as `groups`).

      Click [here](https://leetcode.com/problems/form-array-by-concatenating-subarrays-of-another-array/) for more details

      </details>

   *
      <details>
      <summary> Map of Highest Peak (6 points)</summary>

      ### 1765. Map of Highest Peak

      You are given an integer matrix isWater of size m x n that represents a map of land and water cells.
      
      Click [here](https://leetcode.com/problems/map-of-highest-peak/) for more details

      </details>

   *
      <details>
      <summary> Tree of Coprimes (7 points)</summary>

      ### 1766. Tree of Coprimes 

      **Didnt do**

      There is a tree (i.e., a connected, undirected graph that has no cycles) consisting of n nodes numbered from 0 to n - 1 and exactly n - 1 edges. Each node has a value associated with it, and the root of the tree is node 0.

      Click [here](https://leetcode.com/problems/tree-of-coprimes/) for more details

      </details>

   </details>

</details>