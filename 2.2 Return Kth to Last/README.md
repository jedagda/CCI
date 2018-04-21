# Chapter 2 Problem 2

Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.

## IDEAL 
 <table style="width:100%">
  <tr>
    <td><B>I:</B></td>
   <td>Find the kth to last element of a singly linked list</td>
    <tr>
    <td><B>D:</B></td>
    <td>Load the values into a HashSet, if the value is containted into the hash set delete it</td>
  </tr>
  <tr>
    <td><B>EA:</B></td>
    <td> Since using a Hash Set the problem was fairly straight forward. I wrote by hand that we have to use an empty linked list, and a hash set to solve this problem. If the value of the linked list is not contained in the set then we add it to the set. If it is contained we just taverse through the linked list. Then we return the helper linked list</td>
  </tr>
  <tr>
    <td><B>L:</B></td>
    <td>This problem helped me in understanding the importance of helper data structures</td>
  </tr>
</table> 

## Authors

* **Joshua Dagda** - *Initial work* - [jedagda](https://github.com/jedagda)




