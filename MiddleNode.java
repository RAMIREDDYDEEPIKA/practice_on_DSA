package linkedlist;

public class MiddleNode
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

    public void findMiddleNode()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node is: " + slow.data);
    }

    public static void main(String[] args)
    {
        MiddleNode list = new MiddleNode();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        list.findMiddleNode();

        list.addNode(60);
        list.findMiddleNode();
    }
}