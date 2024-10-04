package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int DAYS_PER_YEAR = 365;
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public int getAge() {
        return toYear(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYear(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                '}';
    }
}
