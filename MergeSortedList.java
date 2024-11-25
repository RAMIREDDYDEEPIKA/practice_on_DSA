package linkedlist;

public class MergeSortedList
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

    public static MergeSortedList mergeSortedLists(MergeSortedList list1, MergeSortedList list2)
    {
        Node dummy = new Node(0);
        Node tail = dummy;

        Node l1 = list1.head;
        Node l2 = list2.head;

        while (l1 != null && l2 != null)
        {
            if (l1.data <= l2.data)
            {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null)
        {
            tail.next = l1;
        }
        else
        {
            tail.next = l2;
        }

        MergeSortedList mergedList = new MergeSortedList();
        mergedList.head = dummy.next;
        return mergedList;
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

    public static void main(String[] args)
    {
        MergeSortedList list1 = new MergeSortedList();
        list1.addNode(1);
        list1.addNode(3);
        list1.addNode(5);

        MergeSortedList list2 = new MergeSortedList();
        list2.addNode(2);
        list2.addNode(4);
        list2.addNode(6);

        System.out.println("List 1:");
        list1.displayNodes();

        System.out.println("List 2:");
        list2.displayNodes();

        MergeSortedList mergedList = mergeSortedLists(list1, list2);
        System.out.println("Merged Sorted List:");
        mergedList.displayNodes();
    }
}