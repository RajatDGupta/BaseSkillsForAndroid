
class Solution {

    fun removeElement(nums: IntArray, num: Int): Int {
        var count=0
        for(item in nums){
            if(item!=num){
                count++
            }
        }
        return count
    }
}

fun main(){
   val c= Solution().removeElement(intArrayOf(0,1,2,2,3,0,4,2),2)
    print(c)
}


//# Common Coding Interview Programs (Kotlin)
//
//## Arrays
//
//1. Find largest/smallest element in array
//2. Reverse an array
//3. Find second largest element
//4. Remove duplicates from sorted array
//5. Rotate array by K positions
//6. Move zeros to end
//7. Find missing number
//8. Two Sum problem
//9. Maximum subarray sum (Kadane’s Algorithm)
//10. Merge two sorted arrays
//
//## Strings
//
//1. Reverse a string
//2. Check palindrome string
//3. Count vowels/consonants
//4. Find longest common prefix
//5. Find longest common suffix
//6. Check anagram
//7. Frequency of characters
//8. First non-repeating character
//9. String compression
//10. Check rotation of strings
//
//## Searching & Sorting
//
//1. Binary Search
//2. Linear Search
//3. Bubble Sort
//4. Selection Sort
//5. Insertion Sort
//6. Merge Sort
//7. Quick Sort
//8. Count occurrences using binary search
//
//## Recursion / Backtracking
//
//1. Factorial using recursion
//2. Fibonacci series
//3. Power of number
//4. Tower of Hanoi
//5. Generate permutations
//6. Generate subsets
//7. N-Queens problem
//
//## Linked List
//
//1. Reverse linked list
//2. Detect cycle
//3. Find middle node
//4. Merge two sorted linked lists
//5. Remove nth node from end
//
//## Stack & Queue
//
//1. Implement stack using array
//2. Valid parentheses
//3. Next greater element
//4. Queue using stacks
//5. Min stack
//
//## HashMap / Set
//
//1. Count frequency of elements
//2. Find duplicates
//3. Longest consecutive sequence
//4. Group anagrams
//
//## Trees
//
//1. Inorder / Preorder / Postorder traversal
//2. Level order traversal
//3. Height of binary tree
//4. Check balanced tree
//5. Lowest common ancestor
//6. Diameter of binary tree
//
//## Dynamic Programming
//
//1. Climbing stairs
//2. Coin change
//3. Longest increasing subsequence
//4. Longest common subsequence
//5. 0/1 Knapsack
//6. Edit distance
//
//## Number Programs
//
//1. Prime number
//2. Armstrong number
//3. Palindrome number
//4. Swap two numbers
//5. GCD / LCM
//6. Decimal to binary
//7. Fibonacci series
//8. Check perfect number
//
//## Pattern Programs
//
//1. Star pyramid
//2. Diamond pattern
//3. Floyd’s triangle
//4. Pascal triangle
//5. Hollow square pattern




