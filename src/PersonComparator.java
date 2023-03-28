import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int comp = Integer.compare((o1.getSurname().split("-")).length, (o2.getSurname().split("-")).length);
        if (comp == 0) {
            comp = Integer.compare(o1.getAge(), o2.getAge());
        }
        return comp;
    }
}
