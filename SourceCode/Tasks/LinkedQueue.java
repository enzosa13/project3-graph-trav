public final class LinkedQueue<T> implements QueueInterface<T>
{
   private Node firstNode; // References node at front of queue
   private Node lastNode;  // References node at back of queue
  	
	public LinkedQueue()
	{
		firstNode = null;
		lastNode = null;
	} // end default constructor

//  < Implementations of the queue operations go here. > Done by Enzo Salum (note to remind myself for README)
	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry);

		if (isEmpty()) {
			firstNode = newNode;
		} else {
			lastNode.setNextNode(newNode);
		}

		lastNode = newNode;
	}

	@Override
	public T dequeue() {
		if (isEmpty()) return null;

		T front = firstNode.getData();
		firstNode = firstNode.getNextNode();

		if (firstNode == null) {
			lastNode = null;
		}

		return front;
	}

	@Override
	public T getFront() {
		if (isEmpty()){
        	return null;
      	} 
		return firstNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;
	}

	private class Node
	{
		private T    data; // Entry in queue
		private Node next; // Link to next node
      
		private Node(T dataPortion)
		{
			data = dataPortion;
			next = null;
		} // end constructor
		
		private Node(T dataPortion, Node linkPortion)
		{
			data = dataPortion;
			next = linkPortion;
		} // end constructor
      
		private T getData()
		{
			return data;
		} // end getData
      
		private void setData(T newData)
		{
			data = newData;
		} // end setData
      
		private Node getNextNode()
		{
			return next;
		} // end getNextNode
		
		private void setNextNode(Node nextNode)
		{
			next = nextNode;
		} // end setNextNode
	} // end Node
} // end LinkedQueue
