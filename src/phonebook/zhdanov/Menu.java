package phonebook.zhdanov;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZhdankiFam on 16.04.2015.
 */
public class Menu {

    ArrayList<Contact> book;


    public void start() {
        book = new ArrayList<Contact>();
        Edit ed = new Edit();
        Contact c = new Contact("Olga", "89312890907", "olga@gmail.com");
        Contact d = new Contact("Vova", "89312490907", "vova@gmail.com");
        Contact e = new Contact("Mama", "89312830907", "mama@gmail.com");
        Contact f = new Contact("Papa", "89312470907", "batya@gmail.com");
        Contact g = new Contact("Sister", "89314290907", "sister@gmail.com");
        book.add(c);
        book.add(d);
        book.add(f);
        book.add(e);
        book.add(g);
        MainMenu men = new MainMenu();


        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("1 - �������� �������");
            System.out.println("2 - ������� �������");
            System.out.println("3 - ������� ��� ��������");
            System.out.println("4 - �����");
            System.out.println("5 - �������������");
            System.out.println("6 - �����");


            int answer = scan.nextInt();
                // �������� �������
            if (answer == 1) {
                Contact cont = new Contact();
                cont = men.addContact();
                book.add(cont);
                //������� �������
            } else if (answer == 2) {
                System.out.println("������� ���: ");
                String name = scan.next();

                for (int i = 0; i < book.size(); i++) {
                    if (name.equals(book.get(i).name)) {
                        book.remove(i);
                        break;
                    }
                }
                  //������� ��� ��������
            } else if (answer == 3) {
                for (int i = 0; i < book.size(); i++) {
                    System.out.print(book.get(i).name + " - ");
                    System.out.print(book.get(i).phone + " - ");
                    System.out.println(book.get(i).email);
                }

                 // �����
            } else if (answer == 4) {
                System.out.println("������� ���: ");
                String b = scan.next();
                for (int i = 0; i < book.size(); i++) {
                    if (b.equals(book.get(i).name)) {
                        System.out.println(book.get(i).name + " " + book.get(i).phone + " " + book.get(i).email);
                    }
                }// ��������������
            } else if (answer == 5) {
                System.out.println("������� ���: ");
                String b = scan.next();
                for (int i = 0; i < book.size(); i++) {
                    if (b.equals(book.get(i).name)) {
                        System.out.println(book.get(i).name + " " + book.get(i).phone + " " + book.get(i).email);
                        System.out.println("1 - ������������� ���");
                        System.out.println("2 - ������������� �����");
                        System.out.println("3 - ������������� Email");
                        System.out.println("4 - ������");
                        int answer1 = scan.nextInt();
                        if (answer1 == 1) {
                            book.get(i).name = ed.editName(book.get(i).name);
                        }else if (answer1 == 2) {
                            book.get(i).phone = ed.editPhone(book.get(i).phone);
                        }else if (answer1 == 3) {
                            book.get(i).email = ed.editEmail(book.get(i).email);
                        }else if (answer1 == 4) {
                            System.exit(0); // ������ ����� � ����
                        } else {
                            System.out.println("��������� ����!");
                        }
                    }
                }// �����
            } else if (answer == 6) {
                System.exit(0);
            }
            System.out.println("��������� ����!");

        }
    }
}
