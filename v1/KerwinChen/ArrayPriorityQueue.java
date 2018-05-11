//Hasif Ahmed, Kerwin Chen
//APCS2 pd1
//HW #46: Arrr, There Be Priorities Here Matey
//2018-05-10
import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

  private ArrayList<String> _queue;

  public ArrayPriorityQueue(){
    _queue = new ArrayList<String>();
  }


  //O(1) - amortized constant time
  //utilizes the .add() method of arraylist
  public void add(String s){
    _queue.add(s);
  }


  //O(1)
  //true if empty, false if not
  public boolean isEmpty(){
    return _queue.isEmpty();
  }


  //O(n)
  //Peek into smallest item in _queue
  public String peekMin(){
    String tp = _queue.get(0); //variable to hold next element to compare with min
    String min = tp; //variable to hold smallest
    for(int i = 1; i < _queue.size(); i++){
      tp = _queue.get(i);
      if(tp.compareTo( min ) <= 0) { //if value in tp is smaller or the same as the min
        min = tp; //update value of min to tp
      }
    }
    return min; //smallest
  }


  //O(n)
  //peekMin() and then removes the min from _queue
  public String removeMin(){
    return _queue.remove( _queue.indexOf( peekMin() ) );
  }

  public String toString(){
    return _queue.toString();
  }

  public static void main(String[] args){

    ArrayPriorityQueue test = new ArrayPriorityQueue();
    test.add("Hello");
    test.add("There");
    test.add("Kerwin");
    test.add("Hasif");

    System.out.println("Priority Queue: " + test);
    System.out.println("Min: "  + test.peekMin());
    test.removeMin();
    System.out.println("Priority Queue: " + test); //[moo]



  }

} //end class
