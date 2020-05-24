import java.util.Scanner;
import java.util.StringTokenizer;

public class customer {
	String Name ;
	String Date;
	String Month;
	String Year;
	void read() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter Name and DOB in Name, DD/MM/YYYY Format: ");
		String str = in.next();
		StringTokenizer st = new StringTokenizer(str, "," + "/");
			this.Name=st.nextToken();
			this.Date=st.nextToken();
			this.Month=st.nextToken();
			this.Year=st.nextToken();
			this.Name=this.Name.trim();
			this.Date=this.Date.trim();
			this.Month=this.Month.trim();
			this.Year=this.Year.trim();

		in.close();
	}
	void display() {
		System.out.println("\nCustomer Details is: ");
		System.out.println(this.Name + "," + this.Date + "," + this.Month + "," + this.Year);
	}

	public static void main(String[] args) {
		customer c1 = new customer();
		c1.read();
		c1.display();
	}
}
