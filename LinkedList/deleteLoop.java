class deleteLoop
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int a)
		{
			data = a;
		}
	}

	void add(int a)
	{
		Node qw = new Node(a);

		if(head==null)
		{
			head = qw;
			head.next = null;
		}
		
		Node temp = head;

		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = qw;
		qw.next=null;

	}
	void loop_del(Node head)
	{
		Node slow = head;
		Node fast = head;
		boolean loop = false;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast)
			{
				System.out.println("LOOP DETECTED");
				loop = true;
				break;
			}
		}
		if(loop)
		{
		int length = 0;
		slow = head;
		while(fast!=slow)
		{
			fast = fast.next;
			slow=slow.next;
			
		}
		System.out.println("FIRST element of loop is "+""+fast.data);

		do {
                fast = fast.next;
                length++;
            } while (fast != slow);

		System.out.println("Length of loop is "+""+length);
		while(fast.next!=slow)
		{
			fast = fast.next;

		}
		fast.next = null;

		}
		else System.out.println("NO LOOP DETECTED");
	}


	void display()
	{
		Node temp = head;

		if(temp == null)
		{
			System.out.println("Empty linkedlist :(" );
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		deleteLoop l = new deleteLoop();
		 head = new Node(1);
        head.next = new Node(2);
        Node node = head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = node;
        l.loop_del(head);
		l.display();
	}
		
}