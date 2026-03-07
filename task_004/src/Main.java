import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Завдання 4
//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Main, створити список цілих чисел і за допомогою
//ListIterator пройтись по списку і збільшити значення на 1.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

        System.out.print("Створений список:");
        for (int i = 0; i < 10; i++) {
            list.add(i * 3);
        }

        for (Integer item : list) {
            System.out.print(" " + item);
        }

        ListIterator<Integer> listIterator = list.listIterator();
        int value;
        while (listIterator.hasNext()) {
            value = listIterator.next();
            listIterator.set(value + 1);
        }

        System.out.print("\nЗмінений список: ");
        for (Integer item : list) {
            System.out.print(" " + item);
        }
    }
}
