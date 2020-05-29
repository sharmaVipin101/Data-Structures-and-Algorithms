class doubly
{	
	Node head,tail;
	class Node
	{
		Node prev;
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
			head.prev = null;
			head.next = null;
			tail = head;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}

			temp.next = qw;
			qw.prev = temp;
			qw.next = null;
			tail = temp.next;

		}
	}

	void insert_start(int a)
	{
		Node qw = new Node(a);
		head.prev = qw;
		qw.next = head;
		qw.prev = null;
		head = qw;

	}

	void insert_at(int index,int a)
	{
		Node qw = new Node(a);

		if(index==0)
			{
				insert_start(a);
			}
		
			
		else
		{
			Node temp = head;
			Node previous = temp;
			while(index!=0)
			{	previous = temp;
				temp=temp.next;
				index--;
			}
			qw.next = previous.next;
			temp.prev = qw;
			qw.prev = previous;
			previous.next = qw;





			

			// temp.prev = qw;


		}

	}
	////////[previous.prev previous previous.next] 5 10
	///////////          [qw.prev qw qw.next]

	void delete()
	{
		head=head.next;
		head.prev = null;
	}
	void delete_last()
	{
		Node temp = head;
		Node previous = temp;
		while(temp.next!=null)
		{previous = temp;
			temp = temp.next;
		}
		previous.next = null;
		tail = previous;
	}

	void delete_at(int index)
	{
		if(index==0)
		{
			delete();
		}
		Node temp = head;
		Node previous = temp;
		while(index!=0)
		{	
			previous = temp;
			temp = temp.next;
			index--;
		}
		if(temp.next == null)
		{
			delete_last();
		}
		else
		{
			previous.next = temp;
			temp.prev = previous;
		}
	}////1 5 10 15
	/////0 1  2 3

	void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	void reverse_display()
	{
		Node temp = tail;

		while(tail!=null)
		{
			System.out.println(tail.data);
			tail=tail.prev;
		}
	}

	public static void main(String args[])
	{
		doubly dl = new doubly();
////////////////////////////////////////////////////////////////////////////
		dl.add(5);
		dl.add(10);
		dl.add(15);
		System.out.println("Doubly linked List printing");
		dl.display();
		System.out.println(" ");

		System.out.println("Inserting element/Node in the start");
		dl.insert_start(1);
		dl.display();
		System.out.println(" ");

		System.out.println("Inserting element/Node in between doubly");
		dl.insert_at(1,3);
		dl.display();
		System.out.println(" ");
//////////////////////////////////////////////////////////////////////////////THREE TYPES OF INSERTION IN DOUBLY ENDS HERE
		
		System.out.println("After deleting first node/element");
		dl.delete();
		dl.display();
		System.out.println(" ");

		System.out.println("After deleting last node/element");
		dl.delete_last();
		dl.display();
		System.out.println();

		System.out.println("After deleting node/element in between doubly");
		dl.delete_at(2);
		dl.display();
		System.out.println(" ");
		//delfront
		//dellast
		//delat



		////////////////////////////////////////////////////
		System.out.println("Reverse Display of linked list");
		dl.reverse_display();
		////////////////////////////////////////////////////

	}
}
