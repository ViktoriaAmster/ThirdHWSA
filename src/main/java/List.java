public class List {
    Node head;
    Node tail;
    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {return currentNode};
            currentNode = currentNode.next;
        }
        return null;
    }

    public void reversList(){
        Node currentNode = head;
        head = tail;
        tail = currentNode;
        while (currentNode != null){
            Node temp = currentNode.next;
            currentNode.next = currentNode.previous;
            currentNode.previous = temp;
            currentNode = temp;
        }
    }



    public class Node{
    int value;
    Node next;
    Node previous;
    }

}
