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
      <summary> Feb 1 </summary>

      ### 191. Number of 1 Bits
      
      A function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

      Click [here](https://leetcode.com/problems/number-of-1-bits/) for more details

      </details>

   *
      <details>
      <summary> Feb 2 </summary>

      ### 669. Trimming a binary tree 

      Given the `root` of a binary search tree and the lowest and highest boundaries as `low` and `high`, trim the tree so that all its elements lies in `[low, high]`. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.

      Click [here](https://leetcode.com/problems/trim-a-binary-search-tree/) for more details

      </details>

   *
      <details>
      <summary> Feb 3 </summary>

      ### 141. Linked List Cycle

      Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

      There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed as a parameter**.

      Click [here](https://leetcode.com/problems/linked-list-cycle/) for more details

      </details>

   *
      <details>
      <summary> Feb 4 </summary>

      ### 594. Longest Harmonious Subsequence
      We define a harmonious array as an array where the difference between its maximum value and its minimum value is **exactly** 1.

      Given an integer array `nums`, return the *length of its longest harmonious subsequence among all its possible subsequences*.

      A **subsequence** of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

      Click [here](https://leetcode.com/problems/longest-harmonious-subsequence/) for more details

      </details>
      
   *
      <details>
      <summary> Feb 5 </summary>

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
      <summary> Feb 6 </summary>

      ### 199. Binary Tree Right Side View

      Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

      Click [here](https://leetcode.com/problems/binary-tree-right-side-view/) for more details

      </details>
      
   *
      <details>
      <summary> Feb 7 </summary>

      ### 284. Peeking Iterator 

      Given an Iterator class interface with methods: `next()` and `hasNext()`, design and implement a PeekingIterator that support the `peek()` operation -- it essentially peek() at the element that will be returned by the next call to next().

      Click [here](https://leetcode.com/problems/peeking-iterator/) for more details

      </details>

   *
      <details>
      <summary> Feb 8 </summary>

      ### 821. Shortest Distance to a Character

      Given a string `s` and a character `c` that occurs in `s`, return an *array of integers answer* where `answer.length == s.length` and `answer[i]` is the shortest distance from `s[i]` to the character `c` in `s`.

      Click [here](https://leetcode.com/problems/shortest-distance-to-a-character/) for more details

      </details>

   *
      <details>
      <summary> Feb 9 </summary>

      ### 1038. Convert BST to Greater Tree
            
      Given the `root` of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

      Click [here](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/) for more details

      </details>

   *
      <details>
      <summary> Feb 10 </summary>

      ### 138. Copy List with Random Pointer

      A linked list of length `n` is given such that each node contains an additional random pointer, which could point to any node in the list, or `null`.

      Construct a deep copy of the list. The deep copy should consist of exactly `n` brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the `next` and `random` pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. **None of the pointers in the new list should point to nodes in the original list**.
      

      Click [here](https://leetcode.com/problems/copy-list-with-random-pointer/) for more details

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

   </details>

</details>