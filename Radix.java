import java.lang.Math;
public class Radix {
  public static int nth(int n, int col) {
    String nStr = String.valueOf(n);
    if (col < nStr.length() && col >= 0) {
      char c = nStr.charAt(col);
      int xx = Character.getNumericValue(c);
      return xx;
    } else {
      return 0;
    }
  }

  public static int length(int n) {
    String nStr = String.valueOf(n);
    int xx = nStr.length();
    return xx;
  }
  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
      //System.out.println("size = : " + original.size());
      //System.out.println(original.toString());
    }
    //System.out.println(original.toString());
  }

  public static void radixSortSimple(SortableLinkedList data) {
    // get max width of integers

    int maxNum = 0;
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i) > maxNum) {
        maxNum = data.get(i);
      }
    }
    int maxWidth = length(maxNum);
    //System.out.println("Max width is: " + maxWidth);

    for (int i = 0; i < maxWidth ; i++) {
      //System.out.println("Starting loop =============== " + i);
      SortableLinkedList[] buckets = new SortableLinkedList[10];

      // create buckets in array of lists
      for (int ii = 0; ii < 10; ii++) {
        buckets[ii] = new SortableLinkedList();
      }

      //SortableLinkedList output = new SortableLinkedList();  don't do this.
      int temp_size = data.size();

      for (int j = 0; j < temp_size; j++) {
        int tmp = data.remove(0);
        int lenNum = length(tmp);
        int digit = nth(tmp, lenNum - i -1);
        //System.out.println("j is: " + j + " digit is: " + digit);
        buckets[digit].add(tmp);

      }

      merge(data, buckets);

    }

    //System.out.println("Final Result = " + data.toString());
  }
}
