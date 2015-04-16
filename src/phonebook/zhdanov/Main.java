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
* поиск по имени
* редактирование контактов
   1 - изменить имя
   2 - изменить номер
   3 - изменить мейл
   4 - сохранить
* создать две коллекции и заполнить их именами
    * в третью коллекцию запиываются имена первых двух без повторений
    * пресечение множеств - в третью записываются только те, котоые есть в обеих коллекциях

 */
