# Chapter 1 Problem 2

Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.

## IDEAL 
 <table style="width:100%">
  <tr>
    <td><B>I:</B></td>
   <td>Write a method that compares two strings and can confirm whether one string is a rearrangement of characters from the other </td>
    <tr>
    <td><B>D:</B></td>
    <td>The goal is to figure out what a permutation is to see how we can solve this problem the most efficiently</td>
  </tr>
  <tr>
    <td><B>EA:</B></td>
    <td> First we want to see whether both strings match in length, if they dont match we return false. Since permutation deals with arrangements, the strings would have to essentially be rearranged. The strings are stored in separate character arrays and rearranged. Then every index of the arrays are compared to one another. If the Arrays, charatcters match then we return true, otherwise we return false.</td>
  </tr>
  <tr>
    <td><B>L:</B></td>
    <td>Sometimes we dont need a special data structure to solve an easy problem.  </td>
  </tr>
</table> 

## Authors

* **Joshua Dagda** - *Initial work* - [jedagda](https://github.com/jedagda)

