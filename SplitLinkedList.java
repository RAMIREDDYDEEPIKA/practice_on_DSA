package linkedlist;

public class SplitLinkedList
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
    }

    public void splitList()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null)
        {
            prev.next = null;
        }

        System.out.println("First Half:");
        displayList(head);

        System.out.println("Second Half:");
        displayList(slow);
    }

    private void displayList(Node start)
    {
        Node temp = start;
        if (temp == null)
        {
            System.out.println("null");
        }
        else
        {
            while (temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args)
    {
        SplitLinkedList list = new SplitLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original List:");
        list.displayList(list.head);

        list.splitList();
    }
}