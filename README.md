# Onboarding-Staging-Challenges

## October

### Week Oct. 11 - 16
#### Java
1. Write a Java Program to iterate HashMap using While and advance for loop. 
2. Write a program which accepts two given String and checks if they are the rotation of each. If they then return true otherwise return false. A String is said to be a rotation of other string if they contain same characters and the sequence is rotated across any character, e.g. "dabc" is a rotation of "abcd" but "dbac" is not. 

--- 

### Week Oct. 18 - 22
#### Java
1. The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc. 
   - Create a function that takes a string and applies the Atbash cipher to it. 
   - Examples 
  ```
  atbash("apple") --> "zkkov" 
  atbash("Hello world!") --> "Svool dliow!" 
  atbash("Christmas is the 25th of December") --> "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi" 
  ```
- Notes: 
  - Capitalisation should be retained. 
  - Non-alphabetic characters should not be altered. 


#### JavaScript: 
1. This robot roams around a 2D grid. It starts at (0, 0) facing North. After each time it moves, the robot rotates 90 degrees clockwise. Given the amount the robot has moved each time, you have to calculate the robot's final position. 
   - To illustrate, if the robot is given the movements 20, 30, 10, 40 then it will move: 
 
  ```
  20 steps North, now at (0, 20) 
  30 steps East, now at (30, 20) 
  10 steps South. now at (30, 10) 
  40 steps West, now at (-10, 10) 
  ...and will end up at coordinates (-10, 10). 
  ```

   - Examples: 
 
    ```
    trackRobot(20, 30, 10, 40) --> [-10, 10]
    trackRobot() --> [0, 0] 
    // No movement means the robot stays at (0, 0). 
    trackRobot(-10, 20, 10) --> [20, -20] 
    // The amount to move can be negative. 
    ```
   - Notes: 
     - Each movement is an integer (whole number). 

2. Create a function that takes the dimensions of two triangles (as arrays) and checks if the first triangle fits into the second one. 
   - Examples: 
  
  ```
  doesTriangleFit([1, 1, 1], [1, 1, 1]) ➞ true 
  doesTriangleFit([1, 1, 1], [2, 2, 2]) ➞ true 
  doesTriangleFit([1, 2, 3], [1, 2, 2]) ➞ false 
  doesTriangleFit([1, 2, 4], [1, 2, 6]) ➞ false 
  ```

   - Notes: 
     - Triangle fits if it has the same or smaller size as the hole. 
     - The function should return false if the triangle with that dimensions is not possible. 
