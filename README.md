# Sorting Algorithms in Java
### This repository contains implementations of several popular sorting algorithms, along with explanations of how they work
## Table of Contents
- Overview
- Algorithms Included
- Explanations and Analysis
- Complexity Comparison

## Overview

### This project serves as a reference for different sorting algorithms implemented in Java. Each algorithm is explained in detail, including how it functions, the steps involved, and its time and space complexity. The goal is to provide not just the code, but also insights into the behavior and efficiency of these algorithms.

## Algorithms Included

### The following sorting algorithms are included in this repository:
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort

## Explanations and Analysis

### Bubble Sort
Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

- **Time Complexity**: O(n²) in the worst and average cases.
- **Space Complexity**: O(1) since it is an in-place algorithm.
- **When to Use**: Simple to implement but inefficient for large datasets. It is often used as an educational tool.

### Selection Sort
Selection Sort divides the list into a sorted and unsorted part. It repeatedly selects the smallest element from the unsorted portion and swaps it with the leftmost unsorted element.

- **Time Complexity**: O(n²) in all cases.
- **Space Complexity**: O(1) since it is also an in-place algorithm.
- **When to Use**: Inefficient on large lists but useful when memory is limited.

### Insertion Sort
Insertion Sort builds the sorted list one element at a time by inserting each new element into its proper position.

- **Time Complexity**: O(n²) in the worst case, but O(n) in the best case when the list is nearly sorted.
- **Space Complexity**: O(1).
- **When to Use**: Efficient for small or nearly sorted datasets.

### Merge Sort
Merge Sort is a divide-and-conquer algorithm that divides the list into smaller sublists, sorts them, and then merges the sorted sublists.

- **Time Complexity**: O(n log n) in all cases.
- **Space Complexity**: O(n) due to auxiliary space used during merging.
- **When to Use**: Great for large datasets, stable sorting algorithm.

### Quick Sort
Quick Sort is another divide-and-conquer algorithm that picks a pivot element and partitions the list into two sublists, sorting each recursively.

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
| Quick Sort     | O(n log n)              | O(n log n)                | O(n²)     

