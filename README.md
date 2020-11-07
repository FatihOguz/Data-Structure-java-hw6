# Data-Structure-java-hw6
Q1:
* A is an ordered integer array with 10 elements from small to large
* B is an ordered integer array with 10 elements from large to small
* C = {5, 2, 13, 9, 1, 7, 6, 8, 1, 15, 4, 11}
* D = {‘S’, ‘B’, ‘I’, ‘M’, ‘H’, ‘Q’, ‘C’, ‘L’, ‘R’, ‘E’, ‘P’, ‘K’}
Apply the following sorting algorithms for the given arrays.
- Shell Sort
- Merge Sort
- Heap Sort
- Quick Sort
Show your works step by step and make explanation. Express how many comparisons and how many
displacements have been made for each. Write your solution by latex or word and upload it as a
StudentNumber.pdf file.
Q2:
Implement Quick Sort and Merge Sort algorithms. Suppose the data is stored in a linked list. You
should use LinkedList class in Java.
In the book, there are methods for 7 algorithms which are
- Selection Sort
- Bubble Sort
- Insertion Sort
- Shell Sort
- Merge Sort
- Heap Sort
- Quick Sort
Compare your implementation with the methods in the book. To do this, you must create 100 (20 of
each) random and 5 (1 of each) sorted arrays/linked lists with a length of ten thousand (10000), forty
thousand (40000), one hundred thousand (100000), one hundred and fifty thousand (150000) and one
hundred and eighty thousand (180000). Run all 9 methods for each, save run times and expected run
times in excell, and draw graphs for each method. Run times and expected run times should be drawn
on the same graphic.
Q3:
Design a library automation system. The system has two types of users: administrators who can update
information and users who browse books.
Book search is a public feature. To update the information, administrators have to enter the system with
a password (a single general password is sufficient).
While designing this system, realize the following: In the system, for each book, the name of the
author, the title of the book, the location of the book (for example, if a book on the 5th shelf in the 3rd
corridor, such as "c3s5.1534" can be used) should be stored. Information about the books should be
stored in nested map and set data structures. For the outermost map, the author name is used as a key,
the value is another map whose keys are book names. In the inner map, the values are sets showing the
location (or locations if there is more than one copy) of that book.
The system should include at least the following functionality:
1. When searching by author name, all books of the author in the library will be listed on the screen.
Then, whichever book the user chooses, the location(s) of that book will be displayed.
2. When searching by book title, author name, location and status will be shown.
3. When the administrator enters the system with a password, he will be able to add books, delete
books, update information.
Q4:
Implement KWHashMap interface in the book using the following hashing methods to organize hash
tables:
a) In chaining is a technique, each table element references a linked list that contains all the items that
hash to the same table index. Use chaining with binary tree instead of linked list.
b) In open addressing, if the table entry is full, subsequent probe locations are calculated using linear
probing (hash(x) +i) or quadratic probing (hash(x) + i^2) methods. Use an alternative probing method
called double hashing where a second hash function is used to calculate subsequent probe locations
(hash(x) + i*second_hash(x)).
Compare the performance of your implementations with HashTableOpen and HashTableChain classes
in the book. Note that you should generate large maps of several entries and perform several random
operations to compare the performance of the methods. Report your experimental evaluation using
tables and graphs. 
