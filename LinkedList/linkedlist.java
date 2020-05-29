class linkedlist
{
	Node head;
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

	void insert_start(int a)
	{
		Node qw = new Node(a);
		qw.next = head;
		head = qw;
	}

	void insert_at(int index,int a)
	{	Node qw = new Node(a);

		int length = 0;
		Node temp = head;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}

		if(index>length)
		{
			System.out.println("Can't insert in between linkedlist");
		}

		else
		{

		
			if(index == 0)
			{
				add(a);
			}

			else if(index==1)
			{ 	qw.next = head.next;
				head.next = qw;
			}

			else
			{
				temp = head;
				
				while(index!=1)
				{
					temp=temp.next;
					index--;
				}

				qw.next = temp.next;
				temp.next = qw;
			}

		}
	}

	void delete_last()
	{
		Node temp = head;
		Node prev = null;
		if(temp==null)
		{
			System.out.println("Empty linkedlist :(");
		}

		else
		{
			while(temp.next!=null)
			{
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
		}
	}



	void delete_front()
	{
		if(head!=null)
		head=head.next;

	}

	void delete_at(int index)
	{
		
		Node temp = head;
		Node prev = null;
		
		int length = 0;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		if(index>length)
		{
			System.out.println("Can't delete");
		}
		else
		{
			if(index == 0)
			{
				delete_front();
			}
			else 	{

						temp = head;
						while(index!=0)
						{
							prev = temp;
							temp = temp.next;
							index--;
						}
						if(temp.next==null)
						{
						prev.next=null;
						}
						else prev.next = temp.next;
					}
		}

	}/////5 6
	//////0 1

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
		linkedlist l = new linkedlist();
		//////////////////////////////////////////////////////////////////////////////////////
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		System.out.println("LinkedList");
		l.display();
		System.out.println(" ");
		
		l.insert_start(1);
		System.out.println("LinkedList after inserting node/element in the front");
		l.display();
		System.out.println(" ");

		l.insert_at(1,2);
		System.out.println("After inserting node/element in between LinkedList");
		l.display();
		System.out.println(" ");
		/////////////////////////////////////////////////////////////////////////////////////THREE TYPES OF INSERTION IN LINKEDLIST ==>ENDS HERE
		l.delete_front();
		System.out.println("After deleting first element");
		l.display();
		System.out.println(" ");

		l.delete_last();
		System.out.println("After deleting last element");
		l.display();
		System.out.println(" ");

		l.delete_at(3);
		System.out.println("After deleting node/element in between LinkedList ");
		l.display();
		System.out.println(" ");
		//////////////////////////////////////////////////////////////////////////////////////THREE TYPES OF DELETION IN LINKEDLIST==>ENDS HERE






	}
}