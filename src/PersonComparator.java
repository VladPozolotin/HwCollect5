import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected int maxWords;

    public PersonComparator(int words) {
        if (words > 0) {
            this.maxWords = words;
        } else {
            this.maxWords = Integer.MAX_VALUE;
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        int comp = 0;
        if (!Boolean.TRUE.equals((o1.getSurname().split("-")).length >= this.maxWords && (o2.getSurname().split("-")).length >= this.maxWords)) {
            comp = Integer.compare((o1.getSurname().split("-")).length, (o2.getSurname().split("-")).length);
        }
        if (comp == 0) {
            comp = Integer.compare(o1.getAge(), o2.getAge());
        }
        return comp;
    }
}
