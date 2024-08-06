package ss7.mvc.mommo;

import java.util.Scanner;

public class RegexHandler {
    private static final String REGE_ID = "^ID-[0-9 ]{4}$";
    private static final String REGE_NAME = "^[a-zA-Z]{4,30}$";
    private static final String REGE_DAY = "^\\d{4}[-/]\\d{1,2}[-/]\\d{1,2}$";
    private static final String REGE_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String REGE_PHONE = "^(\\+84|84)?[0-9]{10}$";
    private static final String REGE_CLASS_NAME = "^C[0-9A-Z    ]{4}$";
    private static final Scanner scanner = new Scanner(System.in);

    public static int checkId() {
        int value;
        while (true) {
            System.out.println("Enter ID (format ID-1234):");
            String input = scanner.nextLine();
            if (input.matches(REGE_ID)) {
                value = Integer.parseInt(input.substring(3));
                break;
            } else {
                System.out.println("Enter a valid ID");
            }
        }
        return value;
    }

    public static String checkName() {
        String value;
        while (true) {
            System.out.println("Enter name (4-30 letters):");
            value = scanner.nextLine();
            if (value.matches(REGE_NAME)) {
                break;
            } else {
                System.out.println("Enter a valid name");
            }
        }
        return value;
    }

    public static String checkDateOfBirth() {
        String value;
        while (true) {
            System.out.println("Enter date of birth (yyyy-MM-dd or yyyy/MM/dd):");
            value = scanner.nextLine();
            if (value.matches(REGE_DAY)) {
                break;
            } else {
                System.out.println("Enter a valid date");
            }
        }
        return value;
    }

    public static String checkEmail() {
        String value;
        while (true) {
            System.out.println("Enter email:");
            value = scanner.nextLine();
            if (value.matches(REGE_EMAIL)) {
                break;
            } else {
                System.out.println("Enter a valid email");
            }
        }
        return value;
    }

    public static String checkPhone() {
        String value;
        while (true) {
            System.out.println("Enter phone number (format +84XXXXXXXXXX or 84XXXXXXXXXX):");
            value = scanner.nextLine();
            if (value.matches(REGE_PHONE)) {
                break;
            } else {
                System.out.println("Enter a valid phone number");
            }
        }
        return value;
    }

    public static String checkClassName() {
        String value;
        while (true) {
            System.out.println("Enter class name (format C1234):");
            value = scanner.nextLine();
            if (value.matches(REGE_CLASS_NAME)) {
                break;
            } else {
                System.out.println("Enter a valid class name");
            }
        }
        return value;
    }
}
