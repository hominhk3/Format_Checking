package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    public String inputStringMatch(String title, String regex) {
        String s = "";
        while (!s.matches(regex)) {
            Scanner sc = new Scanner(System.in);
            System.out.print(title + ": ");
            s = sc.nextLine();
            if (!s.matches(regex)) {
                System.out.println(title + " incorrect format");
            }
        }
        return s;
    }

    public String inputString(String title) {
        String s = "";
        while (s.isBlank() || s.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.print(title + ": ");
            s = sc.nextLine();
        }
        return s;
    }

    public Date inputDate(String title) {
        Date date;
        while (true) {
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(inputString(title));
                return date;
            } catch (ParseException e) {
                System.out.println("Date to correct format(dd/mm/yyyy)");
            }
        }
    }

    public String inputPhone(String title) {
        String s = "";
        while (s.length() < 10 || s.length() > 10) {
            Scanner sc = new Scanner(System.in);
            System.out.print(title + ": ");
            s = sc.nextLine();
            try {
                long a = Long.parseLong(s);
                if (s.length() < 10 || s.length() > 10) {
                    System.out.println("Phone number must be 10 digits");
                }
            } catch (NumberFormatException e) {
                System.out.println("Phone number must be number");
            }
        }
        return s;
    }
}
