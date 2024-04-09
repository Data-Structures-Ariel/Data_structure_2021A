package L05;

public class Node {
    int data;
    Node next;
    Node prev;
    int index;

    public Node(int data, int index) {
        this.data = data;
        this.next = null;
        this.prev=null;
        this.index = index;
    }
}



//public class Node<T>{
//    private T value;
//    private Node <T> next;
//    public Node (T value){
//        this.value=value;
//        this.next=null;
//    }
//    public Node (T value, Node <T> next){
//        this.value=value;
//        this.next=next;
//    }
//    public Node <T> getNext(){
//        return this.next;
//    }
//    public void setNext(Node <T> next){
//        this.next=next;
//    }
//    public T getValue(){
//        return this.value;
//    }
//    public void setValue(T value){
//        this.value=value;
//    }
//    public boolean hasNext(){
//        return this.next!=null;
//    }
//    public String toString(){
//        return " "+this.value;
//    }
//}
