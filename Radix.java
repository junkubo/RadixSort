import java.lang.Math;
public class Radix {
  public static int nth(int n, int col) {
    String nStr = String.valueOf(n);
    char c = nStr.charAt(col);
    int xx = Character.getNumericValue(c);
    return xx;
  }
  public static int length(int n) {
    String nStr = String.valueOf(n);
    int xx = nStr.length();
    return xx;
  }
  public static void merge(MyLinkedList original, MyLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
      System.out.println("size = : " + original.size());
      System.out.println(original.toString());
    }
    System.out.println(original.toString());
  }
}
