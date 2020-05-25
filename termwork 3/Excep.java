import java.util.Scanner;

public class Excep {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a,b,c;
       System.out.println("Enter val of a and b: ");
       a = in.nextInt();
       b = in.nextInt();
       try {
	          c = a/b;
              System.out.println("c = " + c);
       }catch(ArithmeticException e) {
        	  System.out.println("Exception Encountered is "+ e);
       }
        in.close();
    }
}
