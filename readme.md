# PROGRAMMING QUESTIONS

# 1. DATASTRUCTURE AND ALGORITHIM
# 2. COLLECTION
# 3. THREAD
# 4. OOPS
# 5. STRING

# CONCEPTUAL INTERVIEW QUESTIONS AND ANSWARS.
# 1. OOPS
Q1. What is OOPS concept?
Q2. What are association, aggregation, composition and dependency?
Q3. What is abstraction?
Q4. What is the difference between abstract class and interface?
Q5. What is the difference between interface and functional interface?

# COLLECTION
Q1. What is the difference between HashTable and HashMap?
Q2. What is the difference between ArrayList and LinkedList?
Q3. WHat is ConcurrentModificationException?
Q4. What is Fail Fast and Fail Safe operation?
Q5. Explain CopyOnWriteArrayList, CopyOnWriteArraySet and ConcurrentHashMap?

    * The internal implementation of CopyOnWriteArraySet is CopyOnWriteArrayList only.
    * Multiple Threads are able to perform update operation simultaneously but for every update operation, a separate cloned copy is  
      created. As for every update a new cloned copy will be created which is costly. Hence if multiple update operations are required 
      then it is not recommended to use CopyOnWriteArraySet.
    * While one thread iterating the Set, other threads can perform updation, here we won’t get any runtime exception like 
      ConcurrentModificationException.
    * An Iterator of CopyOnWriteArraySet class can perform only read-only and should not perform the deletion, otherwise, we will get 
      Run-time exception UnsupportedOperationException.
    * Use CopyOnWriteArraySet in applications in which set sizes generally stay small, read-only operations vastly outnumber mutative 
      operations, and you need to prevent interference among threads during traversal.
    * CopyOnWriteArraySet helps in minimizing programmer controlled synchronization steps and move the control to inbuilt, well tested 
      APIs.


Q6. How HashMap works internally?
Q7. 

# STRING

# 