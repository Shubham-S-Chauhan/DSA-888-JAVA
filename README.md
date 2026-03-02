# DSA-888-JAVA

> Solving **888 DSA problems** in Java

---

## 📁 Project Structure

```
DSA-888-JAVA/
├── pom.xml                          # Maven build (Java 17, JUnit 5)
├── README.md
└── src/
    ├── main/java/com/dsa888/
    │   ├── datastructures/          
    │   │   ├── ListNode.java        # Singly-linked list node
    │   │   ├── TreeNode.java        # Binary tree node
    │   │   └── GraphNode.java       # Graph node (adjacency list)
    │   └── problems/
    │       ├── SolutionTemplate.java  ← copy this for every new problem
    │       ├── arrays/
    │       ├── strings/
    │       ├── linkedlist/
    │       ├── trees/
    │       ├── graphs/
    │       ├── dp/
    │       ├── sorting/
    │       ├── searching/
    │       ├── backtracking/
    │       ├── greedy/
    │       ├── math/
    │       ├── binarySearch/
    │       ├── twoPointers/
    │       ├── slidingWindow/
    │       ├── heap/
    │       ├── stack/
    │       ├── queue/
    │       ├── hashing/
    │       ├── bitManipulation/
    │       └── trie/
    └── test/java/com/dsa888/        # JUnit 5 tests mirror main structure
```

---

## 🚀 Quick Start

### Prerequisites
- Java 17+
- Maven 3.6+

### Build & Test
```bash 
# compile + run all tests
mvn test

# compile only
mvn compile

# run a single test class
mvn test -Dtest=P001_TwoSumTest
```

---

## ✏️ Adding a New Problem

1. **Copy** `SolutionTemplate.java` into the right category package.
2. **Rename** it following the convention: `P<number>_<ProblemName>.java`  
   e.g. `P021_LongestPalindrome.java`
3. **Fill in** the class name, Javadoc header and `solve()` method.
4. **Add a test** file in the matching `src/test/java/…` package.

### File Naming Convention
```
P<3-digit-number>_<CamelCaseName>.java
```

### Problem Header Template
java
/**
 * Problem: <Title>
 * Difficulty: Easy | Medium | Hard
 * Category: <Category>
 * Link: https://leetcode.com/problems/<slug>/
 *
 * Description:
 *   ...
 *
 * Approach: ... – O(?) time, O(?) space
 */
```

---

## 📦 Data Structure Helpers

| Class | Usage |
|---|---|
| `ListNode` | `ListNode.of(1,2,3)` → builds a linked list; `ListNode.toArray(head)` → converts back |
| `TreeNode` | `TreeNode.of(1,2,3,null,null,4,5)` → builds tree from level-order array |
| `GraphNode` | Standard adjacency-list graph node |

---

## 📊 Progress Tracker

**Goal: 888 problems**

| # | Problem | Category | Difficulty | Status |
|---|---------|----------|------------|--------|
| 001 | [Two Sum](https://leetcode.com/problems/two-sum/) | Arrays | Easy | ✅ |
| 002 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Strings | Easy | ✅ |
| 003 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Linked List | Easy | ✅ |
| 004 | [Max Depth Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Trees | Easy | ✅ |
| 005 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Graphs | Medium | ✅ |
| 006 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | DP | Easy | ✅ |
| 007 | [Binary Search](https://leetcode.com/problems/binary-search/) | Binary Search | Easy | ✅ |
| 008 | [3Sum](https://leetcode.com/problems/3sum/) | Two Pointers | Medium | ✅ |
| 009 | [Longest Substring Without Repeating](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Sliding Window | Medium | ✅ |
| 010 | [Kth Largest Element](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Heap | Medium | ✅ |
| 011 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Stack | Easy | ✅ |
| 012 | [Queue Using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | Queue | Easy | ✅ |
| 013 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Hashing | Easy | ✅ |
| 014 | [Single Number](https://leetcode.com/problems/single-number/) | Bit Manipulation | Easy | ✅ |
| 015 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Sorting | Medium | ✅ |
| 016 | [Search in Rotated Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Searching | Medium | ✅ |
| 017 | [Subsets](https://leetcode.com/problems/subsets/) | Backtracking | Medium | ✅ |
| 018 | [Jump Game](https://leetcode.com/problems/jump-game/) | Greedy | Medium | ✅ |
| 019 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Math | Medium | ✅ |
| 020 | [Implement Trie](https://leetcode.com/problems/implement-trie-prefix-tree/) | Trie | Medium | ✅ |
| 021–888 | _Your problems here_ | — | — | ⬜ |

**Solved: 20 / 888**

---

## 🗂️ Categories

| Category | Package | Sample Problem |
|---|---|---|
| Arrays | `problems/arrays` | Two Sum |
| Strings | `problems/strings` | Valid Palindrome |
| Linked List | `problems/linkedlist` | Reverse Linked List |
| Trees | `problems/trees` | Max Depth Binary Tree |
| Graphs | `problems/graphs` | Number of Islands |
| Dynamic Programming | `problems/dp` | Climbing Stairs |
| Binary Search | `problems/binarySearch` | Binary Search |
| Two Pointers | `problems/twoPointers` | 3Sum |
| Sliding Window | `problems/slidingWindow` | Longest Substring No Repeat |
| Heap / Priority Queue | `problems/heap` | Kth Largest Element |
| Stack | `problems/stack` | Valid Parentheses |
| Queue | `problems/queue` | Queue Using Stacks |
| Hashing | `problems/hashing` | Contains Duplicate |
| Bit Manipulation | `problems/bitManipulation` | Single Number |
| Sorting | `problems/sorting` | Sort Colors |
| Searching | `problems/searching` | Search in Rotated Array |
| Backtracking | `problems/backtracking` | Subsets |
| Greedy | `problems/greedy` | Jump Game |
| Math | `problems/math` | Reverse Integer |
| Trie | `problems/trie` | Implement Trie |

