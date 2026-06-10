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
