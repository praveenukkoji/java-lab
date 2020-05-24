import java.util.*;
public class student {
    String USN;
    String Name;
    String Branch;
    long Phone;

    void insert(String usn, String name, String branch, long phone) {
        this.USN = usn;
        this.Name= name;
        this.Branch = branch;
        this.Phone = phone;
    }

    void display() {
        System.out.println(USN + " " + Name + " " + Branch + " " + Phone);
    }

    public static void main(String[] args) {
        student s[];
        s = new student[100];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of students: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            s[i] = new student();
        }

        for(int i=0;i<n;i++) {
            System.out.println("Enter details:");
            System.out.print("Enter USN:");
            String usn = in.next();
            System.out.print("Enter Name:");
            String name = in.next();
            System.out.print("Enter Branch:");
            String branch = in.next();
            System.out.print("Enter Phone:");
            long phone = in.nextLong();

            s[i].insert(usn, name, branch, phone);
        }

        for(int i=0;i<n;i++) {
            s[i].display();
            System.out.println("");
        }
    }
}
