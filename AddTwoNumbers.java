package linkedlist;

public class AddTwoNumbers
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

    public static Node addTwoLists(Node l1, Node l2)
    {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0)
        {
            int sum = carry;

            if (l1 != null)
            {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummy.next;
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
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        AddTwoNumbers list1 = new AddTwoNumbers();
        list1.addNode(1);
        list1.addNode(4);
        list1.addNode(2);

        AddTwoNumbers list2 = new AddTwoNumbers();
        list2.addNode(2);
        list2.addNode(6);
        list2.addNode(5);

        System.out.println("List 1 :");
        list1.displayNodes();

        System.out.println("List 2 :");
        list2.displayNodes();

        Node result = addTwoLists(list1.head, list2.head);

        AddTwoNumbers resultList = new AddTwoNumbers();
        resultList.head = result;

        System.out.println("Sum :");
        resultList.displayNodes();
    }
}