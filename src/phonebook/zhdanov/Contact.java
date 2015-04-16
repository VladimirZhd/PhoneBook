package phonebook.zhdanov;

import com.sun.javafx.scene.traversal.ContainerTabOrder;

import java.util.Scanner;

/**
 * Created by ZhdankiFam on 14.04.2015.
 */
public class Contact {
    String name;
    String phone;
    String email;
    Scanner scan = new Scanner(System.in);

    public Contact(){}

    public Contact(String newName, String newPhone, String newEmail) {
        name = newName;
        phone = newPhone;
        email = newEmail;
    }
}
