# Chapter 2 Problem 3

Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.

## IDEAL 
 <table style="width:100%">
  <tr>
    <td><B>I:</B></td>
   <td>Delete the middle node, or delete anynode other than the first or the last</td>
    <tr>
    <td><B>D:</B></td>
    <td>Firgure out what the size of the linked list is, then delete the middle</td>
  </tr>
  <tr>
    <td><B>EA:</B></td>
    <td> Since I was using a generic linked list this problem was fairly straight forward since the generic linked list already had a method that checks the size of the linked list. If the the size of the linked list size is greater than 2, then we remove the middle node by traversing tthrough the linked list until it reaches half of it's total size. </td>
  </tr>
  <tr>
    <td><B>L:</B></td>
    <td>The importance of knowing the methods that are available for the generic data structures</td>
  </tr>
</table> 

## Authors

* **Joshua Dagda** - *Initial work* - [jedagda](https://github.com/jedagda)





