public class stack {
  private class Node {
    int data;
    Node next;
    
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node top;
  private int size;

  public stack() {
    this.top = null;
    this.size = 0;
  }
  
}
public void push(int data) {
  Node newNode = new Node(data);
  newNode.next = top;
  top = newNode;
  size++;
}

public int pop() {
  if (isEmpty()) {
    throw new RuntimeException("Stack is empty");
  }
  int data = top.data;
  top = top.next;
  size--;
  return data;
}

public int peek() {
  if (isEmpty()) {
    throw new RuntimeException("Stack is empty");
  }
  return top.data;
}

public boolean isEmpty() {
  return top == null;
}

public int size() {
  return size;
}

public void display() {
  if (isEmpty()) {
    System.out.println("Stack is empty");
    return;
  }
  Node current = top;
  System.out.print("Stack: ");
  while (current != null) {
    System.out.print(current.data + " ");
    current = current.next;
  }
  System.out.println();
}
