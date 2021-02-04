# LeetCode 

- LeetCoding challenge 2021
- Didn't want to make this repo public, but it'll probably guilt me into leetcod-ing regularly, so eh, might as well make a nice README.
- Collapsable markdown?? Nice.
- No support for css, but has emojis :expressionless:. Great.

<details>
<summary style="font-size:20px">Feb 2021 </summary>

## February 2021

*
   <details>
   <summary> Day 1 </summary>

   ### Number of 1 Bits
   
   A function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

   Eg - <br />

   1. 
       * **Input**: 11
       * **Output**: 3
       * **Explaination**: The input 11 (binary string  0000000000000000000000000001011) has a total of three '1' bits.

   2. 
       * **Input**: 32
       * **Output**: 1
       * **Explaination**: The input 32 (binary string  0000000000000000000000000100000) has a total of one '1' bit.
   </details>

*
   <details>
   <summary> Day 2 </summary>

   ### Trimming a binary tree 

   Given the `root` of a binary search tree and the lowest and highest boundaries as `low` and `high`, trim the tree so that all its elements lies in `[low, high]`. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.

   Eg - <br />

   1. 
      * **Input**: root = [1,0,2], low = 1, high = 2
      * **Output**: [1,null,2]

   2. 
      * **Input**: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
      * **Output**: [3,2,null,1]

   3. 
      * **Input**: root = [1,null,2], low = 1, high = 3
      * **Output**: [1,null,2]

   </details>

*
   <details>
   <summary> Day 3 </summary>

   ### Trimming a binary tree 

   Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

   There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that `pos` is not passed as a parameter**.

   Eg - <br />

   1. 
      * **Input**: head = [3,2,0,-4], pos = 1
      * **Output**: true
      * **Explanation**: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

   2. 
      * **Input**: head = [1,2], pos = 0
      * **Output**: true
      * **Explanation**:  There is a cycle in the linked list, where the tail connects to the 0th node.

   3. 
      * **Input**:  head = [1], pos = -1
      * **Output**: false
      * **Explanation**: There is no cycle in the linked list.

   </details>
</details>
