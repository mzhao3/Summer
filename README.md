# Summer

## Maggie Zhao, Richard Wong, Kerwin Chen
### APCS2 pd01

We both decided to follow API specifications in regards to run time. 

[Current best version](v2/ArrayPriorityQueue.java)

`public void add(String x)`
  has O(1) runtime for both worst and average case scenarios. Following this, we added to the end of our priority queues.
  
`public boolean isEmpty()`
  has O(1) runtime, as you just check the size of the queue. 
  
`public String peekMin()`
  has O(n) runtime. We implemented this by iterating through the array to find the minimum. 
  
`public String removeMin()`
  has O(n) runtime. We implemented this by iterating through the array to find the index of the smallest value, and then removing it. 

##### heap todo
1. `isEmpty`
2. `peekMin`
3. `toString`
4. `add`
5. `minChildPos`
6. `removeMin`
