import java.util.ArrayList;

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

        listAnimals.remove("Panda");
        listAnimals.remove("Lion");
        listAnimals.remove("Woolf");

        System.out.println("Розмір списку listAnimals: " + listAnimals.size());
    }
}
