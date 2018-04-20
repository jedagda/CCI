# Chapter 1 Problem 3

URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)

## IDEAL 
 <table style="width:100%">
  <tr>
    <td><B>I:</B></td>
   <td>Given a string, for every space in the string replace it with %20 </td>
    <tr>
    <td><B>D:</B></td>
    <td>The goal is to return a string that replaces it's spaces for %20</td>
  </tr>
  <tr>
    <td><B>EA:</B></td>
    <td>The first steps I took to tackle this problem is that I had to figure out first how to enter the modified character array into a new string, and making sure it had enough space to take in the character array. First I used pen an paper and had to find a way to count the spaces within a string, and if there is more than one space adjucted to each other it would still be counted as one space. I figured that the best way to approach this problem is to count all the spaces in the character array starting from the end of the string going backwards. At the same time we will be counting the true length of the string which is counting every space and character. Once the space an true true length has been calculated we will multiply the space count times 2 and add it to the true length. The true length determines the amount of space that we need to alocate for the character array. The next step we need to replace every space for %20.</td>
  </tr>
  <tr>
    <td><B>L:</B></td>
    <td>Depending on the problem, sometimes it may be better to work backwards.</td>
  </tr>
</table> 

## Authors

* **Joshua Dagda** - *Initial work* - [jedagda](https://github.com/jedagda)

