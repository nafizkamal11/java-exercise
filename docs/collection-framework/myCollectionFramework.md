## [1. Storing Data Using the Collections Framework.md](devJava/1.%20Storing%20Data%20Using%20the%20Collections%20Framework.md)

- Introducing the Collections Framework

  ![img_9.png](img_9.png)

- Finding Your Way in the Collections Framework

  ![img_10.png](img_10.png)  

- Avoiding Using Old Interfaces and Implementations

  ![img_11.png](img_11.png)

- Why Choose a Collection Over an Array?

  - capacity is not limited 
  - can control what elements you may store in it. 
  - provides operations like intersecting or merging with another collection. 
  - a collection is an object and given that an object is extensible,
    can add any operation on most of the collections provided by the JDK.
    It is not possible to do this with an array, because an array is not an object in Java.

## [2. Getting to Know the Collection Hierarchy.md](devJava/2.%20Getting%20to%20Know%20the%20Collection%20Hierarchy.md)

- Avoiding Getting Lost in the Collection Hierarchy

  ![img_18.png](img_18.png)

- The Iterable Interface
  - ← Collection
  - Java SE 5 (2004) along with the for each pattern of code
  - object that implements Iterable is an object that can iterate over.

      ```java
      Collection<String> collection = ...;
      for (String element: collection) {
      // do someting with element
      }
      ```

  - To implement the Iterable interface

    need to provide an instance of another interface, Iterator

- Storing Elements in a Container with the Collection Interface

  - Collection ← Set, List

- Extending Collection with List
  - List remembers in what order its elements have been added.

    Querying a list for its first element does make sense, since a list does remember that.

  - do not have this guarantee with a plain Collection nor for a Set.

    Querying a collection for its *first* element does not make sense.

- Extending Collection with Set
  - you cannot have duplicates in a Set.
  - adding an element to a Set may fail.
- Sorting the element of a Set with SortedSet and NavigableSet
  - Set ← SortedSet ← NavigableSet
  - SortedSet
    - Iterating from the lowest element to the greatest.
    - can extract a headSet and a tailSet of all the elements lesser than, or greater than a given element.
  - NavigableSet
    - the possibility to iterate over the elements in the descending order.


## [6. Extending Collection with Set, SortedSet and NavigableSet.md](devJava/6.%20Extending%20Collection%20with%20Set%2C%20SortedSet%20and%20NavigableSet.md)
    
![img.png](img.png)


## [8. Storing Elements in Stacks and Queues.md](devJava/8.%20Storing%20Elements%20in%20Stacks%20and%20Queues.md)

![img_2.png](img_2.png)

## [9. Using Maps to Store Key Value Pairs.md](devJava/9.%20Using%20Maps%20to%20Store%20Key%20Value%20Pairs.md)

### Map Hierarchy

![img_5.png](img_5.png)

### Using the Convenience Factory Methods for Collections to Create Maps

![img_7.png](img_7.png)

### Exploring the Map interface

- `getKey()`
- `getValue()`
- `setValue(value)`

## [10. Managing the Content of a Map.md](devJava/10.%20Managing%20the%20Content%20of%20a%20Map.md)

- **Adding a Key Value Pair to a Map**
    - put(k, v)
    - putIfAbsent(k, v)
- **Getting a Value From a Key**
    - getKey(k)
    - getOrDefault(k,"default")
- **Removing a Key from a Map**
    - remove(k)
    - remove(k,v)
- **Checking for the Presence of a Key or a Value**
    - containsKey(k)
    - containsValue(v)
- **Checking for the Content of a Map**
    - isEmpty
    - size()
    - clear()
    - putAll(oMap)
- **Getting a View on the Keys, the Values or the Entries of a Map**
    - keySet()
    - entrySet()
    - values()
- **Removing a Key From the Set of Keys**
    - keySet().remove(o)
- **Removing a Value From the Collection of Values**
    - values().remove(o)

      - Removing a value is not as simple because a value can be found more than once in a map. In that case, removing a value from the collection of values just removes the first matching key/value pair.

      - need to be careful in this case because if the implementation you chose is a HashMap, you cannot tell in advance what key/value pair will be found.

    - best choice is to iterate directly on the set of key/value pairs

        ```java
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
        	System.*out*.println("entry = " + entry);
        }
        ```