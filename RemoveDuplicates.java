package linkedlist;

import java.util.HashSet;

public class RemoveDuplicates
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

    public void removeDuplicates()
    {
        if (head == null)
        {
            System.out.println("List is empty, no duplicates to remove.");
            return;
        }

        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null)
        {
            if (seen.contains(current.data))
            {
                prev.next = current.next;
            }
            else
            {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        System.out.println("Removed duplicates from the linked list.");
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
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args)
    {
        RemoveDuplicates list = new RemoveDuplicates();
        list.addNode(10);
        list.addNode(20);
        list.addNode(10);
        list.addNode(30);
        list.addNode(20);
        list.addNode(40);

        System.out.println("Original List:");
        list.displayNodes();

        list.removeDuplicates();

        System.out.println("List After Removing Duplicates:");
        list.displayNodes();
    }
}