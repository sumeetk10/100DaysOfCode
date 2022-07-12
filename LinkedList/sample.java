public class sample {

    Node head;

    class Node {
        int data;
        Node next;
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast (int data) {
        Node newNode  = new Node();
        //Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        
        newNode.next = null;
    }

    public void printlist() {

        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        sample list = new sample();
        list.addFirst(45);
        list.addFirst(20);
        list.addFirst(56);
        list.printlist();

        list.addLast(78);
        list.addLast(89);
        list.printlist();
    }
}