# Sorting Algorithms in Java

## Table of Contents
- Overview
- Algorithms Included
- Explanations and Analysis
- Complexity Comparison

## Overview

### This project serves as a reference for different sorting algorithms implemented in Java. Each algorithm is explained in detail, including how it functions, the steps involved, and its time and space complexity. The goal is to provide not just the code, but also insights into the behavior and efficiency of these algorithms.

## Algorithms Included

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort

## Explanations and Analysis

### Bubble Sort
Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted. The name comes from the fact that the smaller elements "float" or "bubble up" to the top.

- **Time Complexity**: O(n²) in the worst and average cases.
- **Space Complexity**: O(1) since it is an in-place algorithm.
- **When to Use**: Simple to implement but inefficient for large datasets. It is often used as an educational tool.

### Selection Sort
Selection Sort divides the list into a sorted and unsorted part. It repeatedly selects the smallest element from the unsorted portion and swaps it with the leftmost unsorted element.

- **Time Complexity**: O(n²) in all cases.
- **Space Complexity**: O(1) since it is also an in-place algorithm.
- **When to Use**: Inefficient on large lists but useful when memory is limited.

### Insertion Sort
Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is like sorting playing cards in your hands. You split the cards into two groups: the sorted cards and the unsorted cards.

- **Time Complexity**: O(n²) in the worst case, but O(n) in the best case when the list is nearly sorted.
- **Space Complexity**: O(1).
- **When to Use**: Efficient for small or nearly sorted datasets.

### Merge Sort
Merge Sort is a divide-and-conquer algorithm that continuously cuts down a list into multiple sublists until each has only one item, then merges those sublists into a sorted list.

- **Time Complexity**: O(n log n) in all cases.
- **Space Complexity**: O(n) due to auxiliary space used during merging.
- **When to Use**: Great for large datasets, stable sorting algorithm.

### Quick Sort
Quick Sort is another divide-and-conquer algorithm that picks a a pivot element and then sorting values larger than it on one side and smaller to the other side, and then it repeats those steps until the array is sorted.

- **Time Complexity**: O(n log n) on average, but O(n²) in the worst case.
- **Space Complexity**: O(log n) for in-place implementations.
- **When to Use**: Highly efficient for large datasets, but performance depends on the pivot selection.

## Complexity Comparison

| Algorithm      | Time Complexity (Best) | Time Complexity (Average) | Time Complexity (Worst) | Space Complexity | Stability |
|----------------|------------------------|---------------------------|-------------------------|------------------|-----------|
| Bubble Sort    | O(n)                    | O(n²)                     | O(n²)                   | O(1)             | Stable    |
| Selection Sort | O(n²)                   | O(n²)                     | O(n²)                   | O(1)             | Unstable  |
| Insertion Sort | O(n)                    | O(n²)                     | O(n²)                   | O(1)             | Stable    |
| Merge Sort     | O(n log n)              | O(n log n)                | O(n log n)              | O(n)             | Stable    |
| Quick Sort     | O(n log n)              | O(n log n)                | O(n²)                   | O(log n)         | Unstable  |

