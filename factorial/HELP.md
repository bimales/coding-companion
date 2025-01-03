# Factorial

The factorial of a non-negative integer
𝑛
n is the product of all positive integers less than or equal to
𝑛
n. It is denoted by
𝑛
!
n! (read as "n factorial").

Mathematical Definition
For
𝑛
≥
0
n≥0:

𝑛
!
=
𝑛
×
(
𝑛
−
1
)
×
(
𝑛
−
2
)
×
⋯
×
2
×
1
n!=n×(n−1)×(n−2)×⋯×2×1
Special case:

0
!
=
1
0!=1
(by definition).

Examples
5
!
=
5
×
4
×
3
×
2
×
1
=
120
5!=5×4×3×2×1=120
3
!
=
3
×
2
×
1
=
6
3!=3×2×1=6
1
!
=
1
1!=1
0
!
=
1
0!=1 (Special case)

### Explanation
Base Case:

Factorial of 0 or 1 is 1.
factorial(0) = 1
factorial(1) = 1
Recursive Case:

For any number n > 1, the factorial is:
factorial(n) = n * factorial(n - 1)
Input Validation:

If the user enters a negative number, a message is displayed since factorial is not defined for negative numbers.

### Edge Cases
Negative Input: The program gracefully handles negative numbers.
Large Input: For very large inputs, the program may throw an overflow error if the result exceeds the range of long.