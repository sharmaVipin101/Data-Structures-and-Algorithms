class circular
{
	Node head,tail;
	class Node
	{
		int data;
		Node next;
		Node(int a)
		{
			data = a;
		}
	}

	void add(int a)
	{	Node qw = new Node(a);
		if(head==null)
		{
			head = qw;
			head.next = head;
		}
		else
		{
			Node temp = head;
			while(temp.next!=head)
			{
				temp = temp.next;
			}
			temp.next = qw;
			qw.next = head;

		}
	}

	void insert_start(int a)
	{	
		Node qw = new Node(a);
		
		qw.next = head;

		Node temp = head;

		while(temp.next!=head)
		{
			temp = temp.next;
		}
		temp.next = qw;
		head = qw;


	}	

	void insert_at(int index,int a)
	{
		if(index == 0)
			{
				insert_start(a);
			}
			else
			{
				Node qw = new Node(a);
				Node temp = head;
				Node previous = temp;
				while(index!=0)
				{previous = temp;
					temp = temp.next;
					index--;
				}
				if(temp.next==head)
					{
						add(a);
					}
					else
					{
					previous.next = qw;
					qw.next = temp;
					}

			}

	}///1 5 10 15
	////0 1  2  3

	void delete_front()
	{
		if(head!=null)
		{
		
		Node temp = head;
		while(temp.next!=head)
		{
			temp = temp.next;
		}
		head = head.next;
		temp.next = head;
		}

	}

	void delete_last()
	{
		Node temp = head;
		Node previous = temp;
		while(temp.next!=head)
		{
			previous = temp;
			temp = temp.next;
		}
		previous.next = head;

	}

	void delete_at(int index)
	{
		Node temp = head;
		Node previous = temp;
		if(index==0)
		{
			delete_front();
		}
		else
		{
			while(index!=0)
			{
				previous = temp;
				temp = temp.next;
				index--;
			}
			if(temp.next == head)
			{
				delete_last();
			}
			else
			{
				previous.next = temp.next;
			}
		}
	}////1 5 10 15
	/////0 1  2  3

	void display()
	{
		Node temp = head;
		
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp = temp.next;

		}
		if(temp.next==head)
		{
			System.out.println(temp.data);
		}


	}
	public static void main(String args[])
	{
		circular c = new circular();
		/////////////////////////////////////////////////////////////////////////////////////////////
		c.add(5);
		c.add(10);
		c.add(15);
		System.out.println("Circular LinkedList");
		c.display();
		System.out.println(" ");

		c.insert_start(1);
		System.out.println("Circular LinkedList after inserting node/element in the front");
		c.display();
		System.out.println(" ");

		c.insert_at(1,3);
		System.out.println("Circular LinkedList after inserting node/element in between");
		c.display();
		System.out.println(" ");
		///////////////////////////////////////////////////////////////////////////////////////////////THREE TYPES OF INSERTION IN CIRCULAR LINKEDLIST

		c.delete_front();
		System.out.println("Circular LinkedList after deleting first node/element");
		c.display();
		System.out.println(" ");

		c.delete_last();
		System.out.println("After deleting last element/Node");
		c.display();
		System.out.println(" ");

		c.delete_at(1);
		System.out.println("After deleting element/Node in between");
		c.display();
		System.out.println(" ");



		



	}

}