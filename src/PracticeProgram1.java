import java.util.Scanner;

public class PracticeProgram1 {
    public static void main(String[] args) {
        int age, pin;
        String UserName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to HBL\nPlease Enter your age : ");
        age = sc.nextInt();

        if (age >= 21 && age <= 55) {
            System.out.println("New Savings Account:");
            System.out.println("UserName : ");
            UserName = sc.next();
            System.out.println("Pin : ");
            pin = sc.nextInt();
            if (pin > 10000000 && pin < 99999999) {
                System.out.println("Your savings account has been created successfully.");
            }
            else {
                System.out.println("Pin can be 8 digits only.");
            }
        } else if (age > 55) {
            System.out.println("New Senior Citizen Account:");
            System.out.println("UserName : ");
            UserName = sc.next();
            System.out.println("Pin : ");
            pin = sc.nextInt();
            if (pin > 1000 && pin < 9999) {
                System.out.println("Your Senior Citizen Account has been created successfully.");
            } else {
                System.out.println("Pin can be 4 digits only.");
            }
        } else if (age < 21) {
            System.out.println("Ineligible to create an account");
        }
    }
}
