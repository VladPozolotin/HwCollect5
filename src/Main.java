import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        PersonComparator corp = new PersonComparator();
        list.add(new Person("Александр", "Суворов-Рымникский", 69));
        list.add(new Person("Фёдор", "Орлов-Денисов", 58));
        list.add(new Person("Василий", "Татищев", 52));
        list.add(new Person("Пётр", "Шлейзвиг-Гольштейн-Готторпский-Романов", 34));
        list.add(new Person("Николай", "Гольштейн-Готторп-Романов", 50));
        Collections.sort(list, corp);
        System.out.println(list);
    }
}