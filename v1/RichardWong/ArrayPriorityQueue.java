//james huang and richard wong--Team QueueUp
//2018-05-09
//HW #46: Arrr, There Be Priorities Here Matey
//brown apcs pd01

import java.util.ArrayList;

public class ArrayPriorityQueue {
    //instance variables
    ArrayList<String> _data=new ArrayList<String>();
    
    //methods
    //add has a runtime of O(1), as dictated by the JAVA API.
    //it works by adding to the end of the arrayList.
    public void add(String x) {
	_data.add(x);
    }
    
    //removeMin has a runtime of O(n)
    public String removeMin() {
	if (isEmpty()) {
	    return null;
	}
	
	int index=0;
	String toRemove=_data.get(0);//default setting is remove first one

	for(int i=0; i<_data.size(); i++) {
	    if(toRemove.compareTo(_data.get(i))>0) {//if current string is less than reighning champ
		toRemove=_data.get(i);//reigning champ
		index=i;
	    }
	}
	
	_data.remove(index);
	return toRemove;
    }
    
    //peekMin has a runtime of O(n)
    public String peekMin() {
	if (isEmpty()) {
	    return null;
	}
	
	String min=_data.get(0);//default setting is first one

	for(int i=0; i<_data.size(); i++) {
	    if(min.compareTo(_data.get(i))>0) {//if the current string is less than the reigning champ...
		min=_data.get(i);//reigning champ
	    }
	}

	return min;
    }
    
    public boolean isEmpty() {
	return _data.size()<=0;
    }
    
    public static void main(String[] args) {
	ArrayPriorityQueue test=new ArrayPriorityQueue();
	test.add("a");
	System.out.println(test.peekMin());//a
	test.add("b");
	test.add("c");
	test.add("d");
	System.out.println(test.removeMin());//a
	System.out.println(test.removeMin());//b
	System.out.println(test.removeMin());//c
	test.add("a");
	System.out.println(test.removeMin());//a

    }
}
