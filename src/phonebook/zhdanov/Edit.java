package phonebook.zhdanov;

import java.util.Scanner;

/**
 * Created by ZhdankiFam on 16.04.2015.
 */
public class Edit {
    Scanner scan = new Scanner(System.in);

    public String editName(String name) {
        System.out.println("������� ����� ���: ");
        String newName = scan.next();
        System.out.println("�������� " + name + " �� " + newName + " ���� ��, �� ������� 1, ���� ���, ������� 0.");
        int answer = scan.nextInt();
        if (answer == 1) {
            return newName;
        } else {
            return name;
        }
    }

    public String editPhone(String number) {
        System.out.println("������� ����� �����: ");
        String newNumber = scan.next();
        System.out.println("�������� " + number + " �� " + newNumber + " ���� ��, �� ������� 1, ���� ���, ������� 0.");
        int answer = scan.nextInt();
        if (answer == 1) {
            return newNumber;
        } else {
            return number;
        }
    }

    public String editEmail(String email) {
        System.out.println("������� ����� ���: ");
        String newEmail = scan.next();
        System.out.println("�������� " + email + " �� " + newEmail + " ���� ��, �� ������� 1, ���� ���, ������� 0.");
        int answer = scan.nextInt();
        if (answer == 1) {
            return newEmail;
        } else {
            return email;
        }
    }
}
