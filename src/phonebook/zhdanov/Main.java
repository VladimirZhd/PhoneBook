package phonebook.zhdanov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Contact> book;

    public static void main(String[] args) {
        Main program = new Main();
        program.start();
    }

    private void start() {

        Menu m = new Menu();
        m.start();
    }
}
/*
* ����� �� �����
* �������������� ���������
   1 - �������� ���
   2 - �������� �����
   3 - �������� ����
   4 - ���������
* ������� ��� ��������� � ��������� �� �������
    * � ������ ��������� ����������� ����� ������ ���� ��� ����������
    * ���������� �������� - � ������ ������������ ������ ��, ������ ���� � ����� ����������

 */
