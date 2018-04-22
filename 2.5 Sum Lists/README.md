
# Chapter 2 Problem 5

Sum Lists: You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.

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





