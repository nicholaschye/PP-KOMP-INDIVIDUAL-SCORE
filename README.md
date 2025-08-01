# Cheating Detection System

This project is a simple Java console application that detects suspiciously identical score submissions among students. It calculates the total score of each submission and flags any matching submissions as suspected cheating.

## Purpose

This program was created as part of a competitive Java programming practice. It reinforces skills in:

- Input parsing  
- String processing  
- Array handling  
- Logic for duplicate detection

## Features

- Accepts multiple score submissions  
- Computes total score for each submission  
- Flags submissions with identical score patterns (excluding zero scores)  
- Outputs either the total score or a warning message

## Sample Input & Output

```
Input:
4
10 20 30
5 10 15
10 20 30
0 0 0

Output:
suspected to have discussed or cheating or allow cheating
30
suspected to have discussed or cheating or allow cheating
0
```

## How to Run

1. Save the code in a file named `Solution.java`.
2. Open terminal or command prompt in the file location.
3. Compile using `javac Solution.java`.
4. Run with `java Solution`.
5. Enter the number of submissions followed by each score line.

## Project Structure

```
CheatingDetection/
├── Solution.java
└── README.md
```

## Author

Nicholas Chye  
Diploma in Information Technology  
Politeknik Kuching, Malaysia  
[GitHub: nicholaschye](https://github.com/nicholaschye)  
[LinkedIn: nicholas-wong-b98693331](https://www.linkedin.com/in/nicholas-wong-b98693331)

---

*This project is intended for learning and academic practice.*
