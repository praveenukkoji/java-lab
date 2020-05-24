import java.util.*;
public class stack {
	static int stack[], top = -1;
	public static void main(String[] args) {
		System.out.print("Enter Stack Size: ");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		stack = new int[size];
		System.out.println("\nOptions:\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
		System.out.print("Enter your Choice: ");
		int choice = in.nextInt();
		while(choice != 4)
		{
			if(choice == 1) {
				System.out.print("\nEnter Element to push: ");
				int element = in.nextInt();
				if(top == size-1)
					System.out.println("\nStack is full.");
				else
					stack[++top] = element;
			}
			else if(choice==2) {
				if(top == -1)
					System.out.println("\nStack is empty.");
				else
					System.out.println("\nPopped element is: "+ stack[top--]);
			}
			else if(choice==3) {
				if(top == -1)
					System.out.println("\nEmpty stack.");
				else {
					System.out.print("\nStack Elements are: ");
					for(int i=top; i>=0 ;i--)
						System.out.print(stack[i] + " ");
				}
			}
			else
				System.out.println("\nEnter Correct Choice \n");
            System.out.println("\nOptions:\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
    		System.out.print("Enter your Choice: ");
    		choice = in.nextInt();
		}
		in.close();
	}
}
