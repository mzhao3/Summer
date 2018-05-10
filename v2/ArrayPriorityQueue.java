// Maggie Zhao
// APCS2 pd1
// HW #46: Arrr, There Be Priorities Here Matey . . .
// 2018-05-10 R

import java.util.ArrayList;

public class ArrayPriorityQueue {

  private ArrayList<String> _data;

  public ArrayPriorityQueue() {
    _data = new ArrayList();
  }

// worst case: O(1) average case O(1)
  public void add(String x) {
    _data.add(x);
  }

// runtime: O(1)
  public boolean isEmpty() {
    return _data.size() == 0;
  }

// runtime: O(n)
  public String peekMin() {
    String min = _data.get(0);

    for ( String s  : _data) {
      if (s.compareTo(min) < 0 )
        min = s;
    }
    return min;
  }

// runtime: O(n)
  public String removeMin() {
    String min = _data.get(0);
    int minIndex = 0;

    for ( int i = 0; i < _data.size(); i ++) {
      if (_data.get(i).compareTo(min) < 0 ){
        min = _data.get(i);
        minIndex = i;
        //System.out.println(min + minIndex);
      }
    }
    _data.remove(minIndex);
    return min;
  }

  public static void main(String[] args) {
    ArrayPriorityQueue arr1 = new ArrayPriorityQueue();
    arr1.add("fullup");
    arr1.add("bumpdown");
    arr1.add("lib");
    arr1.add("prep");
    arr1.add("prone");
    arr1.add("invert");
    arr1.add("playoffs");

    System.out.println ("Is arr1 empty? " + arr1.isEmpty());

    System.out.println ("Smallest element: " + arr1.peekMin());
    System.out.println("Removing smallest element... " + arr1.removeMin());
    System.out.println ("Smallest element: " + arr1.peekMin());
    arr1.removeMin();
    System.out.println ("Smallest element: " + arr1.peekMin());
    arr1.removeMin();
    System.out.println ("Smallest element: " + arr1.peekMin());
    arr1.removeMin();
    System.out.println ("Smallest element: " + arr1.peekMin());
    arr1.removeMin();
    System.out.println ("Smallest element: " + arr1.peekMin());
    arr1.removeMin();
    System.out.println ("Smallest element: " + arr1.peekMin());
    arr1.removeMin();
    System.out.println ("Smallest element: " + arr1.peekMin());
  }


}
