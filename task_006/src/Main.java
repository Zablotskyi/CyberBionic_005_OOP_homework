import java.util.ArrayList;
import java.util.List;

//Завдання 6
//Використовуючи Intelij IDEA, створити проект, пакет. Створити class Main, у ньому створити список, додати вчителів,
//яких ви зможете згадати зі школи. І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
public class Main {
    public static void main(String[] args) {
        List<String> listTeacher = new ArrayList<>();
        listTeacher.add("Physics");
        listTeacher.add("Informatics");
        listTeacher.add("Chemistry");
        listTeacher.add("Literature");
        listTeacher.add("Biology");

        String bestTeacher = "Physics";
        String bedTeacher = "Biology";

        System.out.println("Список вчителів: " + listTeacher);

        for (String item : listTeacher) {
            if (item.equals(bestTeacher)) {
                System.out.println("індекс комірки кращого вчителя: " + listTeacher.indexOf(item));
            } else if (item.equals(bedTeacher)) {
                System.out.println("індекс комірки найгіршого вчителя: " + listTeacher.indexOf(item));
            }
        }
    }
}
