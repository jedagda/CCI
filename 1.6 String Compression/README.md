# Chapter 1 Problem 5

String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

## IDEAL 
 <table style="width:100%">
  <tr>
    <td><B>I:</B></td>
   <td>Write a method that takes in a string, counts any repeated characters that are right next to each other and returns another string with the charatcter and the number of characters that are right next to each other. </td>
    <tr>
    <td><B>D:</B></td>
    <td>Identify the characters and count the characters that are repeated. Return the modified string if it is shorter or equal than the original string length.</td>
  </tr>
  <tr>
    <td><B>EA:</B></td>
    <td>I ran into several probem with this string modification, I had to re-write the problem about 3 times until I got it right. At first I wrote the problem by hand using simple strings such as abc which should be modified to a1b1c1. I wrote the instances by hand, I wrote the code by hand, and whenever I would run into a problem, I would debug the code by tracing it by hand. Up until now the problem works correctly except it does not take into account the last character. </td>
  </tr>
  <tr>
    <td><B>L:</B></td>
    <td>This problme showed me the importance of tracing</td>
  </tr>
</table> 

## Authors

* **Joshua Dagda** - *Initial work* - [jedagda](https://github.com/jedagda)


