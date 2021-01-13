public class MyLinkedList{
 private int size;
 private Node start,end;
 private Node head = null;
 private Node tail = null;
 private int count = 0;

 public MyLinkedList(){

   this.size = 0;
   this.start = start;
   this.end = end;
 }
 public int size() {
   return size;
 }


 public boolean add(String value) {
    Node newNode = new Node(value);
    size += 1;
    if (head==null) {
      head = tail = newNode;
      head.setPrev(null);
      tail.setNext(null);
      end = start;
    } else {
      tail.setNext(newNode);
      newNode.setPrev(tail);
      tail = newNode;
      tail.setNext(null);

    }
    return true;
 }
 public boolean add(int index, String value) throws IndexOutOfBoundsException {
   count = 0;
   Node current = head;
   Node newNode = new Node(value);

   if (index < 0 || index > size) {
     throw new IndexOutOfBoundsException("OUT OF RANGE!!");
   }

   if (index == 0) {
     size += 1;
     newNode.setNext(head);
     head = newNode;
     return true;
   }
   while (--index > 0) {
     current = current.getNext();
   }
   size += 1;
   newNode.setNext(current.getNext());
   newNode.setPrev(current);
   current.setNext(newNode);

   return true;
 }

 public String get(int index) {
   count = 0;
   Node current = head;
   while (current != null) {
     count += 1;
     if (count == index) {
       return current.getData();
     }
     current = current.getNext();
   }
   return current.getData();
 }
 public String set(int index, String value) {
   count = 0;
   Node current = head;
   while (current != null) {
     if (count == index) {
       current.setData(value);
       return value;
     } else {
       current = current.getNext();
       count += 1;
     }
   }
   return value;
 };
 public String toString() {
   String str = "";
   Node current = head;
   while (current != null) {
     str += current.getData() + ", ";
     current = current.getNext();
     }
    return str;

 };
 public String toStringReversed() {
   String str = "";
   Node current = tail;
   while (current != null) {
     str += current.getData() + ", ";
     current = current.getPrev();
   }
   return str;
 }
 public String remove(int index) {
   String x;

   if (index < 0 || index > size) {
     throw new IndexOutOfBoundsException("OUT OF RANGE!!");
   }
   if (size == 1) {
     head = null;
     size -= 1;
   }
   if (index == 0) {
     x = head.getData();
     head = head.getNext();
     size -= 1;
     return x;
   }
   if (index == size) {
     x = tail.getData();
     tail = tail.getPrev();
     tail.setNext(null);
     size -= 1;
     return x;
   }
   count = 0;
   Node current = head;
   while (current != null) {
     if (count == index) {
       String tempcurr = current.getData();
       current.getPrev().setNext(current);
       size -=1;
       return tempcurr;
     }
     current = current.getNext();
     count += 1;
   }
   return "";
 }
 public void extend(MyLinkedList other) {
   if(size() == 0){
     head = other.head;
     tail = other.tail;
     size = other.size;
   }else if(other.size() > 0){
     tail.setNext(other.head);
     other.head.setPrev(tail);
     tail = other.tail;
     this.size = size()+other.size();
   }
   other.size = 0;
   other.tail = null;
   other.head = null;
 }
}
