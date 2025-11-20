public class LinkedList {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  public void InsertData(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  public void display() {
    Node current = head;
    while(current!=null){
      System.out.print(current.data +"->");
      current = current.next;
    }
    System.out.println("null");
      
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.InsertData(14);
    list.InsertData(20);
    list.display();

    System.out.println();

  }

}
