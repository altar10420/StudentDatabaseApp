import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name:");
        this.firstName = in.nextLine();

        System.out.println("Enter first name:");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter students class level:");
        this.gradeYear = in.nextInt();

        System.out.println(firstName + " " + lastName + " " + gradeYear);

        id++;
    }


}
