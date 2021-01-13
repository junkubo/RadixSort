public class Node{
 public Node(String value){
   data = value;
 }
 private String data;
 private Node next;
 private Node prev;

 public String getData() {
   return data;
 }
 public String setData(String str) {
   data = str;
   return data;
 }
 public Node getNext() {
   return next;
 }
 public Node setNext(Node n) {
   next = n;
   return next;
 }
 public Node getPrev() {
   return prev;
 }
 public Node setPrev(Node n) {
   prev = n;
   return prev;
 }

}
