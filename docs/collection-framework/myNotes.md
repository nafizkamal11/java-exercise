[6. Extending Collection with Set, SortedSet and NavigableSet.md](devJava/6.%20Extending%20Collection%20with%20Set%2C%20SortedSet%20and%20NavigableSet.md)
    
![img.png](img.png)


[8. Storing Elements in Stacks and Queues.md](devJava/8.%20Storing%20Elements%20in%20Stacks%20and%20Queues.md)

![img_2.png](img_2.png)

[9. Using Maps to Store Key Value Pairs.md](devJava/9.%20Using%20Maps%20to%20Store%20Key%20Value%20Pairs.md)

### Map Hierarchy

![img_5.png](img_5.png)

### Using the Convenience Factory Methods for Collections to Create Maps

![img_7.png](img_7.png)

### Exploring the Map interface

- `getKey()`
- `getValue()`
- `setValue(value)`

[10. Managing the Content of a Map.md](devJava/10.%20Managing%20the%20Content%20of%20a%20Map.md)

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