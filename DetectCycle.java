package linkedlist;

public class DetectCycle
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

    public boolean hasCycle()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                System.out.println("Cycle detected in the linked list.");
                return true;
            }
        }
        System.out.println("No cycle detected in the linked list.");
        return false;
    }

    public void createCycle()
    {
        if (head == null)
            return;

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head.next;
        System.out.println("Cycle created in the linked list.");
    }

    public static void main(String[] args)
    {
        DetectCycle list = new DetectCycle();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        list.hasCycle();
        list.createCycle();
        list.hasCycle();
    }
}