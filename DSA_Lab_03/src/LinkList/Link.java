package LinkList;

public class Link {
	
	public String name;
	public double avg;
	public Link link;
	public Link next;
	
	
	//parameterized Constructor
	public Link(String name, double avg) {
		
		this.name = name;
		this.avg = avg;
		this.next = next;
		
	}

	//display details method implementation
	public void displayDetails() {
		
		System.out.println("Name : \t" + name + " || Average : \t" + avg);
		System.out.println("---------------------------");
	}

}
