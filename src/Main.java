import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Comparator<Person> corp = (o1, o2) -> {
            int comp = 0;
            if (!Boolean.TRUE.equals((o1.getSurname().split("-")).length >= 3 && (o2.getSurname().split("-")).length >= 3)) {
                comp = Integer.compare((o1.getSurname().split("-")).length, (o2.getSurname().split("-")).length);
            }
            if (comp == 0) {
                comp = Integer.compare(o1.getAge(), o2.getAge());
            }
            return comp;
        };
        list.add(new Person("Александр", "Суворов-Рымникский", 69));
        list.add(new Person("Фёдор", "Орлов-Денисов", 48));
        list.add(new Person("Василий", "Татищев", 52));
        list.add(new Person("Пётр", "Шлейзвиг-Гольштейн-Готторпский-Романов", 34));
        list.add(new Person("Николай", "Гольштейн-Готторп-Романов", 50));
        Collections.sort(list, corp);
        System.out.println(list);
    }
}