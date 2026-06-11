# Learning Journal

## Day 1 (2026-06-09)

### Accomplishments
- Created GitHub repository
- Installed and configured IntelliJ
- Imported repository into IntelliJ
- Fixed JDK/build configuration issues
- Made first commit and push to GitHub

### Confidence Level
Git: 3/10
IntelliJ: 2/10

### Next Goal
- Start Java Collections

# Learning Journal

## 2026-06-10 (Day 2)

### Topics Studied

* ArrayList
* LinkedList
* HashMap
* Big O Notation
* equals()
* hashCode()

---

### Key Learnings

#### ArrayList

* ArrayList is implemented using a dynamic array.
* Elements are stored in order and can be accessed directly by index.
* `get(index)` is O(1) because Java can directly calculate the element's position.
* Inserting in the middle is O(n) because elements after the insertion point must be shifted.

#### LinkedList

* LinkedList is implemented using nodes connected by references.
* Elements do not need to be stored next to each other in memory.
* `get(index)` is O(n) because Java must traverse nodes to reach the target index.
* Insertions and deletions can be efficient when the target node is already known.

#### HashMap

* HashMap stores data as key-value pairs.
* HashMap uses buckets to organize entries.
* A bucket can be thought of as a drawer inside a cupboard.
* `hashCode()` determines which bucket should be searched.
* `equals()` is used to identify the correct key within a bucket.
* Hash collisions occur when multiple keys are assigned to the same bucket.
* More buckets generally reduce collisions.
* HashMap resizes to maintain good performance as more entries are added.

#### Big O Notation

* Big O describes how performance changes as the amount of data grows.
* It is not about exact execution time.
* O(1) means the work stays roughly constant regardless of size.
* O(n) means the work grows with the number of elements.

---

### Most Important Insight

HashMap first uses `hashCode()` to locate the correct bucket and then uses `equals()` to identify the exact key inside that bucket.

---

### Experiments Completed

#### ArrayList vs LinkedList

Created and ran a program that:

* Added elements to both collections
* Retrieved elements
* Inserted elements at a specific position
* Observed identical outputs despite different internal implementations

#### equals() and hashCode()

Created a User class experiment.

Before overriding:

```text
u1.equals(u2) = false
map.get(u2) = null
```

After overriding:

```text
u1.equals(u2) = true
map.get(u2) = Developer
```

Key takeaway:

* Equal objects must produce the same hashCode.
* HashMap relies on both hashCode() and equals() to retrieve values correctly.

---

### What I Can Explain Now

* ArrayList vs LinkedList
* Why ArrayList `get(index)` is O(1)
* Why LinkedList `get(index)` is O(n)
* HashMap buckets
* Hash collisions
* Basic Big O notation
* equals() vs hashCode()
* Why equal objects must have the same hashCode
* Why HashMap resize operations are expensive

---

### Things Still Unclear

* Detailed HashMap implementation in Java source code
* Collision handling implementation details
* Treeification (Java 8+ bucket optimization)
* Internal resizing algorithm

---

### Confidence Level

| Topic           | Confidence |
| --------------- | ---------- |
| ArrayList       | 7/10       |
| LinkedList      | 7/10       |
| HashMap         | 6/10       |
| Big O           | 6/10       |
| equals()        | 6/10       |
| hashCode()      | 6/10       |
| Git Basics      | 5/10       |
| IntelliJ Basics | 5/10       |

---

### Next Topic

1. Process vs Thread
2. Race Conditions
3. synchronized
4. volatile
5. AtomicInteger

---

### Reflection

At the start of this journey, I rated my understanding of Java Core concepts as 0.

By the end of Day 2, I can explain the fundamentals of collections, HashMap behavior, Big O basics, and the relationship between equals() and hashCode(). I also successfully set up a Java development environment using IntelliJ, connected it to GitHub, committed changes, and pushed code to a remote repository.


## Day 3 (2026-06-11)

### Topics Studied

- Process vs Thread
- Shared Memory
- Race Conditions
- synchronized
- AtomicInteger
- volatile
- Heap
- Stack
- References
- Garbage Collection Basics

---

### Key Learnings

#### Process vs Thread

- A process is a running program.
- A thread is a unit of execution within a process.
- One process can contain multiple threads.
- Threads within the same process share memory and resources.

#### Shared Memory

- Threads can access the same objects in memory.
- Shared memory makes communication between threads easier.
- Shared memory can also introduce concurrency issues.

#### Race Conditions

- Race conditions occur when multiple threads modify shared data simultaneously.
- Operations like `counter++` are not atomic.
- `counter++` consists of:
    - Read
    - Add 1
    - Write
- Multiple threads can overwrite each other's updates.

#### synchronized

- synchronized uses a lock to protect critical sections of code.
- Only one thread can execute a synchronized block at a time.
- Other threads must wait until the lock is released.
- synchronized prevents race conditions.

#### AtomicInteger

- AtomicInteger provides thread-safe operations on integers.
- `incrementAndGet()` performs the entire increment operation atomically.
- AtomicInteger is commonly used for counters.
- AtomicInteger can often replace synchronized for simple numeric updates.

#### volatile

- volatile solves visibility problems between threads.
- Changes made by one thread become visible to other threads immediately.
- volatile does NOT prevent race conditions.
- volatile does NOT make `counter++` atomic.

#### Heap and Stack

- Primitive local variables are stored on the stack.
- References are stored on the stack.
- Objects created with `new` are stored in the heap.
- Multiple references can point to the same object.

Example:

```java
User u1 = new User();
User u2 = u1;
```

- One object exists in the heap.
- Two references point to it.

#### Garbage Collection

- Objects become eligible for garbage collection when no reachable references point to them.
- Java automatically reclaims unused heap memory.
- Developers do not manually free memory.

---

### Most Important Insight

Threads are powerful because they share memory, but that same shared memory is what creates race conditions. Java provides different tools for different concurrency problems:

- synchronized → Mutual exclusion
- AtomicInteger → Atomic updates
- volatile → Visibility

---

### What I Can Explain Now

- Process vs Thread
- Why threads are cheaper than processes
- Shared memory
- Race conditions
- Why `counter++` is not atomic
- How synchronized works
- What AtomicInteger solves
- What volatile solves
- Difference between heap and stack
- How Java garbage collection works at a basic level

---

### Experiments Planned

#### Concurrency

- ThreadCreationDemo.java
- RaceConditionDemo.java
- SynchronizedDemo.java
- AtomicIntegerDemo.java
- VolatileDemo.java

Goal:
- Observe race conditions in practice.
- Compare synchronized and AtomicInteger.
- Verify volatile visibility behavior.

---

### Confidence Level

| Topic | Confidence |
|---------|---------|
| Process vs Thread | 7/10 |
| Shared Memory | 7/10 |
| Race Conditions | 7/10 |
| synchronized | 6/10 |
| AtomicInteger | 6/10 |
| volatile | 6/10 |
| Heap vs Stack | 6/10 |
| Garbage Collection Basics | 5/10 |

---

### Things Still Unclear

- JVM internals
- Metaspace
- JIT Compiler
- Garbage Collector implementation details
- Lock implementation inside the JVM

---

### Next Topic

1. Concurrency Coding Experiments
2. JVM Architecture
3. Metaspace
4. JIT Compiler
5. Garbage Collection Internals

---

### Reflection

Today I learned the foundations of Java concurrency. I can explain why race conditions occur, why synchronized works, and when AtomicInteger or volatile should be used instead.

I also learned how Java memory is organized into stack and heap memory and how garbage collection removes objects that are no longer reachable.

The next step is to reinforce these concepts by implementing small concurrency experiments and observing their behavior directly in code.