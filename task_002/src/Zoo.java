import java.util.ArrayList;

//Завдання 2
//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo. У класі створити список, який записати 8
//тварин через метод add(index, element). Вивести список у консоль.
public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> listAnimals = new ArrayList<>(8);

        listAnimals.add(0, "Dog");
        listAnimals.add(1, "Cat");
        listAnimals.add(2, "Parrot");
        listAnimals.add(3, "Panda");
        listAnimals.add(4, "Elephant");
        listAnimals.add(5, "Lion");
        listAnimals.add(6, "Puma");
        listAnimals.add(7, "Woolf");

        for (String item : listAnimals) {
            System.out.println(item);
        }
    }
}
