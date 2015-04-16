package phonebook.zhdanov;

import java.util.Scanner;

/**
 * Created by ZhdankiFam on 16.04.2015.
 */
public class MainMenu {
    Scanner scan = new Scanner(System.in);


    public Contact addContact() {
        System.out.println("¬ведите им€: ");
        String name = scan.next();

        System.out.println("¬ведите номер: ");
        String phone = scan.next();

        System.out.println("¬ведите email: ");
        String email = scan.next();

        Contact contact = new Contact(name, phone, email);
        return contact;
    }


}
