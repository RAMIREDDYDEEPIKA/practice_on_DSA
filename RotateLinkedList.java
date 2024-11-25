package linkedlist;

public class RotateLinkedList
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

    public void rotateList(int k)
    {
        if (head == null || k == 0)
        {
            return;
        }

        Node last = head;
        int length = 1;

        while (last.next != null)
        {
            last = last.next;
            length++;
        }

        last.next = head;

        k = k % length;
        int stepsToNewHead = length - k;

        Node newTail = head;
        for (int i = 1; i < stepsToNewHead; i++)
        {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;

        newTail.next = null;
        head = newHead;
    }

    public void displayList()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        RotateLinkedList list = new RotateLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original List:");
        list.displayList();

        list.rotateList(2);

        System.out.println("List After Rotation:");
        list.displayList();
    }
}