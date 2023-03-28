import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        PersonComparator corp = new PersonComparator(3);
        list.add(new Person("Александр", "Суворов-Рымникский", 69));
        list.add(new Person("Фёдор", "Орлов-Денисов", 48));
        list.add(new Person("Клавдий", "Людвиг-Бонапарт", 7));
        list.add(new Person("Василий", "Татищев", 52));
        list.add(new Person("Пётр", "Шлейзвиг-Гольштейн-Готторпский-Романов", 34));
        list.add(new Person("Николай", "Гольштейн-Готторп-Романов", 50));
        list.add(new Person("Алексей", "Романов", 13));
        Collections.sort(list, corp);
        System.out.println(list);
        Predicate<Person> nonAdult = o -> o.getAge() < 18;
        list.removeIf(nonAdult);
        System.out.println(list);
    }
}