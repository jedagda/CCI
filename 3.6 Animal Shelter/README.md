# Chapter 3 Problem 6

Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
that type). They cannot select which specific animal they would like. Create the data structures to
maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
and dequeueCat. You may use the built-in Linked List data structure.

## IDEAL 
 <table style="width:100%">
  <tr>
    <td><B>I:</B></td>
   <td>Create a queue that holds the values of dogs or cats</td>
    <tr>
    <td><B>D:</B></td>
    <td>Have a queue that holds the values of dogs or cats, is able to dequeue from the queue or dequeue a dog or a cat</td>
  </tr>
  <tr>
    <td><B>EA:</B></td>
    <td> A linked list was implemented for this Queue, and figured that if the user is looking for a cat, but the cat is not at the head of the queue then the program would have to traverse through the queue until it finds a cat and dequeues it from the list.</td>
  </tr>
  <tr>
    <td><B>L:</B></td>
    <td>This problem allowed me to build a queue from scratch allowing me to decide how the queue would behave.</td>
  </tr>
</table> 

## Authors

* **Joshua Dagda** - *Initial work* - [jedagda](https://github.com/jedagda)


