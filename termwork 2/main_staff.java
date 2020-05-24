import java.util.*;

class Staff {
    int StaffId;
    String Phone;
    int Salary;
    String Name;

    public Staff(int staffId, String phone, int salary, String name) {
        this.StaffId = staffId;
        this.Phone = phone;
        this.Salary = salary;
        this.Name = name;
    }

    void display() {
        System.out.println("");
        System.out.println("Staff Id: " + StaffId);
        System.out.println("Phone: " + Phone);
        System.out.println("Salary: " + Salary);
        System.out.println("Name: " + Name);
    }
}

class Teaching extends Staff {
    String Domain;
    int No_of_publications;
    public Teaching(int staffId, String phone, int salary, String name, String domain, int no_of_publications) {
        super(staffId, phone, salary, name);
        this.Domain = domain;
        this.No_of_publications = no_of_publications;
    }

    void TeachingDisplay() {
        System.out.println("");
        System.out.println("Teaching Staff Details:");
        super.display();
        System.out.println("Domain: " + Domain);
        System.out.println("No_of_publications: " + No_of_publications);
    }
}

class Technical extends Staff {
    String Skills;
    public Technical(int staffId, String phone, int salary, String name, String skill) {
        super(staffId, phone, salary, name);
        this.Skills = skill;
    }

    void TechnicalDisplay() {
        System.out.println("");
        System.out.println("Technical Staff Details:");
        super.display();
        System.out.println("Skills: " + Skills);
    }
}

class Contract extends Staff {
    int Period;
    public Contract(int staffId, String phone, int salary, String name, int period) {
        super(staffId, phone, salary, name);
        this.Period = period;
    }

    void ContractDisplay() {
        System.out.println("");
        System.out.println("Contract Staff Details:");
        super.display();
        System.out.println("Period: " + Period + " years");
    }
}

public class main_staff {
    public static void main(String[] args) {
        Teaching Te1 = new Teaching(11, "9987654341", 300000, "Praveen", "Cse", 10);
        Teaching Te2 = new Teaching(12, "9987654341", 31500, "Pavya", "Mech", 11);
        Teaching Te3 = new Teaching(13, "9987654341", 3000, "Pravin", "EE", 12);

        Te1.TeachingDisplay();
        Te2.TeachingDisplay();
        Te3.TeachingDisplay();

        Technical Tn1 = new Technical(11, "9987654341", 22000, "Pavya", "C");
        Technical Tn2 = new Technical(12, "9987654341", 23000, "Pavya2", "java");
        Technical Tn3 = new Technical(13, "9987654341", 23000, "Pavya3", "C++");

        Tn1.TechnicalDisplay();
        Tn2.TechnicalDisplay();
        Tn3.TechnicalDisplay();

        Contract C1 = new Contract(11, "9987654341", 35000, "Pavya1", 3);
        Contract C2 = new Contract(12, "9987654341", 36000, "Pavya2", 2);
        Contract C3 = new Contract(13, "9987654341", 37000, "Pavya3", 1);

        C1.ContractDisplay();
        C2.ContractDisplay();
        C3.ContractDisplay();

    }
}
