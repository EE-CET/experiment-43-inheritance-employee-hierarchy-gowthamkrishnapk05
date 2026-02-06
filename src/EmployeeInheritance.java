import java.util.Scanner;

class Employee {
        String name;
        int age;
        long ph_no;
        String address;
        int salary;
   
}

// TODO: Create class Officer extends Employee
// Add 'specialization' attribute
class Officer extends Employee
{
        String special;
}

// TODO: Create class Manager extends Employee
// Add 'department' attribute
class Manager extends Employee
{
        String department;
}

public class EmployeeInheritance {
   
        
        // --- OFFICER INPUT ---
        // Create Officer object
        // Read name, age, phone, address, salary, specialization
        // Hint: Use sc.nextLine() for strings to capture spaces, sc.nextInt() for numbers.
        // Be careful with buffer clearing after nextInt()!
        
        // --- MANAGER INPUT ---
        // Create Manager object
        // Read name, age, phone, address, salary, department
        
        // --- OUTPUT ---
        // Print "Officer:"
        // Print officer details (one per line)
        
        // Print "Manager:"
        // Print manager details (one per line)
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Officer o1 = new Officer();
                o1.name = sc.nextLine();
                o1.age = sc.nextInt();
                sc.nextLine();
                o1.ph_no = sc.nextLong();
                sc.nextLine();
                o1.address = sc.nextLine();
                o1.salary = sc.nextInt();
                sc.nextLine();
                o1.special = sc.nextLine();

                Manager m1 = new Manager();
                m1.name = sc.nextLine();
                m1.age = sc.nextInt();
                sc.nextLine();
                m1.ph_no = sc.nextLong();
                sc.nextLine();
                m1.address = sc.nextLine();
                m1.salary = sc.nextInt();
                sc.nextLine();
                m1.department = sc.nextLine();

                System.out.println("Officer:");
                System.out.println(o1.name);
                System.out.println(o1.age);
                System.out.println(o1.ph_no);
                System.out.println(o1.address);
                System.out.println(o1.salary);
                System.out.println(o1.special);

                System.out.println("Manager:");
                System.out.println(m1.name);
                System.out.println(m1.age);
                System.out.println(m1.ph_no);
                System.out.println(m1.address);
                System.out.println(m1.salary);
                System.out.println(m1.department);



        }
}
