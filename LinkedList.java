 

import java.io.*;

public class LinkedList extends Node
{
    Node Start;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main()throws Exception
    {
        System.out.println("Enter the size of the linked list:");
        int n = Integer.parseInt(br.readLine());

        LinkedList list = new LinkedList();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter value "+(i+1));
            int v = Integer.parseInt(br.readLine());

            list.add(v);
        }

        System.out.println();

        while(true)
        {
            list.display();
            System.out.println("What do you want to do:\n1. Add a value\n2. Remove an element\n3. Exit");
            int c = Integer.parseInt(br.readLine());
            System.out.println();

            switch(c)
            {
                case 1: System.out.println("Enter the value to be added:");
                int v = Integer.parseInt(br.readLine());
                list.add(v);
                break;

                case 2:
                System.out.println("Which index should be deleted?");
                int index = Integer.parseInt(br.readLine());
                list.remove(index);
                break;
            }

            if(c == 3)
                break;
        }
    }

    public void add(int data)
    {
        Node current = Start;

        if(current == null)
        {
            Start = new Node(data);
        }
        else
        {
            while(current.next != null)
            {
                current = current.next;
            }

            current.next = new Node(data);
        }
    }

    public void remove(int index)
    {
        if(index == 0)
        {
            Start = null;
        }
        else
        {
            Node current = Start;

            int k = 0;

            while(k < index-1)
            {
                current = current.next;
                k++;
            }

            current.next = current.next.next;
        }
    }

    public void removeLast()
    {
        Node current = Start;
        Node secondLast = Start;

        if(Start.next == null)
        {
            Start = null;
        }
        else
        {
            while(current.next != null)
            {
                secondLast = current;
                current = current.next;
            }

            secondLast.next = null;
        }
    }

    public void removeFirst()
    {
        Start = Start.next;
    }

    public void display()
    {
        Node current = Start;

        System.out.println("\nThe list is:\n");

        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public void countNodes()
    {
        int k = 0;

        Node current = Start;

        while(current != null)
        {
            current = current.next;
            k++;
        }

        System.out.println("Number of nodes: "+k);
    }
}