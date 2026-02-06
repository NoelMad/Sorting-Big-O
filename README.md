# Sorting Algorithm Analysis (Insertion, Selection, Bubble Sort)

## Project Description
This project implements and analyzes three classic sorting algorithms:

- Insertion Sort
- Selection Sort
- Bubble Sort

Each algorithm was modified to count:

- Number of comparisons
- Number of swaps (or moves)

The goal of this project is to compare how each algorithm performs with different types of input data and array sizes.

---

## Algorithms Implemented

### 1. Insertion Sort
Insertion sort builds a sorted portion of the array by inserting elements into their correct position.

- Best Case: O(n)
- Worst Case: O(n²)

---

### 2. Selection Sort
Selection sort repeatedly finds the smallest element and places it in the correct position.

- Best Case: O(n²)
- Worst Case: O(n²)

---

### 3. Bubble Sort
Bubble sort repeatedly swaps adjacent elements if they are in the wrong order.

- Best Case: O(n) (with optimization)
- Worst Case: O(n²)

---

## Input Types Tested

Each sorting algorithm was tested using three types of arrays:

1. Increasing Order (Already Sorted)
2. Random Order
3. Reverse Order

---

## Array Sizes Tested

- 100
- 1,000
- 10,000

---

## Output
The program prints a table showing:

- Algorithm name
- Input type
- Number of comparisons
- Number of swaps

---

## Performance Analysis

### Insertion Sort
- Performs best when the array is already sorted.
- Requires very few swaps in this case.

### Selection Sort
- Performs the same regardless of input order.
- Always makes the same number of comparisons.
- Usually makes fewer swaps than bubble sort.

### Bubble Sort
- Performs well only when the array is already sorted.
- Performs poorly on reverse ordered arrays due to many swaps.

---

## Overall Conclusion
Insertion sort is generally the most efficient for nearly sorted data.  
Selection sort is predictable but inefficient because it always checks every element.  
Bubble sort is typically the least efficient, especially for large or reverse sorted arrays.

---

## How to Run

### Compile
