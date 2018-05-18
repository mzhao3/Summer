
/*****************************************************
 * class RunMed
 * Using a maxHeap and a minHeap, finds the running median
 * Algorithm:
 *    1. if next value is greater than root of maxHeap, add to maxHeap
 *           else add to minHeap
 *    2. balance heaps (size difference < 2)
 *           remove from larger heap, add to smaller until balanced
 *    3. at any time, find med by
 *           a) heap sizes equal: med is mean of roots
 *           b) heap sizes !equal: med is root of larger heap

 *****************************************************/


public class RunMed {
    private ALHeapMin lilVals;
    private ALHeapMax bigVals;


    public RunMed() {
      lilVals = new ALHeapMin();
      bigVals = new ALHeapMax();
    }

// returns median or throws NoSuchElementException()
    public double getMedian(int[] input) {
      double median = 0;
      for (int i = 0; i < input.length; i ++)
        add(input[i]);

      if (bigVals.getSize() > lilVals.getSize())
        median = bigVals.peekMax();
      else if (bigVals.getSize() < lilVals.getSize())
        median = lilVals.peekMin();
      else
        median = ((bigVals.peekMax() + lilVals.peekMin()) / 2);

      return median;
    }


// adds newVal to appropriate heap, balances if necessary
    public void add(Integer newVal) {
      if (newVal < bigVals.peekMax())
        bigVals.add(newVal);
      else
        lilVals.add(newVal);

      while (bigVals.getSize() - lilVals.getSize() >= 2) {
        lilVals.add(bigVals.removeMax());
      }

      while (lilVals.getSize() - bigVals.getSize() >= 2 ) {
        bigVals.add(lilVals.removeMin());
      }
    }


    public static void main (String[] args) {
      RunMed richard = new RunMed();
      richard.getMedian(new int[] {1,6,4});
    }

}
