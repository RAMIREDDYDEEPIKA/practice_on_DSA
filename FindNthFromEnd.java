package linkedlist;

public class FindNthFromEnd
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

    public void findNthFromEnd(int n)
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++)
        {
            if (first == null)
            {
                System.out.println("The list has fewer than " + n + " nodes.");
                return;
            }
            first = first.next;
        }

        while (first != null)
        {
            first = first.next;
            second = second.next;
        }

        System.out.println("The " + n + "-th node from the end is: " + second.data);
    }

    public void displayNodes()
    {
        if (head == null)
        {
            System.out.println("List is empty");
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

    public static void main(String[] args)
    {
        FindNthFromEnd list = new FindNthFromEnd();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(60);
        list.addNode(70);

        System.out.println("Original List:");
        list.displayNodes();

        list.findNthFromEnd(2);
        list.findNthFromEnd(5);
        list.findNthFromEnd(6);
    }
}