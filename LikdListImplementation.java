package linkedlist;

public class LikdListImplementation
{
    private Node head;

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added node with data: " + data);
    }

    public void deleteNode()
    {
        if (head == null)
        {
            System.out.println("List is empty ");
        }
        else
        {
            System.out.println("Deleted node with data: " + head.data);
            head = head.next;
        }
    }

    public void displayNodes()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
        }
        else
        {
            Node temp = head;
            System.out.print("LinkedList: ");
            while (temp != null)
            {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public void reverseList()
    {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("Reversed the linked list.");
    }

    public static void main(String[] args)
    {
        LikdListImplementation list = new LikdListImplementation();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.reverseList();
        list.displayNodes();
        list.deleteNode();
        list.displayNodes();
        list.deleteNode();
        list.displayNodes();
        list.deleteNode();
        list.displayNodes();
        list.deleteNode();
    }
}