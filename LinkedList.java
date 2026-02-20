class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static LinkedList insert(LinkedList list, int data) {
        Node newnode = new Node(data);

        if (list.head == null) {
            list.head = newnode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        return list;
    }

    static void display(LinkedList list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    static LinkedList insertbegin(LinkedList list, int data) {
        Node newnode = new Node(data);

        if (list.head == null) {
            list.head = newnode;
        } else {
            newnode.next = list.head;
            list.head = newnode;
        }
        return list;
    }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 10);
        list = insert(list, 20);
        list = insert(list, 30);
        list = insert(list, 40);
        list = insert(list, 50);
        list = insert(list, 60);

        list = insertbegin(list, 100);

        display(list);
    }
}
