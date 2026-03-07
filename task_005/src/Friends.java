import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Завдання 5
//Використовуючи Intelij IDEA, створити клас Friends. За допомогою методів ArrayList додати масив імена друзів. Вивести
//список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
public class Friends {
    public static void main(String[] args) {
        List<String> listNameFriends = new ArrayList<>();
        listNameFriends.add("Dmytro");
        listNameFriends.add("Anton");
        listNameFriends.add("Oleg");
        listNameFriends.add("Natali");
        listNameFriends.add("Kateryna");

        System.out.println("Cписок друзів:");
        for (String item : listNameFriends) {
            System.out.print(" " + item);
        }

        Collections.sort(listNameFriends);

        System.out.println("\nВідсортований за алфавітним порядком список друзів:");
        for (String item : listNameFriends) {
            System.out.print(" " + item);
        }
    }
}
