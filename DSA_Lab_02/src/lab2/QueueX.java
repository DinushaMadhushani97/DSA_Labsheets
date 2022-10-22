package lab2;

//Attributes
public class QueueX {
	
	private int [] QueueArr;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	//constructor
	public QueueX(int s) {
		
		maxSize =s;
		QueueArr = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	//add new values to the queue
	public void insert(int j) {
		
		if(rear == maxSize - 1) {
			
			System.out.println("Queue is full..!");
		}else {
			QueueArr[++rear] = j;
			nItems++;
		}
	}
	
	//removing the values from the queue
	public int remove() {
		
		if(nItems ==0) {
			
			System.out.println("Queue is Empty..!");
			return -99;
		}else {
			nItems--;
			return QueueArr[front++];
		}
	}
	
	public boolean isEmpty() {
		return(nItems == 0);
	}
	
	public boolean isFull() {
		
		return(nItems == maxSize);
	}

}
