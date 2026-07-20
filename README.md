# Longest Valid Parentheses

This repository contains a Java solution for the **Longest Valid Parentheses** problem.

## Problem Statement

Given a string containing only the characters `(` and `)`, return the length of the longest valid (well-formed) parentheses substring.

### Examples

**Input:** `"(()"`  
**Output:** `2`

**Input:** `")()())"`  
**Output:** `4`

**Input:** `""`  
**Output:** `0`

## Approach

The solution uses a **stack** to keep track of indices of unmatched parentheses.

- Push `-1` initially as a base index.
- Push the index of every `'('`.
- For every `')'`, pop the stack.
- If the stack becomes empty, push the current index as the new base.
- Otherwise, calculate the length of the current valid substring and update the maximum length.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

## Language

- Java
