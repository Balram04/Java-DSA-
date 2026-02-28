# Java DSA Problems & Solutions

## 📚 Array Problems

### 1. Two Sum - [View Solution](twoSum.java)
**Approach:**
1. Create a HashSet to store visited numbers
2. Iterate through the array elements
3. For each element, calculate the complement (target - current element)
4. Check if complement exists in HashSet; if yes, pair found
5. Otherwise, add current element to HashSet and continue

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 2. Find Duplicate Elements - [View Solution](findDuplicate.java)
**Approach:**
1. Take input array from user
2. Use nested loops to compare each element with subsequent elements
3. For element at index i, check all elements from i+1 to end
4. If match found, print the duplicate element
5. Track if any duplicate found using boolean flag

**Time Complexity:** O(n²) | **Space Complexity:** O(1)

---

### 3. Find Min & Max - [View Solution](MinMax.java)
**Approach:**
1. Initialize maxValue to Integer.MIN_VALUE and minValue to Integer.MAX_VALUE
2. Traverse through the entire array
3. Compare each element with current maxValue and update if greater
4. Compare each element with current minValue and update if smaller
5. Display both min and max values after traversal

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 4. Second Largest Element - [View Solution](secondLargest.java)
**Approach:**
1. Initialize maxValue and secondMaxValue to Integer.MIN_VALUE
2. Traverse the array once
3. If current element is greater than maxValue, shift maxValue to secondMaxValue and update maxValue
4. Else if current element is greater than secondMaxValue and not equal to maxValue, update secondMaxValue
5. Return secondMaxValue after complete traversal

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 5. Reverse Array - [View Solution](Revers.java)
**Approach:**
1. Use two pointers: start at index 0 and end at last index
2. Swap elements at start and end positions
3. Increment start pointer and decrement end pointer
4. Continue until start >= end
5. Print the reversed array

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 6. Rotate Array - [View Solution](rotate.java)
**Approach:**
1. Handle edge case: calculate k = k % size to optimize rotations
2. Right rotation using reversal algorithm
3. Reverse first (size - k) elements
4. Reverse last k elements
5. Reverse the entire array to get final rotated array

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 7. Move Zeros to End - [View Solution](moveZero.java)
**Approach:**
1. Use a counter variable initialized to 0
2. Traverse array and place all non-zero elements at counter position
3. Increment counter after placing each non-zero element
4. Fill remaining positions (from counter to end) with zeros
5. Result: all non-zeros at start, all zeros at end

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 8. Frequency Count - [View Solution](FreqCount.java)
**Approach:**
1. Create a boolean visited array to track processed elements
2. For each unvisited element, initialize count to 1
3. Compare with all subsequent elements and increment count if match found
4. Mark matching elements as visited to avoid reprocessing
5. Print element with its frequency count

**Time Complexity:** O(n²) | **Space Complexity:** O(n)

---

### 9. Equilibrium Index - [View Solution](EquilibriumIndx.java)
**Approach:**
1. Calculate total sum of all array elements
2. Initialize leftSum to 0 and rightSum to totalSum
3. Traverse array: subtract current element from rightSum
4. Check if leftSum equals rightSum; if yes, return current index
5. Add current element to leftSum and continue

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 10. Maximum Sum Subarray (Kadane's Algorithm) - [View Solution](MaxSumSubArray.java)
**Approach:**
1. Initialize maxSum to Integer.MIN_VALUE and currentSum to 0
2. Traverse array and add each element to currentSum
3. If currentSum exceeds maxSum, update maxSum
4. If currentSum becomes negative, reset it to 0
5. Return maxSum as the result

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 11. Subarray with Given Sum - [View Solution](SubArraySum.java)
**Approach:**
1. Use sliding window technique with start and end pointers
2. Add elements to currentSum as end pointer moves forward
3. If currentSum exceeds target, shrink window from start
4. Remove elements from start and move start pointer forward
5. When currentSum equals target, print start and end indices

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

## 🔢 Number Theory Problems

### 12. Armstrong Number - [View Solution](amstrong.java)
**Approach:**
1. Count total digits in the number
2. Extract each digit using modulo operation
3. Calculate sum of each digit raised to power of total digits
4. Compare sum with original number
5. If equal, it's an Armstrong number

**Time Complexity:** O(d) where d is number of digits | **Space Complexity:** O(1)

---

### 13. Armstrong Numbers in Range - [View Solution](ArmstrongInRange.java)
**Approach:**
1. Take start and end range as input
2. For each number in range, count its digits
3. Calculate sum of powers of digits
4. Compare sum with original number
5. If match found, print the Armstrong number

**Time Complexity:** O(n*d) where n is range size | **Space Complexity:** O(1)

---

### 14. GCD (Greatest Common Divisor) - [View Solution](gcd.java)
**Approach:**
1. Find the smaller of the two numbers
2. Initialize gcd variable to 1
3. Loop from 1 to smaller number
4. Check if both numbers are divisible by current iterator
5. Update gcd with the current iterator value

**Time Complexity:** O(min(a,b)) | **Space Complexity:** O(1)

