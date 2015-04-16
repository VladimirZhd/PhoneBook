package phonebook.zhdanov;

import java.util.Scanner;

/**
 * Created by ZhdankiFam on 16.04.2015.
 */
public class Edit {
    Scanner scan = new Scanner(System.in);

    public String editName(String name) {
        System.out.println("Введите новое имя: ");
        String newName = scan.next();
        System.out.println("Заменить " + name + " на " + newName + " если да, то введите 1, если нет, введите 0.");
        int answer = scan.nextInt();
        if (answer == 1) {
            return newName;
        } else {
            return name;
        }
    }

    public String editPhone(String number) {
        System.out.println("Введите новый номер: ");
        String newNumber = scan.next();
        System.out.println("Заменить " + number + " на " + newNumber + " если да, то введите 1, если нет, введите 0.");
        int answer = scan.nextInt();
        if (answer == 1) {
            return newNumber;
        } else {
            return number;
        }
    }

    public String editEmail(String email) {
        System.out.println("Введите новое имя: ");
        String newEmail = scan.next();
        System.out.println("Заменить " + email + " на " + newEmail + " если да, то введите 1, если нет, введите 0.");
        int answer = scan.nextInt();
        if (answer == 1) {
            return newEmail;
        } else {
            return email;
        }
    }
}
