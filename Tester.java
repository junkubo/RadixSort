public class Tester {
  public static void main (String args[]) {
    Radix r = new Radix();
    System.out.println(r.nth(56789, 2));
    System.out.println(r.nth(56789, 0));
    System.out.println(r.nth(56789, 4));
    System.out.println(r.nth(56789, 3));
    System.out.println(r.length(56789));

    MyLinkedList m1 = new MyLinkedList();
    MyLinkedList m2 = new MyLinkedList();
    MyLinkedList m3 = new MyLinkedList();
    MyLinkedList m4 = new MyLinkedList();

    SortableLinkedList s1 = new SortableLinkedList();
    SortableLinkedList s2 = new SortableLinkedList();
    SortableLinkedList s3 = new SortableLinkedList();
    SortableLinkedList s4 = new SortableLinkedList();

    m1.add("1");
    m1.add("2");
    m1.add("3");
    m2.add("4");
    m2.add("5");
    m2.add("6");
    m3.add("7");
    m3.add("8");
    m3.add("9");
    m4.add("10");
    m4.add("11");
    m4.add("12");


    s1.add(1);
    s1.add(2);
    s1.add(3);
    s2.add(4);
    s2.add(5);
    s2.add(6);
    s3.add(7);
    s3.add(8);
    s3.add(9);
    s4.add(10);
    s4.add(11);
    s4.add(12);

  SortableLinkedList[] sbuckets = {s2, s3, s4};
  Radix.merge(s1, sbuckets);
  //MyLinkedList[] mbuckets = {m2, m3, m4};
  //Radix.merge(m1, mbuckets);

  SortableLinkedList radixBucket = new SortableLinkedList();
  radixBucket.add(121);
  radixBucket.add(232);
  radixBucket.add(4000);
  radixBucket.add(52);
  radixBucket.add(34);
  radixBucket.add(33);
  radixBucket.add(546);
  radixBucket.add(77);
  radixBucket.add(888);

  System.out.println("==== Radix Sort ====");
  System.out.println("Original List to Sort: " + radixBucket.toString());
  Radix.radixSortSimple(radixBucket);

  }
}
