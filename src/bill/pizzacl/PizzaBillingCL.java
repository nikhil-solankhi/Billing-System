package bill.pizzacl;

public class PizzaBillingCL {

	private String name;
	private long mob = 0;
	private int token = 0;
	static int count;
	private int G_total;

	public PizzaBillingCL() {
		count++;
		token = count;
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setMob(long phone) {
		mob = phone;
	}

	public void setG_total(int g_total) {
		G_total = g_total;
	}

	public void display() {
		System.out.println("Name: " + name + "\nContact No.: +91" + mob + "\nOrder Amount: INR " + G_total
				+ "\nPlace in Queue " + token);
	}

}
