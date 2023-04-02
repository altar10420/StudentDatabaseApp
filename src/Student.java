import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name:");
        this.firstName = in.nextLine();

        System.out.println("Enter first name:");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter students class level:");
        this.gradeYear = in.nextInt();

        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.toUpperCase().equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);
    }

    public void viewBalance() {
        System.out.println("Your balance is $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.println("Enter the tuition you want to pay: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudentID: " + studentID +
                "\nCourses: " + courses +
                "\nBalance: $" + tuitionBalance;
    }

}
