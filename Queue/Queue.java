class Queue
{
	int size;
	int queue[];
	static int front;
	static int rear;
	Queue(int a)
	{	size=a;
		queue = new int[size];
		rear = -1;
		front = -1;


	}
	void enqueue(int a)
	{
		if(rear==size)
		{
			System.out.println("Queue is full :(");
		}
		else
		{
			if(rear==-1 &front ==-1)
			{
				rear++;
				front++;
				
			}
			else
			{
				rear++;

			}
			queue[rear] = a;
			System.out.println(queue[rear]+" Added to Queue. "+"Front is at "+front+". Rear is at "+rear);

			
		}

	}

	void dequeue()
	{
		if(front== -1 && rear== -1)
		{
			
		}
	} 
	public static void main(String args[])
	{
		Queue q = new Queue(10);
		q.enqueue(5);
		
		q.enqueue(10);
		q.enqueue(15);

		// q.dequeue();
		// q.dequeue();

	}
}